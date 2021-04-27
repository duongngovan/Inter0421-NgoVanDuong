package models;

public class TuHoSo {
    String id;
    String boPhan;
    Employee employee;

    public TuHoSo() {
    }

    public TuHoSo(String id, String boPhan, Employee employee) {
        this.id = id;
        this.boPhan = boPhan;
        this.employee = employee;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
