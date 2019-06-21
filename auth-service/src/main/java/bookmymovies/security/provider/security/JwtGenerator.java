package bookmymovies.security.provider.security;

import org.springframework.stereotype.Component;

import bookmymovies.security.provider.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator {
	
	private String secret = "bookmymovies";
	
	public String generate(JwtUser jwtUser) {
		Claims claim = Jwts.claims()
				.setSubject(jwtUser.getUserName());
		claim.put("userId", String.valueOf(jwtUser.getId()));
		claim.put("role", jwtUser.getRole());
		return Jwts.builder()
			.setClaims(claim)
			.signWith(SignatureAlgorithm.HS256, secret)
			.compact();
	}

}
