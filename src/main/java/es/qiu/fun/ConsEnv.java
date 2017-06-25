package es.qiu.fun;

import sun.jvm.hotspot.debugger.cdbg.Sym;

/**
 * Created by wqiu on 25/06/17.
 */
class Pair<T, S> {
    T l;
    S r;

    public Pair(T l, S r) {
        this.l = l;
        this.r = r;
    }
}
public class ConsEnv implements Env{
    Pair<Symbol, Value>  pair;
    Env remEnv;

    public ConsEnv(Pair<Symbol, Value> pair, Env env) {
        this.pair = pair;
        this.remEnv = env;
    }
    public Env extend(Symbol s, Value v) {
        return new ConsEnv(new Pair<Symbol, Value>(s, v), this);
    }

    public Value get(Symbol s)  {
        if(pair.l.equals(s)) {
            return pair.r;
        } else {
            return remEnv.get(s);
        }
    }

}
