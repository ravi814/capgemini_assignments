package Com.F;

import java.awt.PageAttributes.MediaType;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRestController {
	@RequestMapping(value="/vcheck.html" , method = RequestMethod.POST)
	public String success(@ModelAttribute ("user9") Login user9) {
		
		
		Login admin1 = new Login();
		admin1.setUsername("rahul");
		admin1.setPassword("admin");
		
		if(user9.getUsername().equals(admin1.getUsername())){
			if(user9.getPassword().equals(admin1.getPassword())){
				return "Valid User";	
			}else {
				return "Invalid User";}
		}else {
			return "Invalid User";}
	}

}
