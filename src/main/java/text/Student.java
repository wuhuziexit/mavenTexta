package text;

public class Student {
    //    ����һ��ѧ���࣬��Ա��������������name)�����䣨age�����Ա�sex��;��Ա�����������飨read��
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
        System.out.println(getAge()+"���"+getSex()+"ѧ��"+getName()+"���ڶ���");
    }

    public static void main(String[] args) {
        Student stu=new Student("�",18,'Ů');
        stu.read();
    }
}
