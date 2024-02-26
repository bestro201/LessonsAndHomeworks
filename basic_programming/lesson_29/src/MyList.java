import util.MyList;

import java.util.Arrays;


public class MyList<T> implements MyLinkedList<T> {
        private static final int DEFAULT_CAPACITY = 10;
        private Object[] array;
        private int size;

        public MyList() {
            this.array = new Object[DEFAULT_CAPACITY];
            this.size = 0;
        }
        @Override
        public void add(T value) {
            ensureCapacity();
            array[size++] = value;
        }

        @Override
        public void addAll(T... values) {
            ensureCapacity(size + values.length);
            System.arraycopy(values, 0, array, size, values.length);
            size += values.length;
        }

        @Override
        public int size() {
            return size;
        }

        @Override
        public int indexOf(T value) {
            for (int i = 0; i < size; i++) {
                if (array[i].equals(value)) {
                    return i;
                }
            }
            return -1;
        }
        @Override
        public int lastIndexOf(T value) {
            for (int i = size - 1; i >= 0; i--) {
                if (array[i].equals(value)) {
                    return i;
                }
            }
            return -1;
        }
        @Override
        public boolean contains(T value) {
            return indexOf(value) != -1;
        }

        @Override
        public T[] toArray() {
            return Arrays.copyOf((T[]) array, size);
        }

        @Override
        public boolean remove(T value) {
            int index = indexOf(value);
            if (index != -1) {
                remove(index);
                return true;
            }
            return false;
        }

        @Override
        public T remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            T removedValue = (T) array[index];
            System.arraycopy(array, index + 1, array, index, size - index - 1);
            array[--size] = null;
            return removedValue;
        }

        @Override
        public boolean isEmpty() {
            return size == 0;
        }

        @Override
        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            return (T) array[index];
        }

        @Override
        public void set(int index, T value) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            array[index] = value;
        }

        private void ensureCapacity() {
            if (size == array.length) {
                int newCapacity = array.length * 2;
                array = Arrays.copyOf(array, newCapacity);
            }
        }

        private void ensureCapacity(int minCapacity) {
            if (minCapacity > array.length) {
                int newCapacity = Math.max(minCapacity, array.length * 2);
                array = Arrays.copyOf(array, newCapacity);
            }


        }
}