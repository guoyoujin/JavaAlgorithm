package com.trycatch.java.algorithm.singleton;

public class SyncSingleton {
    private static SyncSingleton syncSingleton = null;

    private static SyncSingleton syncSingletonTwo = null;

    private static SyncSingleton syncSingletonThread = null;

    private static SyncSingleton syncSingletonFour = null;

    public  SyncSingleton(){

    }

    /**
     *当一个线程运行该方法，另一个线程处于阻塞状态，保证了多线程模式下 单例对象的唯一性
     * @return
     */
    public static synchronized SyncSingleton newInstance(String therd){
        System.out.println("therd: "+therd);
        if(syncSingleton == null){
            syncSingleton = new SyncSingleton();
        }
        return syncSingleton;
    }


    /**
     * 当一个线程运行该方法，另一个线程处于阻塞状态，保证了多线程模式下 单例对象的唯一性
     * @param therd
     * @return
     */
    public static SyncSingleton newInstanceTwo(String therd){
        System.out.println("therd: "+therd);
        synchronized(SyncSingleton.class){
            if(syncSingletonTwo == null){
                syncSingletonTwo = new SyncSingleton();
            }
        }
        return syncSingletonTwo;
    }

    /**
     * 此方法没有加锁，高并发情况下还是容易重复创建对象
     * @param therd
     * @return
     */
    public static SyncSingleton newInstanceThread(String therd){
        System.out.println("therd: "+therd);
        if(syncSingletonThread == null){
            syncSingletonThread = new SyncSingleton();
        }
        return syncSingletonThread;
    }

    /**
     * 从代码看出此代码提高了程序的执行效率，若单例已创建，则不需再执行加锁操作就可获取实例
     * @param therd
     * @return
     */
    public static SyncSingleton newInstanceFour(String therd){
        System.out.println("therd: "+therd);
        if(syncSingletonFour == null){
           synchronized (SyncSingleton.class){
               if(syncSingletonFour == null){
                   syncSingletonFour = new SyncSingleton();
               }
           }
        }
        return syncSingletonFour;
    }


}
