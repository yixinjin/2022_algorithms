package draft;

public class TestRecursion {

    public static void main(String[] args) {
//        inception();

        System.out.println(findFactRec(10));
        System.out.println(findFactIterate(10));

        System.out.println(findFib(11));
    }

    private static int count = 0;

    public static void inception() {
        if (count > 2) {
            System.out.println("done");
            return;
        }
        count++;
        inception();
    }

    public static long findFactRec(int num) {
        if (num <= 2) {
            return num;
        }
        return num * findFactRec(num - 1);
    }

    public static long findFactIterate(int num) {
        if (num <= 2) return num;

        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static int findFib(int index) {
        if (index == 1) return 0;
        if (index == 2) return 1;
        else return findFib(index - 1) + findFib(index - 2);
    }
}
