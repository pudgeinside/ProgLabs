package src.moves.damage.special;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove{
	
	public EnergyBall(){
		super(Type.GRASS, 90, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p){
		Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
		p.addEffect(e);
	}
	
	@Override
	protected String describe(){
		return "применяет \u001B[32mEnergy Ball\u001B[0m";
	}

}
