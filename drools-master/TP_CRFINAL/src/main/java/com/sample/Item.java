package com.sample;



public class Item {
String nome;
int quantidade;
double preco;
Item parelha;
String genero;
boolean crianca,sexos;
//private static final String COMMA_DELIMITER = ";";

public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getQuantidade() {
	return quantidade;
}
public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public Item getParelha() {
	return parelha;
}
public void setParelha(Item parelha) {
	this.parelha = parelha;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public boolean isCrianca() {
	return crianca;
}
public void setCrianca(boolean crianca) {
	this.crianca = crianca;
}
public boolean isSexos() {
	return sexos;
}
public void setSexos(boolean sexos) {
	this.sexos = sexos;
}
public Item(String nome, int quantidade, double preco, Item parelha, String genero, boolean crianca, boolean sexos) {
	super();
	this.nome = nome;
	this.quantidade = quantidade;
	this.preco = preco;
	this.parelha = parelha;
	this.genero = genero;
	this.crianca = crianca;
	this.sexos = sexos;
}
/*
public String toString() {
    return "Item [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + ", parelha=" + parelha
            + ", genero=" + genero + ", crianca=" + crianca + ", sexos=" + sexos + "]";
}
*/
/*
public static  ArrayList<Item> lerficheiro(){
	

ArrayList<Item> Itemlist = new ArrayList<Item>();

BufferedReader br = null;

try
{
    
    br = new BufferedReader(new FileReader("ficheiro.csv"));
    String line = "";
    
    br.readLine();
    
    while ((line = br.readLine()) != null) 
    {
        String[] tempArray = line.split(COMMA_DELIMITER);
        
        if(tempArray.length > 0 )
        {
        	Item item = new Item(tempArray[0], Integer.parseInt(tempArray[1]), Double.parseDouble(tempArray[2]), null, tempArray[3], Boolean.parseBoolean(tempArray[4]), Boolean.parseBoolean(tempArray[5]));
        	System.out.println(item.toString());
        	Itemlist.add(item);
               }
    }

}
catch(Exception ee)
{
    ee.printStackTrace();
}
finally
{
    try
    {
        br.close();
    }
    catch(IOException ie)
    {
        System.out.println("Erro");
        ie.printStackTrace();
    }
}

return Itemlist;
*/
}


