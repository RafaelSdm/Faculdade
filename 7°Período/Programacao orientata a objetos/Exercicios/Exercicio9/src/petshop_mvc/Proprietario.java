package petshop_mvc;

import java.util.ArrayList;

public class Proprietario {
	
	
	private String nome;
	private int id;
	private String cpf;
	private String endereco;
	private ArrayList<Animal> animais;
	
	
	
	public Proprietario() {
		super();
		this.animais = new ArrayList<>();;

	}





	public Proprietario(String nome, int id, String cpf, String endereco ) {
		super();
		this.nome = nome;
		this.id = id;
		this.cpf = cpf;
		this.endereco = endereco;
		this.animais = new ArrayList<>();;
	}
	
	
	

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
    /*
    public void cadastrarProprietario(String nome, int id, String cpf, String endereco) {
        Proprietario proprietario = new Proprietario(nome, id, cpf, endereco);
        proprietarios.add(proprietario);
    }
    
    public ArrayList<Proprietario> getProprietarios() {
        return proprietarios;
    } 
    */

	
	
	@Override
	public String toString() {
		return "Proprietario nome = " + nome + ", id = " + id + ", cpf = " + cpf + ", endereco = " + endereco;
	}





	public ArrayList<Animal> getAnimais() {
		return animais;
	}





	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}
	
	public void adicionarAniaml(Animal animal) {
		this.animais.add(animal);
	}

}
