package de.etgramlich.dsl.expr;

public interface DividedMinusPlusTimesScope extends EndScope {
    DividedMinusPlusTimesScope minus(Expr expr);
    DividedMinusPlusTimesScope minus(Double aDouble);
    DividedMinusPlusTimesScope divided(Expr expr);
    DividedMinusPlusTimesScope divided(Double aDouble);
    DividedMinusPlusTimesScope plus(Expr expr);
    DividedMinusPlusTimesScope plus(Double aDouble);
    DividedMinusPlusTimesScope times(Expr expr);
    DividedMinusPlusTimesScope times(Double aDouble);
}
