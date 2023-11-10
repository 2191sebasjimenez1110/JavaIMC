package clases;

public class UsuarioVo {
	private String documento;
	private String nombre;
	private Integer edad;
	private Double peso;
	private Double talla;
	private Double IMC;
	
		
	public UsuarioVo() {
		
	}
	
	public UsuarioVo(String documento, String nombre, Integer edad, Double peso, Double talla, Double iMC) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.talla = talla;
		this.IMC = iMC;
	}
	
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getTalla() {
		return talla;
	}
	public void setTalla(Double talla) {
		this.talla = talla;
	}
	public Double getIMC() {
		return IMC;
	}
	public void setIMC(Double iMC) {
		IMC = iMC;
	}

}
