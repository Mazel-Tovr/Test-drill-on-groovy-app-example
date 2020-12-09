package demo

class GClass {

    //Coverage percentage
    //76
    int sum(Integer a, Integer b) {
        return a + b
    }
    //44
    int sum2(int a, int b) {
        return a + b
    }
    //81
    int simpleGroovyMethod() {
        return sum(1, 10)
    }
    //67
    void simpleGroovyMethod2() {
        sum(1, 10)
        sum2(1, 10)
    }
    //100
    void groovyInvokeJavaMethod(JClass jClass) {
        jClass.javaMethod()
    }
    //80
    def groovyInvokeJavaMethod1(JClass jClass) {
        jClass.javaMethod()
    }
    //76
    int println1() {
        println "1111"
        return 1
    }
    //100
    void printVoid() {
        print "void"
    }
    //72
    static int returnNum() {
        int num = 2
        return num
    }
    //87
    User getUser() {
        return new User(1, "Name")
    }
    //87
    static User getUserStatic(){
        return new User(1,"Name")
    }

}

class User {
    int id
    String name

    User(int id, String name) {
        this.id = id
        this.name = name
    }
}


