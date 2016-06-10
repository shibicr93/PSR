package com.saggezza.psr.controller;

import java.util.List;

/**
 * Created by shibi on 9/6/16.
 */
public interface IController<K> {
    List<K> getAll();

    K get(String id);

    void create(K k);

    void update(K k);

    void delete(K k);

}
