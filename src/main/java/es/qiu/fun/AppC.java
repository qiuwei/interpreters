package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public class AppC implements ExprC {
    Symbol funcName;
    ExprC arg;

    public AppC(Symbol funcName, ExprC arg) {
        this.funcName = funcName;
        this.arg = arg;
    }

    // how to handle name collision?
    public ExprC substitute(Symbol s, ExprC target) {
        return new AppC(funcName, arg.substitute(s, target));
    }

    public <T> T accept(Vistor<T> visitor) {
       return visitor.visitAppC(this);
    }
}
