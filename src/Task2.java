public class Task2 {
    public static void main(String[]args){
        HRManager hr = new HRManager();
        hr.work();
        hr.getSalary();

    }
}
class Employee{
    void work(){
        System.out.println("Employee is working");

    }
    void getSalary(){
        System.out.println("The salary of the person is $5000");
    }


}
class HRManager extends Employee{
    @Override
    void work(){
        System.out.println("HRManager is working");
    }
}

