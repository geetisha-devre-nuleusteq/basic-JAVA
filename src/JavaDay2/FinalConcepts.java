package JavaDay2;

public final class FinalConcepts {
	final String var;

	public FinalConcepts() {
		this.var = "I am final variable";
		System.out.println(var);
	}

	public static void main(String... ar) {
		System.out.println("Final class:I can't be inheritted");
		final String a = "I AM FINAL VARIABLE I CANNOT BE MODIFIED";
		FinalConcepts f= new FinalConcepts();
		f.methd();
		System.out.println(a);
	}

	final void methd() {
		System.out.println("I CANNOT BE OVERRIDEN I AM FINAL METHOD");
	}

}
