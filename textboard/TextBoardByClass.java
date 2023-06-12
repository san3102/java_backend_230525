package textboard;
// 게시판 > 게시물 번호, 이름, 내용   > 리스트화
//        > 기능 : 추가, 삭제, 조회, 수정, 종료
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TextBoardByClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PostListDev> postListDevArrayList = new ArrayList<>();
        PostManager postManager = new PostManager();
        // 아래 id값은 Tester 클래스 삭제시 동시에 1로 수정해야함.
        int id = 4;

        // 테스트 종료시 아래 2줄 삭제요망
        Tester tester = new Tester(postListDevArrayList);
        postManager.handlePostOperation(tester);

        while (true) {
            System.out.print("명령어: ");
            String command = scanner.nextLine();

            if (command.equals("add")) {
                PostAdder postAdder = new PostAdder(scanner, id, postListDevArrayList);
                postManager.handlePostOperation(postAdder);
                id++;
            }
            else if (command.equals("list")) {
                PostLister postLister = new PostLister(postListDevArrayList);
                postManager.handlePostOperation(postLister);
            }
            else if (command.equals("update")) {
                PostUpdater postUpdater = new PostUpdater(scanner, postListDevArrayList);
                postManager.handlePostOperation(postUpdater);
            }
            else if (command.equals("delete")) {
                PostDeleter postDeleter = new PostDeleter(scanner, postListDevArrayList);
                postManager.handlePostOperation(postDeleter);
            }
            else if (command.equals("detail")){
                PostDetail postDetail = new PostDetail(scanner, postListDevArrayList);
                postManager.handlePostOperation(postDetail);
            }
            else if (command.equals("search")){
                PostSearcher postSearcher = new PostSearcher(scanner, postListDevArrayList);
                postManager.handlePostOperation(postSearcher);
            }
            else if (command.equals("--help")) {
                Helper helper = new Helper();
                postManager.handlePostOperation(helper);
            }
            else if (command.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("존재하지 않는 명령어입니다.");
            }
        }
    }
}
class PostListDev{
    private int postNumber;
    private String title;
    private String body;
    private String putUpDate;
    private int postView;
//    private String postComment;
//    private String postCommentDate;
    private ArrayList<String> postCommentList;
    public PostListDev(){
        this.postCommentList = new ArrayList<>();
    }
//    public PostListDev(int postNumber, String title, String body){
//        this.postNumber = postNumber;
//        this.title = title;
//        this.body = body;
//        this.postCommentList = new ArrayList<>();
//    }
    public void setPostNumber(int postNumber){this.postNumber = postNumber;}
    public void setTitle(String title){this.title = title;}
    public void setBody(String body){this.body = body;}
    public void setPutUpDate(String putUpDate){this.putUpDate = putUpDate;}
    public void setPostView(int postView){this.postView = postView;}
//    public void setPostComment(String postComment){this.postComment = postComment;}
//    public void setPostCommentDate(String postCommentDate){this.postCommentDate = postCommentDate;}
//    public void setPostCommentList(ArrayList<String> postCommentList){
//        this.postCommentList = postCommentList;
//    }
    public int getPostNumber(){return this.postNumber;}
    public String getTitle(){return this.title;}
    public String getBody(){return this.body;}
    public String getPutUpDate(){return this.putUpDate;}
    public int getPostView(){return this.postView;}
//    public String getPostComment(){return this.postComment;}
//    public String getPostCommentDate(){return this.postCommentDate;}
    public ArrayList<String> getPostCommentList(){
        return postCommentList;
    }

}
interface PostOperation {
    void execute();
}
class Tester implements PostOperation{
    private List<PostListDev> postListArray;
    public Tester(List<PostListDev> postListArray){
        this.postListArray = postListArray;
    }
    @Override
    public void execute(){
        PostListDev postlistTest1 = new PostListDev();
        PostListDev postlistTest2 = new PostListDev();
        PostListDev postlistTest3 = new PostListDev();

        postlistTest1.setPostNumber(1);
        postlistTest1.setTitle("안녕하세요 반갑습니다. 자바 공부중이에요.");
        postlistTest1.setBody("");
        postlistTest1.setPutUpDate("");
        postlistTest1.setPostView(0);
//        postlistTest1.setPostComment(null);
//        postlistTest1.setPostCommentDate(null);
        postListArray.add(postlistTest1);

        postlistTest2.setPostNumber(2);
        postlistTest2.setTitle("자바 질문좀 할게요~");
        postlistTest2.setBody("");
        postlistTest2.setPutUpDate("");
        postlistTest2.setPostView(0);
//        postlistTest1.setPostComment(null);
//        postlistTest1.setPostCommentDate(null);
        postListArray.add(postlistTest2);

        postlistTest3.setPostNumber(3);
        postlistTest3.setTitle("정처기 따야되나요?");
        postlistTest3.setBody("");
        postlistTest3.setPutUpDate("");
        postlistTest3.setPostView(0);
//        postlistTest1.setPostComment(null);
//        postlistTest1.setPostCommentDate(null);
        postListArray.add(postlistTest3);
    }
}
class PostAdder implements PostOperation {
    private Scanner scanner;
    private int id;
    private List<PostListDev> postListArray;
    public PostAdder(Scanner scanner, int id, List<PostListDev> postListArray) {
        this.scanner = scanner;
        this.id = id;
        this.postListArray = postListArray;
    }
    @Override
    public void execute() {
        System.out.printf("게시물 제목을 입력해주세요: ");
        String title = scanner.nextLine();
        System.out.printf("게시물 내용을 입력해주세요: ");
        String body = scanner.nextLine();

        PostListDev postList = new PostListDev();
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String postPutUpDate = currentDateTime.format(formatter);

        postList.setTitle(title);
        postList.setBody(body);
        postList.setPostNumber(id);
        postList.setPutUpDate(postPutUpDate);
        postList.setPostView(0);
//        postList.setPostComment(null);
//        postList.setPostCommentDate(null);
        System.out.println(id + "번 게시물이 추가되었습니다.");
        postListArray.add(postList);
    }
}

class PostLister implements PostOperation {
    private List<PostListDev> postListArray;
    PostLister(List<PostListDev> postListArray){
        this.postListArray = postListArray;
    }
    @Override
    public void execute() {
        System.out.println("게시물 목록을 출력합니다.");
        System.out.println("===============================");
        for(PostListDev data : postListArray){
            System.out.println(data.getPostNumber() + "번 게시물");
            System.out.println("제목 : "+data.getTitle());
//            System.out.println("내용 : "+data.getBody());
//            System.out.println("등록 날짜 : "+data.getPutUpDate());
//            System.out.println("조회수 : "+data.getPostView());
            System.out.println("===============================");
        }
    }
}

class PostUpdater implements PostOperation {
    private Scanner scanner;
    private List<PostListDev> postListArray;

    public PostUpdater(Scanner scanner, List<PostListDev> postListArray) {
        this.scanner = scanner;
        this.postListArray = postListArray;
    }

    @Override
    public void execute() {
        System.out.printf("수정할 게시물 번호 : ");
        int postNum = scanner.nextInt();
        scanner.nextLine();
        boolean found = false;
        for (PostListDev data : postListArray) {
            if (data.getPostNumber() == postNum) {
                System.out.print("수정할 제목: ");
                String newTitle = scanner.nextLine().trim();
                System.out.print("수정할 내용: ");
                String newBody = scanner.nextLine().trim();

                data.setTitle(newTitle);
                data.setBody(newBody);

                System.out.println("게시물이 수정되었습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 게시물 번호가 존재하지 않습니다.");
        }
    }
}

class PostDeleter implements PostOperation {
    private Scanner scanner;
    private List<PostListDev> postListArray;

    public PostDeleter(Scanner scanner, List<PostListDev> postListArray) {
        this.scanner = scanner;
        this.postListArray = postListArray;
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

        Iterator<PostListDev> iterator = postListArray.iterator();

        while (iterator.hasNext()){
            PostListDev data = iterator.next();

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
class Helper implements PostOperation{
    public Helper(){}
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
class PostDetail implements PostOperation{
    private Scanner scanner;
    private List<PostListDev> postListArray;
    public PostDetail(Scanner scanner, List<PostListDev> postListArray){
        this.scanner =  scanner;
        this.postListArray = postListArray;
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

        for(PostListDev data : postListArray){
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
    private void postDetailView(PostListDev data){
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
    private void handlePostDetailOperations(PostListDev data){
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
    private void addComment(PostListDev data){
        System.out.printf("댓글 내용 : ");
        String commentContent = scanner.nextLine();

        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String commentDate = currentDateTime.format(formatter);

        ArrayList<String> comments = data.getPostCommentList();
        comments.add(commentContent);
        comments.add(commentDate);

        System.out.println("댓글이 성공적으로 등록되었습니다.");
    }
    private void recommend(PostListDev data){
        System.out.println("추천 구현예정");
    }
    private void updatePost(PostListDev data){
        System.out.println("수정 구현예정");
    }
    private void deletePost(PostListDev data){
        System.out.println("삭제 구현예정");
    }
}
class PostSearcher implements PostOperation{
    private Scanner scanner;
    private List<PostListDev> postListArray;

    public PostSearcher(Scanner scanner, List<PostListDev> postListArray){
        this.postListArray = postListArray;
        this.scanner = scanner;
    }
    @Override
    public void execute(){
        System.out.printf("검색 키워드를 입력해주세요 (대소문자 구분) : ");
        String postTitle = scanner.nextLine();
        boolean found = false;
        System.out.println("===============================");
        for(PostListDev data : postListArray) {
            if(data.getTitle().contains(postTitle)){
                System.out.println("번호 : " + data.getPostNumber());
                System.out.println("제목 : " + data.getTitle());
                System.out.println("===============================");
                found = true;
            }
        }
        if(!found){
            System.out.println("검색 결과가 없습니다.");
            System.out.println("===============================");
        }
    }
}
class PostManager {
    public void handlePostOperation(PostOperation operation) {
        operation.execute();
    }
}