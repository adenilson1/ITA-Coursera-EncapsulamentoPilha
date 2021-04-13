
public class Principal {

	public static void main(String[] args) {
		Pilha pilha = new Pilha(10);

		pilha.empilhar("Eduardo");
		pilha.empilhar("Adenilson");
		pilha.empilhar("Maria");
		pilha.empilhar("Jose");

		System.out.println(pilha.topo());
		System.out.println(pilha.tamanho());

		// Desempilhando
		System.out.println("-------------------------");
		System.out.println(pilha.desempilhar().toString().toUpperCase());
		System.out.println(pilha.topo().toString().toUpperCase());
		System.out.println(pilha.tamanho());

	}

}
