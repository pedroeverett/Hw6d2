import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.util.ArrayList;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;

  @Before
  public void before() {
    photographer = new Photographer("Pedro");
    digitalCamera = new DigitalCamera();
    analogCamera = new AnalogCamera();
  }

  @Test
  public void addCamera() {
    photographer.addCamera(digitalCamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test 
  public void removeCamera() {
    photographer.addCamera(digitalCamera);
    photographer.removeCamera();
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void checkAnalogcameraDetais() {
    photographer.addCamera(analogCamera);
    photographer.addCamera(digitalCamera);
    ArrayList<String> details = new ArrayList<String>(){{
      add("Nikon 34T, Noise reduction filter, Hi-resolution");
      add("Sony ILCE5100L, No noise reduciton, Lo-resolution");
    }};
    assertEquals(details, photographer.cameraDetails());
  }

  @Test
  public void checkSumPhotos() {
    assertEquals(950, photographer.sumPhotos());
  }

}