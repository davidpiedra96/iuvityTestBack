package com.iuvity.util;

import java.nio.charset.StandardCharsets;
import java.security.spec.KeySpec;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.iuvity.constants.Constants;

public class EncoderAES implements PasswordEncoder {

	@Override
	public String encode(CharSequence rawPassword) {
		return cifrarBase64(getAES((String) rawPassword));
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return cifrarBase64(getAES((String) rawPassword)).equals(encodedPassword)? true:false;
	}

	/**
	 * Método para encriptar un texto en AES
	 * 
	 * @param data
	 * @return
	 */
	public String getAES(String data) {
		try {
			byte[] iv = new byte[16];
			IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
			SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			KeySpec keySpec = new PBEKeySpec(Constants.SECRETKEYAES.toCharArray(), Constants.SALTAES
					.getBytes(), 65536, 256);
			SecretKey secretKeyTemp = secretKeyFactory.generateSecret(keySpec);
			SecretKeySpec secretKey = new SecretKeySpec(secretKeyTemp.getEncoded(), "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
			String AES = Base64.getEncoder().encodeToString(cipher.doFinal(data.getBytes("UTF-8")));
			String AESinBase64 = cifrarBase64(AES);
			return AESinBase64;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Texto para desencriptar texto en AES
	 * 
	 * @param data
	 * @return
	 */
	@SuppressWarnings("unused")
	private String getAESDecrypt(String data) {
		byte[] iv = new byte[16];
		try {
			String AES = descifrarBase64(data);
			IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
			SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			KeySpec keySpec = new PBEKeySpec(Constants.SECRETKEYAES.toCharArray(), Constants.SALTAES.getBytes(), 65536, 256);
			SecretKey secretKeyTemp = secretKeyFactory.generateSecret(keySpec);
			SecretKeySpec secretKey = new SecretKeySpec(secretKeyTemp.getEncoded(), "AES");
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, secretKey, ivParameterSpec);
			return new String(cipher.doFinal(Base64.getDecoder().decode(AES)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Método para codificar en Base64
	 * 
	 * @param a
	 * @return
	 */
	private String cifrarBase64(String a) {
		Base64.Encoder encoder = Base64.getEncoder();
		String b = encoder.encodeToString(a.getBytes(StandardCharsets.UTF_8));
		return b.replace("=", "_");
	}

	/**
	 * Método para decodificar en Base64
	 * 
	 * @param a
	 * @return
	 */
	private static String descifrarBase64(String a) {
		a = a.replace("_", "=");
		Base64.Decoder decoder = Base64.getDecoder();
		byte[] decodedByteArray = decoder.decode(a);
		String b = new String(decodedByteArray);
		return b;
	}

}

