import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;

  @Before
  public void before() {
    photographer = new Photographer();
    digitalCamera = new DigitalCamera();
    analogCamera = new AnalogCamera();
  }

  


}