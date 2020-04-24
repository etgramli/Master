package de.etgramlich.dsl.expr;

public interface BeginScope {
    Scope3 expr(Double aDouble);
    Scope3 expr(Expr expr);
}
