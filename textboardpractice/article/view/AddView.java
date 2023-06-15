package textboardpractice.article.view;

import textboardpractice.article.entity.Article;
import textboardpractice.article.entity.ArticleRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class AddView implements View {
    Scanner scanner = new Scanner(System.in);
    public HashMap<String, Object> inputData = new HashMap<>();
    ArticleRepository articleRepository;
    Article article;

    @Override
    public void render(){
        // 이제 각 View클래스들 내부 render() 메서드에 맨 처음 입력 명령어에 대한 작업이 끝나면 그 다음화면이 출력될 수 있게.
        System.out.println("게시물이 추가되었습니다.");


        System.out.println("화면을 넘기려면 Enter를 입력해주세요.");
        scanner.nextLine();
    }

    public void addScreen(){
        for(int i = 0; i < 30; i++){
            System.out.println();
        }
        System.out.println("========= 게시물 등록 =========");
        getInputData();
    }

    public HashMap<String, Object> getInputData(){

        System.out.printf("게시물 제목을 입력해주세요: ");
        String title = scanner.nextLine();
        System.out.printf("게시물 내용을 입력해주세요: ");
        String body = scanner.nextLine();

        inputData.put("title", title);
        inputData.put("body", body);

        return inputData;
    }
}
