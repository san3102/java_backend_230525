package day3.Input;

import java.io.IOException;

public class Input {
    public static void main(String[] args) {
        try {
            int num = System.in.read();
            System.out.println("출력 : " + num);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
