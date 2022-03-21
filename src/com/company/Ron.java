package com.company;

public class Ron extends Harry{
    public void spell(){
        super.spell();
        System.out.print("lumos ");
    }
    public String toString(){
        return super.toString() + "Ron ";
    }
}
