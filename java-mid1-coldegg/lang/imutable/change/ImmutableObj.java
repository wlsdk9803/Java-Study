package lang.imutable.change;

public class ImmutableObj {

    private final int value; //final 붙였는데 사용자임의 생성자가 없으면, 기본생성자 0으로만 존재되므로 의미가 없어서 err메세지가 뜸

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue){
        int result = value + addValue;
        return new ImmutableObj(result); //값을 수정하는 대신, 새로운 값을 넣은 객체를 새로 생성하여 반환
    }

    public int getValue() {
        return value;
    }

//    public void setValue(int value) {
//        this.value = value;
//    }
}
