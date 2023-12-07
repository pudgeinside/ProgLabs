package src.pokemons;

import ru.ifmo.se.pokemon.*;
import src.moves.damage.special.*;
import src.moves.damage.physical.*;
import src.moves.status.*;

public class Victini extends Pokemon{
	
	public Victini(String name, int level){
		super(name, level);
		if (level < 0) {
			throw new IllegalArgumentException();
		}
		this.setType(Type.PSYCHIC, Type.FIRE);
		this.setStats(100, 100, 100, 100, 100, 100);
		this.setMove(new Inferno(), new ChargeBeam(), new FlameCharge(), new Confide());
	}
	
}