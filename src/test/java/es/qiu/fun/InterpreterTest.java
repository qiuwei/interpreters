package es.qiu.fun;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

/**
 * Created by wqiu on 23/06/17.
 */
public class InterpreterTest {
    @org.junit.Test
    public void interpret() throws Exception {
        ExprC expr = new MultC(new NumberC(6), new NumberC(2));
        assertEquals(Interpreter.interpret(expr, new EmptyEnv()), new NumberV(12));
        ExprC expr2 = new PlusC(expr, new MultC(new NumberC(2), new NumberC(4)));
        assertEquals(Interpreter.interpret(expr2, new EmptyEnv()), new NumberV(20));
    }

    @org.junit.Test
    public void interpretWithFuns() {
        Symbol x = new Symbol("x");
        assertTrue(Interpreter.interpret(new AppC(new FunC(x, new MultC(new IdC(x), new IdC(x))), new NumberC(5)), new EmptyEnv()).equals(new NumberV(25)) );
    }

    @org.junit.Test(expected = NoSuchElementException.class)
    public void interpreWithUnboundFun() {
        Symbol x = new Symbol("x");
        assertTrue(Interpreter.interpret(new AppC(new FunC(x, new MultC(new IdC(x), new IdC(new Symbol("y")))), new NumberC(5)), new EmptyEnv()).equals(new NumberV(25)));

    }

    @org.junit.Test(expected = NoSuchElementException.class)
    public void testStaticScope () {
        Symbol x = new Symbol("x");
        Symbol y = new Symbol("y");
        Symbol f2 = new Symbol("f2");
        FunC fun2 = new FunC(y, new PlusC(new IdC(x), new IdC(y)));
        FunC fun1 = new FunC(x, new AppC(fun2, new NumberC(4)));
        Value result = Interpreter.interpret(new AppC(fun1, new NumberC(3)), new EmptyEnv());
        System.out.println(result);
    }
}