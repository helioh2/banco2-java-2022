package br.ufpr.ja.banco.modelo.funcionarios;

import java.util.List;

/**
 * Calcula a soma das bonificações de todos os funcionários.
 *
 */
public class ControleBonificacoes {
	
	public double calculaBonificacoes(List<Funcionario> funcionarios) {
		double soma = 0;
		for (Funcionario funcionario: funcionarios) {
			double bonificacao = funcionario.getBonificacao();
			soma += bonificacao;
		}
		return soma;
	}

}


// COMO SERIA SEM POLIMORFISMO:
//if (funcionario instanceof Gerente) {
//	double bonificacao = funcionario.getSalario()*0.1 + 500;
//	soma += bonificacao;
//} else if (funcionario instanceof Analista) {
//	double bonificacao = funcionario.getSalario()*0.5;
//	soma += bonificacao;
//} else if (funcionario instanceof Funcionario) {
//	double bonificacao = funcionario.getSalario()*0.1;
//	soma += bonificacao;
//
//}
// ...

