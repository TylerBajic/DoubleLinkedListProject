package DoubleLinkedListProject;

import java.util.NoSuchElementException;

public class TWDoubleLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;

   public TWDoubleLinkedList(){
   size = 0;
   head = null;
   tail = null;
}
   public boolean isEmpty(){
    return size==0;
   }
   public int getSize(){
    return size;
   }

   public void addFirst(E data){
    Node<E> temp = new Node<E>(data, head, null);
    if(head!= null){
        head.prev = temp;
    }
    head = temp;
    if(tail==null){
        tail = temp;
    }
    size++;
   }

   public void addLast(E data){
    Node<E> temp = new Node<E> (data, null, tail);
    if(tail!= null){
        tail.next = temp;
    }
    tail = temp;
    if(head==null){
        head = temp;
    }
    size++;
   }

//    public String printList() {
		
//     @SuppressWarnings("unchecked")
//   Node<CompanyUSA> nodeRef = (Node<CompanyUSA>) head;
//   StringBuilder result = new StringBuilder();
  
//   while (nodeRef != null) {
//       result.append(nodeRef.data + "\n");
  
//       nodeRef = nodeRef.next;
//   }
  
//   return result.toString();
// }    


   public E removeFirst(){
    if(size==0){
        throw new NoSuchElementException();
    }
    Node<E> temp = head;
    head = head.next;
    head.prev = null;

    size--;
    return temp.data;
   }

   public E removeLast(){
    if(size==0){
        throw new NoSuchElementException();
    }
    Node<E> temp = tail;
    tail = tail.prev;
    tail.next = null;

    size--;
    return temp.data;
   }
   public void iterateForward(){
    Node<E> temp = head;
    while(temp !=null){
      System.out.println(temp.data);
      temp = temp.next;
    }

   }

   public void iterateBackward(){
    Node<E> temp = tail;
    while(temp!=null){
        System.out.println(temp.data);
        temp = temp.prev;
    }
   }
   private Node<E> getIndexNode(int index){
    if(index<0|| index>=size){
      System.out.println("Index " + index + "is out of the list range");
      return null;
    }
    Node<E> node = getHead();
    for(int i = 0; i< index && node != null; i++){
    node = node.next;
   }
   return node;
   }
   
    private Node<E> getHead() {
    return head;
}
    public E getIndexNodeData(int index){
    if(index<0 || index>= size){
       System.out.println("Index " + index + " is out of the list range");
       return null;
  }
    Node<E> node = getIndexNode(index);
    if(node != null){
    return node.data;
   }else{
    return null;
   }
  }

    public void addNodeAtIndex(E data, int index){
       if(index<0|| index> size){
           System.out.println("Index "+ index + " is out of the list range");
           return;
        }
        if(index ==0){
           addFirst(data);
        }
        else if(index==size){
           addLast(data);
       }
        else{
           Node<E> newNode = new Node<E>(data, null, null);
            Node<E> temp = head;
        
        for(int i =0; i<index -1; i++){
           temp = temp.next;
        }
       newNode.prev = temp;
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
   }
}

  public E removeNodeAtIndex(int index){
    if(size==0){
      System.out.println("The list is empty, cannot remove an item.");

    }
    if(index<0|| index>= size){
       System.out.println("Index "+ index + " is out of the list range");
       System.out.println("Removing node index " + index + ": null");
    }
    if(index==0){
       return removeFirst();
   }
    else if(index ==size-1){
       return removeLast();
    }
   else{
       Node<E> temp = head;
       for(int i = 0; i<index; i++){
           if(temp==null){
            System.out.println("Error: Reached end of list too soon");
            return null;
           }
           temp = temp.next;
       }
        if(temp!= null){
       temp.prev.next = temp.next;
       temp.next.prev = temp.prev;
       size--;
       return temp.data;
        }
        else{
          return null;
        }
    }
  }
    private static class Node<E>{
        private E data;
        private Node<E> next;
        private Node<E> prev;

        public Node(E data, Node<E> next, Node<E> prev){
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

}


