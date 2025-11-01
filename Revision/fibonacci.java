

public class fibonacci {
    public static void main(String[] args) {
        int series=10;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2+" ");
        fibo(series,n1,n2);
        
    }
    static void fibo(int n, int n1,int n2){
        int n3;
        for (int i = 0; i < n-2; i++) {
            n3 = n1+n2;
            n1 = n2;
            n2= n3;
            System.out.print(n3+" ");
        }
    }
}
