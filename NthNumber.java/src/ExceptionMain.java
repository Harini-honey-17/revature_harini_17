
	

	public class ExceptionMain {

		public static void main(String[] args) {
			// this is for the email validation
			vinay g = new vinay();
			try {
				if (g.isValidEmail("vinay@gmail.com*")) {
					System.out.println("email is validated");
				}
			} catch (InValidEmail e) {
				System.out.println(e.getMessage());
			}

			// now this is for password validation
			Password p = new Password();
			try {
				if (p.isPasswordValid("A123458ghtd")) {
					System.out.println("\n password is validated");
				}
			} catch (InvalidPassword e) {
				System.out.println(e.getMessage());
			}

			// this is for adharcard
			AdharCard ac = new AdharCard();
			try {
				if (ac.isAdharValid("ABCdef12345678")) {
					System.out.println("\n adhar card is valid");
				}
			} catch (InvalidAdhar e) {
				System.out.println(e.getMessage());
			}

		}

	}
	
}