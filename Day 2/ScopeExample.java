package com.prodemy.h2;



public class ScopeExample {
    public static void main(String[] args) {
        TesCope scope = new TesCope();
        scope.firstMethod();
    }

}

 class TesCope {
     int i = 1;
    public void firstMethod() {
        int i =4, j=5;
         this.i = i + j;
        System.out.println(this.i);
        secondMethod(7);

    }
    public void secondMethod(int i) {
        int j = 8;
        this.i = i + j;
        System.out.println(this.i);
    }
}