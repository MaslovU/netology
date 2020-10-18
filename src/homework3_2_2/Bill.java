package homework3_2_2;

import homework3_2_2.taxes.TaxService;
import homework3_2_2.taxes.TaxType;

import java.math.BigDecimal;

class Bill {

    private final BigDecimal amount;
    private final TaxType taxType;
    private final TaxService taxService;

    public Bill(BigDecimal amount, TaxType taxType, TaxService taxService) {

        this.amount = amount;
        this.taxType = taxType;
        this.taxService = taxService;
    }

    public void payTaxes() {

        taxService.payOut(taxType.calculateTaxFor(amount));
    }
}