package com.threads;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            TenThraeds thread = new TenThraeds(i);
            thread.start();
        }
    }
}




