package es.qiu.fun;


/**
 * Created by wqiu on 24/06/17.
 */
public interface Vistor<T> {
    public T visitAppC(AppC appc);
    public T visitIdC(IdC idc);
    public T visitMultC(MultC multC);
    public T visitNumberC(NumberC numberC);
    public T visitPlusC(PlusC plusC);
    public T visitFunC(FunC funC);
}
