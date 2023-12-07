package src;

import ru.ifmo.se.pokemon.*;
import src.pokemons.*;

public class Main{
	public static void main(String[] args) {

		Battle b = new Battle();

		Victini p1 = new Victini("Виктор", 30);
		Shuppet p2 = new Shuppet("Александр", 30);
		Banette p3 = new Banette("Шариков", 30);

		Litwick p4 = new Litwick("Андрей", 30);
		Lampent p5 = new Lampent("Роман", 30);
		Chandelure p6 = new Chandelure("Азат", 30);

		b.addAlly(p1);
		b.addAlly(p2);
		b.addAlly(p3);

		b.addFoe(p4);
		b.addFoe(p5);
		b.addFoe(p6);

		b.go();
	}
}

