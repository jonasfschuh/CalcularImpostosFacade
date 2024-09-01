## Calcular Impostos FACADE

Esse projeto demonstra o uso do Design Patterns FACADE utilizando java puro.

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

# Requisitos:
Cada imposto deve ser calculado de acordo com a seguinte regra:

- ICMS:
  Para os estados de SC, PR, SP e RS
  - Livros - 2%
  - Qualquer outro produto - 17%
  Qualquer outro estado não listado acima, o ICMS é fixo em 17%
- COFINS: 7,6% sobre o lucro bruto
- IE: 30% sobre o preço de venda de qualquer produto
- IOF: 2,5% sobre o valor de venda do produto
- IPI: Livro ou CD a líquota é 0% e para os demais produtos é 8%



Execução com 2 produtos distintos, de estados diferentes e mesmo valor de produção e venda.

```java
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
```


Execução e resultado 
```
Inicializando calculo de tributos 

Produto: Livro de Ingles
Valor do IOF: 25.0
Valor do IPI: 0.0
Valor do COFINS: 76.0
Valor do IE: 300.0
Valor do ICMS: 2.0
Valor Total Impostos: 403.0

------------------------------------------

Produto: DVD Beatles
Valor do IOF: 25.0
Valor do IPI: 80.0
Valor do COFINS: 76.0
Valor do IE: 300.0
Valor do ICMS: 17.0
Valor Total Impostos: 498.0
```
