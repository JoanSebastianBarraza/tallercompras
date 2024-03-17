package notificados;

import Interfaz.Observer;

public class UserService implements Observer{
	private String name;
	public UserService(String name) {
		this.name = name;
	}
	 @Override
	    public void update() {
	        System.out.println(this.name+"Notificando al usuario sobre los productos comprados");
	    }
}
