package io.github.jonasfschuh.Facade.tributos;

import io.github.jonasfschuh.Facade.produtos.TipoProduto;

public class IPI extends Tributo
{	
	public double calcular() 
	{
		//Livro e CD Musica = 0%
		//Demais: 8% sobre o preco de venda
		if ((produto.getTpproduto() == TipoProduto.Livro) ||
				(produto.getTpproduto() == TipoProduto.CD))
		{
			return 0;
		}
		else
		{
			return ((produto.getPrecoVenda() * 8) / 100);
		}
	}

}
