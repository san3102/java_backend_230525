package textboardpractice;

import textboardpractice.article.controller.*;
import textboardpractice.article.entity.Article;
import textboardpractice.article.entity.ArticleRepository;
import textboardpractice.article.view.*;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardApplication {
    public void start(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Article> articleList = new ArrayList<>();
        ArticleRepository articleRepository = new ArticleRepository();
        PostManager postManager = new PostManager();
        ViewManager viewManager = new ViewManager();
        MainView mainView = new MainView();
        View view = new MainView();
        // 아래 id값은 Tester 클래스 삭제시 동시에 1로 수정해야함.
//        int id = 4;

        view.render();
        // 테스트 종료시 아래 2줄 삭제요망
        Tester tester = new Tester(articleRepository);
        postManager.handlePostOperation(tester);

        while (true) {
            String command = mainView.mainScreen();

            if (command.equals("add")) {
                PostAdder postAdder = new PostAdder(articleRepository);
                postManager.handlePostOperation(postAdder);
                view = new AddView();
            }
            else if (command.equals("list")) {
                PostLister postLister = new PostLister(articleRepository);
                postManager.handlePostOperation(postLister);
                view = new ListView();
            }
            else if (command.equals("update")) {
                PostUpdater postUpdater = new PostUpdater(scanner, articleRepository);
                postManager.handlePostOperation(postUpdater);
                view = new UpdateView();
            }
            else if (command.equals("delete")) {
                PostDeleter postDeleter = new PostDeleter(scanner, articleRepository);
                postManager.handlePostOperation(postDeleter);
                view = new DeleteView();
            }
            else if (command.equals("detail")){
                PostDetailer postDetailer = new PostDetailer(scanner, articleRepository);
                postManager.handlePostOperation(postDetailer);
                view = new DetailView();
            }
            else if (command.equals("search")){
                PostSearcher postSearcher = new PostSearcher(scanner, articleRepository);
                postManager.handlePostOperation(postSearcher);
                view = new SearchView();
            }
            else if (command.equals("--help")) {
                PostHelper postHelper = new PostHelper();
                postManager.handlePostOperation(postHelper);
                view = new HelpView();
            }
            else if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("존재하지 않는 명령어입니다.");
            }

            viewManager.handleView(view);
        }
    }
}
