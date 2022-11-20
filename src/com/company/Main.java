package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("88006663636","Iphone", 350);
        Phone phone3 = new Phone("89007779898","Xiaomi",400);

        phone1.Show();
        phone2.Show();
        phone3.Show();

        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone1.receiveCall("Vladimir");
        phone2.receiveCall("Oleg");
        phone3.receiveCall("Andrey");

        phone1.receiveCall("Ruslan","900-373");
        phone2.receiveCall("Ilya","228-898");
        phone3.receiveCall("Gosha","02-02-02");

        phone1.sendMassage("33-44-55","123-321-999-00", "8909555495");
        phone2.sendMassage("456-654","98-65-23");
        phone3.sendMassage("512-777");

    }
}
