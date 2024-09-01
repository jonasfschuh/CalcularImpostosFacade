package io.github.jonasfschuh.Facade;

import io.github.jonasfschuh.Facade.estados.Estado;
import io.github.jonasfschuh.Facade.produtos.Produto;
import io.github.jonasfschuh.Facade.tributos.*;

public class CalcularImpostosFacade {
	
	private Produto produto;
	private Double valorTotal;
	private Double valorImposto;
	private Estado estado;
	
	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void CalcularImpostos() 
	{
		valorTotal = (double) 0;
		valorImposto = (double) 0;
		//calcula tributos do livro
		// IOF
		IOF iof = new IOF();
	    iof.setProduto(produto);		
	    valorImposto = iof.calcular();
	    valorTotal = valorTotal + valorImposto;
	    System.out.println("Valor do IOF: " + valorImposto.toString());	    
	    
		// IPI
		IPI ipi = new IPI();
		ipi.setProduto(produto);		
		valorImposto = ipi.calcular();
		valorTotal = valorTotal + valorImposto;
		System.out.println("Valor do IPI: " + valorImposto.toString());	    		
				
		// COFINS
		COFINS cofins = new COFINS();
		cofins.setProduto(produto);
		valorImposto = cofins.calcular();
		valorTotal = valorTotal + valorImposto;
		System.out.println("Valor do COFINS: " + valorImposto.toString());
				
		// IE
		IE ie = new IE();
		ie.setProduto(produto);		
		valorImposto = ie.calcular();
		valorTotal = valorTotal + valorImposto;
		System.out.println("Valor do IE: " + valorImposto.toString());
				
		// ICMS
		ICMS icms = new ICMS();
		icms.setProduto(produto);
		icms.setEstado(estado);
		valorImposto = icms.calcular();
		valorTotal = valorTotal + valorImposto;
		System.out.println("Valor do ICMS: " + valorImposto.toString());
		System.out.println("Valor Total Impostos: " + valorTotal.toString());
	}
}
