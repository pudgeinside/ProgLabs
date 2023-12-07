package src.moves.status;

import ru.ifmo.se.pokemon.*;

public class WillOWisp extends StatusMove{
	
	public WillOWisp(){
		super(Type.FIRE, 0, 85);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p){
		Effect e = new Effect().condition(Status.BURN).turns(-1);
		p.addEffect(e);
	}
	
	@Override
	protected String describe(){
		return "применяет \u001B[31mWill-O-Wisp\u001B[0m";
	}

}
