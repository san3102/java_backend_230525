package textboardpractice.article.controller;

import textboardpractice.article.entity.Article;
import textboardpractice.article.entity.ArticleRepository;

import java.util.List;

public class Tester implements postoperation {
    private ArticleRepository articleRepository;

    public Tester(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }

    @Override
    public void execute(){
        articleRepository.testData();
    }
}
