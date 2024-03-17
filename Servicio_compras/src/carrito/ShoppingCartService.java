package carrito;

import java.util.ArrayList;
import java.util.List;

import Interfaz.Observable;
import Interfaz.Observer;

public class ShoppingCartService implements Observable {
	private List<Observer> observers = new ArrayList<>();
	private String name;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    
    public ShoppingCartService(String name) {
    	this.name = name;
    }

    public void removeAllProducts() {
        System.out.println(this.name +"Eliminando todos los productos del carrito");
    }
}
