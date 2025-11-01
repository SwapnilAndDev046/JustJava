

public class oneto100prim2 {
    static void Oneto100prime() {
        for (int i = 2; i < 101; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count <= 2) {
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        Oneto100prime();
    }
}
