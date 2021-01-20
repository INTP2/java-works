package jw.annodiy;
public @interface BugReport {
	enum Status {UNCONFIRMED, CONFIRMED, FIXED, NOTABUG};
	boolean showStopper() default true;
	String assiganedTo() default "[none]";
	Status status() default Status.UNCONFIRMED;
	String[] reportedBy();
}