package textboardpractice.article.controller;

import textboardpractice.article.entity.Article;
import textboardpractice.article.entity.ArticleRepository;

import java.util.List;

public class Tester implements postoperation {
    private ArticleRepository articleRepository;
//    private List<Article> articleList;
//    public Tester(List<Article> articleList){
//        this.articleList = articleList;
//    }
    public Tester(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }

    @Override
    public void execute(){
        articleRepository.testData();
//        Article articleList1 = new Article();
//        Article articleList2 = new Article();
//        Article articleList3 = new Article();
//
//        articleList1.setId(1);
//        articleList1.setTitle("안녕하세요 반갑습니다. 자바 공부중이에요.");
//        articleList1.setBody("");
//        articleList1.setPutUpDate("");
//        articleList1.setPostView(0);
//        articleList.add(articleList1);
//
//        articleList2.setId(2);
//        articleList2.setTitle("자바 질문좀 할게요~");
//        articleList2.setBody("");
//        articleList2.setPutUpDate("");
//        articleList2.setPostView(0);
//        articleList.add(articleList2);
//
//        articleList3.setId(3);
//        articleList3.setTitle("정처기 따야되나요?");
//        articleList3.setBody("");
//        articleList3.setPutUpDate("");
//        articleList3.setPostView(0);
//        articleList.add(articleList3);
    }
}
