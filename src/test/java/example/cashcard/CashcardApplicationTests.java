package example.cashcard;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CashcardApplicationTests {

	@Test
	void myFirstTest(){
		assertThat(1).isEqualTo(42);
	}
}
