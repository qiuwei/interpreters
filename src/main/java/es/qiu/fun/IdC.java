package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public class IdC implements ExprC{
    Symbol id;

    public IdC(Symbol id) {
        this.id = id;
    }

    public <T> T accept(Vistor<T> visitor) {
        return visitor.visitIdC(this);
    }

}
