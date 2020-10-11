package generic;
//generic class 
public class Holder<T>  { //T : type : placeholder 
    //state ????????? : which can hold primitive / ref type
	private T ref;//Heap 

	public Holder(T ref) {
		super();
		this.ref = ref;
	}

	public T getRef() {
		return ref;
	}
	
	
	
}
