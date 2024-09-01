package io.github.jonasfschuh.Facade.tributos;

public class IOF extends Tributo
{
	@Override
	public double calcular() 
	{
		//2,5% sobre o valor de venda do produto
		return ((produto.getPrecoVenda() * 2.5) / 100);
	}
}
