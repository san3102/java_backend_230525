package textboardpractice.article.view;

import java.util.Scanner;

public class DeleteView implements View{
    Scanner scanner = new Scanner(System.in);
    public int id;
    @Override
    public void render(){
        System.out.println("해당 게시물이 삭제되었습니다.");

        System.out.println("화면을 넘기려면 Enter를 입력해주세요.");
        scanner.nextLine();
    }

    public void deleteScreen(){
        for(int i = 0; i < 30; i++){
            System.out.println();
        }

        System.out.print("삭제할 게시물 번호: ");
        id = scanner.nextInt();
        scanner.nextLine();
    }
}
