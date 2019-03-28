package enumclass;

public class GenderTest {

	public static void main(String[] args) {
		
		Gender g = Enum.valueOf(Gender.class, "FEMALE");
		System.out.println(g.getName());
		Gender g1 = Enum.valueOf(Gender.class, "MALE");
		System.out.println(g1.getName());
		InterfaceGender i = Enum.valueOf(InterfaceGender.class, "FEMALE");
		i.info();
		InterfaceGender i1 = Enum.valueOf(InterfaceGender.class, "MALE");
		i1.info();
		
	}

}
