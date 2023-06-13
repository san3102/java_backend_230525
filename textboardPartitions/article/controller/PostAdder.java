package textboardPartitions.article.controller;

import textboardPartitions.article.entity.Article;
import textboardPartitions.article.util.Util;

import java.util.List;
import java.util.Scanner;

public class PostAdder implements postoperation {
    private Scanner scanner;
    private int id;
    private List<Article> articleList;
    public PostAdder(Scanner scanner, int id, List<Article> articleList) {
        this.scanner = scanner;
        this.id = id;
        this.articleList = articleList;
    }
    @Override
    public void execute() {
        System.out.printf("게시물 제목을 입력해주세요: ");
        String title = scanner.nextLine();
        System.out.printf("게시물 내용을 입력해주세요: ");
        String body = scanner.nextLine();

        Article postList = new Article();
        String currentTime = Util.currentTime();

        postList.setTitle(title);
        postList.setBody(body);
        postList.setPostNumber(id);
        postList.setPutUpDate(currentTime);
        postList.setPostView(0);
        System.out.println(id + "번 게시물이 추가되었습니다.");
        articleList.add(postList);
    }
}
