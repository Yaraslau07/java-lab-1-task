package org.example;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal productCost = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.05");
        int units = 10_000;

        BigDecimal vatPerUnit = productCost.multiply(vatRate);
        BigDecimal grossPerUnit = productCost.add(vatPerUnit);
        System.out.println("VAT per unit: " + vatPerUnit);

        BigDecimal totalNet = BigDecimal.ZERO;
        BigDecimal totalVat = BigDecimal.ZERO;
        BigDecimal totalGross = BigDecimal.ZERO;

        for (int i = 0; i < units; i++) {
            totalNet = totalNet.add(productCost);
            totalVat = totalVat.add(vatPerUnit);
            totalGross = totalGross.add(grossPerUnit);
        }

        System.out.println("Total net sales value: " + totalNet);
        System.out.println("Total VAT amount: " + totalVat);
        System.out.println("Total gross value: " + totalGross);
    }
}
