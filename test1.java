public class test1 {
    public static void main(String[] args) {
        System.out.println();

        for (int i = 1; i < 9; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 8; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 8; i++) {
            System.out.print(i * i + " ");
        }

        System.out.println();

        for (int i = 1; i <= 11; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 11; i >= -9; i -= 4) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        int i = 8;
        while (i <= 1) {
            System.out.print(i + " ");
            i -= 1;
        }

        System.out.println();

        int ii = 1;
        while (ii <= 11) {
            System.out.print(ii + " ");
            ii += 2;
        }

        System.out.println();

        int iii = 11;
        while (iii >= -9) {
            System.out.print(iii + " ");
            iii -= 4;
        }

        System.out.println();
        System.out.println();
        System.out.println();

        int l = 1;
        do {
            System.out.print(l + " ");
            l++;
        } while (l <= 8);

        System.out.println();

        int h = 11;
        do {
            System.out.print(h + " ");
            h -= 4;
        } while (h >= -9);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.print("Uppgift 8: ");
        System.out.println(sittplatser(6));

        System.out.println();
        System.out.println();
        System.out.println();

    }

    static int sittplatser(int n) {
        int antalPlatser = 10;
        for (int i = 2; i <= n; i++) {
            antalPlatser += 2;
            if (i % 5 == 0) {
                antalPlatser += 1;
            }
        }
        return antalPlatser;
    }

}