package builds.ufpb.br;

import org.junit.jupiter.api.Test;

public class Teste {
    
	
	@Test
    void Test1() {
	    Produto PcGamer = new Produto("Dell",5.000);
	    Produto Mouse = new Produto("Hyperex",250.0);
	    Venda venda1 = new VendaBuilder()
			.Data("05/06/2017")
			.ClientePj("Matheus Silva","001-123-456")
			.item(5, PcGamer)
			.item(3,Mouse)
			.Funcionario("Silva")
			.Build();
	

}
	@Test
	void Test2() {
		Produto Prancha = new Produto("Prancha",1.200);
		Produto Quilha = new Produto("Quilha",300.0);
		Produto Capa = new Produto("Capa",150.0);
		Venda venda2 = new VendaBuilder()
				.Data("05/06/2017")
				.ClientePf("Caio da silva", "123.456.789.10")
				.item(5, Prancha)
				.item(8, Quilha)
				.item(2, Capa)
				.Funcionario("WM")
				.Build();
	}
	@Test
	void Test3() {
		Produto Carro = new Produto("Carro",50.000);
		Produto Pneus = new Produto("Pneus",300.0);
		Produto Gasolina = new Produto("Capa",150.0);
		Venda venda2 = new VendaBuilder()
				.Data("05/06/2017")
				.ClientePf("Joao Batista", "123.456.789.10")
				.item(1, Carro)
				.item(4, Pneus)
				.item(9, Gasolina)
				.Funcionario("Ramo")
				.Build();
	}

}
