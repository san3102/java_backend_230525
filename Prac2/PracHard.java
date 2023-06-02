package Prac2;

import java.util.ArrayList;
import java.util.List;

public class PracHard {
    public static void main(String[] args) {
        /*Book 클래스를 생성하고, 책의 제목, 저자, 출판연도, 대여 여부를 나타내는 인스턴스 변수를 가지도록 합니다.
                                title   author  pubYear isRented
        Library 클래스를 생성하고, 여러 개의 Book 객체를 관리합니다.
        addBook() 메서드를 작성하여 책을 도서관에 추가합니다.
        rentBook() 메서드를 작성하여 책을 대여합니다.
        returnBook() 메서드를 작성하여 대여한 책을 반납합니다.
        printAvailableBooks() 메서드를 작성하여 현재 대여 가능한 책의 목록을 출력합니다.
        */
        Book book1 = new Book("수학의 정석", "지은이", 2023);
        Book book2 = new Book("삼국지", "모름", 1955);
        Book book3 = new Book("선형대수학", "경문사", 2013);
        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printAvailableBooks();
        library.rentBook("수학의 정석");
        library.rentBook("Java란 무엇인가");
        library.rentBook("선형대수학");
        library.returnBook("수학의 정석");
        library.returnBook("수학의 정석");
        library.printAvailableBooks();

    }
}

class Book{
    private String title;
    private String author;
    private int pubYear;
    private boolean isRented;
    public Book (String title, String author, int pubYear){
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.isRented = false;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPubYear(){
        return pubYear;
    }
    public boolean isRented(){
        return isRented;
    }
    public void setRented(boolean isRented){
        this.isRented = isRented;
    }

}
class Library{
    private List<Book> bookList;
    public Library(){
        bookList = new ArrayList<>();
    }
    public void addBook(Book book){
        bookList.add(book);
    }
    public void rentBook(String title){
        for(Book book : bookList){
            if(book.getTitle().equals(title) && !book.isRented()){
                book.setRented(true);
                System.out.println(title + " 이(가) 대여되었습니다.");
                return;
            }
        }
        System.out.println("대여할 수 없는 책입니다.");
    }
    public void returnBook(String title){
        for(Book book : bookList){
            if(book.getTitle().equals(title) && book.isRented()) {
                book.setRented(false);
                System.out.println(title + " 이(가) 정상 반납되었습니다.");
                return;
            }
        }
        System.out.println("반납할 수 없는 책입니다.");
    }
    public void printAvailableBooks(){
        System.out.println("------------------------");
        for(Book book : bookList){
            if(!book.isRented()){
                System.out.println(book.getTitle() + " - " + book.getAuthor() + " (" + book.getPubYear() + ")");
            }
        }
        System.out.println("------------------------");
    }
}