import java.util.*;
public class Libreria{
    private int cod_Libreria; //codice identificativo della libreria
    private int num_Libri; //numero di libri presenti nella libreria
    private String genere_Libreria; //genere della libreria
    private ArrayList<Libro> libri; //lista di libri presenti nella libreria
    public Libreria(){
        cod_Libreria = 0;
        num_Libri = 0;
        genere_Libreria = "";
        libri = new ArrayList<>();
    }
    public Libreria(int cod_L, String ttl, String aut, int anno_P, int cod_Lib, int num_L, String gen_L){
        //super(cod_L, ttl, aut, anno_P);
        this.cod_Libreria = cod_Lib;
        this.num_Libri = num_L;
        this.genere_Libreria = gen_L;
        this.libri = new ArrayList<>();
    }
    public int getCod_Libreria(){
        return this.cod_Libreria;
    }
    public int getNum_Libri(){
        
            return this.num_Libri;
    }
    public String getGenere_Libreria(){
        return this.genere_Libreria;
    }
    public void setCod_Libreria(int cod_Lib){
        this.cod_Libreria = cod_Lib;
    }
    public void setNum_Libri(int num_L){
        this.num_Libri = num_L;
    }
    public void setGenere_Libreria(String gen_L){
        this.genere_Libreria = gen_L;
    }
    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Codice Libreria: ").append(this.cod_Libreria).append("\n")
      .append("Numero Libri: ").append(this.num_Libri).append("\n")
      .append("Genere Libreria: ").append(this.genere_Libreria).append("\n")
      .append("I libri dentro la libreria sono:\n");
    for (Libro libro : libri) {
        sb.append(libro.toString()).append("\n");
     }
    return sb.toString();
}
    public void aggiungiLibro(Libro libro){ 
        this.libri.add(libro); //aggiunge il libro alla lista
        this.num_Libri = libri.size(); //aggiorna il numero di libri
    }
    public void creaLibro(){ //crea un libro
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci quanti libri vuoi aggiungere: ");
        int num_L = input.nextInt(); //inserisce il numero di libri

        for (int i = 0; i < num_L; i++) {
            System.out.println("Inserisci il codice del libro: ");
            int cod_L = input.nextInt(); //inserisce il codice del libro
            input.nextLine(); 

            System.out.println("Inserisci il titolo del libro: "); 
            String ttl = input.nextLine(); //inserisce il titolo del libro

            System.out.println("Inserisci l'autore del libro: ");
            String aut = input.nextLine(); //inserisce l'autore del libro

            System.out.println("Inserisci l'anno di pubblicazione del libro: ");
            int anno_P = input.nextInt(); //inserisce l'anno di pubblicazione del libro
            input.nextLine();

            Libro libro = new Libro(cod_L, ttl, aut, anno_P); //crea un oggetto libro
            
            aggiungiLibro(libro); //aggiunge il libro alla lista
            System.out.println("Libro aggiungo alla libreria!"); //messaggio di conferma
        }
        input.close();
        
    }
}
