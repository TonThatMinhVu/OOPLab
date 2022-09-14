public class StudentAandB {
    public static void main(String[] args) {
        Student stuA = new Student(90,"Quan","ITITUN");
        System.out.println(stuA.getGPA());
        System.out.println(stuA.getName());
        Student stuB = new Student(0,"Bang","ITITIU");
        System.out.println(stuB.getGPA());
        System.out.println(stuB.getName());
    }
}
