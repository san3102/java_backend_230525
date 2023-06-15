package textboardpractice.article.view;

import textboardpractice.article.entity.Article;

import java.util.Scanner;
import java.util.List;

public class SearchView implements View{
    Scanner scanner = new Scanner(System.in);
    public String title;

    @Override
    public void render(){
        System.out.println("화면을 넘기려면 Enter를 입력해주세요.");
        scanner.nextLine();
    }

    public void searchScreen(){
        System.out.printf("검색 키워드를 입력해주세요 (대소문자 구분) : ");
        title = scanner.nextLine();
    }

    public void searchCheck(List<Article> articleList){
        if(!articleList.isEmpty()){
            for(Article data : articleList) {
                if(data.getTitle().contains(title)){
                    System.out.println("번호 : " + data.getId());
                    System.out.println("제목 : " + data.getTitle());
                    System.out.println("===============================");
                }
            }
        }else{
            System.out.println("검색 결과가 없습니다.");
            System.out.println("===============================");
        }
    }
}
