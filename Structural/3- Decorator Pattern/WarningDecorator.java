public class WarningDecorator implements AbstractArtefact {

    private AbstractArtefact artefact;

    public WarningDecorator(AbstractArtefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public String render() {
        return artefact.render() + " [Warning]";
    }

}
