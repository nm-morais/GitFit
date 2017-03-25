package com.example.nunomorais.a123;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;

/**
 * Created by messuped on 3/25/17.
 */


public class History implements Serializable {


    private LinkedHashMap<Date, Log> calendar;

    public History() {
        calendar = new LinkedHashMap<Date, Log>();
    }

    public void addLog() {
        calendar.put(new Date(), new Log());
    }

    public Log getLog(Date day) throws NoAvailableLogException {
        Log l = calendar.get(day);

        if (l == null) throw new NoAvailableLogException();

        return l;
    }

}
