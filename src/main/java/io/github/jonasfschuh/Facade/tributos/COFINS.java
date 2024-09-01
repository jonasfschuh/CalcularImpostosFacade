package io.github.jonasfschuh.Facade.tributos;

public class COFINS extends Tributo
{
	@Override
	public double calcular() 
	{
		// 7,6% sobre o lucro bruto
        return (produto.getPrecoVenda() * 7.6) / 100;
	}
}
