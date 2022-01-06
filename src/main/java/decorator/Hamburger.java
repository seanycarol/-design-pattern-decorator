package decorator;

public class Hamburger implements IHamburger {
    private float preco;

    public Hamburger() {

    }

    public Hamburger(float preco) {
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }
}
