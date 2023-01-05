package com.example.inclassactivity2;

public class job {
    String name;
    float salary;
    String jobType;

    public job(String name, float salary, String jobType) {
        this.name = name;
        this.salary = salary;
        this.jobType = jobType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' + ", jobType='" + jobType;
    }
}
