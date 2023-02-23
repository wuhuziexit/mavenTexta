package text;

public class Student {
    //    定义一个学生类，成员变量包括姓名（name)、年龄（age）、性别（sex）;成员方法包括读书（read）
    private String name;
    private int age;
    private char sex;
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public char getSex() {
        return sex;
    }
    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    private void read(){
        System.out.println(getAge()+"岁的"+getSex()+"学生"+getName()+"正在读书");
    }

    public static void main(String[] args) {
        Student stu=new Student("李华",18,'女');
        stu.read();
    }
}
