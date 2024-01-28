package dev.test;

public class MyLinkedList implements NodeList{
     private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }
    @Override
    public ListItem getRoot() {
        return root;
    }
    public boolean addItem( ListItem newItem) {
        if ( root == null) {
            root = newItem;
            return true;
        }
        ListItem currentItem = root;
        while ( currentItem != null) {
            int comparedValue = currentItem.compareTo(newItem);
            if (comparedValue < 0 ) {
                if (currentItem.next() != null ) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    currentItem.setPrevious(currentItem);
                    return true;
                }
            }
            if ( comparedValue > 0 ) {
                if (currentItem.previous() != null ) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    currentItem.setNext(currentItem);
                    return true;
                }
            }
            if ( comparedValue == 0 ){
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem newItem) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
