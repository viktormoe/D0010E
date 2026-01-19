public class ovning {

    public static int sittplatser(int n) {
        int platser = 10;
        for (int r = 2; r <= n; r++) {
            platser += 2;
            if (r % 5 == 0)
                platser++;
        }
        return platser;
    }

    public static void main(String[] args) {
        // Test example
        int result = sittplatser(12);
        System.out.println("Sittplatser för 12 rader: " + result);
    }
}