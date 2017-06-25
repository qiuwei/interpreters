package es.qiu.fun;

/**
 * Created by wqiu on 25/06/17.
 */
public class FuncV implements Value{
    Symbol arg;
    ExprC body;
    Env env;

    public FuncV(Symbol arg, ExprC body, Env env) {
        this.arg = arg;
        this.body = body;
        this.env = env;
    }

    public Value add(NumberV v) {
        throw new UnsupportedOperationException();
    }

    public Value mult(NumberV v) {
        throw new UnsupportedOperationException();
    }

    public Value add(FuncV v) {
        throw new UnsupportedOperationException("A function can not be added");
    }

    public Value mult(FuncV v) {
        throw new UnsupportedOperationException("A function can not be multiplied");
    }

    public Value add(Value v) {
        throw new UnsupportedOperationException("A function can not be added");
    }

    @Override
    public String toString() {
        return "FuncV{" +
                "arg=" + arg +
                ", body=" + body +
                ", env=" + env +
                '}';
    }

    public Value mult(Value v) {
        throw new UnsupportedOperationException("A function can not be multiplied");
    }

    public Value app(Value v) {
        Env envExtended = env.extend(this.arg, v);
        return this.body.accept(new InterpretVisitor(envExtended));
    }
}
