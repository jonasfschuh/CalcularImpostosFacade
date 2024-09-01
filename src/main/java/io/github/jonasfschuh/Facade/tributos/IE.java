package io.github.jonasfschuh.Facade.tributos;

public class IE extends Tributo
{
	@Override
	public double calcular() 
	{
		//30% sobre o preco de venda de qualquer produto
		return ((produto.getPrecoVenda() * 30) / 100);
	}

}
