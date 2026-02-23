public class FullPyramid {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (char i = 'E'; i >= 'A'; i--) {

            for (char j = 'A'; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}