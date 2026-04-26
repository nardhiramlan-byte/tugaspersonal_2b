package Main;

public class Queue{
    Node front, rear;

    // enqueue
    public void tambahAntrian(String no, String nama, double total) {
        Node newNode = new Node(no, nama, total);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // dequeue
    public Node layaniPelanggan() {
        if (front == null) {
            return null;
        }

        Node temp = front;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return temp;
    }

    // tampilkan antrian
    public void tampilkan() {
        if (front == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        Node temp = front;
        while (temp != null) {
            System.out.println(temp.nomorAntrian + " - " + temp.nama + " - Rp" + temp.totalBelanja);
            temp = temp.next;
        }
    }
}
