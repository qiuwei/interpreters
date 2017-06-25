package es.qiu.fun;

/**
 * Created by wqiu on 25/06/17.
 */
public class SubstituteVisitor implements Vistor<ExprC>{
    private final Symbol s;
    private final ExprC exprC;

    public SubstituteVisitor(Symbol s, ExprC exprC) {
        this.s= s;
        this.exprC = exprC;
    }

    public ExprC visitAppC(AppC appc) {
        return new AppC(appc.funcName, appc.arg.accept(this));
    }

    public ExprC visitIdC(IdC idc) {
        if(this.s.equals(idc.id)) {
            return this.exprC;
        } else {
            return idc;
        }
    }

    public ExprC visitMultC(MultC multC) {
        return new MultC(multC.l.accept(this), multC.r.accept(this));
    }

    public ExprC visitNumberC(NumberC numberC) {
        return numberC;
    }

    public ExprC visitPlusC(PlusC plusC) {
        return new PlusC(plusC.l.accept(this), plusC.r.accept(this));
    }
}
