package org.javaturk.dp.ch04.singleton.problem;

import java.io.Serializable;

/**
 * Created by Murat Öngüdü on 4/4/2015.
 */
public class SingletonTrueSerializable implements Serializable {

    private static int count;
    private String name;

    private SingletonTrueSerializable() {
        name = "PughSingleton" + count;
        count++;
    }

    public String getName() {
        return name;
    }

    private static class SingletonHelper{
        private static final SingletonTrueSerializable INSTANCE = new SingletonTrueSerializable();
    }

    public void printName() {
        System.out.println(name); ;
    }

    public static SingletonTrueSerializable getInstance(){
        return SingletonHelper.INSTANCE;
    }

    /**
     * After this you will notice that hashCode of both the instances are same in test program.
     *
     * For Serializable and Externalizable classes, the readResolve method allows a class to replace/resolve
     * the object read from the stream before it is returned to the caller. By implementing the readResolve method,
     * a class can directly control the types and instances of its own instances being deser
     *
     * http://docs.oracle.com/javase/8/docs/platform/serialization/spec/input.html
     *
     * @return
     */
    protected Object readResolve() {
        return getInstance();
    }

}