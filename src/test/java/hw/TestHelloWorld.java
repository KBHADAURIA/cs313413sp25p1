package hw;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {

  private HelloWorld fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new HelloWorld();  // Create the HelloWorld instance
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;  // Cleanup
  }

  @Test
  public void initialization() {
    // Test to check if fixture is initialized properly
    assertNotNull(fixture);
  }

  @Test
  public void getMessage() {
    // Test if getMessage() returns the expected string "hello world"
    assertNotNull(fixture);
    assertEquals("hello world", fixture.getMessage());  // Ensure that it matches the expected string
  }

  @Test
  public void getYear() {
    // Test if getYear() returns the expected year 2025
    assertNotNull(fixture);
    assertEquals(2025, fixture.getYear());
    // Ensure that it matches the expected year
  }

  @Test
  public void getMessageInList() {
    // Fix: list.get(0) accesses the first (and only) element
    var list = Arrays.asList(fixture);  // List with one element
    assertEquals("hello world", list.get(0).getMessage());  // Correct: Accessing the first element
  }

  @Test
  public void getYearInList() {
    // Fix: list.get(0) accesses the first (and only) element
    var list = Arrays.asList(fixture);  // List with one element
    assertEquals(2025, list.get(0).getYear());  // Correct: Accessing the first element
  }
}
