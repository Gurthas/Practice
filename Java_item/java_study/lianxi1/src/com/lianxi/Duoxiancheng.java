package com.lianxi.duoxiancheng;

/**
 * Created by admin on 2017/8/2.
 * java多线程的2种方法
 */
//继承thread类
/*public class Duoxiancheng extends Thread {
    public void run(){
        System.out.println("Duoxiancheng.run()");
    }

    public static void main(String[] args) {
        Duoxiancheng dxc1 = new Duoxiancheng();
        Duoxiancheng dxc2 = new Duoxiancheng();
        Duoxiancheng dxc3 = new Duoxiancheng();
        dxc1.start();
        dxc2.start();
        dxc3.start();

    }

}*/
//继承Runnable接口
public class Duoxiancheng implements Runnable{
    @Override
    public void run() {
        System.out.println("Duoxiancheng.run()");
    }
    public static void main(String[] args) {
        Duoxiancheng dxc = new Duoxiancheng();
        Thread t1 = new Thread(dxc);
        Thread t2 = new Thread(dxc);
        Thread t3 = new Thread(dxc);
        t1.start();
        t2.start();
        t3.start();
    }
}

