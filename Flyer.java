
import org.lgna.story.resources.FlyerResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class Flyer extends SFlyer {

    public Flyer(final FlyerResource resource) {
        super(resource);
    }
}
