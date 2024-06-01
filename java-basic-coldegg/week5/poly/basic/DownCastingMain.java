package week5.poly.basic;

public class DownCastingMain {

    public static void main(String[] args) {
        //부모 타입으로 자식 인스턴스 참조 : 다형적 참조
        Parent poly = new Child(); //x001
        //이 때 상속은 아래가 위를 물려받은 것이므로,
        //위에서 아래의 정보는 없으므로 자식의 메소드는 호출 불가능
        //이를 다운 캐스팅을 통해 부모가 자식을 호출하도록 만들 것임

        //1. 다운캐스팅
        //child타입의 변수를 하나 더 만들어서 poly에 담긴 참조값을 복사
        //그렇게 타입이 다운된 child를 통해서 child 메소드를 호출
        Child child1 = (Child) poly; //x001
        child1.childMethod();
        //캐스팅(Child)로 parent 타입을 Child로 바꾼 후, 그걸 Child 타입의 child 변수에 담는다
        //새로운 변수에 담는 것이므로 poly 자체가 변하는 게 아님

        //2. 일시적 다운캐스팅
        //새로운 변수에 담는 게 번거로움 => 자식 메소드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();

    }
}
