import java.math.BigDecimal;
public class BigDecimalExample {
    public static void main(String[] args) {
        BigDecimal price = new BigDecimal("19.99");
        BigDecimal tax = new BigDecimal("0.08");
        BigDecimal total = price.add(price.multiply(tax));
        System.out.println("Total: $" + total);
    }
}