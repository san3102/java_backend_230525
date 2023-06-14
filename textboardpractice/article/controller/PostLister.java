package textboardpractice.article.controller;

import textboardpractice.article.entity.Article;

import java.util.List;

public class PostLister implements postoperation {
    private List<Article> articleList;
    public PostLister(List<Article> articleList){
        this.articleList = articleList;
    }
    @Override
    public void execute() {
        System.out.println("게시물 목록을 출력합니다.");
        System.out.println("===============================");
        for(Article data : articleList){
            System.out.println(data.getPostNumber() + "번 게시물");
            System.out.println("제목 : "+data.getTitle());
            System.out.println("===============================");
        }
    }
}
