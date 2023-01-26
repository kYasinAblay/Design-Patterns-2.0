package org.javaturk.dp.ch04.singleton.problem;

import java.io.Serializable;

/**
 * inspired by http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-with-examples
 *
 * Created by Murat Öngüdü on 4/4/2015.
 */
public class SingletonSerializable implements Serializable {

    private static int count;
    private String name;

    private SingletonSerializable() {
        name = "Singleton" + count;
        count++;
    }

    public String getName() {
        return name;
    }

    private static class SingletonHelper{
        private static final SingletonSerializable INSTANCE = new SingletonSerializable();
    }

    public void printName() {
        System.out.println(name); ;
    }

    public static SingletonSerializable getInstance(){
        return SingletonHelper.INSTANCE;
    }
}