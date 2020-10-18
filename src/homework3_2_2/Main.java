package homework3_2_2;

import homework3_2_2.taxes.IncomeTaxType;
import homework3_2_2.taxes.ProgressiveTaxType;
import homework3_2_2.taxes.TaxService;
import homework3_2_2.taxes.VATaxType;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                new Bill(new BigDecimal(25000), new IncomeTaxType(), new TaxService()),
                new Bill(new BigDecimal(65000), new VATaxType(), new TaxService()),
                new Bill(new BigDecimal(220000), new ProgressiveTaxType(), new TaxService()),
                new Bill(new BigDecimal(22000), new ProgressiveTaxType(), new TaxService())
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
