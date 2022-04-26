package br.com.benefrancis.composite;

import java.util.ArrayList;
import java.util.List;

public class Node {
	protected String name;
	protected List<Node> childNodes;

	public Node(String name) {
		super();
		this.name = name;
		this.childNodes = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void add(Node child) {
		childNodes.add(child);
		;
	}

	public List<Node> getChildNodes() {
		return childNodes;
	}

}
