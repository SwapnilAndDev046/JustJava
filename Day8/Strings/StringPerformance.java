package Day8.Strings;

public class StringPerformance {
    public static void main(String[] args) {
        String Alphabets = "";
        for (int i = 1; i <26 ; i++) {
            char alpha = (char)('a'+i);
            Alphabets = Alphabets+alpha;
          }
      System.out.println("a"+Alphabets);
    }
}
