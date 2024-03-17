package carrito;

public class PaymentService {
	private ShoppingCartService shoppingCartService;

    public PaymentService(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    public void processPayment() {
        System.out.println("Procesando el pago...");
        shoppingCartService.notifyObservers();
    }
}
