package dev.cisnux.collections;

import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;

public class SingleQueue<E> extends AbstractQueue<E> {
    private E data;

    @Override
    public Iterator<E> iterator() {
        return Collections.singleton(data).iterator();
    }

    @Override
    public int size() {
        return data == null ? 0 : 1;
    }

    @Override
    public boolean offer(E e) {
        if (e == null)
            return false;
        if (size() >= 1)
            return false;
        data = e;
        return true;
    }

    @Override
    public E poll() {
        if (size() == 0)
            return null;
        final var item = data;
        data = null;
        return item;
    }

    @Override
    public E peek() {
        return data;
    }
}
