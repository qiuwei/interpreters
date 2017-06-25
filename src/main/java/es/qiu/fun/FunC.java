package es.qiu.fun;

/**
 * Created by wqiu on 25/06/17.
 */
public class FunC implements ExprC{
    Symbol arg;
    ExprC body;

    public FunC(Symbol arg, ExprC body) {
        this.arg = arg;
        this.body = body;
    }

    public <T> T accept(Vistor<T> interpretVisitor) {
        return interpretVisitor.visitFunC(this);
    }
}
