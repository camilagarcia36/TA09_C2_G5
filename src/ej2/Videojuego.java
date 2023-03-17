package ej2;

public class Videojuego implements Entregable{

	private final static int HORAS_ESTIMADAS_DEF=100;
	
    public final static int MAYOR=1;
    
    public final static int MENOR=-1;
    
    
    public final static int IGUAL=0;
    
    private String titulo; 
    private int horasEstimadas; 
    private boolean entregado; 
    private String genero; 
    private String compania;
    
    public Videojuego()
    { }
    
    public Videojuego(String titulo, String compañia) {
    	this.titulo= titulo; 
    	this.compania = compania; 
    	int HORAS_ESTIMADAS_DEF; 
    	
    }
    
    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
    	this.titulo = titulo; 
    	this.horasEstimadas = horasEstimadas; 
    	this.genero = genero;
    	this.compania = compania;
    	this.entregado =false; 
    }
    
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String compania) {
		this.compania = compania;
	} 
    
    public void entregar() {
    	entregado =true;
    }
    
    
    public void devolver() {
    	entregado = false; 
    }
    
    public boolean isEntregado() {
    	if(entregado) {
    		return true; 
    	} 
    	return false; 
    }
    @Override
    public int compareTo(Object a) {
		int estado = MENOR;

		Videojuego ref = (Videojuego) a;
		if (horasEstimadas > ref.getHorasEstimadas()) {
			estado = MAYOR;
		} else if (horasEstimadas == ref.getHorasEstimadas()) {
			estado = IGUAL;
		}

		return estado;
		
	}
    
    
    public String toString() {
    	return "Informacion del videojuego con más horas estimadas \n"+ "El titulo es " 
    + titulo + ", las horas estimadas son " + horasEstimadas 
    + ". el genero es " + genero + " y la compañia es " + compania;
    	
    }
    
   public boolean equals(Videojuego a) {
	   if(titulo.equalsIgnoreCase(a.getTitulo()) && compania.equalsIgnoreCase(a.getCompania())) {
		   return true;  
	   }
	   return false; 
   }


    
}
