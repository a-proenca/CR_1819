package com.sample;

public class Compra {
Item item;
Pessoa pessoa;
public Compra(Item item, Pessoa pessoa) {
	super();
	this.item = item;
	this.pessoa = pessoa;
}
public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
public Pessoa getPessoa() {
	return pessoa;
}
public void setPessoa(Pessoa pessoa) {
	this.pessoa = pessoa;
}
}
