package com.example.nunomorais.GitFit.Logs;

import com.example.nunomorais.GitFit.NoAvailableLogException;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by messuped on 3/25/17.
 */


public class History implements Serializable {


    private Map<Date, Log> calendar;

    public History() {
        calendar = new LinkedHashMap<Date, Log>();
    }

    public void addLog() {
        Date date = new Date();
        calendar.put(date,new Log(date));
    }

    public Log getLog(Date day) throws NoAvailableLogException {
        Log l = calendar.get(day);

        if (l == null) throw new NoAvailableLogException();

        return l;
    }

    public Iterator<Log> getAllHistory(){
        return this.calendar.values().iterator();
    }

}
