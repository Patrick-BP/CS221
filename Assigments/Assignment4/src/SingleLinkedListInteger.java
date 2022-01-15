public class SingleLinkedListInteger<Integer> {

    //data member
    private Node head = null;
    private int size = 0;

    private static class Node<Integer>{

        // data Fields
        private int data;
        private Node next;

        public Node(int item) {
            this.data = item;
            this.next = null;
        }
        public Node(int item, Node<Integer> nodeRef){
            this.data = item;
            this.next = nodeRef;
        }

    }

    // Helper Methods
    private void addAfter(int item, Node<Integer> node){
        Node<Integer> temp = new Node<>(item, node.next);
        node.next = temp;
        size++;
    }

    private void addFirst(int item){
        Node<Integer> temp = new Node<>(item, head);
        head = temp;
        size++;
    }
    private Node<Integer> getNode(int index){
        Node<Integer> node = head;
        for (int i = 0; i < index && node != null; i++) {
            node = node.next;
        }
        return node;
    }

    //public methods
    public void add(int index, int item){
        if(index < 0 || index > size)
            throw new ArrayIndexOutOfBoundsException();

        if(index == 0){
            addFirst(item);
        }else{
            Node<Integer> node = getNode(index-1);
            addAfter(item, node);
        }


    }

    public void add(int item){add(size, item);}
    public int size(){return size;}



    public boolean find(int item){
        Node<Integer> current = head;
        while(current != null){
            if(item == current.data){
                return true;
            }
            current =  current.next;
        }
        return false;
    }

    public int max(){
        int max = 0;
        Node<Integer> current = head;
        while(current != null){
            if(current.data > max){
                max = current.data;
            }
            current = current.next;
        }
        return max;
    }

    public int min(){
        int min = head.next.data;
        Node<Integer> current = head;
        while(current != null){
            if(current.data < min){
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    public String toString(){
        Node<Integer> current =head;
        StringBuilder result = new StringBuilder();
        while(current != null) {
            result.append(current.data);
            if (current.next != null){
                result.append(" ==> ");
            }
            current = current.next;
        }
        return result.toString();
    }

}
