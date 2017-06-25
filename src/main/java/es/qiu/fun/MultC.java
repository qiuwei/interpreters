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

    public <T> T accept(Vistor<T> visitor) {
        return visitor.visitMultC(this);
    }

}
