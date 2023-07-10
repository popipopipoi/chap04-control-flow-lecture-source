package com.ohgiraffers.section01.conditional;

public class Application {

    public static void main(String[] args) {
        A_if a = new A_if();  //객체 생성
       // a.testSimpleIfStatement(); //호출
       // a.testNestedIfStatement();
        B_ifElse b = new B_ifElse();
       // b.testSimpleIfElseStatement();
       // b.testNestedIfElseStatement();
        C_ifElseIf c = new C_ifElseIf();
       // c.testSimpleIfElseIfstatment();
       // c.testNestedIfElseIfStatement();
        D_swich d = new D_swich();
       // d.testSimpleSwitchStatement();
        d.testSwitchVendingMachine();
    }

}
