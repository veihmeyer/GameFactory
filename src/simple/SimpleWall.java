package simple;

import interfaces.AbstractWall;

public class SimpleWall implements AbstractWall {
	
	public void Wall() {
		
	}
	
	@Override
	public void create() {
		System.out.println("Voc� criou uma corredor de poder simples!");
	}
}
