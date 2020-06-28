/**
 * �Ա�����һ��С���򣬷���һ�������������
 *
 * @author mashibing
 */

package com.mashibing.juc.c_006;

public class T implements Runnable {

    private int count = 10;

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            T t = new T();
            new Thread(t, "THREAD" + i).start();
        }
    }

    public synchronized void run() {
        count--;
        System.out.println(Thread.currentThread().getName() + " count = " + count);
    }

}
