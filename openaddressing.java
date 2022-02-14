package hashpack;

public class openaddressing {

	public static void main(String[] args) {
		 MyHashmap mh = new MyHashmap(7);
		    mh.insert(49);
		    mh.insert(56);
		    mh.insert(72);
		    if(mh.search(56)==true)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		    mh.delete(56);
		    if(mh.search(56)==true)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
	}
}

class MyHashmap  {
	int[] arr;
	int cap,size;
	MyHashmap(int c){
		cap =  c;
		size = 0;
		arr=new int[cap];
		for(int i=0;i<cap;i++) {
			arr[i] = -1;
		}
	}
	int hash(int key) {
		return key%cap;
	}
	boolean search(int key) {
		int h = hash(key);
		int i =h;
		while(arr[i] != -1) {
			if(arr[i] == key) 
				return true;
			i = (i+1)%cap;//circularly search
			if(i==h)//comes to the same point
				return false;
		}
		return false;
	}
	boolean insert(int key) {
		int h = hash(key);
		int i =h;
		if(cap==size)//If table is full
			return false;
		while(arr[i] !=-1 && arr[i] !=key && arr[i] != -2) {//to check for next slot if already occupied
			i = ((i+1)%cap);
		}
		if(arr[i] == key)//To avoid duplicates
			return false;
		else {
			arr[i]=key;
			size++;
			return true;
		}
			
	}
	boolean delete(int key) {
		int h = hash(key);
		int i =h;
		while(arr[i] != -1) {
			if(arr[i] == key) {
				arr[i]=-2;
				return true;
			}
				
			i = (i+1)%cap;
			if(i==h)
				return false;
		}
		return false;
	}
	
}
