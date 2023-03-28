package com.threads;

import java.util.ArrayList;

public class TenThraeds extends Thread {
    private final int threadNumber;
    final static Object key = new Object();
    private static int i = 1;


    public TenThraeds(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    // להדפיש באופו אקראי את כל הת'רידים
    /*
    public void run(){
        System.out.printf("thread name: %d\n",this.threadNumber);
    }
    */

    //print_oder function
    //להדפיס המספרים בסדר עולה מ 1 ל 10
    /*
    public void run(){
        synchronized (key) {
            while (i <= 10) {
                if(this.threadNumber == i){
                    System.out.printf("thread name: %d\n", this.threadNumber);
                    i++;
                    key.notifyAll();
                }
                else{
                    try {
                        key.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
     */

    //print_ten10 function
    public void run() {
        if (this.threadNumber != 10) {
            System.out.printf("thread name: %d\n", this.threadNumber);
        } else {
            synchronized (key) {
                try {
                    key.wait(1500);
                    System.out.printf("thread name: %d\n", this.threadNumber);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }




}
