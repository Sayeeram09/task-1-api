package com.example.taskapi.model;

import java.util.Date;

public class TaskExecution {
    private Date startTime;
    private Date endTime;
    private String status;

    public TaskExecution() {}

    public TaskExecution(Date startTime, Date endTime, String status) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.status = status;
    }

    public Date getStartTime() { return startTime; }

    public void setStartTime(Date startTime) { this.startTime = startTime; }

    public Date getEndTime() { return endTime; }

    public void setEndTime(Date endTime) { this.endTime = endTime; }

    public String getStatus() { return status; }

    public void setStatus(String status) { this.status = status; }
}
