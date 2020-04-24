package CauTrucDuLieuGiaiThuat.BaiTap;

public class TestMyArrayList {
    public static class Student{
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1,"huy");
        Student b = new Student(2,"quy");
        Student c = new Student(3,"hung");
        MyArrayList<Student> studentMyArrayList = new MyArrayList<>();
        MyArrayList<Student> newstudentMyArrayList = new MyArrayList<>();
        studentMyArrayList.add(a);
        studentMyArrayList.add(b);
        studentMyArrayList.add(c);
        studentMyArrayList.remove(1);
        System.out.println(studentMyArrayList.size());
//        System.out.println(studentMyArrayList.get(2).getName());
        System.out.println(studentMyArrayList.indexOf(a));
        newstudentMyArrayList = studentMyArrayList.clone();
//        for (int i = 0; i <studentMyArrayList.size() ; i++) {
//            Student student = (Student) studentMyArrayList.elements[i];
//            System.out.println(student.getName());
//        }
                for (int i = 0; i <newstudentMyArrayList.size() ; i++) {
            System.out.println(newstudentMyArrayList.get(i).getName());
        }
    }
}
