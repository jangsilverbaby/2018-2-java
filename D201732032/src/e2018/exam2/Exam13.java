package e2018.exam2;

interface OnCreateListener {
	void onCreate(); 
}


class MessageBox {
	OnCreateListener listener; 
	public void setButton(OnCreateListener listener) {
		this.listener = listener; 
	} 
	public void create() { 
		System.out.println("MessageBox create"); 
		listener.onCreate(); 
	}
} 

public class Exam13 { 
	public static void main(String[] args) { 
		MessageBox messageBox = new MessageBox();
		/*OnCreateListener listener = new OnCreateListener() {
			@Override
			public void onCreate() { 
				System.out.println("MyOnCreateListener onCreate"); 
			}
		};*/

		messageBox.setButton(new OnCreateListener() {
			@Override
			public void onCreate() { 
				System.out.println("MyOnCreateListener onCreate"); 
			}
		});
		messageBox.create();
	}
}