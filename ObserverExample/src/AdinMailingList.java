
public class AdinMailingList {

	public static void main(String[] args) {
		MailingList adinMailingList = new MailingList();
		
		Subscriber s1 = new Subscriber("James");
		Subscriber s2 = new Subscriber("Jordan");
		Subscriber s3 = new Subscriber("Claudia");
		Subscriber s4 = new Subscriber("Audrey");
		Subscriber s5 = new Subscriber("Jenny");

		adinMailingList.subscrible(s1);
		adinMailingList.subscrible(s2);
		adinMailingList.subscrible(s3);
		adinMailingList.subscrible(s4);
		adinMailingList.subscrible(s5);
		
		// adinMailingList.unSubscrible(s4);
		
		s1.subscribleMailingList(adinMailingList);
		s2.subscribleMailingList(adinMailingList);
		s3.subscribleMailingList(adinMailingList);
		s4.subscribleMailingList(adinMailingList);
		s5.subscribleMailingList(adinMailingList);
		
		adinMailingList.sendMail("New tutorial");
	}

}
