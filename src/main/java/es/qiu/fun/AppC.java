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

    public Integer intepret(FunDefs funDefs) {
        FuncDefC fun = funDefs.get(funcName);
        // whether evaluate arg is a crucial design decision
        return fun.getBody().substitute(fun.getArgName(), arg).intepret(funDefs);
    }

    // how to handle name collision?
    public ExprC substitute(Symbol s, ExprC target) {
        return new AppC(funcName, arg.substitute(s, target));
    }
}
