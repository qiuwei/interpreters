package es.qiu.fun;

/**
 * Created by wqiu on 25/06/17.
 */
public interface Env {

    public Env extend(Symbol s, Value v);

    Value get(Symbol s);
}
