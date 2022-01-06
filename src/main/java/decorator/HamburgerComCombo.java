package decorator;

public class HamburgerComCombo extends  HamburguerDecorator {

    public HamburgerComCombo(IHamburger hamburger) {
        super(hamburger);
    }

    public float getPreco() {
        return this.getHamburger().getPreco() + 12.00f;
    }
}
