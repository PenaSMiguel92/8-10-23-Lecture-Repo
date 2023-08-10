public class Player extends Character {
    private String role;

    public Player(String name, String role) {
        //super is a call to the parent class constructor... the constructor located in the Character class.
        super(name);
        this.role = role;
    }

    


}
