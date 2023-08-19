public class Editor {
    public void openProject(String path) {
        AbstractArtefact[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        artefacts[0] = new UnsavedDecorator(new MainDecorator(artefacts[0]));
        artefacts[2] = new ErrorDecorator(artefacts[2]);
        artefacts[3] = new WarningDecorator(artefacts[3]);

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
