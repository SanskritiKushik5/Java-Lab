class Employee{
    int salary = 50000;
}
class Inheritance extends Employee{
    int bonus = 20000;
    public static void main(String args[]){
        Inheritance p = new Inheritance();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}