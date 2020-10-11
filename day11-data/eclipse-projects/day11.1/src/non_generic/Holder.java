package non_generic;

public class Holder {
    //state ????????? : which can hold primitive / ref type
	private Object ref;//Heap 

	public Holder(Object ref) {
		super();
		this.ref = ref;
	}

	public Object getRef() {
		return ref;
	}
	
	
	
}
