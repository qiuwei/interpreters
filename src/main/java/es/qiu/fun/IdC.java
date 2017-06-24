package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public class IdC implements ExprC{
    Symbol id;

    public IdC(Symbol id) {
        this.id = id;
    }

    public Integer intepret(FunDefs funDefs) {
        throw new UnsupportedOperationException("Error: An id shouldn't be interpreted");
    }

    public ExprC substitute(Symbol s, ExprC target) {
        if (id.equals(s)) {
            return target;
        } else {
            return this;
        }
    }

    public <T> T accept(Vistor<T> visitor) {
        return visitor.visitIdC(this);
    }

}
