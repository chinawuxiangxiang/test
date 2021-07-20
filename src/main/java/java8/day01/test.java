package java8.day01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class test
{
    public static void main(String[] args)
    {
        String name = "tetst112ffds";

        List<String> strs = new ArrayList<String>();
        strs.add("1");
        strs.add("2");
        strs.add("3");

        strs.stream().filter((str) -> new LanmbdaTestInterfaceI().test1(str)).forEach(System.out::println);

        boolean x = strs.stream().allMatch((str) -> str.equals("2"));

        System.out.print("---------------------------");

        strs.stream().map((str) -> new LanmbdaTestInterfaceI2().filter(str)).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("---------------------------1");
        strs.stream().map((y)->y).forEach(System.out::println);

        String yuy = strs.stream().map((y)->y).collect(Collectors.joining());

       String result = strs.stream().reduce("", (k, j) -> {
           if (j.equals("2")){
             return k;
           }
           else{
               return k + j;
           }
       });

        System.out.println(result);
    };
}
