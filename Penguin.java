
import org.lgna.story.resources.flyer.PenguinResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class Penguin extends Flyer {

    public Penguin(final PenguinResource resource) {
        super(resource);
    }
}
