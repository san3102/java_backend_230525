package prac;
import java.util.*;
public class Prac3 {
    public static void main(String[] args) {
        /*Book 클래스를 생성하고, 책의 제목, 저자, 출판연도, 대여 여부를 나타내는 인스턴스 변수를 가지도록 합니다.
                                title   author  publiYear isRented
        Library 클래스를 생성하고, 여러 개의 Book 객체를 관리합니다.
        addBook() 메서드를 작성하여 책을 도서관에 추가합니다.
        rentBook() 메서드를 작성하여 책을 대여합니다.
        returnBook() 메서드를 작성하여 대여한 책을 반납합니다.
        printAvailableBooks() 메서드를 작성하여 현재 대여 가능한 책의 목록을 출력합니다.
        */

        // 도서관 객체 생성 및 도서 추가, 대여, 반납, 목록 출력 등의 기능 수행
        Library library = new Library();
        Book b1 = new Book("수학의 정석", "지은이", 2003);
        Book b2 = new Book("삼국지", "모름", 2000);

        library.addBook(b1);
        library.addBook(b2);

        library.printAvailableBooks();
        library.rentBook("수학의 정석");
        library.rentBook("Java란 무엇인가");
        library.returnBook("수학의 정석");
        library.printAvailableBooks();
    }
}

class Book{
    private String title;
    private String author;
    private int publiYear;
    private boolean isRented;
    // 생성자, Getter및 Setter 메서드 작성
    public Book(String title, String author, int publiYear){ // 생성자
        this.title = title;
        this.author = author;
        this.publiYear = publiYear;
        this.isRented = false;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPubliYear(){
        return publiYear;
    }
    public boolean isRented(){
        return isRented;
    }
    public void setRented(boolean rented){
        isRented = rented;
    }
}

class Library{
    private List<Book> bookList;
    public Library(){                  // 생성자
        bookList = new ArrayList<>();  // List<Book> bookList = new ArrayList<>();
    }
    public void addBook(Book book){
        bookList.add(book);
    }
    public void rentBook(String title){
        // 도서 대여 기능구현
        for(Book book : bookList){
            if(book.getTitle().equals(title) && !book.isRented()){
                book.setRented(true);
                System.out.println(title + " 이(가) 대여되었습니다.");
                return;     // 메서드 종료
            }
        }
        System.out.println("대여할 수 없는 책입니다.");
    }
    public void returnBook(String title){
        // 도서 반납 기능구현
        for(Book book : bookList){
            if(book.getTitle().equals(title) && book.isRented()){
                book.setRented(false);
                System.out.println(title + " 이(가) 정상반납 되었습니다.");
                return;     // 메서드 종료
            }
        }
        System.out.println("반납할 수 없는 책입니다.");
    }
    public void printAvailableBooks(){
        // 대여 가능한 도서 목록 출력 기능구현
        System.out.println("-------------------------");
        System.out.println("대여 가능한 도서 목록");
        for(Book book : bookList){
            if(!book.isRented()){
                System.out.println(book.getTitle() + " - " + book.getAuthor() + " (" + book.getPubliYear() + ")");
            }
        }
        System.out.println("-------------------------");
    }
}