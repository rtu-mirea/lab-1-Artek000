public class HelloWorld{
    public static void main(String[] args){
        Student student = new Student();
        student.name = "Artek";
        student.age = 18;
        student.isAlive = true;

        System.out.println(student);
    }
}

class Student{
    public String name;
    public int age;
    public boolean isAlive;

    public String toString() {
        return isAlive ?
                name + ", " + age + " y.o"
                : "X((";
    }
}