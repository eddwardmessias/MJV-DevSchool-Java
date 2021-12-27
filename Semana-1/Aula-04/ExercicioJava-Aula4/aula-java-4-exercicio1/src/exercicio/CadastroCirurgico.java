package exercicio;

public class CadastroCirurgico {
	
	/*Atividade 01
	Declare de forma legível variáveis que representam seus dados pessoais como: 
	nome, cpf, idade, altura, doador orgao, email, telefone e data de nascimento.*/	
	
	private String nome;
	private long cpf;
	private int idade;
	private double altura;
	private boolean doadorDeOrgao;
	private String email;
	private long telefone;
	private String dataDeNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCpf() {
		return cpf;
	}
	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public boolean getDoadorDeOrgao() {
		return doadorDeOrgao;
	}
	public void setDoadorDeOrgao(boolean doadorDeOrgao) {
		this.doadorDeOrgao = doadorDeOrgao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
	public void converterBoleann() {
		if(this.getDoadorDeOrgao() == true) {
			System.out.println("Doador de Orgão: Sim");
		} else {
			System.out.println("Doador de Orgão: Não");
		}
	}
	
	public void mostrarDadosCadastro() {		
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cpf: " + this.getCpf());		
		System.out.println("Idade: " + this.getIdade() + " anos");
		System.out.println("Altura: " + this.getAltura() + "m");
		converterBoleann();
		System.out.println("Número Telefone: " + this.getTelefone());
		System.out.println("Email: " + this.getEmail());
		System.out.println("Data de Nascimento: " + this.getDataDeNascimento());		
	}
		
	
}
