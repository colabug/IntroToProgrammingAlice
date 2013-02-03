
import org.lgna.story.resources.sims2.BaseEyeColor;
import org.lgna.story.event.SceneActivationListener;
import org.lgna.story.resources.sims2.FemaleAdultHairShortSlick;
import org.lgna.story.resources.sims2.BaseSkinTone;
import org.lgna.story.resources.sims2.Gender;
import org.lgna.story.resources.sims2.FemaleAdultFullBodyOutfitOverShirtPantsSandals;
import org.lgna.story.resources.sims2.AdultPersonResource;
import org.lgna.story.resources.prop.BookcaseResource;
import org.lgna.story.resources.flyer.PenguinResource;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.*;
import org.lgna.common.EachInTogetherRunnable;
import static org.lgna.common.ThreadUtilities.doTogether;
import static org.lgna.common.ThreadUtilities.eachInTogether;

public class Scene extends SScene {

    private SRoom room = new SRoom();
    private SCamera camera = new SCamera();
    private AdultPerson corey = new AdultPerson(new AdultPersonResource(Gender.FEMALE, BaseSkinTone.LIGHTER, BaseEyeColor.DARK_BROWN, FemaleAdultHairShortSlick.RED, 1.0, FemaleAdultFullBodyOutfitOverShirtPantsSandals.GREYBLUE));
    private Bookcase bookcase = new Bookcase(BookcaseResource.COLONIAL_BOOKCASE_COLONIAL_DARK_BROWN_WOODCURLY);
    private Penguin penguin = new Penguin(PenguinResource.BABY);
    private JapaneseCypress japaneseCypress = new JapaneseCypress();

    public Scene() {
        super();
    }

    private void performCustomSetup() {
    }

    private void performGeneratedSetUp() {
        this.setAtmosphereColor(new Color(0.5, 0.5, 1.0));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(Color.BLACK);
        this.setFogDensity(0.0);
        this.setName("myScene");
        this.room.setFloorPaint(SRoom.FloorAppearance.REDWOOD);
        this.room.setWallPaint(SRoom.WallAppearance.YELLOW);
        this.room.setCeilingPaint(Color.WHITE);
        this.room.setOpacity(1.0);
        this.room.setName("room");
        this.room.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(-0.0025454, 0.996759, 0.0723638, 0.035061));
        this.camera.setPositionRelativeToVehicle(new Position(0.248, 1.68, -0.324));
        this.corey.setPaint(Color.WHITE);
        this.corey.setOpacity(1.0);
        this.corey.setName("corey");
        this.corey.setVehicle(this);
        this.corey.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0147708, 0.0, 0.999891));
        this.corey.setPositionRelativeToVehicle(new Position(0.415, 0.0, 4.21));
        this.corey.setSize(new Size(0.4, 1.71, 0.304));
        this.bookcase.setPaint(Color.WHITE);
        this.bookcase.setOpacity(1.0);
        this.bookcase.setName("bookcase");
        this.bookcase.setVehicle(this);
        this.bookcase.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.bookcase.setPositionRelativeToVehicle(new Position(4.21E-4, 0.0, 4.76));
        this.bookcase.setSize(new Size(0.767, 2.53, 0.564));
        this.penguin.setPaint(Color.WHITE);
        this.penguin.setOpacity(0.5);
        this.penguin.setName("penguin");
        this.penguin.setVehicle(this);
        this.penguin.setOrientationRelativeToVehicle(new Orientation(0.0, 9.60021E-4, 0.0, 1.0));
        this.penguin.setPositionRelativeToVehicle(new Position(0.793, 2.07E-4, 4.29));
        this.penguin.setSize(new Size(0.428, 0.651, 0.336));
        this.japaneseCypress.setPaint(Color.WHITE);
        this.japaneseCypress.setOpacity(1.0);
        this.japaneseCypress.setName("japaneseCypress");
        this.japaneseCypress.setVehicle(this);
        this.japaneseCypress.setOrientationRelativeToVehicle(new Orientation(0.0, -0.124755, 0.0, 0.992188));
        this.japaneseCypress.setPositionRelativeToVehicle(new Position(-0.935, 0.0, 4.99));
        this.japaneseCypress.setSize(new Size(1.71, 1.5, 0.739));
    }

    private void initializeEventListeners() {
        this.addSceneActivationListener(new SceneActivationListener() {
            public void sceneActivated(final SceneActivationEvent e) {
                Scene.this.myFirstMethod();
            }
        });
    }

    protected void handleActiveChanged(final Boolean isActive, final Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }

    public void myFirstMethod() {
        this.corey.introduceMyself();
        Integer guessedAge = this.getIntegerFromUser("How old do you think I am?");
        if (guessedAge > this.corey.age) {
            this.corey.say("What? Why would you think I'm that old?");
        } else {
            this.corey.say("Awww, you're so sweet!");
        }
    }
}
