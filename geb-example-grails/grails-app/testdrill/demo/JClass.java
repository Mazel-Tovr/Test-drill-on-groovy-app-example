package demo;

public class JClass {


    static class User {
        private int Id;
        private String name;

        public User(int id, String name) {
            Id = id;
            this.name = name;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public void javaMethod() {
        System.out.println("Java method invoked");
        User user = new User(1, "Egor");
        System.out.println(user);
        System.out.println(userToSting(user));
        premSum(1, 1);
        objectSum(1, 1);
    }

    public void javaInvokeGroovyMethod(GClass gClass) {
        gClass.simpleGroovyMethod();
    }

    private int premSum(int a, int b) {
        return a + b;
    }

    private int objectSum(Integer a, Integer b) {
        return a + b;
    }

    private String userToSting(User user) {
        return "Java User: id= " + user.Id + ", name=" + user.name;
    }


}
