package text;

public class Cat {
//    创建一个猫类的实例化对象，并且用成员方法实现猫的一系列行为，
//    猫的行为包括，注视动作（注视老鼠）、奔跑动作（向老鼠方向奔跑）、捕捉动作（捕捉老鼠）、进食动作（吃老鼠）、睡觉动作。
    private String name;
    public Cat(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void Gaze(){
//        注视动作,注视老鼠
        System.out.println(getName()+"注视着老鼠。");
    }
    private void Running(){
//        奔跑动作（向老鼠方向奔跑）
        System.out.println(getName()+"向老鼠方向奔跑。");
    }
    private void Catch(){
//        捕捉动作（捕捉老鼠）
        System.out.println(getName()+"捕捉老鼠。");
    }
    private void Eating(){
//       进食动作（吃老鼠）
        System.out.println(getName()+"吃老鼠。");
    }
    private void Sleep(){
//       睡觉动作
        System.out.println(getName()+"睡觉。");
    }

    public static void main(String[] args) {
        Cat cat=new Cat("小猫包包");
        cat.Gaze();
        cat.Running();
        cat.Catch();
        cat.Eating();
        cat.Sleep();
    }
}
