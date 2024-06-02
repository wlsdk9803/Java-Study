package lang.object.tostring;

public class Dog {
    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "dogName = " + dogName + "/" + "age = "+ age;
//    }

    @Override
    public String toString() { // alt+insert 누르고 toString 선택
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}
