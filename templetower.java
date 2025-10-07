public class templetower {
    public static void main(String[] args) 
    {
        int n = 3;
        moveDisks(n, 'A', 'C', 'B');
    }
    public static void moveDisks(int n, char source, char des, char helper) {
        if (n == 0) return;
        moveDisks(n - 1, source, helper, des);
        System.out.println("Move stone " + n + " from " + source + " to " + des);
        moveDisks(n - 1, helper, des, source);
    }
}