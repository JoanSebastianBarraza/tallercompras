package notificados;

import Interfaz.Observer;

public class InventoryService implements Observer{
	private String name;
	public InventoryService(String name) {
		this.name= name;
	}
	@Override
    public void update() {
        System.out.println(this.name+"Actualizando el inventario, descontando unidades");
    }
}
