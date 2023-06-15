package textboardpractice.article.view;

import java.util.Scanner;

public class MainView implements View{
    Scanner scanner = new Scanner(System.in);

    @Override
    public void render(){
        System.out.println("=========================================");
        System.out.println("게시판 작동을 실행하려면 Enter를 눌러주세요.");
        System.out.println("=========================================");
        scanner.nextLine();
    }

    public String mainScreen(){
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 30; i++){
            System.out.println();
        }

        System.out.println("========= 메인 화면 =========");
        for(int i = 0; i < 2; i++){
            System.out.println();
        }
        System.out.printf("명령어 : ");
        String cmd = scanner.nextLine();

        return cmd;
    }
}
