package textboardpractice.article.view;

import textboardpractice.article.entity.Article;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListView implements View {
    private List<Article> articleList;
    Scanner scanner = new Scanner(System.in);
    public ListView(){

    }
    public ListView(List<Article> articleList) {
        this.articleList = articleList;
    }

    @Override
    public void render() {
        System.out.println("화면을 넘기려면 Enter를 입력해주세요.");
        scanner.nextLine();
    }

    public void listScreen(){
        System.out.println("게시물 목록을 출력합니다.");
        System.out.println("===============================");
        for (Article data : articleList) {
            System.out.println(data.getId() + "번 게시물");
            System.out.println("제목 : " + data.getTitle());
            System.out.println("===============================");
        }
    }
}