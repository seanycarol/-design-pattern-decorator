package decorator;

public class HamburgerComAdicional extends HamburguerDecorator {

    public HamburgerComAdicional(IHamburger hamburger) {
        super(hamburger);
    }

    public float getPreco() {
        return this.getHamburger().getPreco() + 4.50f;
    }
}
