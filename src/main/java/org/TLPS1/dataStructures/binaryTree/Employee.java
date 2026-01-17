package org.TLPS1.dataStructures.binaryTree;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private String workstation;
    private String office;

    public Employee(int id, String name, String workstation, String office) {
        this.id = id;
        this.name = name;
        this.workstation = workstation;
        this.office = office;
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

    public String getWorkstation() {
        return workstation;
    }

    public void setWorkstation(String workstation) {
        this.workstation = workstation;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workstation='" + workstation + '\'' +
                ", office='" + office + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name) && Objects.equals(workstation, employee.workstation) && Objects.equals(office, employee.office);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, workstation, office);
    }


    @Override
    public int compareTo(Employee empl) {
        if (this.getId() == empl.getId()){
            return 0;
        } else if (this.getId() > empl.getId()){
            return 1;
        } else {
            return -1;
        }
    }
}
