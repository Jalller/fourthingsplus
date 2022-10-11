package dat.backend.model.entities;

import java.sql.Timestamp;

public class Item {
    private int id;
    private String name;
    private boolean done;
    private Timestamp created;
    private String username;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return done;
    }

    public Timestamp getCreated() {
        return created;
    }

    public String getUsername() {
        return username;
    }

    public Item(int id, String name, boolean done, Timestamp created, String username) {
        this.id = id;
        this.name = name;
        this.done = done;
        this.created = created;
        this.username = username;
    }
}
