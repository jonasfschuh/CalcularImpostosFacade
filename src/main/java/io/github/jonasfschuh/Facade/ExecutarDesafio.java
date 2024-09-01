package io.github.jonasfschuh.Facade;

import io.github.jonasfschuh.Facade.estados.Estado;
import io.github.jonasfschuh.Facade.produtos.Produto;
import io.github.jonasfschuh.Facade.produtos.TipoProduto;

public class ExecutarDesafio {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Inicializando calculo de tributos \n");
		// LIVRO
		Produto pd = new Produto();
		pd.setDescricao("Livro de Ingles");
		pd.setPrecoProducao(100);
		pd.setPrecoVenda(1000);
		pd.setTpproduto(TipoProduto.Livro);
		System.out.println("Produto: " + pd.getDescricao());
		// --------------------------------------------
		CalcularImpostosFacade cf = new CalcularImpostosFacade();
		cf.setProduto(pd);
		cf.setEstado(Estado.SC);
		cf.CalcularImpostos();

		// DVD
		System.out.println("\n------------------------------------------\n");
		pd.setDescricao("DVD Beatles");
		pd.setPrecoProducao(100);
		pd.setPrecoVenda(1000);
		pd.setTpproduto(TipoProduto.DVD);
		System.out.println("Produto: " + pd.getDescricao());
		// --------------------------------------------		
		cf.setProduto(pd);
		cf.setEstado(Estado.MT);
		cf.CalcularImpostos();
		
		
	}
}
