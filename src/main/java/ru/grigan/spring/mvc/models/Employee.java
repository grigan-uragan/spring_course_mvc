package ru.grigan.spring.mvc.models;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 255, message = "your name must have size between 2 and 255 symbols")
    private String name;
    @NotBlank(message = "surname is required field ")
    private String surname;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{2}", message = "your phone number must have view XXX-XX-XX")
    private String phone;
    @Min(value = 100, message = "your salary must be more than 100")
    @Max(value = 1000, message = "your salary must be less than 1001")
    private int salary;
    private String department;
    private Map<String, String> departments;
    private String carBrand;
    private Map<String, String> carBrands;
    private String[] languages;
    private Map<String, String> langList;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "information technologies");
        departments.put("HR", "human resources");
        departments.put("Sales", "Sales");
        carBrands = new HashMap<>();
        carBrands.put("BMW", "BMW");
        carBrands.put("Audi", "Audi");
        carBrands.put("Mercedes-Benz", "MB");
        langList = new HashMap<>();
        langList.put("English", "EN");
        langList.put("French", "FR");
        langList.put("Japanese", "JP");
    }

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public Map<String, String> getLangList() {
        return langList;
    }

    public void setLangList(Map<String, String> langList) {
        this.langList = langList;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
