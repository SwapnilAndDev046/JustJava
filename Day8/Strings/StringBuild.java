package Day8.Strings;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <26 ; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);// like an array it keeps adding the new coming character
        }
        builder.deleteCharAt(4);//e gets deleted
        System.out.println(builder.toString());//convert builder to String
    }
}
