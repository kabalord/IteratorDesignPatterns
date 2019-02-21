package iterator;

import app.ArbreBinaire;

import java.util.Iterator;

public class ArbreBinaireIterator implements Iterator<ArbreBinaire> {

    public ArbreBinaire arbreBinaire;
    boolean me;

    ArbreBinaireIterator FilsGaucheIterator;
    ArbreBinaireIterator FilsDroitIterator;

    public ArbreBinaireIterator(ArbreBinaire arbreBinaire) {
        super();
        me = false;
        this.arbreBinaire = arbreBinaire;
        if(arbreBinaire.getFilsGauche()!=null) {
            this.FilsGaucheIterator = arbreBinaire.getFilsGauche().iterator();
        }
        if(this.arbreBinaire.getFilsDroit()!=null) {
            this.FilsDroitIterator = this.arbreBinaire.getFilsDroit().iterator();
        }
    }

    @Override
    public boolean hasNext() {
        if(this.FilsDroitIterator!=null && this.FilsDroitIterator.hasNext()) {
            return true;
        }
        else if(this.FilsDroitIterator!=null && this.FilsDroitIterator.hasNext()) {
            return true;
        }
        else if(!me) {
            return true;
        }
        return false;
    }

    @Override
    public ArbreBinaire next() {
        if(this.FilsGaucheIterator!=null && this.FilsGaucheIterator.hasNext()) {
            return FilsGaucheIterator.next();
        }
        else if(this.FilsDroitIterator!=null && this.FilsDroitIterator.hasNext()) {
            return FilsDroitIterator.next();
        }
        else if(!me) {
            me = true ;
            return this.arbreBinaire;
        }
        return null;
    }

}