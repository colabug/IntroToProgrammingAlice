
import org.lgna.story.resources.sims2.PersonResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class Person extends Biped {

    public Person(final PersonResource resource) {
        super(resource);
    }
}
