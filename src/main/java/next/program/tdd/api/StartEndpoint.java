package next.program.tdd.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartEndpoint {
	
	@GetMapping("api/tdd")
	public String tdd() {
		return "Hier3 hier start rest";
	}

}
