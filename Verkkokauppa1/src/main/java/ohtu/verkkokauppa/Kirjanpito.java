package ohtu.verkkokauppa;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class Kirjanpito implements KirjanpitoInterface {

    /*    private static Kirjanpito instance;
    
    public static Kirjanpito getInstance() {
        if ( instance==null) {
            instance = new Kirjanpito();
        }
        
        return instance;
    }*/

    private ArrayList<String> tapahtumat;

    public Kirjanpito() {
        this.tapahtumat = new ArrayList<String>();
    }

    @Override
    public void lisaaTapahtuma(String tapahtuma) {
        tapahtumat.add(tapahtuma);
    }

    @Override
    public ArrayList<String> getTapahtumat() {
        return tapahtumat;
    }
}
