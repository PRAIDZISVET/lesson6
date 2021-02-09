package com.itacademy.lesson6;

public class oopDemo {
    public static void main(String[] args) {

       // test();
        //test2();
        Atm atm = new Atm();
        atm.print();
        atm.inputAtm20(0);
        atm.inputAtm50(2);
        atm.inputAtm100(1);
        atm.print();

        System.out.println(atm.outputAtm(110));


//        Atm atm1 = new Atm(5,12,23);
//        atm1.print();
//        atm1.inputAtm50(10);
//        atm1.print();
//        //atm1.inputAtm(250);
//        atm1.inputAtm100(2);
//
//        System.out.println(atm.outputAtm(3180));

    }

    private static void test2() {
        TimerDuration timerDuration = new TimerDuration(3934);
        timerDuration.print();
        System.out.println(timerDuration.totalSeconds());
    }

    private static void test() {
        Computer computer = new Computer("Windows",new Hdd(500), new Ram(1024));
        //computer.setName("Windows");
        //computer.setHdd(500);
        //computer.setRam(1024);

        computer.on();
        computer.load();
        computer.off();

        Computer computer2 = new Computer();
        computer2.setName("Mac");
        computer2.setHdd(new Hdd(400));
        computer2.setRam(new Ram(512));

        computer2.on();
        computer2.load();
        computer2.off();
    }
}
