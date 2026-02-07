import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        
        Product p1 = new Product();
        Product p2 = new Product();

        try {

            System.out.println("Producto 1");

            String desc;
            do {
                System.out.print("Descripición: ");
                desc = sc.nextLine();
            } while (desc.trim().isEmpty());
            p1.setDescription(desc);

            String code;
            do {
                System.out.print("Código: ");
                code = sc.nextLine();
            } while (code.trim().isEmpty());
            p1.setCode(code);

            String type;
            do {
                System.out.print("Tipo: ");
                type = sc.nextLine();
            } while (type.trim().isEmpty());
            p1.setType(type);

            double cost;
            while(true) {
                try {
                    System.out.print("Costo: ");
                    cost = sc.nextDouble();
                    if (cost >= 0) {
                        break;
                    }
                    System.out.println("El costo debe ser positivo");
                } catch(InputMismatchException e) {
                    System.out.println("Debes ingresar un número válido");
                    sc.nextLine();
                }
            }
            p1.setCost(cost);

            double tax;
            while(true) {
                try {
                    System.out.print("Impuesto(%): ");
                    tax = sc.nextDouble();
                    if (tax >= 0 && tax <= 100) {
                        break;
                    }
                    System.out.println("El impuesto debe estar entre 0 y 100");
                } catch (InputMismatchException e) {
                    System.out.println("Debes ingresar un número válido");
                    sc.nextLine();
                }
            }
            p1.setTax(tax);

            sc.nextLine();

            System.out.println("\nProducto 2");

            do {
                System.out.print("Descripición: ");
                desc = sc.nextLine();
            } while (desc.trim().isEmpty());
            p2.setDescription(desc);

            do {
                System.out.print("Código: ");
                code = sc.nextLine();
            } while (code.trim().isEmpty());
            p2.setCode(code);

            do {
                System.out.print("Tipo: ");
                type = sc.nextLine();
            } while (type.trim().isEmpty());
            p2.setType(type);

            while(true) {
                try {
                    System.out.print("Costo: ");
                    cost = sc.nextDouble();
                    if (cost >= 0) {
                        break;
                    }
                    System.out.println("El costo debe ser positivo");
                } catch(InputMismatchException e) {
                    System.out.println("Debes ingresar un número válido");
                    sc.nextLine();
                }
            }
            p2.setCost(cost);

            while(true) {
                try {
                    System.out.print("Impuesto(%): ");
                    tax = sc.nextDouble();
                    if (tax >= 0 && tax <= 100) {
                        break;
                    }
                    System.out.println("El impuesto debe estar entre 0 y 100");
                } catch (InputMismatchException e) {
                    System.out.println("Debes ingresar un número válido");
                    sc.nextLine();
                }
            }
            p2.setTax(tax);

            double profit;
            while(true) {
                try {
                    System.out.print("\nUtilidad(%): ");
                    profit = sc.nextDouble();
                    if (profit >= 0 && profit <= 100) {
                        break;
                    }
                } catch(InputMismatchException e) {
                    System.out.println("Dbes ingresar un número válido");
                    sc.nextLine();
                }
            }

            System.out.println("\nDatos del producto 1");
            p1.showProduct();

            System.out.println("\nDatos del producto 2");
            p2.showProduct();

            String result = compareProducts(p1, p2, profit);
            System.out.println("Producto con mayor precio de venta: " + result);

        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado, por favor intenta de nuevo");
        }
    } 

    static String compareProducts(Product p1, Product p2, double profit) {
        double price1 = p1.calculatePrice(profit);
        double price2 = p2.calculatePrice(profit);

        if (price1 > price2) {
            return p1.getDescription();
        } else {
            return p2.getDescription();
        }
    }
}

class Product {
    private String description;
    private String code;
    private String type;
    private Double cost;
    private Double tax;

    public String getDescription() { return description; }
    public String getCode() { return code; }
    public String getType() { return type; }
    public Double getCost() { return cost; }
    public Double getTax() { return tax; }

    public void setDescription(String description) { this.description = description; }
    public void setCode(String code) { this.code = code; }
    public void setType(String type) { this.type = type; }
    public void setCost(Double cost) { this.cost = cost; }
    public void setTax(Double tax) { this.tax = tax; }

    public void showProduct() {
        System.out.println("Descripción: " + description);
        System.out.println("Código: " + code);
        System.out.println("Tipo: " + type);
        System.out.println("Costo: " + cost);
        System.out.println("Impuesto: " + tax + "%");
    }

    public double calculatePrice(double profit) {
        double priceWithProfit = cost + (cost * profit / 100);
        double finalPrice = priceWithProfit + (priceWithProfit *tax /100);
        return finalPrice;
    }
}