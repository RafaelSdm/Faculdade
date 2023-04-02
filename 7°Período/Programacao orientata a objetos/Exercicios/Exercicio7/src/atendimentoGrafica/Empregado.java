package atendimentoGrafica;

public class Empregado extends Usuario {

	private String tipoEquipamento;

	private Double salario;

	private String setor;

	public Empregado(int id, String nome, String email, String senha, String tipoEquipamento, Double salario,
			String setor) {
		super(id, nome, email, senha);
		this.setTipoEquipamento(tipoEquipamento);
		this.setSalario(salario);
		this.setSetor(setor);
	}

	public String getTipoEquipamento() {
		return tipoEquipamento;
	}

	public void setTipoEquipamento(String tipoEquipamento) {
		this.tipoEquipamento = tipoEquipamento;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	



}
