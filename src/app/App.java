package app;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        ArbreBinaire Root = new ArbreBinaire("G");
        Root.setFilsGauche(new ArbreBinaire("C"));
        Root.setFilsDroit(new ArbreBinaire("F"));
        Root.getFilsGauche().setFilsGauche(new ArbreBinaire("A"));
        Root.getFilsGauche().setFilsDroit(new ArbreBinaire("B"));
        Root.getFilsDroit().setFilsGauche(new ArbreBinaire("D"));
        Root.getFilsDroit().setFilsDroit(new ArbreBinaire("E"));
        for (Iterator<ArbreBinaire> iterator = Root.iterator(); iterator.hasNext(); ) {
            ArbreBinaire element = iterator.next();
            System.out.println(element.getEtiquette());
        }
    }

}

