import java.util.ArrayList;
import java.util.List;

public class MailingList implements Subject {
	
	private List<Subscriber> subs = new ArrayList<>();
	String title;
	
	@Override
	public void subscrible(Subscriber sub) {
		subs.add(sub);
	}
	
	@Override
	public void unSubscrible(Observer sub) {
		subs.remove(sub);
	}
	
	@Override
	public void notifySubscribers() {
		for(Observer sub : subs) {
			sub.update();
		}
	}
	
	@Override
	public void sendMail(String title) {
		this.title = title;
		notifySubscribers();
	}

}
