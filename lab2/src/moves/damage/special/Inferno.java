package src.moves.damage.special;


import ru.ifmo.se.pokemon.*;


public class Inferno extends SpecialMove{
	public Inferno(){
		super(Type.FIRE, 100, 50);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p){
		Effect e = new Effect().condition(Status.BURN).turns(-1);
		p.addEffect(e);
	}
	
	@Override
	protected String describe(){
		return "применяет \u001B[31mInferno\u001B[0m";
	}

}
