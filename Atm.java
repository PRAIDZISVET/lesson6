package com.itacademy.lesson6;

public class Atm {

    private int count20;
    private int count50;
    private int count100;

    public Atm() {
    }

    public Atm(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public void print() {
        int sum = count20 * 20 + count50 * 50 + count100 * 100;
        System.out.printf("20: %d, 50: %d, 100: %d, TOTAL: %d \n", count20, count50, count100, sum);
    }

    public int inputAtm20(int input20) {
        return count20 += input20;
    }

    public int inputAtm50(int input50) {
        return count50 += input50;
    }

    public int inputAtm100(int input100) {
        return count100 += input100;
    }

    public boolean outputAtm(int outputSum) {
        boolean result;
        int outCount20 = 0;
        int outCount50 = 0;
        int outCount100 = 0;
        int ostatok = outputSum;
        if ((outputSum > (count20 * 20 + count50 * 50 + count100 * 100)) || (outputSum % 20 != 0 && outputSum % 50 % 20 != 0)) {
            result = false;
            System.out.println("В банкомате отсутствует необходимая сумма денег либо отсутствуют нужные номиналы банкнот");
        } else {
            while (ostatok != 0) {
                if (count100 != 0 && ostatok >= 100) {
                    count100--;
                    ostatok -= 100;
                    outCount100++;
                } else if (count50 != 0 &&  ostatok >= 50 && ostatok % 50 % 20 == 0) {
                    count50--;
                    ostatok -= 50;
                    outCount50++;
                } else if (count20 != 0 && ostatok >= 20) {
                    count20--;
                    ostatok -= 20;
                    outCount20++;
                } else {
                    ostatok = 0;
                    System.out.println("Указанная сумма не может быть выдана. В банкомате отсутствуют нужные номиналы банкнот");
                }
            }
            result = outputSum == outCount20*20 + outCount50 * 50 + outCount100 * 100;
            System.out.printf("Выданы купюры: 20: %d, 50: %d, 100: %d \n",outCount20, outCount50, outCount100);
        }
        return result;
    }
}
