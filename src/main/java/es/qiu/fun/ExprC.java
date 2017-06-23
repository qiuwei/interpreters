package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public interface ExprC {
    public Integer intepret(FunDefs funDefs);
    public ExprC substitute(Symbol s, ExprC target);
}
