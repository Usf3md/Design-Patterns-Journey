import java.util.ArrayList;
import java.util.List;

public class Collection<T> {
  private List<T> products = new ArrayList<>();

  public void add(T product) {
    products.add(product);
  }

  public Iterator<T> createIterator() {
    return new ProductIterator(this);
  }

  public class ProductIterator implements Iterator<T> {
    private int index;
    private Collection<T> collection;

    public ProductIterator(Collection<T> collection) {
      this.collection = collection;
    }

    @Override
    public T current() {
      return products.get(index);
    }

    @Override
    public boolean hasNext() {
      return index < products.size();
    }

    @Override
    public void next() {
      index++;
    }

  }
}
