package java8.day01;

import java.util.Random;

public class LanmbdaTestInterfaceI2 implements  LanmbdaTestInterface2{
    @Override
    public String filter(String str) {
        if (str.equals("2")){

            return str;

        }
        else{
           return  String.valueOf(new Random(100).nextInt());
        }
    }
}
