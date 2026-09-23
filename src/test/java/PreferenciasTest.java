import org.example.Preferencias;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreferenciasTest {

    @Test
    public void deveRetornarEhTemaClaro() {
        Preferencias.getInstance().setEhTemaClaro(true);
        assertTrue(Preferencias.getInstance().getEhTemaClaro());
    }

    @Test
    public void deveRetornarModoOfflineAtivo() {
        Preferencias.getInstance().setModoOfflineAtivo(false);
        assertFalse(Preferencias.getInstance().getModoOfflineAtivo());
    }

    @Test
    public void deveRetornarVolume() {
        Preferencias.getInstance().setVolume(30);
        assertEquals(30, Preferencias.getInstance().getVolume());
    }

}