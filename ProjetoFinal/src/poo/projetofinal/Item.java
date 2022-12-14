package poo.projetofinal;

public class Item{
	
	private String nomeItem;
	private double precoItem;
	
	public Item(String nomeItem, double precoItem) {
		super();
		this.nomeItem = nomeItem;
		this.precoItem = precoItem;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public double getPrecoItem() {
		return precoItem;
	}
}