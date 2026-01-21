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

        int o = 8;
        while (o <= 1) {
            System.out.print(o + " ");
            o -= 1;
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
        System.out.println("Uppgift 9:");

        boolean a = true, b = true, c = true;
        int i = 0, j = 0, k = 0;
        if (i >= j) {
            k += 100;
        }

        if (a) {
            i += j;
        }

        if (a && b) {
            c = true;
        }

        if (a || b) {
            c = false;
        }

        if ((a && b) || (b && c)) {
            b = (a && c);
        }

        if (!c && (b || !b)) {
            a = true;
        }

        if (!b) {
            a = true;
        } else {
            c = true;
        }

        if (c || a) {
            if (b) {
                j += k;
            } else {
                j = k;
            }
        } else {
            c = false;
        }

        System.out.print("hej: ");
        String words = input.next();
        System.out.print(words);

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