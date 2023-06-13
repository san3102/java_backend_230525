package textboardPartitions.article.controller;

import textboardPartitions.article.entity.Article;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PostDeleter implements postoperation {
    private Scanner scanner;
    private List<Article> articleList;

    public PostDeleter(Scanner scanner, List<Article> articleList) {
        this.scanner = scanner;
        this.articleList = articleList;
    }

    @Override
    public void execute() {
        System.out.print("삭제할 게시물 번호: ");
        String inputData = scanner.nextLine();
        int postNum;
        try {
            postNum = Integer.parseInt(inputData);
        }catch (NumberFormatException e){
            System.out.println("게시물 번호는 숫자로만 입력해주세요.");
            execute();
            return;
        }

        boolean found = false;

        Iterator<Article> iterator = articleList.iterator();

        while (iterator.hasNext()){
            Article data = iterator.next();

            if(data.getPostNumber() == postNum){
                iterator.remove();
                data.getPostCommentList().clear();
                System.out.println("게시물이 삭제되었습니다.");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("해당 게시물 번호가 존재하지 않습니다.");
        }
    }
}
