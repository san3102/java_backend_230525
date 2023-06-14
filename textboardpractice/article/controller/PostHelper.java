package textboardpractice.article.controller;

public class PostHelper implements postoperation {
    public PostHelper(){}
    @Override
    public void execute(){
        System.out.println("-----------------------------");
        System.out.println("add : 게시물 추가");
        System.out.println("list : 게시물 목록");
        System.out.println("search : 게시물 제목 검색");
        System.out.println("detail : 게시물 상세보기");
        System.out.println("update : 게시물 수정");
        System.out.println("delete : 게시물 삭제");
        System.out.println("exit : 프로그램 종료");
        System.out.println("-----------------------------");
    }
}
