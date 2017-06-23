package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public class FuncDefC {
    Symbol funcName;
    Symbol argName;
    ExprC body;

    public FuncDefC(Symbol funcName, Symbol argName, ExprC body) {
        this.funcName = funcName;
        this.argName = argName;
        this.body = body;
    }

    public ExprC getBody() {
        return body;
    }

    public Symbol getArgName() {
        return argName;
    }

    public Symbol getFuncName() {
        return funcName;
    }
}
