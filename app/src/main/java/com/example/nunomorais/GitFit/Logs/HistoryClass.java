package com.example.nunomorais.GitFit.Logs;

import com.example.nunomorais.GitFit.NoAvailableLogException;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


public class HistoryClass implements History {


    private Map<Date, Log> calendar;

    public HistoryClass() {
        calendar = new LinkedHashMap<Date, Log>();
    }

    @Override
    public Log addLog() {
        Date date = new Date();
        return calendar.put(date, new Log(date));
    }

    @Override
    public Log getLog(Date day) throws NoAvailableLogException {
        Log l = calendar.get(day);

        if (l == null) throw new NoAvailableLogException();

        return l;
    }

    @Override
    public Iterator<Log> getAllHistory() {
        return this.calendar.values().iterator();
    }

}
