package desginPattern.creational;

class Student {
    private String name;
    private int age;
    private String major;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.major = builder.major;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", major='" + major + "'}";
    }

    public static class Builder {
        private String name;
        private int age;
        private String major;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setMajor(String major) {
            this.major = major;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .setName("Tushar")
                .setAge(20)
                .setMajor("CSE")
                .build();

        System.out.println(student);
    }
}