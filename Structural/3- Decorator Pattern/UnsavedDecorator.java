public class UnsavedDecorator implements AbstractArtefact {

    private AbstractArtefact artefact;

    public UnsavedDecorator(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " [Unsaved]";
    }
}
