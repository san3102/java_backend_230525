package textboardpractice.article.controller;

import textboardpractice.article.entity.Article;
import textboardpractice.article.entity.ArticleRepository;
import textboardpractice.article.view.ListView;
import textboardpractice.article.view.ViewManager;

import java.util.ArrayList;
import java.util.List;

public class PostLister implements postoperation {
    private List<Article> articleList;
    private ArticleRepository articleRepository;
    private ViewManager viewManager;
    public PostLister(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
        this.viewManager = new ViewManager();
    }
    @Override
    public void execute() {
        ListView listView = new ListView(articleRepository.getArticleList());
//        viewManager.handleView(listView);
        listView.listScreen();
    }
}
