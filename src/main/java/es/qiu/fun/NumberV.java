package es.qiu.fun;

import javax.naming.OperationNotSupportedException;
import javax.swing.*;

/**
 * Created by wqiu on 25/06/17.
 */
public class NumberV implements Value{
    Integer n;
    public NumberV(Integer n) {
        this.n = n;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NumberV numberV = (NumberV) o;

        return n.equals(numberV.n);

    }

    @Override
    public int hashCode() {
        return n.hashCode();
    }

    @Override
    public String toString() {
        return "NumberV{" +
                "n=" + n +
                '}';
    }

    public Value add(NumberV v) {
        return new NumberV(this.n + v.n);
    }

    public Value mult(NumberV v) {
        return new NumberV(this.n * v.n);
    }

    public Value add(FuncV v) {
        throw new UnsupportedOperationException("A function can not be added");
    }

    public Value mult(FuncV v) {
        throw new UnsupportedOperationException("A function can not be multiplied");
    }

    public Value add(Value v) {
        return v.add(this);
    }

    public Value mult(Value v) {
        return v.mult(this);
    }

    public Value app(Value v) {
        throw new UnsupportedOperationException("A number cannot be applied to a value");
    }
}
