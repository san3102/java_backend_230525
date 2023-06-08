package prac2;
import java.util.*;

public class djfkasjdbf {
    public static ArrayList<Integer> postNumber = new ArrayList<>();
    public static ArrayList<String> title = new ArrayList<>();
    public static ArrayList<String> body = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.printf("명령어 : ");
            String cmd = scan.nextLine();

            if(cmd.equals("add")){
                addPost(scan);
            }else if(cmd.equals("list")){
                postList();
            }else if(cmd.equals("update")){
                postUpdate(scan);
            }else if(cmd.equals("delete")){
                postRemove(scan);
            }
            else if(cmd.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }else{
                System.out.println("존재하지 않는 명령어입니다.");
            }
        }
    }
    public static void addPost(Scanner scan){
        System.out.printf("게시물 제목을 입력해주세요 : ");
        String titles = scan.nextLine();
        System.out.printf("게시물 내용을 입력해주세요 : ");
        String bodys = scan.nextLine();
        title.add(titles);
        body.add(bodys);
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
            System.out.println("내용 : " + body.get(i));
            System.out.println("===============================");
        }
    }
    public static void postUpdate(Scanner scan){
        System.out.printf("수정할 게시물 번호 : ");
        int postNum = scan.nextInt();
        String trash = scan.nextLine();
        if(postNum >= postNumber.size()){
            System.out.println("없는 게시물 번호입니다.");
        }else{
            System.out.printf("수정할 제목 : ");
            String newTitle = scan.nextLine().trim();
            System.out.printf("수정할 내용 : ");
            String newBody = scan.nextLine().trim();
            title.set(postNum-1, newTitle);
            body.set(postNum-1, newBody);
        }
    }
    public static void postRemove(Scanner scan){
        System.out.printf("삭제할 게시물 번호 : ");
        int postNum = scan.nextInt();
        String trash = scan.nextLine();
        for(int index = 0; index < postNumber.size(); index++){
            if(postNumber.get(index) == postNum){
                postNumber.remove(index);
                title.remove(index);
                body.remove(index);
                System.out.println(postNum + "번째 게시물이 삭제되었습니다.");
                break;
            }else if(index == postNumber.size() - 1){
                System.out.println("없는 게시물 번호입니다.");
                break;
            }
        }
    }
}
