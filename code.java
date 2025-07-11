public class Code {
    public static void main(String[] args) {
        // Generate and print 10 random integers between 1 and 100
        java.util.Random rand = new java.util.Random();
        System.out.println("Random numbers:");
        for (int i = 0; i < 10; i++) {
            int randomNum = rand.nextInt(100) + 1;
            System.out.println(randomNum);
            System.out.println("me")
        }
    }
}