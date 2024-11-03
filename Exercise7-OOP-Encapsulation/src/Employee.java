public class Employee {
    private String id;
    private String name;
    private int salary;
    private int AnnualSalary;

    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAnnualSalary() {
        return salary *12;
    }

    public String raisedSalary(int percent){
        setSalary(salary + (salary * percent /100));
        return "the salary after raised is : "+getSalary();
    }

    public String toString(){
        return "Name ; "+getName()+"\nID : "+getId()+"\nSalary : "+getSalary()+"\nAnnual Salary : "+getAnnualSalary()+"\n\"&***************************************************&\"";

    }
    Employee(){

    }
    Employee(String id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
