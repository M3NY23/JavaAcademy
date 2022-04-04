@FunctionalInterface
interface Basic {
    public int perfomOperation(int num1, int num2);
}

@FunctionalInterface
interface Verification {
    public boolean identify(int num);
}

@FunctionalInterface
interface Sequence {
    public int performSequence(int num);
}

class Calculator {

    public static int add(int num1, int num2) {
        Basic sum = (int x, int y) -> x + y;
        return sum.perfomOperation(num1, num2);
    }

    public static int sub(int num1, int num2) {
        Basic sub = (int x, int y) -> x - y;
        return sub.perfomOperation(num1, num2);
    }

    public static boolean isOdd(int num) {
        Verification odd = (int x) -> (x % 2 == 0);
        return odd.identify(num);
    }

    public static boolean isPrime(int num) {
        Verification prime = (int x) -> {
            if (x == 0 || x == 1)
                return false;
            for (int i = 2; i <= x / 2; i++)
                if (x % i == 0)
                    return false;
            return true;
        };
        return prime.identify(num);
    }

    public static int getFactorial(int num) {
        Sequence factorial = (int x) -> {
            if (x == 0 || x == 1)
                return 1;
            int result = 1;
            for (int i = 1; i <= x; i++)
                result *= i;
            return result;
        };
        return factorial.performSequence(num);
    }
}