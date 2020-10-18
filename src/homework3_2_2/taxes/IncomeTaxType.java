package homework3_2_2.taxes;

import java.math.BigDecimal;

public class IncomeTaxType extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {

        BigDecimal amount1 = new BigDecimal(String.valueOf(amount));
        BigDecimal valueTax = new BigDecimal("0.13");

        return amount1.multiply(valueTax);
    }
}
