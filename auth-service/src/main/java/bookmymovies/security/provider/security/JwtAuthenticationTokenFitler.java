package bookmymovies.security.provider.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import bookmymovies.security.provider.model.JwtAuthenticationToken;

public class JwtAuthenticationTokenFitler extends AbstractAuthenticationProcessingFilter {

	public JwtAuthenticationTokenFitler() {
		super("/rest/**");
	}

	@Override
	public Authentication attemptAuthentication(HttpServletRequest httpRequest, HttpServletResponse httpResponse)
			throws AuthenticationException, IOException, ServletException {
		String header = httpRequest.getHeader("Authorization");
		if(header == null  || !header.startsWith("Token"))
			throw new RuntimeException("JWT token is missing...");
		String authenticationToken = header.substring(6);
		return getAuthenticationManager().authenticate(new JwtAuthenticationToken(authenticationToken));
	}
	
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		super.successfulAuthentication(request, response, chain, authResult);
		chain.doFilter(request, response);
	}

}
