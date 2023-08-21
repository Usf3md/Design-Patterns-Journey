public class Clip implements Component {

    @Override
    public Component duplicate() {
        return new Clip();
    }
}
