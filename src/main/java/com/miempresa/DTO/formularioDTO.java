package com.miempresa.DTO;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class formularioDTO {
	@NotBlank(message ="Campo Obligatorio")
	private String	nombre ;
	@NotBlank(message ="Campo Obligatorio")
	private String	apellido ;
	private String sexo ;
	@Range(min=0 , max=100, message="Ingrese una edad correcta")
	private int	edad ;
	@NotBlank(message ="Campo Obligatorio")
//	@Size(min=4,max=8, message ="La longitud es de 4 a 8 digitos")
	@Pattern(regexp = "^(?=.*\\d)(?=.*[A-Z]).{6,8}$", message ="La longitud es 6 a 8 digitos, almenos una letra mayuscula y no se permite caracteres especiales")
	private String 	clave ;
	@NotBlank(message ="Campo Obligatorio")
	@Email(message ="Ingrese un correo valido")
	private String correo ;
	private OpcionesSexo[] opcionesSexo;
	
	public formularioDTO() {}

	
	
	public formularioDTO(String nombre, String apellido, String sexo, int edad, String clave, String correo,
			OpcionesSexo[] opcionesSexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.edad = edad;
		this.clave = clave;
		this.correo = correo;
		this.opcionesSexo = opcionesSexo;
	}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public OpcionesSexo[] getOpcionesSexo() {
		return opcionesSexo;
	}
	public void setOpcionesSexo(OpcionesSexo[] opcionesSexo) {
		this.opcionesSexo = opcionesSexo;
	}

	
	
}
