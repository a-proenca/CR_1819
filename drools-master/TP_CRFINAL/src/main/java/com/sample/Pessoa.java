package com.sample;

public class Pessoa {
	
	String nome;
	String sexo;
	String estado;
	boolean filho;
	boolean flag;
	public Pessoa(String nome, String sexo, String estado, boolean filho, boolean flag) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.estado = estado;
		this.filho = filho;
		this.flag = flag;
	}
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public boolean isFilho() {
		return filho;
	}
	public void setFilho(boolean filho) {
		this.filho = filho;
	}
	
	
	
	

}
