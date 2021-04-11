package clasesPeliculas;

public class Pelicula {
	
	private String codPelicula;
	private String titulo;
	private String anio;
	private String duracion;
	private String pais;
	private String direccion;
	private String guion;
	private String fotografia;
	private String reparto;
	
	public Pelicula() {
		
	}
	
	public Pelicula(String codPelicula, String titulo, String anio, String duracion, String pais, String direccion,
			String guion, String fotografia, String reparto) {
		super();
		this.codPelicula = codPelicula;
		this.titulo = titulo;
		this.anio = anio;
		this.duracion = duracion;
		this.pais = pais;
		this.direccion = direccion;
		this.guion = guion;
		this.fotografia = fotografia;
		this.reparto = reparto;
	}

	public String getCodPelicula() {
		return codPelicula;
	}

	public void setCodPelicula(String codPelicula) {
		this.codPelicula = codPelicula;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getGuion() {
		return guion;
	}

	public void setGuion(String guion) {
		this.guion = guion;
	}

	public String getFotografia() {
		return fotografia;
	}

	public void setFotografia(String fotografia) {
		this.fotografia = fotografia;
	}

	public String getReparto() {
		return reparto;
	}

	public void setReparto(String reparto) {
		this.reparto = reparto;
	}

	@Override
	public String toString() {
		return "Pelicula [codPelicula=" + codPelicula + ", titulo=" + titulo + ", anio=" + anio + ", duracion="
				+ duracion + ", pais=" + pais + ", direccion=" + direccion + ", guion=" + guion + ", fotografia="
				+ fotografia + ", reparto=" + reparto + "]";
	}
	
	
	
	
	

	
	
	
	
	

}
