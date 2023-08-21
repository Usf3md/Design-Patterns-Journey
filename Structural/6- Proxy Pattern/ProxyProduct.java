public class ProxyProduct extends Product {
    private DbContext database;

    public ProxyProduct(int id, DbContext database) {
        super(id);
        this.database = database;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        database.markAsChanged(this);
    }

}
