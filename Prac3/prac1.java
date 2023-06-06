package Prac3;

public class prac1 {
    public static void main(String[] args) {
        /*
        *
        **
        ***
        ****
        *****
        */
        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 5; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();

        //            *  4
        //           **  3
        //          ***  2
        //         ****  1
        //        *****  0
        for(int i = 0; i < 5; i++){                 // 0 1 2 3 4
            for(int j = 0; j < 4 - i; j++){         // 0 1 2 3 > 0 1 2 > 0 1 > ...
                System.out.printf(" ");
            }
            for(int k = 0; k < i + 1; k++){         // 0 > 0 1 > 0 1 2 > 0 1 2 3 > ...
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++){
                System.out.printf(" ");
            }
            for(int k = 0; k < 5 - i; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4-i; j++){
                System.out.printf(" ");
            }
            for(int k = 0; k < (2*i)+1; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 4; i >= 0; i--){
            for(int j = 0; j < 4 - i; j++){
                System.out.printf(" ");
            }
            for(int k = 0; k < (2*i)+1; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();

        Triangle1(10);
        Triangle2(10);
    }
    public static void Triangle1(int height){
        if(height == 0){
            return;
        }else{
            for(int i = 0; i < height; i++){
                for(int j = 0; j <= i; j++){
                    System.out.printf("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void Triangle2(int height){
        if(height == 0){
            return;
        }else{
            for(int i = 0; i < height; i++){                 // 0 1 2 3 4
                for(int j = 0; j < height -1 - i; j++){         // 0 1 2 3 > 0 1 2 > 0 1 > ...
                    System.out.printf(" ");
                }
                for(int k = 0; k < i + 1; k++){         // 0 > 0 1 > 0 1 2 > 0 1 2 3 > ...
                    System.out.printf("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
