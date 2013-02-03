
import org.lgna.story.resources.prop.JapaneseCypressResource;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class JapaneseCypress extends Prop {

    public JapaneseCypress() {
        super(JapaneseCypressResource.JAPANESE_CYPRESS);
    }
}
