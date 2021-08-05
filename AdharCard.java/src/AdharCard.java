
public class AdharCard {
		
		public boolean isAdharValid(String name) throws Exception {
			if(name!=null && name.matches("[A-Z]{3}[a-z]{3}[0-9]{8}")) {
				return true;
			}else {
				throw new Exception("invalid adharcard " + name + " plz try again after some time");
			}
		}

	}