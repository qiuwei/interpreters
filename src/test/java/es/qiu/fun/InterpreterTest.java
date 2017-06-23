package es.qiu.fun;

import static org.junit.Assert.*;

/**
 * Created by wqiu on 23/06/17.
 */
public class InterpreterTest {
    @org.junit.Test
    public void interpret() throws Exception {
        ExprC expr = new MultC(new NumberC(6), new NumberC(2));
        assertTrue((Interpreter.interpret(expr, new FunDefs()) == 12));
        ExprC expr2 = new PlusC(expr, new MultC(new NumberC(2), new NumberC(4)));
        assertTrue(Interpreter.interpret(expr2, new FunDefs()) == 20);
    }

    @org.junit.Test(expected = .class))
    public void interpretWithFuns() {
        Symbol x = new Symbol("x");
        FuncDefC fun1 = new FuncDefC(new Symbol("square"), x, new MultC(new IdC(x), new IdC(x)));
        FunDefs funDefs = new FunDefs();

        FuncDefC unboundFun1 = new FuncDefC(new Symbol("square_unbound"), x, new MultC(new IdC(x), new IdC(new Symbol("y"))));
        funDefs.add(unboundFun1);

        funDefs.add(fun1);
        assertTrue(Interpreter.interpret(new AppC(new Symbol("square"), new NumberC(5)), funDefs) == 25);
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)  {

    }

}