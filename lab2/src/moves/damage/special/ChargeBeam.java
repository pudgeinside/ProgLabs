package src.moves.damage.special;

import ru.ifmo.se.pokemon.*;

public class ChargeBeam extends SpecialMove{
	
	public ChargeBeam(){
		super(Type.ELECTRIC, 50, 90);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p){
		Effect e = new Effect().chance(0.7).stat(Stat.SPECIAL_ATTACK, 1);
		p.addEffect(e);
	}
	@Override
	protected String describe(){
		return "применяет \u001B[33mCharge Beam\u001B[0m";
	}

}
