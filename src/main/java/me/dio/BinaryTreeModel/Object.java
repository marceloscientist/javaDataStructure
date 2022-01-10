package me.dio.BinaryTreeModel;

import java.util.Objects;

public
class Object extends TreeObject<Object> {
    Integer myValue;

    public
    Object (Integer myValue) {
        this.myValue = myValue;
    }

    @Override
    public
    boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Object object = o;
        return Objects.equals(myValue, object.myValue);
    }

    @Override
    public
    int hashCode ( ) {
        return Objects.hash(myValue);
    }

    @Override
    public
    int compareTo (Object other) {
        return (this.myValue > other.myValue)? 1:
                (this.myValue < other.myValue)? -1: 0;
    }

    @Override
    public
    String toString ( ) {
        return myValue.toString();
    }
}
