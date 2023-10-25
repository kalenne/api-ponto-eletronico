package com.kap.pontointeligente.api.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordUtils {
	
	private static Logger log = LoggerFactory.getLogger(PasswordUtils.class);
	
	public PasswordUtils () {
		
	}
	
	public static String gerarBCrypt(String senha) {
		if (senha == null) {
			return senha;
		}
		
		log.info("Gerando hasg com o BCrypt");
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder.encode(senha);
	}

}
