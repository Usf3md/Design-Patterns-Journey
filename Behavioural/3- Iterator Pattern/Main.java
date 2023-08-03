public class Main {
    public static void main(String[] args) {
        Collection<Product> products = new Collection<>();
        products.add(new Product(1, "Juice"));
        products.add(new Product(2, "Chocolate"));
        products.add(new Product(3, "Pepsi"));
        Iterator<Product> it = products.createIterator();
        while (it.hasNext()) {
            System.out.println(it.current());
            it.next();
        }
    }
}