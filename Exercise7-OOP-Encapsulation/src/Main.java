//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account aco = new Account("1002493110","Hashim",10000 );
        Account aco1 = new Account("1149845594","baroom",3000 );
        System.out.println(aco.debit(500));
        System.out.println(aco.debit(500));
        System.out.println(aco.debit(50000));
        System.out.println(aco.getBalance());
        System.out.println("&***************************************************&");
        System.out.println(aco.credit(11000));
        System.out.println(aco.credit(1200));
        System.out.println(aco.getBalance());
        System.out.println("&***************************************************&");
        System.out.println(aco.transferTo(aco1,5000));
        System.out.println(aco.transferTo(aco1,40000));
        System.out.println("first account : "+aco.getBalance());
        System.out.println("second account : "+aco1.getBalance());
        System.out.println("&***************************************************&");
        System.out.println(aco.toString());
        System.out.println("&***************************************************&");
        System.out.println(aco1.toString());
        System.out.println("&***************************************************&");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println("----------------------Employee-----------------------");
        Employee employee = new Employee();
        employee.setSalary(10000);
        employee.setId("1012234332");
        employee.setName("Hashim Baroom");
        System.out.println(employee.toString());
        System.out.println(employee.raisedSalary(50));
        System.out.println(employee.toString());
        System.out.println("&***************************************************&");
        Employee employee1 = new Employee("1323456456","Ali Ahmed",15000);
        System.out.println(employee.toString());
        System.out.println(employee.raisedSalary(10));
        System.out.println(employee.toString());




    }
}