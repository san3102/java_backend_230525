package textboardpractice.article.controller;

import textboardpractice.article.entity.Article;
import textboardpractice.article.entity.ArticleRepository;
import textboardpractice.article.view.DeleteView;
import textboardpractice.article.view.View;
import textboardpractice.article.view.ViewManager;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PostDeleter implements postoperation {
    private Scanner scanner;
    private List<Article> articleList;
    private ViewManager viewManager;
    private ArticleRepository articleRepository;

    public PostDeleter(Scanner scanner, ArticleRepository articleRepository) {
        this.scanner = scanner;
        this.articleRepository = articleRepository;
        this.viewManager = new ViewManager();
    }

    @Override
    public void execute() {
        DeleteView deleteView = new DeleteView();
//        viewManager.handleView(deleteView);

        deleteView.deleteScreen();
        articleRepository.delete(deleteView.id);

//        System.out.println("게시물이 삭제되었습니다.");
//        System.out.print("삭제할 게시물 번호: ");
//        String inputData = scanner.nextLine();
//        int postNum;
//        try {
//            postNum = Integer.parseInt(inputData);
//        }catch (NumberFormatException e){
//            System.out.println("게시물 번호는 숫자로만 입력해주세요.");
//            execute();
//            return;
//        }

//        boolean found = false;
//
//        Iterator<Article> iterator = articleList.iterator();
//
//        while (iterator.hasNext()){
//            Article data = iterator.next();
//
//            if(data.getPostNumber() == postNum){
//                iterator.remove();
//                data.getPostCommentList().clear();
//                found = true;
//                break;
//            }
//        }
//        if(!found){
//            System.out.println("해당 게시물 번호가 존재하지 않습니다.");
//        }
    }
}
