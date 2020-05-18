public class MainClass {
    public static void main(String[] args){

        Student Student1 = new Student();

        Student Student2 = new Student();

       System.out.println(Student1.getFach());

        Student1.setName("Peter");
        System.out.println(Student1.getName());

        System.out.println(Student2.getMatikelNummer());
        Student2.setMatikelNummer(342189);
        System.out.println(Student2.getMatikelNummer());


    }
}
