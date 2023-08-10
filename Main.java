/*
 * Garbage Collection - 
 * Every time an object is created, it goes into heap memory. 
 * 
 * Different objects take up different amounts of memory space.
 * An object with 20 different instance variable will take up more space than an object with 5 different instance variables.
 * 
 * The heap is where garbage collection happens. Note: we cannot force garbage collection in Java.
 * We can only suggest garbage collection to happen using System.gc() but it is not guaranteed to occur.
 * 
 * So how does Java handle garbage collection?
 * 
 * When memory runs low, Java runs the garbage collector to remove what it isn't needed so we can 
 * reuse the space in memory.
 * 
 * 1) reference goes out of scope.
 * public void example() {
 * Cat c = new Cat();
 * }
 * reference to c goes bye bye, which makes the object eligible for garbage collection.
 * 
 * 2) The reference is assigned to another object
 * 
 * Cat c = new Cat();
 * c = new Cat();
 * 
 * My first object is left in the dust when it was "reprogrammed" to a new object.
 * 
 * 3) The reference is explicitly set to null;
 * 
 * Cat c = new Cat();
 * c = null;
 * 
 */

public class Main {
    public static void main(String[] args) {
        Player p = new Player("Sussie", "Hampster");
    }
}