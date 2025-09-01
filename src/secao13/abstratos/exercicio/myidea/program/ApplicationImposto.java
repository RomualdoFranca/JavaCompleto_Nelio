package secao13.abstratos.exercicio.myidea.program;

import secao13.abstratos.exercicio.myidea.entities.Contribuintes;
import secao13.abstratos.exercicio.myidea.entities.PessoaFisica;
import secao13.abstratos.exercicio.myidea.entities.PessoaJuridica;

public class ApplicationImposto {

	public static void main(String[] args) {

		Contribuintes pf = new PessoaFisica("Lua", 50000.00, 2000.00);
		System.out.println(pf);
		
		Contribuintes pj = new PessoaJuridica("MisterMix", 400000.00, 25);
		System.out.println(pj);
		
	}

}
