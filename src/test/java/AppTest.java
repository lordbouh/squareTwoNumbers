//package ru.skillfactory.qajava.maven;

import org.example.App;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static org.testng.Assert.assertEquals;

public class AppTest {
//    public static void currentTime(){
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern ("yyyy/MM/dd HH:mm:ss");
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(dtf.format(now));
//    }
//    @BeforeClass
//    public static void beforeClass(){
//        System.out.println("Before class");
//        currentTime();
//    }
//    @AfterClass
//    public static void afterClass(){
//        System.out.println("After class");
//        currentTime();
//    }
    @DataProvider(name = "squareProvider")
    Object[][] dataProvider(){
        return new Object[][]{
                {2,2,4},
                {1,2,1},
                {-1,2,1},
                {0,2,0}
        };
    }
    @Test(dataProvider = "squareProvider")
    void powResult (double arg1, double arg2, double expected){
        double result = Math.pow(arg1,arg2);
        System.out.println(result);
       assertEquals(result, expected);
    }
}
