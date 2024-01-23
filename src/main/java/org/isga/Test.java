package org.isga;

public class Test {
    public static void main(String[] args) {

        Personnage personnage = new Roi();

        personnage.setArme(new Chevalier());
        personnage.utiliserArme();
        personnage.combattre();

        try {
            personnage.utiliserArme();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}



