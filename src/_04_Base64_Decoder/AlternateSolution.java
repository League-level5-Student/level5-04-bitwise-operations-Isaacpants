package _04_Base64_Decoder;

public class AlternateSolution {
//	char[] c = file.toCharArray();
//	double bytLength = (file.length() / 4) * 3;
//	byte[] b = new byte[(int) bytLength];
//	c = file.toCharArray();
//	for (int i = 0; i < b.length; i++) {
//
//		if (i % 3 == 0) {
//			if(i==0) {
//				byte by = (byte) ((convertBase64Char(c[i])<<2) + (convertBase64Char(c[i +1]) >>4));
//				b[i] = by;
//			}else {
//			byte by = (byte) ((convertBase64Char(c[i]) << 6) + (convertBase64Char(c[i + 1])));
//
//			b[i] = by;
//			}
//		} else if (i % 3 == 2) {
//		//	if(i==2) {
//		//		byte by = (byte) ((convertBase64Char(c[i]) << 6) + (convertBase64Char(c[i + 1])));
//		//		b[i] = by;
//		//	}
//			byte by = (byte) ((convertBase64Char(c[i]) << 2) + (convertBase64Char(c[i + 1]) >> 4));
//			b[i] = by;
//		} else if (i % 3 == 1) {
//			byte by = (byte) ((convertBase64Char(c[i]) << 4) + (convertBase64Char(c[i + 1]) >> 2));
//			b[i] = by;
//		}
//	}
//
//	return b;
}
