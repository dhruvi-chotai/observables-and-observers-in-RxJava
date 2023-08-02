package com.example.observablesandobserversinrxjava;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Task> createTaskList(){
        List<Task> tasks =  new ArrayList<>();
        tasks.add(new Task("Wake up",true,0));
        tasks.add(new Task("Take Bath",true,2));
        tasks.add(new Task("Brush your teeth",false,1));
        tasks.add(new Task("DO prayer",true,3));
        tasks.add(new Task("Go to office",true,4));
        return tasks;
    }
}
