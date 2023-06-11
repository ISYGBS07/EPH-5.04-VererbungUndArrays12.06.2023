package model;

public class Mensch {

    //Attribute
    protected String name;
    protected int alter;


    //Referenzen
    private Kurs[] kurse;
    private Unterrichtsfach[] faecher;

    public Mensch(String name, int alter) {
        this.name = name;
        this.alter = alter;
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

    public Kurs[] getKurse() {
        return kurse;
    }

    public void setKurse(Kurs[] kurse) {
        this.kurse = kurse;
    }

    public Unterrichtsfach[] getFaecher() {
        return faecher;
    }

    public void setFaecher(Unterrichtsfach[] faecher) {
        this.faecher = faecher;
    }

    public void addKurs(Kurs neuerKurs){

        if(kurse == null) {
            kurse = new Kurs[1];
            kurse[0] = neuerKurs;
        }else{

            Kurs[] hilfsArray = new Kurs[kurse.length+1];

            for(int i = 0; i < kurse.length; i++){
                hilfsArray[i] = kurse[i];
            }

            hilfsArray[hilfsArray.length] = neuerKurs;

            kurse = hilfsArray;

        }
    }

    public void addFach(Unterrichtsfach neuesFach) {
        //TODO Hinzufügen eines Faches, das ein Lehrer unterrichten kann.

        if (faecher == null) {
            faecher = new Unterrichtsfach[1];
            faecher[0] = neuesFach;
        } else {

            Unterrichtsfach[] hilfsArray = new Unterrichtsfach[faecher.length + 1];

            for (int i = 0; i < faecher.length; i++) {
                hilfsArray[i] = faecher[i];
            }

            hilfsArray[hilfsArray.length] = neuesFach;

            faecher = hilfsArray;

        }
    }
}
