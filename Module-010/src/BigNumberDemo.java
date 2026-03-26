import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigNumberDemo {
    public static void main(String[] args) {
        BigInteger bigInt1 = new BigInteger("123456789012345678901234567890");
        BigInteger bigInt2 = new BigInteger("987654321098765432109876543210");
        BigInteger bigSum = bigInt1.add(bigInt2);
        System.out.println("BigInteger sum: " + bigSum);

        BigDecimal dec1 = new BigDecimal("0.3333333333333333333333");
        BigDecimal dec2 = new BigDecimal("1.6666666666666666666667");
        BigDecimal decSum = dec1.add(dec2).setScale(10, RoundingMode.HALF_UP);
        System.out.println("BigDecimal sum: " + decSum);
    }
}
