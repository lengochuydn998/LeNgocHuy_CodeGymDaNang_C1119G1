package CauTrucDuLieuGiaiThuat.BaiTap;

public class Test {
    public static void main(String[] args) {
        class Student {
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
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "1");
        Student student2 = new Student(2, "2");
        Student student3 = new Student(3, "3");
        Student student4 = new Student(4, "4");
        Student student5 = new Student(5, "5");
        Student student6 = new Student(6, "6");
        Student student7 = new Student(7, "7");
        Student student8 = new Student(8, "8");
        Student student9 = new Student(9, "9");

        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addLast(student3);
        myLinkedList.add(3, student5);
        myLinkedList.add(4, student9);
//        myLinkedList.remove(2);
        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
//        }
            System.out.println(myLinkedList.indexOf(student1));
        }
        for (int i = 0; i <cloneLinkedList.size() ; i++) {

        }

    }
}

