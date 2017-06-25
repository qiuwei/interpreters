package es.qiu.fun;

/**
 * Created by wqiu on 23/06/17.
 */
public class Symbol {
    String s;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Symbol symbol = (Symbol) o;

        return s.equals(symbol.s);

    }

    @Override
    public int hashCode() {
        return s.hashCode();
    }

    public Symbol(String s){
        this.s = s;
    }

    @Override
    public String toString() {
        return "Symbol{" +
                "s='" + s + '\'' +
                '}';
    }
}
