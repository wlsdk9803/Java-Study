package lang.String.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple, Banana, Orange";

        // split()
        String[] splitStr = str.split(", ");
        for (String s: splitStr) {
            System.out.println(s);
        }

        String joinStr = "";
        for (String string : splitStr) {
            joinStr += string + "-";
        }

        System.out.println("joinStr = " + joinStr); //joinStr = Apple- Banana- Orange-

        joinStr = "";
        for (int i = 0; i < splitStr.length; i++) {
            String string = splitStr[i];
            joinStr += string;
            if(i != splitStr.length -1 ) {
                joinStr += "-";
            }
        }

        System.out.println("joinStr = " +joinStr);
        //join()
        joinStr = String.join("-", "A", "B", "C");
        System.out.println("joinStr = " + joinStr);

        String result = String.join("-", splitStr);//배열 사이에 delimiter 끼워넣기
        System.out.println("result = " + result);
    }
}
