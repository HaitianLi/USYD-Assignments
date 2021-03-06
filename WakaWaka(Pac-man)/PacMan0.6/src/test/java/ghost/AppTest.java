/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ghost;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    /**
     * when a app object creat, test if it is null
     */
    @Test 
    public void appNotNullTest() {
        App appTest = new App();
        assertNotNull(appTest);
    }

    /**
     * when a app object creat, the build object should be initiallized as well
     * the build objects initialized when the app constractor called
     */
    @Test 
    public void appCreateProperlywithBuildObjectTest() {
        App appTest = new App();
        Builder buildTest = appTest.getBuilder();
        
        assertNotNull(buildTest);
    }

    /**
     * Since to test setup is impossible in Juni, now we test other functions in app.class
     */
    // @Test 
    // public void appCreateProperlywithBuildObjectTest() {
    //     App appTest = new App();
    //     Builder buildTest = appTest.getBuilder();
    //     assertNotNull(buildTest);
    // }



}
