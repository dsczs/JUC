/**
 * synchronized�ؼ���
 * ��ĳ���������
 *
 * @author mashibing
 */

package com.mashibing.juc.c_001;

public class T {

    private int count = 10;
    private Object o = new Object();

    public void m() {
        synchronized (o) {
            count--;
            System.out.println(Thread.currentThread().getName() + " count = " + count);
        }
    }

}

