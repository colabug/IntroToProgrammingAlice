
import org.lgna.story.resources.sims2.AdultPersonResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class AdultPerson extends Person {

    private Integer age = 32;
    private String[] favoriteActivities = new String[]{"camping", "cooking", "photography"};

    public AdultPerson(final AdultPersonResource resource) {
        super(resource);
    }

    public void introduceMyself() {
        this.say("Hello my name is " + this.getName(), Say.duration(2.0));
        this.say("My age is " + this.age, Say.duration(2.0));
        for (final String activity : this.favoriteActivities) {
            this.say("I love " + activity);
        }
    }
}
