public class Linked {
    private Node head;

    public void insert(int data){
        Node node = new Node();
        node.setData(data);
        node.setPrevious(null);
        node.setNext(null);

        Node n = head;

        if (head == null){
            head = node;
        }else{
            Node nod = head;
            while(nod.getNext()!=null){
                nod = nod.getNext();
            }
            nod.setNext(node);

            while(node.getPrevious()!=null){

            }

        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.setData(data);
        node.setNext(head);

        head = node;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.setData(data);

        Node n = head;

        if (index==0){
            insertAtStart(data);
        }else{
            for (int i=0;i<index-1;i++){
                n = n.getNext();
            }
            node.setNext(n.getNext());
            n.setNext(node);
        }
    }

    public void delete(int index){
        if (index==0){
            head = head.getNext();
        }else{
            Node n = head;
            for (int i =0;i<index-1;i++){
                n = n.getNext();
            }
            Node temp = n.getNext();
            n.setNext(temp.getNext());
        }
    }

    public void show(){
        Node n = head;
        while(n.getNext()!=null){
            System.out.println(n.getData());
            n = n.getNext();
        }
        System.out.println(n.getData());
    }

}
