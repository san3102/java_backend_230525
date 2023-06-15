package textboardpractice.article.entity;

import java.util.ArrayList;

public class Article {
    private int postNumber;
    private String title;
    private String body;
    private String putUpDate;
    private int postView;
    private int id;
    private ArrayList<String> postCommentList;
    private String postPutUpDate;
    public Article(){
        this.postCommentList = new ArrayList<>();
    }
    public Article(String title, String body){
        this.title = title;
        this.body = body;
    }
    public Article(int id, String title, String body, String putUpDate){
        this.id = id;
        this.title = title;
        this.body = body;
        this.putUpDate = putUpDate;
    }
    public void setTitle(String title){this.title = title;}
    public void setBody(String body){this.body = body;}
    public void setPutUpDate(String putUpDate){this.putUpDate = putUpDate;}
    public void setPostView(int postView){this.postView = postView;}
    public void setPostPutUpDate(String postPutUpDate){this.postPutUpDate = postPutUpDate;}
    public void setId(int id){this.id = id;}
    public int getPostNumber(){return this.postNumber;}
    public String getTitle(){return this.title;}
    public String getBody(){return this.body;}
    public String getPutUpDate(){return this.putUpDate;}
    public int getPostView(){return this.postView;}
    public ArrayList<String> getPostCommentList(){
        return postCommentList;
    }
    public String getPostPutUpDate(){return postPutUpDate;}
    public int getId(){return id;}

}
