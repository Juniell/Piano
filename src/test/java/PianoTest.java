import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.core.ComponentLookupScope;
import org.assertj.swing.core.Robot;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.sound.midi.MidiUnavailableException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    private ArrayList<Integer> a = new ArrayList<Integer>();
    private FrameFixture window;
    //private Robot robot = BasicRobot.robotWithNewAwtHierarchy();

    @BeforeEach
    void setUp() {
        //robot.settings().componentLookupScope(ComponentLookupScope.ALL);
        Piano piano = GuiActionRunner.execute(Piano::new);
        window = new FrameFixture(piano);

        window.show(); // shows the frame to test
    }

    @Test
    public void museTest() throws MidiUnavailableException, InterruptedException {
        a.add(0, 60);
        a.add(1, 69);
        a.add(2, 69);
        a.add(3, 67);
        a.add(4, 69);
        a.add(5, 65);
        a.add(6, 60);
        a.add(7, 60);
        Piano song1 = new Piano();
        song1.PianoNotes(a);
        assertEquals(a, song1.music);
        a.clear();

        a.add(0, 60);
        a.add(1, 61);
        a.add(2, 62);
        a.add(3, 63);
        a.add(4, 64);
        a.add(5, 65);
        a.add(6, 66);
        a.add(7, 67);
        a.add(8, 68);
        a.add(9, 69);
        a.add(10, 70);
        a.add(11, 71);
        a.add(12, 72);
        Piano allNotes = new Piano();
        allNotes.PianoNotes(a);
        assertEquals(a, allNotes.music);
    }

    @Test
    public void buttonTest() {
        window.button("C").click();
        window.button("C#").click();
        window.button("D").click();
        window.button("D#").click();
        window.button("E").click();
        window.button("F").click();
        window.button("F#").click();
        window.button("G").click();
        window.button("G#").click();
        window.button("A").click();
        window.button("A#").click();
        window.button("B").click();
        window.button("C1").click();
    }

    @AfterEach
    void tearDown() {
        window.cleanUp();
    }
}
