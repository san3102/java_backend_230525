package exam;
import java.util.Scanner;
public class exam2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 높이를 입력해주세요 : 3
        System.out.printf("높이를 입력해주세요 : ");
        int height = scan.nextInt();
        triangle(height);

        // 높이를 입력해주세요 : 5
        System.out.printf("높이를 입력해주세요 : ");
        height = scan.nextInt();
        triangle(height);

        // 높이를 입력해주세요 : 7
        System.out.printf("높이를 입력해주세요 : ");
        height = scan.nextInt();
        triangle(height);
    }
    public static void triangle(int height){
        for(int i = 0; i < height; i++){
            for(int j = 0; j < height - i; j++){
                System.out.printf(" ");
            }
            for(int k = 0; k < 2 * i + 1; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
