package textboardpractice.article.view;

import java.util.Scanner;

public class UpdateView implements View{
    Scanner scanner =  new Scanner(System.in);
    public String inputNewTitle;
    public String inputNewBody;
    public int id;
    @Override
    public void render(){
        System.out.println("수정이 완료되었습니다.");

        System.out.println("화면을 넘기려면 Enter를 입력해주세요.");
        scanner.nextLine();
    }
    public void updateScreen(){
        for(int i = 0; i < 30; i++){
            System.out.println();
        }

        System.out.printf("수정할 게시물 번호 : ");
        id = scanner.nextInt();
        scanner.nextLine();
        inputNewTitle = inputNewTitle();
        inputNewBody = inputNewBody();
    }

    public String inputNewTitle(){
        System.out.print("수정할 제목: ");
        String newTitle = scanner.nextLine().trim();
        return newTitle;
    }
    public String inputNewBody(){
        System.out.print("수정할 내용: ");
        String newBody = scanner.nextLine().trim();
        return newBody;
    }
}
