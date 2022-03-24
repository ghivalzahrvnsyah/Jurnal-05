package Queueu;

class Queue {
    QNode head, tail;


    public Queue() {
        this.head = this.tail = null;
    }
    void enqueue (String key) {
        QNode temp = new QNode(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    void dequeue() {
        if (this.head == null){
            System.out.println("data tidak ditemukan");
            return;
        }

        QNode temp = this.head;
        this.head = this.head.next;

        if (this.head == null)
            this.tail = null;
    }

}
