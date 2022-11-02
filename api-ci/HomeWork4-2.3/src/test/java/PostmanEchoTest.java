import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import java.lang.management.GarbageCollectorMXBean;

class PostmanEchoTest {

    @Test
    void shouldPostmanEcho() {
        // Given - When - Then
// Предусловия
        given ()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("some data")
        ;


    }

}
