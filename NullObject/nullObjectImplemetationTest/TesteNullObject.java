package nullObjectImplemetationTest;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import nullObjectImplemetation.NullCurse;
import nullObjectImplemetation.Pessoa;

public class TesteNullObject {

	public static void main(String[] args) {
		Pessoa pessoaWithCurse = new Pessoa("com curso", 20, new NullCurse("Curso teste", LocalTime.of(14, 00)));
		Pessoa pessoaNotCurse = new Pessoa("com curso", 20, new NullCurse());
		
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(pessoaWithCurse);
		pessoas.add(pessoaNotCurse);
		
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getName());
			System.out.println(pessoa.getAge());
			System.out.println(pessoa.getCurse().getName() + " horário: " + pessoa.getCurse().curseTime());
		}
		

	}

}
