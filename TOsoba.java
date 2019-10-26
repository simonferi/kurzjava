import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TOsoba implements IZena {

    private String meno;
    private Date datumNarodenia;
    private boolean tehotna = false;



    public TOsoba(String meno, Date datumNarodenia) {
        this.meno = meno;
        this.datumNarodenia = datumNarodenia;
    }

    public String dajMeno() {
        return meno;
    }

    public Date dajDatumNarodenia() {
        return datumNarodenia;
    }

    public static void main(String[] args) {
    
        List<IZena> zoznam = new ArrayList<IZena>();
        // List z2 = new ArrayList();

        TOsoba janka = new TOsoba("Janka", new Date(1996, 4, 1));
        janka.setTehotna(true);

        zoznam.add(new TOsoba("Jano", new Date(1977, 0, 23)));
        zoznam.add(new TOsoba("Jožo", new Date(1966, 4, 1)));
        zoznam.add(janka);


        for (IZena osoba : zoznam) {
            System.out.println(
                String.format(">>> Meno: %s, teh.: %s", 
                    osoba.dajMeno(), String.valueOf(osoba.isTehotna())));
        }
        
        IOsoba o = new IOsoba() {
            public String dajMeno() { return "Anonym"; }
            public Date dajDatumNarodenia() { return null; };
        };

        System.out.println(o.dajMeno());


    }

    public boolean isTehotna() {
        return tehotna;
    }

    public void setTehotna(boolean tehotna) {
        this.tehotna = tehotna;
    }

    
}