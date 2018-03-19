package parsing_json;

import java.util.ArrayList;

/*
ElementCollection:

The Element collection should extend ArrayList and implement 3 methods.

findByAtomicNumber will take an argument int atomicNumber and return the Element with number atomicNumber

findByName will take an argument String name and return the Element with name name

where will take arguments String field and Object value.
If Element has an attribute with the name field then the method will go through each Element in the collection and
return a new ElementCollection with all Elements who's field matches the Object value.
If no attribute is called field then the method should simply return an empty ElementCollection.
 */

public class ElementCollection extends ArrayList<Element> {


    public Element findByAtomicNumber(int atomic_number) {


        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getNumber() == atomic_number) {
                return this.get(i);
            }
        }
        return null;
        // return the Element with number atomicNumber
    }

    public Element findByName(String name) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getName().equals(name)) {
                return this.get(i);
            }
        }
        return null;
        // return the Element with name name
    }

    public ElementCollection where(String fieldName, Object value) {
        return null;
    }
}
/*
Java[edit]
The following is an example in Java:

// Without reflection
Foo foo = new Foo();

foo.hello();

// With reflection
Object foo = Class.forName("complete.classpath.and.Foo").newInstance();
// Alternatively: Object foo = Foo.class.newInstance();
Method m = foo.getClass().getDeclaredMethod("hello", new Class<?>[0]);
m.invoke(foo);
 */