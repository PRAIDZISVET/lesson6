package com.itacademy.lesson6;

public class Computer {
    private static String CURRENT_VALUE = "Common";
    private String name;
    private Hdd hdd;
    private Ram ram;


    public Computer (String name, Hdd hdd, Ram ram) {

     this.name = name;
     this.hdd = hdd;
     this.ram = ram;
   }
 // Перегрузка конструктора Computer
 public Computer () {
   // this ("asdf", 500, 1024);
  }

    public void on () {
        System.out.println("Я включился " + name +" hdd: " + hdd.getCapacity() + " ram: "+ ram.getCapacity());
    }

    public void load () {
        System.out.println("Я загрузился");
    }

    public void off () {
        System.out.println("Я выключился");
    }


    // сеттеры
    public void setName (String name) {
        this.name = name;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    //геттеры
    public String getName () {
        return this.name;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public Ram getRam() {
        return ram;
    }
}
