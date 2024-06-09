package lang.object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // toString()은 Object 클래스의 메서드
        String string = child.toString(); //toString -> 객체에 대한 정보를 반환해 주는 메서드
        // lang.object.Child@30f39991 -> 클래스명, 인스턴스에 대한 정보 제공
        System.out.println(string);
    }
}
