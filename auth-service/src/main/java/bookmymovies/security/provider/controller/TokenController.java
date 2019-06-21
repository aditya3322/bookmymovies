package bookmymovies.security.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bookmymovies.security.provider.model.JwtUser;
import bookmymovies.security.provider.security.JwtGenerator;

@RestController
@RequestMapping("/bookmymovies/api/token")
public class TokenController {

	@Autowired
	private JwtGenerator jwtTokenGenerator;
	
	@PostMapping
	public String generate(@RequestBody JwtUser jwtUser) {
		return jwtTokenGenerator.generate(jwtUser);
	}
	
}
