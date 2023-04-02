package atendimentoGrafica;

public class EmpregadoTerceirizado extends Usuario {

	private String funcao;

	private String empresa;

	public EmpregadoTerceirizado(int id, String nome, String email, String senha, String funcao, String empresa) {
		super(id, nome, email, senha);
		this.setFuncao(funcao);
		this.setEmpresa(empresa);
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	
	
	
	

}

