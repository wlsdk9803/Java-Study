package ref;

public class VarChange2 {
    public static void main(String[] args) {
//        참조형 예시
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; //dataA에 저장된 참조값이 복사되어서 dataB에 저장
        //변수 dataA가 가르키는 인스턴스를 복사하는 것이 아님
        //따라서 같은 인스턴스를 참조하므로 출력 시 같은 값이 나온다.

        System.out.println("dataA 참조값 =" + dataA);
        System.out.println("dataB 참조값 =" + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }
}
