package io.github.jonasfschuh.Facade.tributos;

import io.github.jonasfschuh.Facade.produtos.Produto;

public abstract class Tributo
{
	Produto produto;

	public Produto getProduto() 
	{
		return produto;
	}

	public void setProduto(Produto produto) 
	{
		this.produto = produto;
	}
	
	public abstract double calcular();	
}
