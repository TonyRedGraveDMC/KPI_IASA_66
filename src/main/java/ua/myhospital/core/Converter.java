package ua.myhospital.core;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Converter {
    public static Timestamp convertToTimestamp (LocalDateTime ldt){
        return Timestamp.valueOf(ldt);
    }

    public  static LocalDateTime convertToLocalDateTime (Timestamp ts){
        return ts.toLocalDateTime();
    }
}
