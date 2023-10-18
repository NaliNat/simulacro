package ar.edu.bda.losmejores.simulacro.services;

import java.util.List;

public interface Service<T, ID> {
    List<T> getAll();
/*
    T getById(ID id);
*/
    void add(T entity);
}
