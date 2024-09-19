package seesion_14_practice;

public class Carte extends Item implements Imprumutabil {
    private String autor;
    private boolean disponibil;

    public Carte(String titlu, int anPublicare, String autor) {
        super(titlu, anPublicare);
        this.autor = autor;
        this.disponibil = true;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void imprumuta() {
        if (disponibil) {
            disponibil = false;
            System.out.println("Cartea a fost împrumutată.");
        } else {
            System.out.println("Cartea nu este disponibilă pentru împrumut.");
        }
    }

    @Override
    public void returneaza() {
        disponibil = true;
        System.out.println("Cartea a fost returnată.");
    }

    @Override
    public boolean esteDisponibil() {
        return disponibil;
    }

    @Override
    public String getDetalii() {
        return "Carte: " + getTitlu() + ", Autor: " + autor + ", An Publicare: " + getAnPublicare();
    }
}