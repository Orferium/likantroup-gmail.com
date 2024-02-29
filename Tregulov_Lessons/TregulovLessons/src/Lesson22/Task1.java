package Lesson22;

public class Task1 {
    public static void main(String[] args) {
        Student one = new Student();
        one.name = new StringBuilder("Иван");
        one.course = 3;
        one.grade = 5;
        one.showInfo(one.name, one.course, one.grade);
    }

      static class Student {
        private StringBuilder name = new StringBuilder();
        public StringBuilder getName() {
            StringBuilder name2 = new StringBuilder(name);
            return name2;
        }
        public void SetName(StringBuilder name) {
            this.name = name;
        }

        private int course;
        public int getCourse() {
            return course;
        }
        public void SetCourse(int c) {
            course = c;
        }
        private int grade;
        public int getGrade() {
            return grade;
        }
        public void SetGrade(int g) {
            grade = g;
        }

        static void showInfo(StringBuilder name, int course, int grade) {
            System.out.print("Студент " + name + ", учится на " + course + " курсе," +
                    " имеет оценку " + grade);
        }

    }


}
