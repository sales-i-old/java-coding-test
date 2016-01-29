package com.salesi.service;

import com.salesi.entity.ToDo;

import java.util.ArrayList;

/**
 * Created by salesi on 28/01/2016.
 */
public interface CreateToDoService {

    ArrayList<ToDo> createTodo(ArrayList<ToDo> todoArrayList);
}
