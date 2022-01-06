package decorator;

public abstract class HamburguerDecorator implements IHamburger {
    private IHamburger hamburger;

    public HamburguerDecorator(IHamburger hamburger) {
        this.hamburger = hamburger;
    }

    public IHamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(IHamburger hamburger) {
        this.hamburger = hamburger;
    }

    public float getPreco() {
        return hamburger.getPreco();
    }
}
