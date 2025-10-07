public class dragonsroar {
        public static void main(String[] args) {
        int n = 5;
        printNumbers(1, n);
    }
    public static void printNumbers(int current, int n) {
        if (current > n) return;
        System.out.print(current + " ");
        printNumbers(current + 1, n);
    }
}