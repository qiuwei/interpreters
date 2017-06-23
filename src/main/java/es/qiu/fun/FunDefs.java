package es.qiu.fun;

import java.util.Hashtable;

/**
 * Created by wqiu on 23/06/17.
 */
public class FunDefs {
    Hashtable<Symbol, FuncDefC> fundefTable;

    public FunDefs(){
        fundefTable = new Hashtable<Symbol, FuncDefC>();
    }

    public void add(FuncDefC funDef){
        fundefTable.put(funDef.getFuncName(), funDef);
    }

    public FuncDefC get(Symbol funcName) {
        FuncDefC fun = fundefTable.get(funcName);
        if(fun == null) {
            throw new UnsupportedOperationException("Function not defined");
        } else {
            return fun;
        }
    }
}
