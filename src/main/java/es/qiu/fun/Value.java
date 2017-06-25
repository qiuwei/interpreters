package es.qiu.fun;

/**
 * Created by wqiu on 25/06/17.
 */
public interface Value {
    public Value add(Value v);
    public Value mult(Value v);
    public Value app(Value v);

    public Value add(NumberV v);
    public Value mult(NumberV v);

    public Value add(FuncV v);
    public Value mult(FuncV v);
}
