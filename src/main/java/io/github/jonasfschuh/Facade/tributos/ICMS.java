package io.github.jonasfschuh.Facade.tributos;

import io.github.jonasfschuh.Facade.estados.Estado;
import io.github.jonasfschuh.Facade.produtos.TipoProduto;

public class ICMS extends Tributo
{
	Estado estado;
	
	public Estado getEstado() 
	{
		return estado;
	}

	public void setEstado(Estado estado) 
	{
		this.estado = estado;
	}

	@Override
	public double calcular() 
	{	
		if ((estado == Estado.SC) || (estado == Estado.PR) || (estado == Estado.SP) || (estado == Estado.RS)) 
		{
			if (produto.getTpproduto() == TipoProduto.Livro)
			{				  
				return (produto.getPrecoProducao() * 2) / 100;
			}	
			else
			{
				return (produto.getPrecoProducao() * 17) / 100;				
			}
		}
		else
		{
			if (produto.getTpproduto() == TipoProduto.Livro)
			{				
				// se tributo eh 0, e nao incidente.
				return 0; //(produto.getPrecoProducao() * 0) / 100;
			}	
			else
			{
				return (produto.getPrecoProducao() * 17) / 100;				
			}
		}
	}

}
