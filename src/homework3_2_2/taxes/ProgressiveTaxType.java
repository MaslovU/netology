package homework3_2_2.taxes;

import java.math.BigDecimal;

public class ProgressiveTaxType extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {

        BigDecimal amount1 = new BigDecimal(String.valueOf(amount));
        BigDecimal valueTax;
        int res = amount.compareTo(BigDecimal.valueOf(100000));
        if (res < 0) {
            valueTax = new BigDecimal("0.10");
        } else {
            valueTax = new BigDecimal("0.15");
        }

        return amount1.multiply(valueTax);
    }
}
