package com.trycatch.java.algorithm.singleton;

import java.io.Serializable;


/**
 * 如果一个类想被序列化，需要实现Serializable接口。否则将抛出NotSerializableException异常，这是因为，在序列化操作过程中会对类型进行检查，要求被序列化的类必须属于Enum、Array和Serializable类型其中的任何一种。

 2、在变量声明前加上该关键字，可以阻止该变量被序列化到文件中。

 3、在类中增加writeObject 和 readObject 方法可以实现自定义序列化策略
 */
public class VolatileSingleton implements Serializable{
    private static volatile VolatileSingleton volatileSingleton = null;

    private VolatileSingleton(){}

    /**
     *  volatile关键字来保证可见性。
     *  volatile变量规则：对一个变量的写操作先行发生于后面对这个变量的读操作
     *　当一个共享变量被volatile修饰时，它会保证修改的值会立即被更新到主存，当有其他线程需要读取时，它会去内存中读取新值。
     *　而普通的共享变量不能保证可见性，因为普通共享变量被修改之后，什么时候被写入主存是不确定的，当其他线程去读取时，此时内存中可能还是原来的旧值，因此无法保证可见性。
     *　另外，通过synchronized和Lock也能够保证可见性，synchronized和Lock能保证同一时刻只有一个线程获取锁然后执行同步代码，并且在释放锁之前会将对变量的修改刷新到主存当中。因此可以保证可见性
     * @return
     */
    private static VolatileSingleton newInstance(){
        if(volatileSingleton==null){
            synchronized (VolatileSingleton.class){
                if(volatileSingleton==null){
                    volatileSingleton = new VolatileSingleton();
                }
            }
        }
        return volatileSingleton;
    }

    private Object readResolve() {
        return volatileSingleton;
    }
}
