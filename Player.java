public class Player extends Character {
    private String role;

    public Player(String name, String role) {
        //super is a call to the parent class constructor... the constructor located in the Character class.
        super(name);
        this.role = role;
    }

    public String speak() {
        return "Hello, I am " + super.name + ", and I am a " + this.role + "! Nice to meet you!";
    }


}
