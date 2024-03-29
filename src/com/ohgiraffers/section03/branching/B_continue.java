package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testSimpleContinueStatement() {
        /* continue문 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        /* 1부터 100사이의 4의 배수이면서 5의 배수인 값 출력 */
        for(int i = 1; i <= 100; i++) {

            /* 4의 배수가 아니거나 5의 배수가 아닌 경우 */
            if(i % 4 != 0 || i % 5 !=0) {
                continue;
            }

            System.out.println(i);
        }
    }

    public void testSimpleContinueStatement2() {
        /* 중첩 반복문 내 continue문 사용에 대한 흐름을 이해하고 적용할 수 있다.
        * continue는 모든 반복문을 건너 뛰는 것이 아닌, 자신에게 가장 인접한 반복문의 실행만 건너 뛴다.
        * */

        /* 구구단 2~9단을 출력하되 곱해지는 수가 짝수인 경우는 출력하지 않는다. */
        for(int dan = 2; dan < 10; dan++) {
            for (int su = 1; su < 10; su++) {
                if(su % 2 == 0) {
                    continue;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        }
    }

    public void testJumpContinue() {
        /* 중첩 반복문 내 continue문 사용 시 jump(goto)에 대한 흐름을 이해하고 적용할 수 있다. */
        label:
        for(int dan = 2; dan < 10; dan++) {
            for (int su = 1; su < 10; su++) {
                if(su % 2 == 0) {
                    continue label;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
        }
    }
}
