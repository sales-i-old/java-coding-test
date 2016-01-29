package com.salesi.entity;

/**
 * Created by salesi on 28/01/2016.
 */
public class ToDo {

    int taskId;
    String taskName;
    String taskDescription;


    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public ToDo(int taskId, String taskName, String taskDescription) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ToDo toDo = (ToDo) o;

        if (taskId != toDo.taskId) return false;
        if (taskName != null ? !taskName.equals(toDo.taskName) : toDo.taskName != null) return false;
        return taskDescription != null ? taskDescription.equals(toDo.taskDescription) : toDo.taskDescription == null;

    }

    @Override
    public int hashCode() {
        int result = taskId;
        result = 31 * result + (taskName != null ? taskName.hashCode() : 0);
        result = 31 * result + (taskDescription != null ? taskDescription.hashCode() : 0);
        return result;
    }
}
