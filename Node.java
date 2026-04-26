package Main;

public class Node {
	    String nomorAntrian;
	    String nama;
	    double totalBelanja;
	    Node next;
	    
	    Node(String nomorAntrian, String nama, double totalBelanja) {
	    	this.nomorAntrian = nomorAntrian;
	    	this.nama = nama;
	    	this.totalBelanja = totalBelanja;
	    	this.next = null;
	    }
	}
