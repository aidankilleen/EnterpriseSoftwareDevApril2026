package ie.pt.springboothelloworld;

public record User(int id,
                   String name,
                   String email,
                   boolean active) {
}
