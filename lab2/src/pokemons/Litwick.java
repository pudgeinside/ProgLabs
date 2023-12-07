package src.pokemons;

import ru.ifmo.se.pokemon.*;
import src.moves.damage.special.*;

public class Litwick extends Pokemon{
	
	public Litwick(String name, int level){
		super(name, level);
		if (0 > level && level > 100) {
			throw new IllegalArgumentException();
		}
		this.setType(Type.GHOST, Type.FIRE);
		this.setStats(50, 30, 55, 65, 55, 20);
		this.setMove(new EnergyBall(), new ShadowBall());
	}

}