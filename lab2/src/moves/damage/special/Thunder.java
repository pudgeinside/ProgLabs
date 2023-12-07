package src.moves.damage.special;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove{
	
	public Thunder(){
		super(Type.ELECTRIC, 110, 70);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p){
		Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
		p.addEffect(e);
	}
	
	@Override
	protected String describe(){
		return "применяет \u001B[33mThunder\u001B[0m";
	}

}
