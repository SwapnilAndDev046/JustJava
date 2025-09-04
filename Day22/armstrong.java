package Day22;

public class armstrong {
    public static void main(String[] args) {
        int n = 1634;
        Armstrong(n);
    }
    static void Armstrong(int n){
        String sc = String.valueOf(n);
        if (sc.length()==3) {
            int fd = n/100;
            int md = (n%100)/10;
            int ld = (n%100)%10;
            String output = Math.pow(fd, 3) + Math.pow(md, 3) + Math.pow(ld, 3) == n ? "yess it is arm" : "nooooo";
            System.out.println(output);
        }else if (sc.length()==4) {
            int fd = n/1000;
            int md1 = (n%1000)/100;
            int md2 = (n%100)/10;
            int ld = (n%100)%10;
            String output = Math.pow(fd, 4) + Math.pow(md1, 4) + Math.pow(md2, 4) + Math.pow(ld, 4) == n ? "yess it is arm" : "nooooo";
            System.out.println(output);
        }
    }
}
