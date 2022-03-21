package com.company;

public class Griffindor {
    public void spell(){
        System.out.print("Expellaramus ");
    }
    public String toString(){
        return "Griffindor ";
    }
    public void potions(){}
    public void transfiguration(){}

    public static void main(String[] args) {
        Griffindor [] hs = {new Ron(), new Hermione(), new Harry()};

        for(Griffindor g:hs){
            g.potions();
            System.out.println();
            g.transfiguration();
            System.out.println();
            System.out.println(g);
            System.out.println();
        }
    }
}
