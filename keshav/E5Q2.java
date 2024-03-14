class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " (Age: " + age + ")";
    }
}

class FamilyTree {
    private Person root;
    private FamilyTree[] children;

    public FamilyTree(Person root) {
        this.root = root;
        this.children = new FamilyTree[0];
    }

    public void addChild(FamilyTree child) {
        FamilyTree[] newChildren = new FamilyTree[children.length + 1];
        System.arraycopy(children, 0, newChildren, 0, children.length);
        newChildren[children.length] = child;
        children = newChildren;
    }

    public void displayTree(String prefix) {
        System.out.println(prefix + root);
        for (FamilyTree child : children) {
            child.displayTree(prefix + "  ");
        }
    }
}

public class E5Q2 {
    public static void main(String[] args) {
        // Create family members
        Person grandfather = new Person("John", 70);
        Person grandmother = new Person("Mary", 68);
        Person father = new Person("Michael", 40);
        Person mother = new Person("Sarah", 38);
        Person son = new Person("Tom", 15);
        Person daughter = new Person("Emily", 12);

        // Create family tree
        FamilyTree grandparentTree = new FamilyTree(grandfather);
        FamilyTree parentTree = new FamilyTree(father);
        FamilyTree child1Tree = new FamilyTree(son);
        FamilyTree child2Tree = new FamilyTree(daughter);

        // Link family members
        grandparentTree.addChild(parentTree);
        parentTree.addChild(child1Tree);
        parentTree.addChild(child2Tree);

        // Display family tree
        System.out.println("Family Tree:");
        grandparentTree.displayTree("");
    }
}
