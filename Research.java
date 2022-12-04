import java.util.ArrayList;

public abstract class Research {
    ArrayList<Node> tree;
    private Person person;

    public Research(GenTree pd, Person person) {
        tree = pd.getData();
        this.person = person;
    }

    public ArrayList<Person> start() {
        return null;
    }

    public Person getPerson() {
        return person;
    }
}