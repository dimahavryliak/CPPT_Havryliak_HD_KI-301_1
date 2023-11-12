package com.company;

public class EquationsApp {
    public static void main(String[] args) {
        CalculateTheEquationInterface calc = new CalculateTheEquation();
        System.out.println("  y=ctg(x)  = " + calc.doCalculation(200));
        System.out.println("  y=ctg(x)   = " + calc.doCalculation(50));
        System.out.println("  y=ctg(x)   = " + calc.doCalculation(-2222));

        System.out.println("  y=ctg(x)" +
                "   = " + calc.doCalculationWithInputInside());
    }
}
