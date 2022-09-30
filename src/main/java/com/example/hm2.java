package com.example;

public class hm2 {
    public static void main(String[] args) {
        //  5. Дано трехзначное число. Изменить одну его цифру так, чтобы оно стало палиндромом (одинаково читается справа налево и слева направо).

        int x=1, y=2, z=3;
        int a = 100 * x + 10 * y + z;
        if (x!=z) {
            z = x;
            a = 100 * x + 10 * y + z;
            System.out.println(a);
        }
            else System.out.println(a);

    }
}
