package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public class MultC implements ExprC{
    ExprC l;
    ExprC r;

    public MultC(ExprC l, ExprC r) {
        this.l = l;
        this.r = r;
    }

    public Integer intepret(FunDefs funDefs) {
        return l.intepret(funDefs) * r.intepret(funDefs);
    }

    public ExprC substitute(Symbol s, ExprC target) {
        return new MultC(l.substitute(s, target), r.substitute(s, target));
    }
}
