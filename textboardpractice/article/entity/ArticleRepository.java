package textboardpractice.article.entity;

import textboardpractice.article.util.Util;

import java.util.ArrayList;
import java.util.List;

public class ArticleRepository {
    private List<Article> articleList = new ArrayList<>();
    private int id = 4;
    public void testData(){
        Article articleList1 = new Article();
        Article articleList2 = new Article();
        Article articleList3 = new Article();

        articleList1.setId(1);
        articleList1.setTitle("안녕하세요 반갑습니다. 자바 공부중이에요.");
        articleList1.setBody("");
        articleList1.setPutUpDate("");
        articleList1.setPostView(0);
        articleList.add(articleList1);

        articleList2.setId(2);
        articleList2.setTitle("자바 질문좀 할게요~");
        articleList2.setBody("");
        articleList2.setPutUpDate("");
        articleList2.setPostView(0);
        articleList.add(articleList2);

        articleList3.setId(3);
        articleList3.setTitle("정처기 따야되나요?");
        articleList3.setBody("");
        articleList3.setPutUpDate("");
        articleList3.setPostView(0);
        articleList.add(articleList3);
    }
    public void add(String title, String body){
        Article article = new Article(id, title, body, Util.currentTime());
        articleList.add(article);
        id++;
    }
    public List<Article> getArticleList(){
        return articleList;
    }

    public void update(int id, String newTitle, String newBody){
        for(Article data : articleList){
            if(id == data.getId()){
                data.setTitle(newTitle);
                data.setBody(newBody);
            }
        }
    }
}

