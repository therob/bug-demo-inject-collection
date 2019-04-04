package example;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@DisplayName("inject a list of beans")
public class AppContextTest {

	@Test
	@DisplayName("constructor: inject with implementation")
	void test_constructor_withimpl() {
		new AnnotationConfigApplicationContext(example.constructor.withimpl.Config.class);
	}

	@Test
	@DisplayName("constructor: inject without implementation")
	void test_constructor_withoutimpl() {
		assertThrows(Exception.class, () -> new AnnotationConfigApplicationContext(example.constructor.withoutimpl.Config.class));
	}

	@Test
	@DisplayName("field: inject with implementation")
	void test_field_withimpl() {
		new AnnotationConfigApplicationContext(example.field.withimpl.Config.class);
	}

	@Test
	@DisplayName("field: inject without implementation")
	void test_field_withoutimpl() {
		assertThrows(Exception.class, () -> new AnnotationConfigApplicationContext(example.field.withoutimpl.Config.class));
	}

	@Test
	@DisplayName("setter: inject with implementation")
	void test_setter_withimpl() {
		new AnnotationConfigApplicationContext(example.setter.withimpl.Config.class);
	}

	@Test
	@DisplayName("setter: inject without implementation")
	void test_setter_withoutimpl() {
		assertThrows(Exception.class, () -> new AnnotationConfigApplicationContext(example.setter.withoutimpl.Config.class));
	}
}
