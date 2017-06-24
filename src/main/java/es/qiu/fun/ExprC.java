package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public interface ExprC {
    public ExprC substitute(Symbol s, ExprC target);

    public <T> T accept(Vistor<T> InterpretVisitor);
}
