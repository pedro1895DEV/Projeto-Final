package poo.projetofinal;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Restaurante {
	
	private static double valorConta = 0;
	
	static Item strogonoff1 = new Item ("Strogonoff de Carne", 32.90);
	static Item strogonoff2 = new Item ("Strogonoff de Frango", 31.90);
	static Item picanha = new Item("Churrasco de Picanha", 55.00);
	static Item bife = new Item("Bife Acebolado", 49.50);
	static Item frango = new Item("Fil  de Frango", 27.97);
	static Item frango2 = new Item("Frango   Parmegiana", 28.00);
	static Item feijoada = new Item("Feijoada", 25.00);
	static Item lasanha = new Item("Lasanha", 30.00);
	static Item bisteca = new Item("Bisteca Su na", 27.50);
	static Item cavalo = new Item("Bife   Cavalo", 35.55);
	
	static List<Item> adicionados = new ArrayList<>();
	
	
	
	public static void Abrir() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--MENU DO SISTEMA--");
		System.out.println("1. Inicializar Mesa");
		
		int opcao = teclado.nextInt();
		
		switch(opcao) {
			case 1:
				inicializarMesa();
				break;
		}
		
		if(opcao != 1) {
			System.err.println("OP  O INV LIDA!!!");
		}
		
		teclado.close();
	}
	
	public static void inicializarMesa() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--------GERENCIAR MESA--------");
		System.out.println("1. Adicionar Item a Mesa");
		System.out.println("2. Imprimir Parcial da Mesa");
		System.out.println("3. Imprimir Conta da Mesa");
		System.out.println("4. Encerrar Mesa");
		
		int opcao = teclado.nextInt();
		
		switch(opcao) {
			case 1:
				adicionarItem();
				break;
			case 2:
				imprimirParcial();
				break;
			case 3:
				imprimirTotal();
				break;
			case 4:
				Abrir();
				break;
		}
		
		if(opcao > 4 || opcao < 1) {
			System.err.println("OP  O INV LIDA!!!");
		} else
		
		teclado.close();
	}
	
	public static void adicionarItem() {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Selecione o prato que voc  deseja: ");
		System.out.println("1. Strogonoff de Carne - R$32,90");
		System.out.println("2. Strogonoff de Frango - R$31,90");
		System.out.println("3. Churrasco de Picanha - R$55,00");
		System.out.println("4. Bife Acebolado - R$49,50");
		System.out.println("5. Fil  de Frango - R$27,97");
		System.out.println("6. Frango   Parmegiana - R$28,00");
		System.out.println("7. Feijoada - R$ 25,00");
		System.out.println("8. Lasanha -  R$ 30,00");
		System.out.println("9. Bisteca Su na - R$ 27,50");
		System.out.println("10. Bife   Cavalo - R$ 35,55");
		System.out.println("11. Remover Itens");
		System.out.println("12. Voltar");
		
		int opcao = teclado.nextInt();
		
		switch(opcao) {
		case 1:
			adicionados.add(strogonoff1);
			addItem(strogonoff1);
			break;
		case 2:
			adicionados.add(strogonoff2);
			addItem(strogonoff2);
			break;
		case 3:
			adicionados.add(picanha);
			addItem(picanha);
			break;
		case 4:
			adicionados.add(bife);
			addItem(bife);
			break;
		case 5:
			adicionados.add(frango);
			addItem(frango);
			break;
		case 6:
			adicionados.add(frango2);
			addItem(frango2);
			break;
		case 7:
			adicionados.add(feijoada);
			addItem(feijoada);
			break;
		case 8:
			adicionados.add(lasanha);
			addItem(lasanha);
			break;
		case 9:
			adicionados.add(bisteca);
			addItem(bisteca);
			break;
		case 10:
			adicionados.add(cavalo);
			addItem(cavalo);
			break;
		case 11:
			removerItem();
			break;
		case 12:
			inicializarMesa();
		}
		
		adicionarItem();
		
		if(opcao > 12 || opcao < 1) {
			System.err.println("OP  O INV LIDA!!!");
		} else
		
		
		teclado.close();
	}
	
	public static void removerItem() {
		if (adicionados.contains(strogonoff1)) {
			adicionados.remove(strogonoff1);
			removeItem(strogonoff1);
		} else if(adicionados.contains(strogonoff2)) {
			adicionados.remove(strogonoff2);
			removeItem(strogonoff2);
		} else if(adicionados.contains(picanha)) {
			adicionados.remove(picanha);
			removeItem(picanha);
		} else if(adicionados.contains(bife)) {
			adicionados.remove(bife);
			removeItem(bife);
		} else if(adicionados.contains(frango)) {
			adicionados.remove(frango);
			removeItem(frango);
		} else if(adicionados.contains(frango2)) {
			adicionados.remove(frango2);
			removeItem(frango2);
		} else if(adicionados.contains(feijoada)) {
			adicionados.remove(feijoada);
			removeItem(feijoada);
		} else if(adicionados.contains(lasanha)) {
			adicionados.remove(lasanha);
			removeItem(lasanha);
		} else if(adicionados.contains(bisteca)) {
			adicionados.remove(bisteca);
			removeItem(bisteca);
		} else if(adicionados.contains(cavalo)) {
			adicionados.remove(cavalo);
			removeItem(cavalo);
		}
		inicializarMesa();
	}
	
	public static void addItem (Item item) {
		valorConta =+ item.getPrecoItem();
	}
	
	public static void removeItem(Item item) {
		valorConta =- item.getPrecoItem();
	}
	
	public static void imprimirParcial() {
		System.out.println("R$ " + valorConta);
		inicializarMesa();
	}
	
	public static void imprimirTotal() {
		System.out.println("R$ " + valorConta);
		inicializarMesa();
	}
	
	public static void main(String[] args) {
		
		
		Abrir();
		
	}
}