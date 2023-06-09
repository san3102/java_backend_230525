package textboard;
// 게시판 > 게시물 번호, 이름, 내용   > 리스트화
//        > 기능 : 추가, 삭제, 조회, 수정, 종료
import java.util.*;
public class TextboardByClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<PostListDev> postListDevArrayList = new ArrayList<>();
        PostListDev postlists = new PostListDev();
        PostManager postManager = new PostManager();
        int id = 1;

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
//            else if (command.equals("delete")) {
//                PostDeleter postDeleter = new PostDeleter(scanner);
//                postManager.handlePostOperation(postDeleter);
//            }
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
    // 게시물 번호, 이름, 내용, 조회수, 등록날짜
    private int postNumber;
    private String title;
    private String body;
    private String putUpDate;
    private int postView;
    public PostListDev(){}
    public PostListDev(int postNumber, String title, String body){
        this.postNumber = postNumber;
        this.title = title;
        this.body = body;
    }
    public void setPostNumber(int postNumber){this.postNumber = postNumber;}
    public void setTitle(String title){this.title = title;}
    public void setBody(String body){this.body = body;}
    public void setPutUpDate(String putUpDate){this.putUpDate = putUpDate;}
    public void setPostView(int postView){this.postView = postView;}
    public int getPostNumber(){return this.postNumber;}
    public String getTitle(){return this.title;}
    public String getBody(){return this.body;}
    public String getPutUpDate(){return this.putUpDate;}
    public int getPostView(){return this.postView;}

}
interface PostOperation {
    void execute();
}

class PostAdder implements PostOperation {
    private Scanner scanner;
    private int id;
    private List<PostListDev> postLists;
    public PostAdder(Scanner scanner, int id, List<PostListDev> postListArray) {
        this.scanner = scanner;
        this.id = id;
        this.postLists = postListArray;
    }
    public void execute() {
        System.out.printf("게시물 제목을 입력해주세요: ");
        String title = scanner.nextLine();
        System.out.printf("게시물 내용을 입력해주세요: ");
        String body = scanner.nextLine();

        PostListDev postList = new PostListDev();

        postList.setTitle(title);
        postList.setBody(body);
        postList.setPostNumber(id);
        System.out.println(id + "번 게시물이 추가되었습니다.");
        postLists.add(postList);
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
            System.out.println("내용 : "+data.getBody());
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
        for (PostListDev post : postListArray) {
            if (post.getPostNumber() == postNum) {
                System.out.print("수정할 제목: ");
                String newTitle = scanner.nextLine().trim();
                System.out.print("수정할 내용: ");
                String newBody = scanner.nextLine().trim();

                post.setTitle(newTitle);
                post.setBody(newBody);

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

    public PostDeleter(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print("삭제할 게시물 번호: ");
        int postNum = scanner.nextInt();
        scanner.nextLine();
        // 게시물 삭제 로직 구현
        System.out.println("게시물이 삭제되었습니다.");
    }
}
class Helper implements PostOperation{
    public Helper(){}
    @Override
    public void execute(){
        System.out.println("-----------------------------");
        System.out.println("add : 게시물 추가");
        System.out.println("list : 게시물 목록");
        System.out.println("update : 게시물 수정");
        System.out.println("delete : 게시물 삭제");
        System.out.println("exit : 프로그램 종료");
        System.out.println("-----------------------------");
    }
}

class PostManager {
    public void handlePostOperation(PostOperation operation) {
        operation.execute();
    }
}