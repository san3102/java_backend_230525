package textboardpractice.article.controller;

import textboardpractice.article.entity.Article;
import textboardpractice.article.entity.ArticleRepository;
import textboardpractice.article.util.Util;
import textboardpractice.article.view.AddView;
import textboardpractice.article.view.View;
import textboardpractice.article.view.ViewManager;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class PostAdder implements postoperation {
    private Scanner scanner;
    private List<Article> articleList;
    private ArticleRepository articleRepository;

    public PostAdder(Scanner scanner, List<Article> articleList) {
        this.scanner = scanner;
        this.articleList = articleList;
        this.articleRepository = new ArticleRepository();
    }

    @Override
    public void execute() {
        AddView addView = new AddView();
        addView.render();

        HashMap<String, Object> inputData = addView.getInputData();
        String title =(String) inputData.get("title");
        String body = (String) inputData.get("body");


//        Article postList = new Article();
//        String currentTime = Util.currentTime();

        articleRepository.add(title, body);

//        postList.setTitle(title);
//        postList.setBody(body);
//        postList.setPostNumber(id);
//        postList.setPutUpDate(currentTime);
//        postList.setPostView(0);
        System.out.println("게시물이 추가되었습니다.");
//        articleList.add(postList);

    }
}
//    public View getResultView() {
//        return viewList;
//    }

