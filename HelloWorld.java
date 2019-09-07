public class HelloWorld{
    public static void main(String[] args){
        Student oleg = new Student("Oleg");
        Student vasya = new Student("Vasya",18);

        Student[] students = {oleg,vasya};

    for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }
}

class Student{
    public String name;
    public int age;
    public boolean isAlive;

    public Student(String name){
        this.name = name;
        age = 69;
        isAlive = true;
    }

    public Student(String name,int age){
        this.name = name;
        this.age = age;
        isAlive = true;
    }

    public String toString() {
        return isAlive ?
                name + ", " + age + " y.o"
                : "X((";
    }
}