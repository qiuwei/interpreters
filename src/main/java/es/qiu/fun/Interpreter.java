package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public class Interpreter {

    public static Value interpret(ExprC expr, EmptyEnv emptyEnv) {
        InterpretVisitor interpretVisitor = new InterpretVisitor(emptyEnv);
        return expr.accept(interpretVisitor);
    }
}
