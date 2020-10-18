package homework3_2_2.taxes;

import java.math.BigDecimal;

public class VATaxType extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {

        BigDecimal amount1 = new BigDecimal(String.valueOf(amount));
        BigDecimal valueTax = new BigDecimal("0.18");

        return amount1.multiply(valueTax);
    }
}
