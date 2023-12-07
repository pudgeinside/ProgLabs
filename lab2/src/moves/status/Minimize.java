package src.moves.status;

import ru.ifmo.se.pokemon.*;

public class Minimize extends StatusMove{
	
	public Minimize(){
		super(Type.NORMAL, 0, 100);
	}
	
	@Override
	protected void applySelfEffects(Pokemon p){
		p.setMod(Stat.EVASION, 2);
	}
	
	@Override
	protected String describe(){
		return "применяет \u001B[38;5;8mMinimize\u001B[0m";
	}

}
