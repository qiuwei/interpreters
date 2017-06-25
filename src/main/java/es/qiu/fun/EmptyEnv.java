package es.qiu.fun;

import java.util.NoSuchElementException;

/**
 * Created by wqiu on 25/06/17.
 */

public class EmptyEnv implements Env{
    public EmptyEnv () {
    }

    public Env extend(Symbol s, Value v) {
        return new ConsEnv(new Pair<Symbol, Value>(s, v), this);
    }

    public Value get(Symbol s) {
        throw new NoSuchElementException(String.format("Symbol %s not found", s));
    }


}
