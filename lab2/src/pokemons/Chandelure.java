package src.pokemons;

import ru.ifmo.se.pokemon.*;
import src.moves.damage.special.*;

public class Chandelure extends Lampent{
	
	public Chandelure(String name, int level){
		super(name, level);
		this.setType(Type.GHOST, Type.FIRE);
		this.setStats(60, 55, 90, 145, 90, 80);
		this.addMove(new Flamethrower());
	}
	
}