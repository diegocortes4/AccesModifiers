// Superclass.java
public class Superclass {
    private int privateVar;        // Private variable
    protected int protectedVar;  // Protected variable

    // Constructor for the Superclass
    public Superclass() {
        privateVar = 10;
        protectedVar = 20;
    }

    // Public method to access privateVar
    public int getPrivateVar() {
        return privateVar;
    }
}

// Subclass.java
public class Subclass extends Superclass {
    private int subclassVar;  // Private variable in the Subclass

    // Constructor for the Subclass
    public Subclass() {
        subclassVar = 30;
    }

    // Public method to access subclassVar
    public int getSubclassVar() {
        return subclassVar;
    }
}

// AccessControlDemo.java
public class AccessControlDemo {
    public static void main(String[] args) {
        // Create an instance of the Subclass
        Subclass subObj = new Subclass();

        // Access public and protected members through methods
        System.out.println("PrivateVar from Superclass (via method): " + subObj.getPrivateVar()); // OK
        System.out.println("ProtectedVar from Superclass (via direct access): " + subObj.protectedVar); // OK

        // Access private variable from Subclass (not directly accessible)
        // System.out.println("SubclassVar: " + subObj.subclassVar); // This line will cause a compilation error

        // Access public and protected members from Subclass
        System.out.println("SubclassVar: " + subObj.getSubclassVar()); // OK
    }
}
