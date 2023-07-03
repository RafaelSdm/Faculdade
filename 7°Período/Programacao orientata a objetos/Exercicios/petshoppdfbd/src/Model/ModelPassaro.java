package Model;

public class ModelPassaro extends ModelAnimal {
	private Integer num_anilha;
	
	
	public ModelPassaro() {
		super();
	}


	public ModelPassaro(Integer id, String nome, Integer idade, String raca, String cor, String sexo, Integer num_anilha) {
		super(id, nome, idade, raca, cor, sexo);
		this.num_anilha = num_anilha;
	}


	public Integer getNum_anilha() {
		return num_anilha;
	}


	public void setNum_anilha(Integer num_anilha) {
		this.num_anilha = num_anilha;
	}
	
	
	
	
}
