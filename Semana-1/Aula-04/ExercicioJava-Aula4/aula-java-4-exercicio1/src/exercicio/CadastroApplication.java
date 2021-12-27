package exercicio;

public class CadastroApplication {

	public static void main(String[] args) {
		
		CadastroCirurgico cadastro = new CadastroCirurgico();
		
		//Professor esta primeira versão tem como base o princípio MVP
		
		cadastro.setNome("Ticio");
		cadastro.setCpf(12345678998L);
		cadastro.setIdade(68);
		cadastro.setAltura(2.25);
		cadastro.setDoadorDeOrgao(true);
		cadastro.setEmail("ticioexemploaula4@javamail.com");
		cadastro.setTelefone(5588988123456l);
		cadastro.setDataDeNascimento("01/01/1953");		
		
		cadastro.mostrarDadosCadastro();	
		
	}
}