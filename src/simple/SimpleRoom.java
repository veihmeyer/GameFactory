package simple;

import interfaces.AbstractRoom;

public class SimpleRoom implements AbstractRoom {
	public void Room() {
		
	}
	
	@Override
	public void create() {
		System.out.println("Voc� criou uma sala de poder simples!");
	}
}
