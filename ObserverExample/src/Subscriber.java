
public class Subscriber implements Observer {
	private String name;
	private MailingList mailingList = new MailingList();

	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hey " + name + " Mail sent, title: " + mailingList.title);
	}

	@Override
	public void subscribleMailingList(MailingList mailingList) {
		this.mailingList = mailingList;
	}

}
