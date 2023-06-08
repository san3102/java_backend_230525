package textboard;
import java.util.*;
public class Textboard {
    public static void main(String[] args) {
        ArrayList<String> posts = new ArrayList<>();
        ArrayList<Integer> postNumber = new ArrayList<>();
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        while (true){
            System.out.printf("명령어 : ");
            String command = scan1.nextLine().trim();

            if(command.equals("exit")){

                System.out.println("프로그램을 종료합니다.");
                break;

            }else if(command.equals("add")){
                int postNum = 0;

                while (true){
                    System.out.printf("게시물 제목을 입력해주세요 : ");
                    posts.add(scan2.nextLine());
                    System.out.printf("게시물 내용을 입력해주세요 : ");
                    posts.add(scan2.nextLine());
                    postNum++;
                    postNumber.add(postNum);
                    System.out.println(postNum + "번 게시물이 등록되었습니다.");

                    System.out.printf("추가로 등록하고 싶으시면 1번, 뒤로 가고 싶으시면 2번을 입력해주세요 : ");
                    int check = scan3.nextInt();
                    if(check == 1){
                        continue;
                    }else{
                        break;
                    }

                }
            }else if(command.equals("list")){
                System.out.println("==================================");
                for(int i = 0, count = 0; i < posts.size() - 1; i+=2, count++){
                    System.out.println(postNumber.get(count) + "번 게시물");
                    System.out.println("제목 : " + posts.get(i));
                    System.out.println("내용 : " + posts.get(i+1));
                    System.out.println("==================================");
                }
            }else if(command.equals("--help")){
                System.out.println("----------------------------------");
                System.out.println("add : 게시물 등록");
                System.out.println("list : 등록된 게시물 조회");
                System.out.println("exit : 프로그램 종료");
                System.out.println("----------------------------------");
                continue;
            }
            else if(command.equals("update")){
                System.out.printf("수정할 게시물 번호 : ");
                int check = scan3.nextInt();
                for(int num : postNumber){                          // 1 2 3 4 5 6 7 8...
                    if(num == check){
                        System.out.printf("제목 : ");
                        String title = scan2.nextLine();
                        posts.set((check - 1) * 2, title);            // 0 1, 2 3, 4 5, 6 7, 8 9, 10 11, 12 13, 14 15
                        System.out.printf("내용 : ");
                        String body = scan2.nextLine();
                        posts.set(check * 2 - 1, body);
                        break;
                    }else{
                        System.out.println("없는 게시물 번호 입니다.");
                    }
                }
            }
            else{
                System.out.println("잘못된 명령어 입니다.");
            }
        }
    }
}
