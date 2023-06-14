package textboardpractice.article.controller;

import textboardpractice.article.entity.Article;

import java.util.List;
import java.util.Scanner;

public class PostUpdater implements postoperation {
    private Scanner scanner;
    private List<Article> articleList;

    public PostUpdater(Scanner scanner, List<Article> articleList) {
        this.scanner = scanner;
        this.articleList = articleList;
    }

    @Override
    public void execute() {
        System.out.printf("수정할 게시물 번호 : ");
        int postNum = scanner.nextInt();
        scanner.nextLine();
        boolean found = false;
        for (Article data : articleList) {
            if (data.getPostNumber() == postNum) {
                System.out.print("수정할 제목: ");
                String newTitle = scanner.nextLine().trim();
                System.out.print("수정할 내용: ");
                String newBody = scanner.nextLine().trim();

                data.setTitle(newTitle);
                data.setBody(newBody);

                System.out.println("게시물이 수정되었습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 게시물 번호가 존재하지 않습니다.");
        }
    }
}
