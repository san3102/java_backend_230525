package textboardPartitions.article.controller;

public class PostManager {
    public void handlePostOperation(postoperation postoperation) {
        postoperation.execute();
    }
}
