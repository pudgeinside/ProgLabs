package src.moves.damage.physical;

import ru.ifmo.se.pokemon.*;

public class FlameCharge extends PhysicalMove{
	
	public FlameCharge(){
		super(Type.FIRE, 50, 100);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.SPEED, 1);
		
	}
	@Override
	protected String describe(){
		return "применяет \u001B[31mFlame Charge\u001B[0m";
	}

}
