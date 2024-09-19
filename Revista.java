package seesion_14_practice;

public class Revista extends Item implements Imprumutabil{
    private int numarEditie;
    private boolean disponibil;

    public Revista(String titlu, int anPublicare, int numarEditie) {
        super(titlu, anPublicare);
        this.numarEditie = numarEditie;
        this.disponibil = true;
    }

    public int getNumarEditie() {
        return numarEditie;
    }

    @Override
    public void imprumuta() {
        if (disponibil) {
            disponibil = false;
            System.out.println("Revista a fost împrumutată.");
        } else {
            System.out.println("Revista nu este disponibilă pentru împrumut.");
        }
    }

    @Override
    public void returneaza() {
        disponibil = true;
        System.out.println("Revista a fost returnată.");
    }

    @Override
    public boolean esteDisponibil() {
        return disponibil;
    }

    @Override
    public String getDetalii() {
        return "Revista: " + getTitlu() + ", Numar Ediție: " + getNumarEditie() + ", An Publicare: " + getAnPublicare();
    }







}
