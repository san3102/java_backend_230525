package textboardpractice.article.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Util {
    public static String currentTime(){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String postPutUpDate = currentDateTime.format(formatter);
        return postPutUpDate;
    }
}
