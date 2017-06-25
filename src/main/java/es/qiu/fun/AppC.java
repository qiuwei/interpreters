package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public class AppC implements ExprC {
    ExprC func;
    ExprC arg;

    public AppC(ExprC func, ExprC arg) {
        this.func= func;
        this.arg = arg;
    }

    public <T> T accept(Vistor<T> visitor) {
       return visitor.visitAppC(this);
    }
}
