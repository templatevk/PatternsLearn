package composite;

public interface Composite<T> extends Iterable<T> {
	void add(T item);
	void remove(T item);
}
