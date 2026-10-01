public class Student {
    private Integer id;
    private String  name;
    private int age;
    private int grade;

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        if(grade>=1 && grade<=11){
            this.grade = grade;
        } else{
            System.out.println("Enter a grade between 1 and 11.");
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int i) {
        if (i>0){
            this.age = i;
        }
        else {
            System.out.println("Age cannot be zero or negative.");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
