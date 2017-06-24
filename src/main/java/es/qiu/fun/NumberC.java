package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public class NumberC implements ExprC {
    Integer n;

    public NumberC(Integer n){
        this.n = n;
    }

    public ExprC substitute(Symbol s, ExprC target) {
        return this;
    }

    public <T> T accept(Vistor<T> visitor) {
        return visitor.visitNumberC(this);
    }
}
