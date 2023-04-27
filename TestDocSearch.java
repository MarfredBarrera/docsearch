import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.io.IOException;

public class TestDocSearch {
	@Test 
	public void testIndex() throws URISyntaxException, IOException {
    Handler h = new Handler("./technical/");
    URI rootPath = new URI("http://localhost/");
    assertEquals("There are 1391 total files to search.", h.handleRequest(rootPath));
	}
	@Test 
	public void testSearch() throws URISyntaxException, IOException {
    Handler h = new Handler("./technical/");
    URI rootPath = new URI("http://localhost/search?q=sushi");
    String expect = "Found 0 paths";
    assertEquals(expect, h.handleRequest(rootPath));
	}
}

