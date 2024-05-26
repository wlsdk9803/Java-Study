package ref;
public class VarChange2 {
    public static void main(String[] args) {

        Data dataA = new Data();
        dataA.value = 10; //value 속성값 10
        Data dataB = dataA; //dataB에 dataA 참조값을 복사

        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB); //둘의 참조값은 같다.
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value); //동일참조값.value이므로 같다.

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value); //동일참조값.value이므로 20으로 같다.

        //dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value); //동일참조값.value이므로 30으로 같다.

    }
}