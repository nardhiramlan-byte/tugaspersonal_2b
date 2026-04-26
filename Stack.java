package Main;

public class Stack {
    Node top;

    // push
    public void push(Node data) {
        Node newNode = new Node(data.nomorAntrian, data.nama, data.totalBelanja);
        newNode.next = top;
        top = newNode;
    }

    // tampilkan stack
    public void tampilkan() {
        if (top == null) {
            System.out.println("Belum ada transaksi!");
            return;
        }

        Node temp = top;
        while (temp != null) {
            System.out.println(temp.nomorAntrian + " - " + temp.nama + " - Rp" + temp.totalBelanja);
            temp = temp.next;
        }
    }
}
