package S1;

public class Mathaufgabe {

    public double add(double x, double y) {
        return x + y;
    }

    public double diff(double x, double y) {
        return x - y;
    }

    public Boolean is_perfect(double value) {
        int sum_divisors = 0;
        for (int i = 2; i < value / 2; i++) {
            if (value % i == 0) {
                sum_divisors += i;
            }
        }
        if (sum_divisors == value)
            return true;
        return false;
    }

    public double mul(double x, double y) {
        double sum = 0, init_x = x;
        if (x > 0) {
            while (x != 0) {
                sum += y;
                x--;
            }
        } else {
            while (x != 0) {
                sum += y;
                x++;
            }
        }
        if (y < 0 && init_x < 0) {
            return -sum;
        }
        return sum;
    }
}
