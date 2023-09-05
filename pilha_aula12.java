package collectionList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class pilha_aula12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		
		String livro;
		int opcao;
		
		do {	
		
		System.out.println("1- Adicionar livro na pilha");
		System.out.println("2- Listar todos os livros.");
		System.out.println("3- Retirar livro da pilha");
		System.out.println("0- Sair");
		opcao = ler.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.printf("\nDigite o nome: ");
			livro = ler.nextLine();	
			pilha.push(livro);
			System.out.printf("Pilha:" + pilha + "\nLivro adicionado!");		
			break;
			
		case 2:
			System.out.println("Lista de livros na pilha: " + pilha);
			break;
			
		case 3:
			if (!pilha.isEmpty()) {
				pilha.pop();
                System.out.println("\nPilha: " + pilha);
                System.out.println("Um livro foi retirado da pilha!");
            } else {
                System.out.println("A pilha está vazia!");
            }
			break;
			
		case 0:
			System.out.println("Programa finalizado!");
			break;
		}
		} while (opcao != 0);		
		
		
			
		Iterator<String> iterator = pilha.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	
		}
	    
}


