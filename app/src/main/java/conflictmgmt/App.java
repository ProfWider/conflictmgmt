/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package conflictmgmt;

public class App {
    public String getGreeting() {
        return "Hello World";
    }

    public String anotherGreeting() {
        return "Hello World";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
