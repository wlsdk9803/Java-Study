package lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        // split()
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

//        String joinStr = "";
//        for (String string : splitStr) {
//            joinStr += string + "-";
//        }
//        System.out.println("joinStr = " + joinStr); // Apple-Banana-Orange- // 마지막 '-'는 빼고 싶은데 이 과정이 매우 번거로움 // 아래가 그 과정...

//        for(int i=0; i< splitStr.length; i++){
//            String string = splitStr[i];
//            joinStr += string;
//            if(i != splitStr.length- 1) joinStr += '-';
//        }
//        System.out.println("joinStr = " + joinStr); // 성공적으로 'pple-Banana-Orange' 이렇게 나오지만 굉장히 번거로움...

        // join
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열: " + joinedStr);

        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
