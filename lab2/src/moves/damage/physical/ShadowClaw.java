package src.moves.damage.physical;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove{
	
	public ShadowClaw(){
		super(Type.GHOST, 70, 100);
	}
	
	@Override
	protected double calcCriticalHit(Pokemon att, Pokemon def){
		if ( (att.getStat(Stat.SPEED) / 512.0 ) > Math.random()) {
			return 2.0*3.0;
		} else {
			return 1.0;
		}
	}
	
	@Override
	protected String describe(){
		return "применяет \u001B[38;5;55mShadow Claw\u001B[0m";
	}

}
