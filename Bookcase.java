
import org.lgna.story.resources.prop.BookcaseResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class Bookcase extends Prop {

    public Bookcase(final BookcaseResource resource) {
        super(resource);
    }
}
