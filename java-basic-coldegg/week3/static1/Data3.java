package week3.src.static1;

public class Data3 {
    public String name;
    public static int count; //static변수 선언

    public Data3(String name){
        this.name = name;
        count++;
    }
}
