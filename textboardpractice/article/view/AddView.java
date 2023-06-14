package textboardpractice.article.view;

import java.util.HashMap;
import java.util.Scanner;


public class AddView implements View {
    Scanner scanner = new Scanner(System.in);

    @Override
    public void render(){
        for(int i = 0; i < 30; i++){
            System.out.println();
        }
        System.out.println("========= 게시물 등록 =========");
//        System.out.printf("게시물 제목을 입력해주세요: ");
//        String title = scanner.nextLine();
//        System.out.printf("게시물 내용을 입력해주세요: ");
//        String body = scanner.nextLine();
//        getInputData();
    }

    public HashMap<String, Object> getInputData(){
        HashMap<String, Object> inputData = new HashMap<>();

        System.out.printf("게시물 제목을 입력해주세요: ");
        String title = scanner.nextLine();
        System.out.printf("게시물 내용을 입력해주세요: ");
        String body = scanner.nextLine();

        inputData.put("title", title);
        inputData.put("body", body);

        return inputData;
    }
}
