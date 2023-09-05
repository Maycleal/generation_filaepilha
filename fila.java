package collectionList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
				
		String nome;
		int opcao;
		
		do {	
		
		System.out.println("1- Adicionar cliente na fila");
		System.out.println("2- Listar todos os clientes.");
		System.out.println("3- Retirar cliente da fila");
		System.out.println("0- Sair");
		opcao = ler.nextInt();
		
				
		switch (opcao) {
		case 1:
			System.out.println("\nDigite o nome do cliente: ");
			nome = ler.next();	
			fila.add(nome);
			System.out.println("Fila:" + fila + "\nCliente adicionado!");		
			break;
			
		case 2:
			System.out.println("Lista de clientes na fila: " + fila);
			break;
			
		case 3:
			if (!fila.isEmpty()) {
				fila.remove();
                System.out.println("\nFila: " + fila);
                System.out.println("O cliente foi chamado.");
            } else {
                System.out.println("A fila está vazia!");
            }
			break;
			
		case 0:
			System.out.println("Programa finalizado!");
			break;
		}
		} while (opcao != 0);		
		
		
			
		Iterator<String> iterator = fila.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		}
	    
}


