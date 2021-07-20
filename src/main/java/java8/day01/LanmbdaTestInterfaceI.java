package java8.day01;

public class LanmbdaTestInterfaceI implements  LanmbdaTestInterface{

    @Override
    public boolean test1(String str) {

        if (str.equals("2")){
            return true;
        }
        else{
            return false;
        }
    }
}
