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
    private ArticleRepository articleRepository;
    private ViewManager viewManager;

    public PostAdder(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
        this.viewManager = new ViewManager();
    }

    @Override
    public void execute() {
        AddView addView = new AddView();
//        viewManager.handleView(addView);

        addView.addScreen();

        HashMap<String, Object> inputData = addView.inputData;
        String title =(String) inputData.get("title");
        String body = (String) inputData.get("body");

        articleRepository.add(title, body);

//        System.out.println("게시물이 추가되었습니다.");
    }
}
//    public View getResultView() {
//        return viewList;
//    }

