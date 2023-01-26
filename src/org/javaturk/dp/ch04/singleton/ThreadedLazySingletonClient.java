/*
 * All rights reserved
 * Written by Akin Kaldiroglu for Design Patterns Seminar
 * 27 May 2009
 * akink@bilginc.com
 */

package org.javaturk.dp.ch04.singleton;

public class ThreadedLazySingletonClient extends Thread {

	public static void main(String[] args) {
		for(int i = 0; i < 200; i++){
			new ThreadedLazySingletonClient().start();
		}
	}
	
	public void run(){
		ThreadedLazySingleton ls = ThreadedLazySingleton.getInstance();
		ls.printName();
	}
}
