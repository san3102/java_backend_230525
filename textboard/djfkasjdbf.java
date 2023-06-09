package textboard;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class djfkasjdbf {
    public static ArrayList<Integer> postNumber = new ArrayList<>();
    public static ArrayList<Integer> postView = new ArrayList<>();
    public static ArrayList<String> title = new ArrayList<>();
    public static ArrayList<String> body = new ArrayList<>();
    public static ArrayList<String> putUpDate = new ArrayList<>();
    public static ArrayList<String> contentsOfComment = new ArrayList<>();
    public static ArrayList<String> commentDate = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        test();

        while (true){
            System.out.printf("명령어 : ");
            String cmd = scan.nextLine();

            if(cmd.equals("add")){
                addPost(scan);
            }else if(cmd.equals("list")){
                postList();
            }else if(cmd.equals("update")){
                postUpdate(scan);
            }else if(cmd.equals("delete")) {
                postRemove(scan);
            }else if(cmd.equals("detail")){
                postDetail(scan);
            }else if(cmd.equals("search")){
                titleSearch(scan);
            }
            else if(cmd.equals("--help")){
                System.out.println("----------------------------");
                System.out.println("add : 게시물 추가");
                System.out.println("search : 게시물 검색 (제목)");
                System.out.println("list : 게시물 목록");
                System.out.println("detail : 게시물 상세 출력");
                System.out.println("update : 게시물 수정");
                System.out.println("delete : 게시물 삭제");
                System.out.println("exit : 프로그램 종료");
                System.out.println("----------------------------");
            }else if(cmd.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("존재하지 않는 명령어입니다.");
            }
        }
    }
    public static void addPost(Scanner scan){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String postDate = currentDateTime.format(formatter);
        System.out.printf("게시물 제목을 입력해주세요 : ");
        String titles = scan.nextLine();
        System.out.printf("게시물 내용을 입력해주세요 : ");
        String bodys = scan.nextLine();
        putUpDate.add(postDate);
        title.add(titles);
        body.add(bodys);
        postView.add(0);
            if(postNumber.isEmpty()){
                postNumber.add(1);
                System.out.println(postNumber.get(0) + "번째 게시물이 등록되었습니다.");
            }else{
                postNumber.add(postNumber.get(postNumber.size() - 1) + 1);
                System.out.println(postNumber.get(postNumber.size() - 1) + "번째 게시물이 등록되었습니다.");
        }
    }
    public static void postList(){
        System.out.println("===============================");
        for(int i = 0; i < title.size(); i++){
            System.out.println(postNumber.get(i) + "번 게시물");
            System.out.println("제목 : " + title.get(i));
//            System.out.println("내용 : " + body.get(i));
            System.out.println("===============================");
        }
    }
    public static void postUpdate(Scanner scan){
        System.out.printf("수정할 게시물 번호 : ");
        int postNum = scan.nextInt();
        trash(scan);
        for(int index = 0; index < postNumber.size(); index++){
            if(postNumber.get(index) == postNum){
                System.out.printf("수정할 제목 : ");
                String newTitle = scan.nextLine().trim();
                System.out.printf("수정할 내용 : ");
                String newBody = scan.nextLine().trim();
                title.set(index, newTitle);
                body.set(index, newBody);
                break;
            }else if(index == postNumber.size() - 1){
                System.out.println("없는 게시물 번호입니다.");
                break;
            }
        }
    }
    public static void postRemove(Scanner scan){
        System.out.printf("삭제할 게시물 번호 : ");
        int postNum = scan.nextInt();
        trash(scan);
        for(int index = 0; index < postNumber.size(); index++){
            if(postNumber.get(index) == postNum){
                postNumber.remove(index);
                title.remove(index);
                body.remove(index);
                putUpDate.remove(index);
                System.out.println(postNum + "번째 게시물이 삭제되었습니다.");
                break;
            }else if(index == postNumber.size() - 1){
                System.out.println("없는 게시물 번호입니다.");
                break;
            }
        }
    }
    public static void postDetail(Scanner scan){
        System.out.printf("상세보기 할 게시물 번호를 입력해주세요 : ");
        int postNum = scan.nextInt();
        trash(scan);
        for(int index = 0; index < postNumber.size(); index++){
            if(postNumber.get(index) == postNum){
                postView.set(index, postView.get(index) + 1);
                System.out.println("===============================");
                System.out.println("번호 : " + postNumber.get(index));
                System.out.println("제목 : " + title.get(index));
                System.out.println("내용 : " + body.get(index));
                System.out.println("등록 날짜 : " + putUpDate.get(index));
                System.out.println("조회 수 : " + postView.get(index));
                System.out.println("===============================");
                System.out.printf("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) : ");
                int choice = scan.nextInt();
                trash(scan);
                switch (choice){
                    case 1:
                        System.out.println("[댓글 기능]");
                        detailComment(scan, index);
                        break;
                    case 2:
                        System.out.println("[추천 기능]");
                        detailRecommend();
                        break;
                    case 3:
                        System.out.println("[수정 기능]");
                        detailUpdate();
                        break;
                    case 4:
                        System.out.println("[삭제 기능]");
                        detailDelete();
                        break;
                    case 5:
                        break;
                }
                break;
            }else if(index == postNumber.size() - 1){
                System.out.println("없는 게시물 번호입니다.");
                break;
            }
        }
    }
    // detail 상세보기 내부기능 메서드들
    public static void detailComment(Scanner scan, int index){
        System.out.printf("댓글 내용 : ");
        String commentContents = scan.nextLine();
//        contentsOfComment.add();

        System.out.println("댓글이 성공적으로 등록되었습니다");

        // 시간
//        LocalDateTime currentDateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
//        String postDate = currentDateTime.format(formatter);
    }
    public static void detailRecommend(){

    }
    public static void detailUpdate(){

    }
    public static void detailDelete(){

    }
    // detail 상세보기 내부기능 메서드들 끝
    public static void titleSearch(Scanner scan){
        int check = 0;
        System.out.printf("검색 키워드를 입력해주세요 : ");
        String keyword = scan.nextLine();
        System.out.println("===============================");
        for(int index = 0; index < postNumber.size(); index++){
            if(title.get(index).contains(keyword)){
                System.out.println("번호 : " + postNumber.get(index));
                System.out.println("제목 : " + title.get(index));
                System.out.println("===============================");
                check++;
            }
        }
        if(check == 0){
            System.out.println("검색 결과가 없습니다.");
            System.out.println("===============================");
        }
    }
    public static void test(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String postDate = currentDateTime.format(formatter);
        postNumber.add(1);
        title.add("안녕하세요 반갑습니다 자바 공부중이에요.");
        body.add(" ");
        putUpDate.add(postDate);
        postView.add(0);
        postNumber.add(2);
        title.add("자바 질문좀 할게요~");
        body.add(" ");
        putUpDate.add(postDate);
        postView.add(0);
        postNumber.add(3);
        title.add("정처기 따야되나요?");
        body.add(" ");
        putUpDate.add(postDate);
        postView.add(0);
    }    public static void trash(Scanner scan){
        String trash = scan.nextLine();
    }
}
