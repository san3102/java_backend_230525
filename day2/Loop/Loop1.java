package day2.Loop;

public class Loop1 {

    public static void main(String[] args) {
        // while, for
        int i = 0;
        while (i <= 5) {
            System.out.println(i);
            i++;        // 조건 변수 제어
        }

        for (int i2 = 1; i2 <= 5; i2++) {
            System.out.println(i2);
        }

        for (int a = 0; a < 4; a++) {
            System.out.println("코드1");
            System.out.println("코드2");
        }
        System.out.println("-----------------------");
        int b = 0;
        while (b < 4) {
            System.out.println("코드1");
            System.out.println("코드2");
            b++;
        }

        /*
        축구 경기가 진행중입니다. 축구경기 타임은 총 90분이고,

        현재 A팀이 0점, B팀이 2점인 상황에서, A팀은 최고의 스트라이커인 손흥민을 투입하기로 결정했다.

        손흥민은 투입과 동시에 그리고 5분마다 골을 넣을 수 있는 능력을 가지고 있다.

        만약 80분에 투입이 되면 80분에 곧바로 골을 넣게되고 85분에 골을 넣음으로서 동점이 가능하게 된다.

        (90분이되면 경기가 바로 종료되므로 골을 넣을 수 없다. 해당 경기의 심판은 추가시간을 주지 않는 것으로 유명하다.)

        현재 경기타임 time과 A팀의 득점 score가 주어질 때, 손흥민을 투입하면 A팀의 최종 득점은 몇 점인지 출력하시오.
        */

        int time = 74;
        int score = 0;

        for (; time < 90; time += 5) {
            score++;
        }
        System.out.println(score);

        // 출력 : 4

        // a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
        // 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
        // ex )
        // 오름차순 :  1, 2, 3, 4, 5
        // 내림차순 :  5, 4, 3, 2, 1


        int p = 8;
        int q = 15;

        if(q > p){
            int l = q;
            q = p;
            p = l;
        }
        for(; q <= p; q++){
                System.out.println(q);
        }



    }
}