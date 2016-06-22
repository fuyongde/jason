package com.jason;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date d = simpleDateFormat.parse("20150601");
        System.out.println(d);

        System.out.println( "Hello World!" );
    }
}
