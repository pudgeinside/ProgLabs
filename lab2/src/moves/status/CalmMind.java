package src.moves.status;

import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove{
	
	public CalmMind(){
		super(Type.PSYCHIC, 0, 100);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.SPECIAL_ATTACK, 1);
		p.setMod(Stat.SPECIAL_DEFENSE, 1);
	}
	
	@Override
	protected String describe(){
		return "применяет \u001B[38;5;198mCalm Mind\u001B[0m";
	}

}
