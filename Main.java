
     public class Main{
    public static void main(String[] args) {
        int max = 0;
        for (int i = 9999; i >= 1000 ; i--) {
            if (i % 13 == 0 && i % 10 == 0) {
                max = i;
                break;
            }
        }
        System.out.println(" largest 4 digit number divisible by 13 and 10 is: " + max);
    }
}
    

