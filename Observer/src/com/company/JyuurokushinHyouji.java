package com.company;

class JyuurokushinHyouji implements Observer {
    public void update(Subject s) {
        print(((Suuchi)s).getValue());
    }
    private void print(int n) {
        System.out.println(n + "を 16 進数で表示します");

        String hex2 = Integer.toHexString(n);
        System.out.println(hex2);
    }
}
