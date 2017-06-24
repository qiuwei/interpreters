package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public class PlusC implements ExprC{
    ExprC l;
    ExprC r;

    public PlusC (ExprC l, ExprC r){
        this.l = l;
        this. r = r;
    }

    public ExprC substitute(Symbol s, ExprC target) {
        return new PlusC(l.substitute(s, target), r.substitute(s, target));
    }

    public <T> T accept(Vistor<T> visitor) {
        return visitor.visitPlusC(this);
    }
}
