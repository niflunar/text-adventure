public class Room {
    Room n, s, e, w;
    String name;
    String description;

    public Room() {

    }

    public void start(String name, String description, Room n, Room s, Room e, Room w) {
        this.name = name;
        this.description = description;
        this.n = n;
        this.s = s;
        this.e = e;
        this.w = w;
    }

    public void describe() {
        System.out.println(description);
    }
}
