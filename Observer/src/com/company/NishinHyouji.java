package com.company;

class NishinHyouji implements Observer {
    public void update(Subject s) {
        print(((Suuchi)s).getValue());
    }
    private void print(int n) {
        System.out.println( n + "を2進数で表示します");
        String hex = Integer.toBinaryString(n);
        System.out.println(hex);
    }
}
