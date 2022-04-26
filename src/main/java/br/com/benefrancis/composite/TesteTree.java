package br.com.benefrancis.composite;

import java.util.List;

public class TesteTree {
	public static void main(String[] args) {

		Tree tree = new Tree("World");
		Node root = tree.getRoot();

		Node brasil = new Node("Brasil");
		Node america = new Node("America");
		root.add(brasil);
		root.add(america);
		
		Node saoPaulo = new Node("São Paulo");
		Node rioDeJaneiro = new Node("Rio de Janeiro");
		brasil.add(saoPaulo);
		brasil.add(rioDeJaneiro);

		Node newYork = new Node("New York");
		Node chicago = new Node("Chicago");
		america.add(newYork);
		america.add(chicago);

		System.out.println(root.getName());
		List<Node> nodes = root.getChildNodes();

		for (Node n : nodes) {
			System.out.println("-" + n.getName());
			List<Node> childes = n.getChildNodes();
			for (Node c : childes) {
				System.out.println("--" + c.getName());
			}
		}
	}
}
