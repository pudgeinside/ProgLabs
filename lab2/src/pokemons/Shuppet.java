package src.pokemons;

import ru.ifmo.se.pokemon.*;
import src.moves.damage.special.*;
import src.moves.status.*;

public class Shuppet extends Pokemon{
	
	public Shuppet(String name, int level){
		super(name, level);
		if (level < 0) {
			throw new IllegalArgumentException();
		}
		this.setType(Type.GHOST);
		this.setStats(44, 75, 35, 63, 33, 45);
		this.setMove(new WillOWisp(), new CalmMind(), new Thunder());
	}
	
}