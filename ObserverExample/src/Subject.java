
public interface Subject {

	void subscrible(Subscriber sub);

	void unSubscrible(Observer sub);

	void notifySubscribers();

	void sendMail(String title);

}