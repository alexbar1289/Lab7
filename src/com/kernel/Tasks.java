package com.kernel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tasks {

    private static Map<String, String> tasks = new HashMap<>();

    static {
        tasks.put("Monday", "");
        tasks.put("Tuesday", "");
        tasks.put("Wednesday", "");
        tasks.put("Thursday", "");
        tasks.put("Friday", "");
        tasks.put("Saturday", "");
        tasks.put("Sunday", "");
    }

    public String takeTask(String day){
        return tasks.get(day);
    }

    public Set getDays(){
        return tasks.keySet();
    }

    public void setTask(String day, String task){
        tasks.put(day, task);
    }
}
