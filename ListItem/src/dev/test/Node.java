package dev.test;

class Node extends ListItem{
    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return rightLink;
    }


    @Override
    ListItem setNext(ListItem listItem) {
        return rightLink = listItem;
    }

    @Override
    ListItem previous() {
        return leftLink;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        return leftLink = listItem;
    }

    @Override
    int compareTo(ListItem listItem) {
        int comparedValue = ((Integer)super.getValue()).compareTo((Integer)listItem.getValue());
        return comparedValue;

    }
}
