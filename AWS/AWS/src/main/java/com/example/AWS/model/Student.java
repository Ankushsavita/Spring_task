package com.example.AWS.model;

public class Student {
    private int id;
    private String name;
    private Boolean Status;

    public Student(int id , String name, Boolean Status) {
        this.id = id;
        this.name = name;
        this.Status = Status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getStatus() {
        return Status;
    }

    public void setStatus(Boolean status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Status=" + Status +
                '}';
    }
}
