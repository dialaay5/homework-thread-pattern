package com.dbPoolPattern;
public class Main {
    public static void main(String[] args)  {

        EightmultiThreads t1 = new EightmultiThreads("insert into person values(3, 'danny') ");
        EightmultiThreads t2 = new EightmultiThreads("insert into person values(4, 'dan') ");
        EightmultiThreads t3 = new EightmultiThreads("insert into person values(5, 'tal') ");
        EightmultiThreads t4 = new EightmultiThreads("insert into person values(6, 'ron') ");
        EightmultiThreads t5 = new EightmultiThreads("insert into person values(7, 'talia') ");
        EightmultiThreads t6 = new EightmultiThreads("insert into person values(8, 'itay') ");
        EightmultiThreads t7 = new EightmultiThreads("insert into person values(9, 'dassy') ");
        EightmultiThreads t8 = new EightmultiThreads("insert into person values(10, 'roma') ");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

    }
}

