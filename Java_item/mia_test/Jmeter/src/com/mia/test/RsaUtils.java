package com.mia.test;

import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;

import javax.crypto.Cipher;

public class RsaUtils {

	public static String DEFAULT_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCiwJbb2EeK9ZB4Chyj5/mIVPRE" + "\r"
			+ "od0pJrv3LM2UVtkod+2mPVjV9Xi1E06gUaoexX/ebfRXm1eBwu3LtYbklh5Ji5oF" + "\r"
			+ "ycoUCFhwzhmm8ZtjdkCIicFfxUU4I5NunL6+37+hy43EgCrao5tFgHtnkeR/vNyG" + "\r" + "faxdxevPbVEtWlJz6wIDAQAB"
			+ "\r";

	private static String GetpublicKey() {
		return DEFAULT_PUBLIC_KEY;
	}

	private static RSAPublicKey readRSAPublicKey(String publicKey) throws Exception {
		publicKey = GetpublicKey();
		byte[] keyBytes = Base64Utils.decode(publicKey);
		// byte[] keyBytes = getBase64(publicKey);
		X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		return (RSAPublicKey) keyFactory.generatePublic(spec); // Key publicK =
																// keyFactory.generatePublic(x509KeySpec);
	}

	public static String rsa(String input) {
		try {
			String Key = GetpublicKey();
			RSAPublicKey publicKey = readRSAPublicKey(Key);

			int key_len = publicKey.getModulus().bitLength() / 8;
			// System.out.println(key_len);
			int length = key_len - 11;

			String[] datas = splitString(input, length / 3);
			StringBuilder sb = new StringBuilder();

			Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);

			for (String b : datas) {
				sb.append(Base64Utils.encode(cipher.doFinal(b.getBytes("UTF-8"))));
			}
			String param = sb.toString().replace("+", "-").replace("/", "_");
			return param;
		} catch (Exception e) {
			return "";
		}
	}

	private static String[] splitString(String str, int len) {
		int size = (str.length() + len - 1) / len;
		String[] arr = new String[size];
		for (int i = 0; i < size; i++) {
			int length = i == size - 1 ? str.length() - (i * len) : len;
			arr[i] = str.substring(i * len, i * len + length);
		}
		return arr;

	}

}
