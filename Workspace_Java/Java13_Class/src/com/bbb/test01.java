package com.bbb;

public class test01 {
	public static void main(String[] args) {
        Cake cake = new StrawberryCake();

        if (cake instanceof Cake) {
            System.out.println("케익 인스턴스 or");
            System.out.println("케익 상속하는 인스턴스 \n");
        }
        if (cake instanceof CheeseCake) {
            System.out.println("치즈케익 인스턴스 or");
            System.out.println("치즈케익 상속하는 인스턴스 \n");
        }
        if (cake instanceof StrawberryCake) {
            System.out.println("딸기치즈케익 인스턴스 or");
            System.out.println("딸기치케익 상속하는 인스턴스 \n");
        }
        System.out.println("=======================");
        Cake cake1 = new CheeseCake();
        if (cake1 instanceof Cake) {
            System.out.println("케익 인스턴스 or");
            System.out.println("케익 상속하는 인스턴스 \n");
        }
        if (cake1 instanceof CheeseCake) {
            System.out.println("치즈케익 인스턴스 or");
            System.out.println("치즈케익 상속하는 인스턴스 \n");
        }
        if (cake1 instanceof StrawberryCake) {
            System.out.println("딸기치즈케익 인스턴스 or");
            System.out.println("딸기치케익 상속하는 인스턴스 \n");
        }
    }
}

class Cake {

}

class CheeseCake extends Cake {

}

class StrawberryCake extends CheeseCake {

}
