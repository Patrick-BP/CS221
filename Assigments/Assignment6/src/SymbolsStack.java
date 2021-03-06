import java.util.Arrays;
import java.util.EmptyStackException;

public class SymbolsStack<E> implements StackInterface<E> {

    private E [] data;
    private int top = -1;
    private static final int INITIAL_CAPACITY = 10;

    public SymbolsStack() {
        data = (E[]) new Object[INITIAL_CAPACITY];
    }

    @Override
    public E push(E obj) {
        if(top == data.length - 1 ){
            // reallocate()
        }
        data[++top] = obj;
        return obj;
    }

    @Override
    public E peek() {
        if(empty()){
            throw new EmptyStackException();
        }
        return data[top];
    }

    @Override
    public E pop() {
        if(empty()){
            throw new EmptyStackException();
        }
        return data[top--];
    }

    @Override
    public boolean empty() {
        return top == -1;
    }

    @Override
    public int getSize() {
        return top + 1;
    }

    @Override
    public String toString() {
        return "SymbolsStack{" +
                "data=" + Arrays.toString(data) +
                ", top=" + top +
                '}';
    }
}
