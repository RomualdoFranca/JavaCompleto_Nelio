package secao14.tratamento_excecoes.personalizadas.model.exception;


//Essa classe pode ser uma extenção da classe Exception ou RunTimeException.
//Caso seja uma extenção da RunTime,  o compilador não obriga a tratar.Se não tiver o bloco try-catch, o compilador
//não indica nada.

//Caso seja um extenção da Exception, obrigatoriamente as exception devem ser tratadas.
public class DomainException extends Exception{
	private static final long serialVersionUID = 1L;
	
	//esse construtor permite que se possa instanciar a exceção personalizada, passando uma mensagem para ela
	public DomainException(String msg) {
		super(msg);
	}
	

}
