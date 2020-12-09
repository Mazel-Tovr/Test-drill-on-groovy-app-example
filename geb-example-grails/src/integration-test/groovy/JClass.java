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
    }

    private String userToSting(User user) {
        return "Java User: id= "+ user.Id+", name="+ user.name;
    }

}
