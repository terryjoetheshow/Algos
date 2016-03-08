package DataStructure;

class HashEntry {

	private int key;
	private LinkedList list;
	//private int value;
	
	HashEntry(int key, int value) {
		this.key = key;
		list = new LinkedList();
		list.Add(value);
		//this.value = value;
	}
	
	public void addValue(int value) {
		list.Add(value);
	}
	
	public int getKey() {
		return key;
	}
	
	public int getTopValue() {
		return list.getHead().getData();
	}

}

public class HashTable {

	private final static int TABLE_SIZE = 8;
	
	HashEntry[] table;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public HashTable() {
		table = new HashEntry[128];
	}
	
	public void add(int value) {
		int key = hashFunction(value);
		if(table[key] == null) {
			table[key] = new HashEntry(key, value);
		}
		else {
			table[key].addValue(value);
		}
	}	
	
	public int hashFunction(int value) {
		return value % TABLE_SIZE;
	}
}
