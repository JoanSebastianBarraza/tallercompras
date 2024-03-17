import carrito.PaymentService;
import carrito.ShoppingCartService;
import notificados.InventoryService;
import notificados.UserService;

public class Main {

	public static void main(String[] args) {
		ShoppingCartService shoppingCartService = new ShoppingCartService("Servicio de carrito de compras: ");
        InventoryService inventoryService = new InventoryService("Servicio de inventario: ");
        UserService userService = new UserService("Servicio de usuario: ");

        shoppingCartService.addObserver(inventoryService);
        shoppingCartService.addObserver(userService);

     
        PaymentService paymentService = new PaymentService(shoppingCartService);
        paymentService.processPayment();
        
        removeAllProductsAfterPayment(shoppingCartService);
    }

	 private static void removeAllProductsAfterPayment(ShoppingCartService shoppingCartService) {
	        shoppingCartService.removeAllProducts();
	    }
	}
