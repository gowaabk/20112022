import java.util.ArrayList;

public class ChildResearch extends Research {

    public ChildResearch(GenTree pd, Person person) {
        super(pd, person);
    }

    @Override
    public ArrayList<Person> start() {

        var result = new ArrayList<Person>();

        for (Node node : tree) {
            if (super.getPerson().getName().equals(node.person2.getName())
                    && node.relation == Relationship.child) {
                result.add(node.person1);
            }
        }

        return result;
    }
}
