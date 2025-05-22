public class Libro {
    // Attributi
    private int cod_Libro; //codice identificativo del libro
    private String titolo; //titolo del libro
    private String autore; //autore del libro
    private int anno_Pubblicazione; //anno di pubblicazione del libro
    // Metodi
    //costruttore di default
    public Libro(){
        cod_Libro = 0;
        titolo = "";
        autore = "";
        anno_Pubblicazione = 0;
    }
    //costruttore con parametri
    public Libro(int cod_L, String ttl, String aut, int anno_P){
        this.cod_Libro = cod_L;
        this.titolo = ttl;
        this.autore = aut;
        this.anno_Pubblicazione = anno_P;
    }
    //metodi per la selezione dei dati
    public int getCod_Libro(){
        return this.cod_Libro;
    }
    public String getTitolo(){
        return this.titolo;
    }
    public String getAutore(){
        return this.autore;
    }
    public int getAnno_Pubblicazione(){
        return this.anno_Pubblicazione;
    }
    //metodi per la modifica dei dati
    public void setCod_Libro(int cod_L){
        this.cod_Libro = cod_L;
    }
    public void setTitolo(String ttl){
        this.titolo = ttl;
    }
    public void setAutore(String aut){
        this.autore = aut;
    }
    public void setAnno_Pubblicazione(int anno_P){
        this.anno_Pubblicazione = anno_P;
    }
    //metodo per la visualizzazione dei dati
    public String toString(){
        return "Codice Libro: " + this.cod_Libro + "\n" +
               "Titolo: " + this.titolo + "\n" +
               "Autore: " + this.autore + "\n" +
               "Anno di Pubblicazione: " + this.anno_Pubblicazione;
    }
    
}
