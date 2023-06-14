package textboardpractice.article.entity;

import textboardpractice.article.util.Util;

import java.util.ArrayList;

public class ArticleRepository {
    private ArrayList<Article> articleList = new ArrayList<>();
    private int id = 4;
    public void add(String title, String body){
        Article article = new Article(id, title, body, Util.currentTime());

        articleList.add(article);

        id++;
    }
}
