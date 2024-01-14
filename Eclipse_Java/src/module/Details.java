package module;
class Details {
	String name;
	int age;
	public Details(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Details g = new Details("HOOW", 20);
		System.out.println("Hello "+ g.name+ " Are you "+ g.age+" Right now");
		// TODO Auto-generated method stub

	}

}
