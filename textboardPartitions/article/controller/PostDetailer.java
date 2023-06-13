package textboardPartitions.article.controller;

import textboardPartitions.article.entity.Article;
import textboardPartitions.article.util.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostDetailer implements postoperation{
    private Scanner scanner;
    private List<Article> articleList;
    public PostDetailer(Scanner scanner, List<Article> articleList){
        this.scanner =  scanner;
        this.articleList = articleList;
    }
    @Override
    public void execute(){
        System.out.printf("상세보기 할 게시물 번호를 입력해주세요 : ");

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

        for(Article data : articleList){
            if(data.getPostNumber() == postNum){

                postDetailView(data);

                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("해당 게시물 번호가 존재하지 않습니다.");
        }
    }
    private void postDetailView(Article data){
        System.out.println("===============================");
        System.out.println("번호 : " + data.getPostNumber());
        System.out.println("제목 : " + data.getTitle());
        System.out.println("내용 : " + data.getBody());
        System.out.println("등록 날짜 : " + data.getPutUpDate());
        data.setPostView(data.getPostView() + 1);
        System.out.println("댓글 수 : " + data.getPostCommentList().size() / 2);
        System.out.println("조회 수 : " + data.getPostView());
        System.out.println("===============================");

        if(!(data.getPostCommentList().isEmpty())){
            System.out.println("============== 댓글 =============");
            ArrayList<String> commentList = data.getPostCommentList();
            for(int index = 0; index < commentList.size(); index+=2){
                System.out.println("댓글 내용 : " + commentList.get(index));
                System.out.println("댓글 작성일 : " + commentList.get(index+1));
                System.out.println("===============================");
            }
        }
        handlePostDetailOperations(data);
    }
    private void handlePostDetailOperations(Article data){
        System.out.printf("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 상세정보 다시보기, 0. 처음 화면으로) : ");
        // addComment, recommend, updatePost, deletePost, return
        String inputData = scanner.nextLine();
        int choice;

        try {
            choice = Integer.parseInt(inputData);
        }catch (NumberFormatException e){
            System.out.println("숫자로만 입력해주세요.");
            handlePostDetailOperations(data);
            return;
        }
        switch (choice){
            case 1:
                addComment(data);
                handlePostDetailOperations(data);
                break;
            case 2:
                recommend(data);
                handlePostDetailOperations(data);
                break;
            case 3:
                updatePost(data);
                handlePostDetailOperations(data);
                break;
            case 4:
                deletePost(data);
                handlePostDetailOperations(data);
                break;
            case 5:
                postDetailView(data);
                break;
            case 0:
                System.out.println("상세보기 화면을 빠져나갑니다.");
                break;
            default:
                System.out.println("잘못된 선택입니다.");
        }
    }
    // 아래 4개의 메서드들은 data객체를 활용
    private void addComment(Article data){
        System.out.printf("댓글 내용 : ");
        String commentContent = scanner.nextLine();

        String commentDate = Util.currentTime();

        ArrayList<String> comments = data.getPostCommentList();
        comments.add(commentContent);
        comments.add(commentDate);

        System.out.println("댓글이 성공적으로 등록되었습니다.");
    }
    private void recommend(Article data){
        System.out.println("추천 구현예정");
    }
    private void updatePost(Article data){
        System.out.println("수정 구현예정");
    }
    private void deletePost(Article data){
        System.out.println("삭제 구현예정");
    }
}
