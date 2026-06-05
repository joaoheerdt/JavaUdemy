package Enumeracao.Application;

import Enumeracao.Entities.Client;
import Enumeracao.Entities.Enums.OrderStatus;
import Enumeracao.Entities.Order;
import Enumeracao.Entities.OrderItem;
import Enumeracao.Entities.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdfBirth = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfOrder = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdfBirth.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine(); // Limpeza do buffer do teclado (consome a quebra de linha pendente do nextInt)
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);

        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + sdfOrder.format(order.getMoment()));
        System.out.println("Order status: " + order.getStatus());
        System.out.println("Client: " + order.getClient().getName()
                + " (" + sdfBirth.format(order.getClient().getBirthDate()) + ") - "
                + order.getClient().getEmail());

        System.out.println("Order items:");
        for (OrderItem item : order.getItems()) {
            System.out.println(item.getProduct().getName()
                    + ", $" + String.format("%.2f", item.getPrice())
                    + ", Quantity: " + item.getQuantity()
                    + ", Subtotal: $" + String.format("%.2f", item.subTotal()));
        }

        System.out.println("Total price: $" + String.format("%.2f", order.total()));


        sc.close();
    }


}
