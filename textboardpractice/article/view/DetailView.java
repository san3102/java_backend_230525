package textboardpractice.article.view;

import textboardpractice.article.entity.Article;

import java.util.List;
import java.util.Scanner;

public class DetailView implements View{
    Scanner scanner = new Scanner(System.in);
    public int id;
//    public List<Article> articleList;
    public DetailView(){
//        this.articleList = articleList;
    }

    @Override
    public void render(){
        System.out.println("화면을 넘기려면 Enter를 입력해주세요.");
        scanner.nextLine();
    }

    public void detailScreen(){
        System.out.printf("상세보기 할 게시물 번호를 입력해주세요 : ");
        id = scanner.nextInt();
    }

    public void detailCheck(List<Article> articleList){
        if(!articleList.isEmpty()){
            for(Article data : articleList){
                System.out.println("===============================");
                System.out.println("번호 : " + data.getId());
                System.out.println("제목 : " + data.getTitle());
                System.out.println("내용 : " + data.getBody());
                System.out.println("등록 날짜 : " + data.getPutUpDate());
                data.setPostView(data.getPostView() + 1);
//                System.out.println("댓글 수 : " + data.getPostCommentList().size() / 2);
                System.out.println("조회 수 : " + data.getPostView());
                System.out.println("===============================");
            }
        }else{
            System.out.println("해당 게시물 번호가 존재하지 않습니다.");
        }
    }
}
