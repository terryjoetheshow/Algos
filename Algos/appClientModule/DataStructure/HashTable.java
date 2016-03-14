package DataStructure;

//load factor n/k: n is size of data, k is the number of buckets.  
//searching through a chained linkedList of hashed nodes should at most take n/k, which is big O(n)

class HashEntry {

	private int key;
	private int value;
	HashEntry next;
	
	HashEntry(int key, int value) {
		this.key = key;
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public int getKey() {
		return key;
	}
	
	public HashEntry getNext() {
		return next;
	}
}

public class HashTable {

	private final static int TABLE_SIZE = 8;
	
	HashEntry[] table;
	
	public static void main(String[] args) throws Exception {
		HashTable table = new HashTable();
		table.add(123,  5000);
		table.add(1,  1111);
		table.add(8, 2222);
		table.add(9, 3334);
		
		System.out.println(table.find(1));
		System.out.println(table.find(123));
		System.out.println(table.find(8));
		System.out.println(table.find(9));
	}

	public HashTable() {
		table = new HashEntry[TABLE_SIZE];
	}

	public int find(int key) throws Exception {
		int hashVal = hashFunction(key);
		if (table[hashVal] == null) {
			throw new Exception("No key exists");
		}
		
		HashEntry node = table[hashVal];
		
		while (node != null) {
			if(node.getKey()==key)
				return node.getValue();
			node = node.getNext();
		}
		throw new Exception("No matching key");
	}
	
	public void add(int key, int value) {
		int hashVal = hashFunction(key);
		if(table[hashVal] == null) {
			table[hashVal] = new HashEntry(key, value);
		}
		else {
			HashEntry node = new HashEntry(key, value);
			node.next = table[hashVal];
			table[hashVal] = node;
		}
	}	

	
	
	public int hashFunction(int key) {
		return key % TABLE_SIZE;
	}
}
