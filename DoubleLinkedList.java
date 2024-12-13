public class DoubleLinkedList {

        Node Head = null;
        Node Tail = null;

        DoubleLinkedList(Node node){

        }
        void AddToFront(int value){
                Node node = new Node(value);
                node.Next = this.Head;

                if (this.Head != null)
                {this.Head.Prev = node;}

                else {this.Tail =node;
                        this.Head = node;}
        }

        void AddToAnd(){


        }

    }
