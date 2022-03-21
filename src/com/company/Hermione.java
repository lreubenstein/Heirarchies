package com.company;

public class Hermione extends Ron{
    public void potions(){
        super.potions();
        System.out.print("Veritaserum ");
    }
    public String toString(){
        return "Hermione " + super.toString();
    }
    public void transfiguration(){
        System.out.print("otter ");
        super.transfiguration();
    }
}
