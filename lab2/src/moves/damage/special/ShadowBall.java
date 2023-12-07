package src.moves.damage.special;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove{
	
	public ShadowBall(){
		super(Type.GHOST, 80, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p){
		Effect e = new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1);
		p.addEffect(e);
	}
	
	@Override
	protected String describe(){
		return "применяет \u001B[38;5;55mShadow Ball\u001B[0m";
	}

}
