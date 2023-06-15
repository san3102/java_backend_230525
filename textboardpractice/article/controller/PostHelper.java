package textboardpractice.article.controller;

import textboardpractice.article.view.HelpView;
import textboardpractice.article.view.ViewManager;

public class PostHelper implements postoperation {
    ViewManager viewManager;
    public PostHelper(){
        this.viewManager = new ViewManager();
    }
    @Override
    public void execute(){
        HelpView helpView = new HelpView();
//        viewManager.handleView(helpView);

        helpView.helpScreen();

//        System.out.println("-----------------------------");
//        System.out.println("add : 게시물 추가");
//        System.out.println("list : 게시물 목록");
//        System.out.println("search : 게시물 제목 검색");
//        System.out.println("detail : 게시물 상세보기");
//        System.out.println("update : 게시물 수정");
//        System.out.println("delete : 게시물 삭제");
//        System.out.println("exit : 프로그램 종료");
//        System.out.println("-----------------------------");
    }
}
