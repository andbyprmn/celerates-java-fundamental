package com.celerates.models;

public class Employees {
    
    private String te_employee_id;
    private String te_employee_name;
    private String te_gender;
    private String te_email;
    private int te_salary;
    
    public Employees(String te_employee_id, String te_employee_name, String te_gender, String te_email,
            int te_salary){
        this.te_employee_id = te_employee_id;
        this.te_employee_name = te_employee_name;
        this.te_gender = te_gender;
        this.te_email = te_email;
        this.te_salary = te_salary;
        
    }

    public String getTe_employee_id() {
        return te_employee_id;
    }

    public void setTe_employee_id(String te_employee_id) {
        this.te_employee_id = te_employee_id;
    }

    public String getTe_employee_name() {
        return te_employee_name;
    }

    public void setTe_employee_name(String te_employee_name) {
        this.te_employee_name = te_employee_name;
    }

    public String getTe_gender() {
        return te_gender;
    }

    public void setTe_gender(String te_gender) {
        this.te_gender = te_gender;
    }

    public String getTe_email() {
        return te_email;
    }

    public void setTe_email(String te_email) {
        this.te_email = te_email;
    }

    public int getTe_salary() {
        return te_salary;
    }

    public void setTe_salary(int te_salary) {
        this.te_salary = te_salary;
    }
    
}
