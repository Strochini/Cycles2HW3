public class Main {
    public static void main(String[] args) {

        // Task 1

        int startYear = 2022 - 200;
        int endYear = 2022 + 100;
        int result = 0;

        for (; result < endYear; result = result + 79) {
            if (result % 79 == 0 && result > startYear) {

                System.out.println(result);
            }
        }
        // Task 2

        int two = 2;
        int factor = 1;
        int result0 = 0;

        for (; factor <= 10; factor ++) {
            result0 = two * factor;
            System.out.println(two + "*" + factor + "=" + result0);
        }
    }
}