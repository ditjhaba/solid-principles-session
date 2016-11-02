package dip.example1.fixed;

import dip.example1.Order;

public class USTaxStrategy implements TaxStrategy{
    public double findTaxAmount(Order order) {
        return 0;
    }
}
