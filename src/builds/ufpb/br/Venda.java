package builds.ufpb.br;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	
	private String data;
	private Frete frete;
	private List<ItemVenda> itens = new ArrayList<>();
	private Funcionario funcionario;
	private VendaBuilder  builder;
	private Cliente cliente;
		
	
	
	public void addItem(ItemVenda Produto) {
		itens.add(Produto);
	}

	public Venda(VendaBuilder builder) {
		this.builder = builder;
	}
	public Venda(String Data) {
		this.data = data;
	}
	public Venda() {
	}

	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	
	public VendaBuilder getBuilder() {
		return builder;
	}
	
	public void setBuilder(VendaBuilder builder) {
		this.builder = builder;
	}
	
	public List<ItemVenda> getItens() {
		return itens;
	}
	
	public void setItens(List<ItemVenda> itens) {
		this.itens = itens;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public Frete getFrete() {
		return frete;
	}
	
	public void setFrete(Frete frete) {
		this.frete = frete;
	}

	

	

	

}
