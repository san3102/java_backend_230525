package Prac3;

public class triPrac {
    public static void main(String[] args) {
        for(int i = 0 ; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4-i; j++){
                System.out.printf(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println();

        triangle(10);
        System.out.println();
        reverseTriangle(10);
    }
    public static void triangle(int height){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < height - i - 1; j++){
                System.out.printf(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
    public static void reverseTriangle(int height){
        for(int i = 0; i < height; i++){
            for(int j = 0; j <= i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
