package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HamburgerTest {

    @Test
    void deveRetornarPrecoHamburger() {
        IHamburger hamburger = new Hamburger(10.0f);

        assertEquals(10.0f, hamburger.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburgerComCombo() {
        IHamburger hamburger = new HamburgerComCombo(new Hamburger(10.0f));

        assertEquals(22.0f, hamburger.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburgerComAdicional() {
        IHamburger hamburger = new HamburgerComAdicional(new Hamburger(10.0f));

        assertEquals(14.5f, hamburger.getPreco());
    }

    @Test
    void deveRetornarPrecoHamburgerComComboMaisAdicional() {
        IHamburger hamburger = new HamburgerComCombo(new HamburgerComAdicional(new Hamburger(10.0f)));

        assertEquals(26.5f, hamburger.getPreco());
    }
}