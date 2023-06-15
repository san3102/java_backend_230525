package textboardpractice.article.controller;

import textboardpractice.article.entity.Article;
import textboardpractice.article.entity.ArticleRepository;
import textboardpractice.article.view.UpdateView;

import java.util.List;
import java.util.Scanner;

public class PostUpdater implements postoperation {
    private Scanner scanner;
    private List<Article> articleList;
    private ArticleRepository articleRepository;
    private String newTitle;
    private String newBody;
    private int id;

    public PostUpdater(Scanner scanner, ArticleRepository articleRepository) {
        this.scanner = scanner;
        this.articleRepository = articleRepository;
    }

    @Override
    public void execute() {
        UpdateView updateView = new UpdateView();
        updateView.render();

        id = updateView.id;
        newTitle = updateView.inputNewTitle;
        newBody = updateView.inputNewBody;

        articleRepository.update(id, newTitle, newBody);
//        System.out.printf("수정할 게시물 번호 : ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        boolean found = false;
//        for (Article data : articleList) {
//            if (data.getId() == id) {
//                System.out.print("수정할 제목: ");
//                String newTitle = scanner.nextLine().trim();
//                System.out.print("수정할 내용: ");
//                String newBody = scanner.nextLine().trim();
//
//                data.setTitle(newTitle);
//                data.setBody(newBody);
//
//                System.out.println("게시물이 수정되었습니다.");
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("해당 게시물 번호가 존재하지 않습니다.");
//        }
    }
}
