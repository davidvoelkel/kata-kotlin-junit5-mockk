import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ThingTests {
    @Test
    fun `a thing is not existing`() {
        assertThat(Thing()).isNull()
    }
}
