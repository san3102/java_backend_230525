package textboardpractice.article.controller;

import textboardpractice.article.entity.Article;

import java.util.List;
import java.util.Scanner;

public class PostSearcher implements postoperation {
    private Scanner scanner;
    private List<Article> articleList;

    public PostSearcher(Scanner scanner, List<Article> articleList){
        this.articleList = articleList;
        this.scanner = scanner;
    }
    @Override
    public void execute(){
        System.out.printf("검색 키워드를 입력해주세요 (대소문자 구분) : ");
        String postTitle = scanner.nextLine();
        boolean found = false;
        System.out.println("===============================");
        for(Article data : articleList) {
            if(data.getTitle().contains(postTitle)){
                System.out.println("번호 : " + data.getPostNumber());
                System.out.println("제목 : " + data.getTitle());
                System.out.println("===============================");
                found = true;
            }
        }
        if(!found){
            System.out.println("검색 결과가 없습니다.");
            System.out.println("===============================");
        }
    }
}
