public class OddNumbers {
    public static void main(String[] args) {

        int min = 101;
        int max = 0;
        int sum = 0;

        System.out.println("Odd Numbers between 1 to 100:");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;

                if (i < min) min = i;
                if (i > max) max = i;
            }
        }

        System.out.println("\nMin: " + min);
        System.out.println("Max: " + max);
        System.out.println("Sum: " + sum);

        int count = 0;
        int sum50 = 0;
        int minOdd = Integer.MAX_VALUE;
        int maxOdd = 0;

        System.out.println("\nOdd Numbers between 1 to 50:");

        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
                sum50 += i;

                if (i < minOdd) minOdd = i;
                if (i > maxOdd) maxOdd = i;
            }
        }

        double avg = (double) sum50 / count;

        System.out.println("\n\nThree Minimum Odd Numbers Sum: " + (1 + 3 + 5));
        System.out.println("Three Maximum Odd Numbers Sum: " + (45 + 47 + 49));
        System.out.println("Average Odd Numbers: " + avg);
    }
}