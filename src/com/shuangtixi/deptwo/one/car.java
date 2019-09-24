package com.shuangtixi.deptwo.one;

 class Vrhicles{
    public String brand;
    public String color;
    public void run(){
        System.out.println("我已经开动了");
    }
    public void showInfo(){
        System.out.println("商标为"+brand);
        System.out.println("颜色为"+color);
}}
    class car extends Vrhicles{
    private int seats;
    public void showCar(){
      showInfo();
    }
 }
 class Truck extends Vrhicles{
     private float load;
     public void showTruck(){
         showInfo();
     }
 }