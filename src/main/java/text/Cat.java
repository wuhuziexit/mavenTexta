package text;

public class Cat {
//    ����һ��è���ʵ�������󣬲����ó�Ա����ʵ��è��һϵ����Ϊ��
//    è����Ϊ������ע�Ӷ�����ע�����󣩡����ܶ��������������ܣ�����׽��������׽���󣩡���ʳ�����������󣩡�˯��������
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
//        ע�Ӷ���,ע������
        System.out.println(getName()+"ע��������");
    }
    private void Running(){
//        ���ܶ��������������ܣ�
        System.out.println(getName()+"���������ܡ�");
    }
    private void Catch(){
//        ��׽��������׽����
        System.out.println(getName()+"��׽����");
    }
    private void Eating(){
//       ��ʳ������������
        System.out.println(getName()+"������");
    }
    private void Sleep(){
//       ˯������
        System.out.println(getName()+"˯����");
    }

    public static void main(String[] args) {
        Cat cat=new Cat("Сè����");
        cat.Gaze();
        cat.Running();
        cat.Catch();
        cat.Eating();
        cat.Sleep();
    }
}
