package model;

/**
 * Created by Jean-Pierre on 10.05.2017.
 */
public class Schueler extends Mensch{

    private Tadel[] tadelDesSchuelers;

    public Tadel[] getTadelDesSchuelers() {
        return tadelDesSchuelers;
    }

    public void setTadelDesSchuelers(Tadel[] tadelDesSchuelers) {
        this.tadelDesSchuelers = tadelDesSchuelers;
    }

    /**
     * Ein Objekt der Klasse Schüler.
     * @param name
     * @param alter
     */



    public Schueler(String name, int alter) {
        super(name,alter);
    }

    public void addKurs(Kurs neuerKurs){
        super.addKurs(neuerKurs);
    }


    /**
     * Ein Tadel wird der Menge der Tadel hinzugefügt.
     * Da wir auf der Datenstruktur Array arbeiten und diese eine statische Größe hat, müssen wir tricksen.
     * Überlegt euch etwas kluges!
     * @param neuerTadel
     */
    private void addTadel(Tadel neuerTadel){
        //TODO Hinzufügen eins Tadels für den Schüler.
        if(tadelDesSchuelers == null) {
            tadelDesSchuelers = new Tadel[1];
            tadelDesSchuelers[0] = neuerTadel;
        }else{

            Tadel[] hilfsArray = new Tadel[tadelDesSchuelers.length+1];

            for(int i = 0; i < tadelDesSchuelers.length; i++){
                hilfsArray[i] = tadelDesSchuelers[i];
            }

            hilfsArray[hilfsArray.length] = neuerTadel;

            tadelDesSchuelers = hilfsArray;

        }
    }


    /**
     * Methode erstellt aus den Informationen zum Schüler (Name, Alter, Kurse, Tadel) eine kompakte Information
     * und gibt diese als String zurück.
     * @return
     */
    public String getInfo(){
        String info = "Name:" + getName() + "Alter: " + getAlter() + "Kurse: " + getKurse() + "Tadel: " + getTadelDesSchuelers();
        //TODO Kompakte Zeichenkette zu den Informationen einer Lehrkraft - gut lesbar!
        return info;
    }
}
