package app;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        ArbreBinaire Root = new ArbreBinaire("1");
        Root.setFilsGauche(new ArbreBinaire("2"));
        Root.setFilsDroit(new ArbreBinaire("3"));
        Root.getFilsGauche().setFilsGauche(new ArbreBinaire("4"));
        Root.getFilsGauche().setFilsDroit(new ArbreBinaire("5"));
        Root.getFilsDroit().setFilsGauche(new ArbreBinaire("6"));
        Root.getFilsDroit().setFilsDroit(new ArbreBinaire("7"));
        for (Iterator<ArbreBinaire> iterator = Root.iterator(); iterator.hasNext(); ) {
            ArbreBinaire element = iterator.next();
            System.out.println(element.getEtiquette());
        }
    }

}

