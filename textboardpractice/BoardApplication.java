package textboardpractice;

import textboardpractice.article.controller.*;
import textboardpractice.article.entity.Article;
import textboardpractice.article.view.*;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApplication {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Article> articleList = new ArrayList<>();
        PostManager postManager = new PostManager();
        ViewManager viewManager = new ViewManager();
        MainView mainView = new MainView();
        View view;
        // 아래 id값은 Tester 클래스 삭제시 동시에 1로 수정해야함.
//        int id = 4;

        // 테스트 종료시 아래 2줄 삭제요망
        Tester tester = new Tester(articleList);
        postManager.handlePostOperation(tester);

        while (true) {
            String command = mainView.render();

            if (command.equals("add")) {
                PostAdder postAdder = new PostAdder(scanner, articleList);
//                viewManager.handleView(postAdder.getResultView());
                postManager.handlePostOperation(postAdder);
            }
            else if (command.equals("list")) {
                PostLister postLister = new PostLister(articleList);
                postManager.handlePostOperation(postLister);
            }
            else if (command.equals("update")) {
                PostUpdater postUpdater = new PostUpdater(scanner, articleList);
                postManager.handlePostOperation(postUpdater);
            }
            else if (command.equals("delete")) {
                PostDeleter postDeleter = new PostDeleter(scanner, articleList);
                postManager.handlePostOperation(postDeleter);
            }
            else if (command.equals("detail")){
                PostDetailer postDetailer = new PostDetailer(scanner, articleList);
                postManager.handlePostOperation(postDetailer);
            }
            else if (command.equals("search")){
                PostSearcher postSearcher = new PostSearcher(scanner, articleList);
                postManager.handlePostOperation(postSearcher);
            }
            else if (command.equals("--help")) {
                PostHelper postHelper = new PostHelper();
                postManager.handlePostOperation(postHelper);
            }
            else if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("존재하지 않는 명령어입니다.");
            }

//            view.render();
        }
    }
}
