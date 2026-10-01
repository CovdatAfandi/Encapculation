public class Main {
    public static void main(String[] args) {
    Student student=new Student();
    student.setAge(-5);
    student.setGrade(10);
        System.out.println(student.getAge());

    User user1=new User();
    user1.setUsername("Alibaba");
        System.out.println(user1.getUsername());

     user1.setPassword("sncsdxfbrj");
        System.out.println(user1.getPassword());


        Account a1=new Account(1);
        a1.deposit(100);
        a1.withdraw(10);
        System.out.println(a1.getBalance());


        A b=new A();
        System.out.println(A.getCount());
    }

}
