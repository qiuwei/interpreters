package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public class Interpreter {

    public static Integer interpret(ExprC expr, FunDefs funDefs) {
        return expr.intepret(funDefs);
    }
}
