package es.qiu.fun;

/**
 * Created by wqiu on 24/06/17.
 */
public class InterpretVisitor implements Vistor<Value>{
    private final Env env;

    public InterpretVisitor(Env env)  {
        this.env = env;
    }
    public Value visitAppC(AppC appC) {
        Value funcV = appC.func.accept(this);
        Value argV = appC.arg.accept(this);
        return funcV.app(argV);
    }

    public Value visitIdC(IdC idC) {
        return env.get(idC.id);
    }

    public Value visitMultC(MultC multC) {
        return multC.l.accept(this).mult(multC.r.accept(this));
    }

    public Value visitNumberC(NumberC numberC) {
        return new NumberV(numberC.n);
    }

    public Value visitPlusC(PlusC plusC) {
        return plusC.l.accept(this).add(plusC.r.accept(this));
    }

    public Value visitFunC(FunC funC) {
        return new FuncV(funC.arg, funC.body, this.getEnv());
    }

    public Env getEnv() {
        return env;
    }
}
