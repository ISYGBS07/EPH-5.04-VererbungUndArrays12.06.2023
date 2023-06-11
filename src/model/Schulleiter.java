package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Schulleiter extends Lehrer{

    //Attribute
    private String name;
    private int alter;
    private String besoldungsGruppe;

    //Referenzen
    private Kurs[] kurseDesLehrers;
    private Unterrichtsfach[] faecherDesLehrers;

    /**
     * Ein Objekt der Klasse Schulleiter hebt sich von einem Lehrer einzig dadurch ab,
     * dass es einem Schüler einen Tadel ausstellen kann.
     * @param name
     * @param alter
     * @param besoldungsGruppe
     */
    public Schulleiter(String name, int alter, String besoldungsGruppe) {
        super(name,alter,besoldungsGruppe);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }



    public String getBesoldungsGruppe() {
        return besoldungsGruppe;
    }

    public void setBesoldungsGruppe(String besoldungsGruppe) {
        this.besoldungsGruppe = besoldungsGruppe;
    }

    /**
     * Ein Kurs wird der Menge der Kurse hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerKurs
     */
    public void addKurs(Kurs neuerKurs){
        super.addKurs(neuerKurs);
    }

    /**
     * Ein Fach wird der Menge der unterrichtenden Fächer hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuesFach
     */
    public void addFach(Unterrichtsfach neuesFach){
        super.addFach(neuesFach);
    }

    /**
     * Einem Schüler wird ein Tadel hinzugefügt.
     * @param s Der zu tadelnde Schüler.
     * @param t Der Tadel.
     */
    public void tadelEinenSchueler(Schueler s, Tadel t){
        //TODO Umsetzung dafür, dass ein Schulleiter einem Schüler einen Tadel geben kann.
    }

    /**
     * Methode erstellt aus den Informationen zum Schulleiter (Name, Alter, Besoldungsgruppe, Kurse, Fächer) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        return super.getInfo();
    }
}
