package model;

public class Discount {
    public double calculate(Integer num) {

            if (num >= 1 && num <= 99)
                return 1.0;
            else if (num >= 100 && num <= 299)
                return 0.05;
            else if (num >= 300 && num <= 999)
                return 0.1;
            return 0;

    }

}
