package com.tutorial.entity;

import java.util.Date;

import javax.persistence.*;

@javax.persistence.Entity(name = "persona")
public class Persona {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_persona")
	private int id_persona;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="fecNacimiento")	
	private Date fecNacimiento;
	
	@Column(name="eMail")	
	private String eMail;
	
	@Column(name="casado")	
	private boolean casado;
	
	@Column(name="divorciado")
	private boolean divorciado;
	
	@Column(name="peso")
	private double peso;
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persona(String nombre, String apellido, Date fecNacimiento, String eMail, boolean casado, boolean divorciado,
			double peso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fecNacimiento = fecNacimiento;
		this.eMail = eMail;
		this.casado = casado;
		this.divorciado = divorciado;
		this.peso = peso;
	}

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
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

	public Date getFecNacimiento() {
		return fecNacimiento;
	}

	public void setFecNacimiento(Date fecNacimiento) {
		this.fecNacimiento = fecNacimiento;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public boolean isDivorciado() {
		return divorciado;
	}

	public void setDivorciado(boolean divorciado) {
		this.divorciado = divorciado;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [id_persona=" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fecNacimiento=" + fecNacimiento + ", eMail=" + eMail + ", casado=" + casado + ", divorciado="
				+ divorciado + ", peso=" + peso + "]";
	}
		
}
