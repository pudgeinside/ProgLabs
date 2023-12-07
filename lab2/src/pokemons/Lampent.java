package src.pokemons;

import ru.ifmo.se.pokemon.*;
import src.moves.status.*;

public class Lampent extends Litwick{
	
	public Lampent(String name, int level){
		super(name, level);
		this.setType(Type.GHOST, Type.FIRE);
		this.setStats(60, 40, 60, 95, 60, 55);
		this.addMove(new Minimize());
	}
	
}