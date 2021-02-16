/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ghost;

import org.junit.jupiter.api.Test;

import processing.core.PApplet;
import processing.core.PImage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

public class AppTest{
    
    
    @Test
    /**
     * Check app work properly, when app been created, the build instance should be created.
     */
    public void appCreateProperlywithBuildObjectTest() {
        App classUnderTest = new App();
        Builder build = classUnderTest.getBuilder();
        assertNotNull(build);
    }

    
    @Test
    /**
     * check if the the image run in the setup method or after it.
     */
    public void appLoadImgInsetupMethod() {
        App app = new App();
        PApplet.runSketch(new String[] { "Test Sketch" }, app);
        app.delay(1000);
        app.noLoop();
        
        Builder build = app.getBuilder();
        HashMap<String, PImage> Hmap;
        Hmap = build.getImgMap();
        assertFalse(Hmap.containsValue(null));
    }
}