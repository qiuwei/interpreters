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

    public <T> T accept(Vistor<T> visitor) {
        return visitor.visitPlusC(this);
    }
}
