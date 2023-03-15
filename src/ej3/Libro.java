package ej3;

public class Libro {
    private String ISBN = "";
    private String Titulo = "";
    private String Autor = "";
    private int Npaginas = 0;

    public Libro (String ISBN,String Titulo,String Autor,int Npaginas){
        this.Titulo=Titulo;
        this.Autor=Autor;
        this.ISBN=ISBN;
        this.Npaginas = Npaginas;
    }
    


    public String getAutor() {
        return Autor;
    }
    public int getNpaginas() {
        return Npaginas;
    }
    public String getISBN() {
        return ISBN;
    }
    public String getTitulo() {
        return Titulo;
    }
    public void setAutor(String autor) {
        Autor = autor;
    }
    public void setNpaginas(int npaginas) {
        Npaginas = npaginas;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
    return "El libro "+Titulo+" con ISBN "+ISBN+" creado por el autor "+Autor+" tiene "+Npaginas+" paginas";
    }
}
