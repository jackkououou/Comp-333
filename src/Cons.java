public class Cons implements ImmutableList {
    // ---BEGIN INSTANCE VARIABLES---
    public final int head;
    public final ImmutableList tail;
    // ---END INSTANCE VARIABLES---

    public Cons(final int head, final ImmutableList tail) {
        this.head = head;
        this.tail = tail;
    } // Cons

    public boolean equals(final Object other) {
        if (other instanceof Cons) {
            final Cons otherCons = (Cons) other;
            return head == otherCons.head && tail.equals(otherCons.tail);
        } else {
            return false;
        }
    } // equals

    public int length() {
        return 1 + tail.length();
    }

    public int sum() {
        return this.head + tail.sum();
    }

    public ImmutableList append(ImmutableList other) {
        ImmutableList lump = new Cons(this.head, this.tail.append(other));
        return lump;
    }

    public boolean contains(int value) {
        return (this.head == value || this.tail.contains(value));
    }

    public String toString() {
        return "Cons(" + head + ", " + tail.toString() + ")";
    } // toString

    public int hashCode() {
        return sum();
    } // hashCode

} // Cons

// Lists always end on Nil SOOOOOO it can be used as the base case of recusions
