package com.trycatch.java.algorithm.treenode;

public class TreeNodeMethod {
    public static TreeNode getTreeNode(){
        TreeNode treeNode9 = new TreeNode(9L);
        TreeNode treeNode10 = new TreeNode(10L);
        TreeNode treeNode20 = new TreeNode(20L);
        TreeNode treeNode15 = new TreeNode(15L);
        TreeNode treeNode35 = new TreeNode(35L);
        treeNode10.setRightNode(treeNode20);
        treeNode10.setLeftNode(treeNode9);
        treeNode20.setLeftNode(treeNode15);
        treeNode20.setRightNode(treeNode35);
        return treeNode10;
    }

    public static TreeNode getNotBTreeNode(){
        TreeNode treeNode9 = new TreeNode(9L);
        TreeNode treeNode10 = new TreeNode(10L);
        TreeNode treeNode20 = new TreeNode(20L);
        TreeNode treeNode15 = new TreeNode(15L);
        TreeNode treeNode35 = new TreeNode(35L);
        treeNode9.setLeftNode(treeNode10);
        treeNode9.setRightNode(treeNode20);
        treeNode20.setLeftNode(treeNode15);
        treeNode20.setRightNode(treeNode35);
        return treeNode9;
    }


    /**
     * 先序遍历 根==>>左==>>右
     * @param treeNode
     */
    public static void preTravereBtree(TreeNode treeNode){
        if(treeNode!=null){
            System.out.println(treeNode.getVal());
            preTravereBtree(treeNode.getLeftNode());
            preTravereBtree(treeNode.getRightNode());
        }
    }

    /**
     * 中序遍历 左==>>根==>>右
     * @param treeNode
     */
    public static void inTravereBtree(TreeNode treeNode){
        if(treeNode!=null){
            inTravereBtree(treeNode.getLeftNode());
            System.out.println(treeNode.getVal());
            inTravereBtree(treeNode.getRightNode());
        }
    }


    /**
     * 后序遍历 左==>>右==>>根
     * @param treeNode
     */
    public static void endTravereBtree(TreeNode treeNode){
        if(treeNode!=null){
            inTravereBtree(treeNode.getLeftNode());
            inTravereBtree(treeNode.getRightNode());
            System.out.println(treeNode.getVal());
        }
    }


    /**
     * 创建一个二叉树的方法
     * @param treeRoot
     * @param value
     */
    public static void createTreeNode(TreeRoot treeRoot, Long value){
      if(treeRoot.getTreeNodeRoot()==null){
          TreeNode treeNode = new TreeNode(value);
          treeRoot.setTreeNodeRoot(treeNode);
      }else{
          TreeNode tmpTreeNode = treeRoot.getTreeNodeRoot();
          while(tmpTreeNode!=null){
              if(tmpTreeNode.getVal() < value){
                  if(tmpTreeNode.getRightNode() == null){
                      tmpTreeNode.setRightNode( new TreeNode(value));
                      return;
                  }else{
                      tmpTreeNode  = tmpTreeNode.getRightNode();
                  }
              }else{
                  if(tmpTreeNode.getLeftNode() == null){
                      tmpTreeNode.setLeftNode(new TreeNode(value));
                      return;
                  }else{
                      tmpTreeNode = tmpTreeNode.getLeftNode();
                  }
              }
          }
      }
    }


    /**
     * 求二叉树的高度/深度
     * @param treeNode
     * @return
     */
    public static Long getTreeHeight(TreeNode treeNode){
        if(treeNode==null){
            return 0L;
        }else{
            Long left = getTreeHeight(treeNode.getLeftNode());
            Long right = getTreeHeight(treeNode.getRightNode());
            Long max = left;
            if(max<right){
                max = right;
            }
            return max+1;
        }
    }

    /**
     * 求二叉树的最大值
     * @param treeNode
     * @return
     */
    public static Long getTreeMax(TreeNode treeNode){
        if(treeNode==null){
            return -1L;
        }else{
            Long left = getTreeMax(treeNode.getLeftNode());
            Long right = getTreeMax(treeNode.getRightNode());
            Long currentvalue = treeNode.getVal();
            Long max = left;
            if(right>max){
                max = right;
            }
            if(currentvalue>max){
                max = currentvalue;
            }
            return max;
        }
    }

    /**
     * 验证是否合法的二分查找树
     * @param treeNode
     * @param minValue
     * @param maxValue
     * @return
     */
    public static boolean isValidBst(TreeNode treeNode,Long minValue, Long maxValue){
       if(treeNode==null){
           return true;
       }
       if(treeNode.getVal()<minValue || treeNode.getVal() > maxValue){
            return false;
       }
       return isValidBst(treeNode.getLeftNode(),minValue,treeNode.getVal()) && isValidBst(treeNode.getRightNode(),treeNode.getVal(),maxValue);
    }


    /**
     * 获取二叉树的节点的个数
     * @param treeNode
     * @return
     */
    public static Long getTreeNodeNum(TreeNode treeNode){
        if(treeNode == null){
            return 0L;
        }
        return getTreeNodeNum(treeNode.getLeftNode()) + getTreeNodeNum(treeNode.getRightNode())+1;
    }

    public static boolean isValidEqu(TreeNode treeNode1, TreeNode treeNode2){
        if(treeNode1 == null && treeNode2 == null){
            return true;
        }else if(treeNode1 == null || treeNode2 == null){
            return false;
        }
        if(treeNode1.getVal() != treeNode2.getVal()){
            return false;
        }
        boolean leftFlag = isValidEqu(treeNode1.getLeftNode(),treeNode2.getLeftNode());
        boolean rightFlag = isValidEqu(treeNode1.getRightNode(),treeNode2.getRightNode());
        return leftFlag && rightFlag;
    }
}
