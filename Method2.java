public class Method2 {
    public static void division(int a, int b) {
        int c = a % b;
//        System.out.println("Your:" + c);
        if (c == 0) {
            System.out.println("Делится!");
        } else {
            System.out.println("Делится с остатком: " +c);
        }
    }
}
