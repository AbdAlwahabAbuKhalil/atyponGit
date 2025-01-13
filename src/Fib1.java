public class Fib1 {
    public int calculate(int num) {
        if (num <= 1) {
            return num;
        }
        return calculate(num - 1) + calculate(num - 2);
    }
}
