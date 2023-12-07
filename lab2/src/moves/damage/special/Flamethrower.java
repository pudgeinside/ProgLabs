package src.moves.damage.special;


import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove{
	
	public Flamethrower(){
		super(Type.FIRE, 90, 100);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p){
		Effect e = new Effect().chance(0.1).condition(Status.BURN);
		p.addEffect(e);
		
	}
	@Override
	protected String describe(){
		return "применяет \u001B[31mFlamethrower\u001B[0m";
	}

}
