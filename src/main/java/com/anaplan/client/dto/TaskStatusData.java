package com.anaplan.client.dto;

import com.anaplan.client.TaskStatus;

/**
 * Created by Spondon Saha
 * User: spondonsaha
 * Date: 6/21/17
 * Time: 3:39 PM
 */
public class TaskStatusData {
    private String type;
    private String taskId;
    private double progress;
    private String currentStep;
    private TaskStatus.State taskState;
    private TaskResultData result;
    private String cancelledBy;

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }

    public String getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(String currentStep) {
        this.currentStep = currentStep;
    }

    public TaskStatus.State getTaskState() {
        return taskState;
    }

    public void setTaskState(TaskStatus.State taskState) {
        this.taskState = taskState;
    }

    public TaskResultData getResult() {
        return result;
    }

    public void setResult(TaskResultData result) {
        this.result = result;
    }

    public String getCancelledBy() {
        return cancelledBy;
    }

    public void setCancelledBy(String cancelledBy) {
        this.cancelledBy = cancelledBy;
    }
}
