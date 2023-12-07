package src.moves.status;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove{
	
	public Confide(){
		super(Type.NORMAL, 0, 100);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.SPECIAL_ATTACK, -1);
	}
	
	@Override
	protected String describe(){
		return "применяет \u001B[38;5;8mConfide\u001B[0m";
	}

}
