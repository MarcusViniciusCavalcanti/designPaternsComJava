package nullObjectImplemetationTest;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import nullObjectImplemetation.Curse;
import nullObjectImplemetation.NullCurse;
import nullObjectImplemetation.Pessoa;

public class TesteNullObject {

	public static void main(String[] args) {
		Curse curse = new NullCurse("Curso teste", LocalTime.of(14, 00));
		Pessoa pessoaWithCurse = new Pessoa("com curso", 20, curse);
		
		Curse curse2 = new NullCurse();
		Pessoa pessoaNotCurse = new Pessoa("com curso", 20, curse2);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoaWithCurse);
		pessoas.add(pessoaNotCurse);
			
		for (Pessoa pessoa : pessoas) {
			System.out.println(
				"Nome: " + pessoa.getName() +
				"Idade: " + pessoa.getAge() +
				"Curso cadastrado: " + pessoa.getCurse().getName() + " horário: " + pessoa.getCurse().curseTime());
		}	
		

	}

}
