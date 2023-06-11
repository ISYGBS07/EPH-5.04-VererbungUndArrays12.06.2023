package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Lehrer extends Mensch{

    //Attribute
    private String besoldungsGruppe;


    /**
     * Ein Objekt der Klasse Lehrer wird erstellt.
     * @param name
     * @param alter
     * @param besoldungsGruppe    Gehaltsstufen von Lehrern
     */
    public Lehrer(String name, int alter, String besoldungsGruppe) {
        super(name,alter);
        this.besoldungsGruppe = besoldungsGruppe;
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
     * Sobald das Array erweitert wurde, muss dem Kurs noch mitgeteilt werden, dass dieser Lehrer den Kurs übernimmt.
     * @param neuerKurs
     */
    public void addKurs(Kurs neuerKurs){
        super.addKurs(neuerKurs);
        neuerKurs.setLehrkraft(this);
    }

    /**
     * Ein Fach wird der Menge der unterrichtenden Fächer hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuesFach
     */
    public void addFach(Unterrichtsfach neuesFach){
        //TODO Hinzufügen eines Faches, das ein Lehrer unterrichten kann.
        super.addFach(neuesFach);
    }

    /**
     * Methode erstellt aus den Informationen zum Lehrer (Name, Alter, Besoldungsgruppe, Kurse, Fächer) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        String info = "Name:" + getName() + "Alter: " + getAlter() + "Kurse: " + getKurse() + "Fächer: " + getFaecher() + "Besoldungsstufe: " + getBesoldungsGruppe();
        //TODO Kompakte Zeichenkette zu den Informationen einer Lehrkraft - gut lesbar!
        return info;
    }
}
