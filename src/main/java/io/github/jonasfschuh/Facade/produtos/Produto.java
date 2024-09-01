package io.github.jonasfschuh.Facade.produtos;

public class Produto 
{
	private double precoProducao;
	private double precoVenda;
	private String descricao;
	private TipoProduto tpproduto;
	
	public double getPrecoProducao() 
	{
		return precoProducao;
	}
	public void setPrecoProducao(double precoProducao) 
	{
		this.precoProducao = precoProducao;

	}
	public double getPrecoVenda() 
	{
		return precoVenda;

	}
	public void setPrecoVenda(double precoVenda) 
	{
		this.precoVenda = precoVenda;

	}
	public String getDescricao() 
	{
		return descricao;
	}
	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;

	}
	public TipoProduto getTpproduto()
	{
		return tpproduto;

	}
	public void setTpproduto(TipoProduto tpproduto)
	{
		this.tpproduto = tpproduto;

	}		
}
