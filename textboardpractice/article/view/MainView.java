package textboardpractice.article.view;

import java.util.Scanner;

public class MainView {
    public String render(){
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
