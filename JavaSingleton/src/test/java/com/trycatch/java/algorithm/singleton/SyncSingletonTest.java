package com.trycatch.java.algorithm.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SyncSingletonTest {
    @Test
    public void testFrist()
    {
        for(int i=0;i<100;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    SyncSingleton syncSingletonFirst = SyncSingleton.newInstance(Thread.currentThread().getName()+"");
                    SyncSingleton syncSingletonSecond = SyncSingleton.newInstance(Thread.currentThread().getName()+"");
                    Assert.assertEquals("object !=",syncSingletonFirst,syncSingletonSecond); // 验证是相等
                }
            });
            thread.setName("线程："+i+"");
            thread.start();
        }


    }

    @Test
    public void testSecond()
    {
        for(int i=0;i<100;i++) {
            Thread thread =  new Thread(new Runnable() {
                @Override
                public void run() {
                    SyncSingleton syncSingletonFirst = SyncSingleton.newInstanceTwo(Thread.currentThread().getName()+"");
                    SyncSingleton syncSingletonSecond = SyncSingleton.newInstanceTwo(Thread.currentThread().getName()+"");
                    Assert.assertEquals("object !=", syncSingletonFirst, syncSingletonSecond); // 验证是相等
                }
            });
            thread.setName("线程："+i+"");
            thread.start();
        }

    }

    @Test
    public void testThread()
    {
        for(int i=0;i<100;i++) {
            Thread thread =  new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1);
                        SyncSingleton syncSingletonFirst = SyncSingleton.newInstanceThread(Thread.currentThread().getName()+"");
                        System.out.println(syncSingletonFirst);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            });
            thread.setName("线程："+i+"");
            thread.start();
        }

    }

    @Test
    public void testFour()
    {
        for(int i=0;i<100;i++) {
            Thread thread =  new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(1);
                        SyncSingleton syncSingletonFirst = SyncSingleton.newInstanceFour(Thread.currentThread().getName()+"");
                        System.out.println(syncSingletonFirst);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
            });
            thread.setName("线程："+i+"");
            thread.start();
        }

    }
}
