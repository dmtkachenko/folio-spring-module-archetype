package $package;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.zonky.test.db.AutoConfigureEmbeddedDatabase;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@AutoConfigureEmbeddedDatabase
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FolioSpringApplicationTest {

  @Test
  void shouldAnswerWithTrue() {
    assertTrue(true);
  }
}
