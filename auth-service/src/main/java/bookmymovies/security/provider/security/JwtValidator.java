package bookmymovies.security.provider.security;

import org.springframework.stereotype.Component;

import bookmymovies.security.provider.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
@Component
public class JwtValidator {

	private String secret = "bookmymovies";

	public JwtUser validate(String token) {
		JwtUser jwtuser = null;
		try {
			Claims claim =  Jwts.parser()
					.setSigningKey(secret)
					.parseClaimsJws(token).getBody();
			jwtuser = new JwtUser();
			jwtuser.setUserName(claim.getSubject());
			jwtuser.setId(Long.parseLong((String) claim.get("userId")));
			jwtuser.setRole((String) claim.get("role"));
		} catch (Exception e) {
			System.out.println("Exception Found: " + e.getMessage());
		}
		return jwtuser;
	}

}
