package Model;

public class ModelRelacao {
	private Integer id_do_dono;
	private Integer id_do_animal;
	
	public ModelRelacao() {
		super();
	}

	public ModelRelacao(Integer id_do_dono, Integer id_do_animal) {
		super();
		this.id_do_dono = id_do_dono;
		this.id_do_animal = id_do_animal;
	}

	public Integer getId_do_dono() {
		return id_do_dono;
	}

	public void setId_do_dono(Integer id_do_dono) {
		this.id_do_dono = id_do_dono;
	}

	public Integer getId_do_animal() {
		return id_do_animal;
	}

	public void setId_do_animal(Integer id_do_animal) {
		this.id_do_animal = id_do_animal;
	}
	
	
}
