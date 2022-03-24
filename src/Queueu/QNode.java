package Queueu;

public class QNode {
    String key;
    QNode next;

    public QNode(String key){
        this.key = key;
        this.next = null;
    }
}
