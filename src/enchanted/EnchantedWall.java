package enchanted;

import interfaces.AbstractWall;

public class EnchantedWall implements AbstractWall {
	public EnchantedWall() {
		
	}

	@Override
	public void create() {
		System.out.println("Uohhhm, voc� criou uma corredor m�gico!");
	}
}
