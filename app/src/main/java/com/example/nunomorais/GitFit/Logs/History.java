package com.example.nunomorais.GitFit.Logs;

import com.example.nunomorais.GitFit.NoAvailableLogException;

import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;


/**
 * A history is just a structure of logs, to keep the user's previous logs stored for acess
 * and analysis of progress
 */
interface History extends Serializable {

    /**
     * adds a log to the history
     * this process is automated
     *
     * @return the inserted log
     */
    Log addLog();

    /**
     * returns the log correspondent to the inserted date
     *
     * @param day the day correspondent to the log
     * @return object Log
     * @throws NoAvailableLogException
     */
    Log getLog(Date day) throws NoAvailableLogException;


    /**
     * returns an iterator of all the logs until the day
     *
     * @return Object iterator
     */
    Iterator<Log> getAllHistory();
}
