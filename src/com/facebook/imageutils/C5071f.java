package com.facebook.imageutils;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.imageutils.f */
/* loaded from: classes7.dex */
public class C5071f {
    /* renamed from: a */
    private static boolean m30845a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (str.charAt(i) != bArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static int m30844b(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: c */
    private static byte m30843c(InputStream inputStream) {
        return (byte) (inputStream.read() & 255);
    }

    /* renamed from: d */
    private static String m30842d(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b : bArr) {
            sb2.append((char) b);
        }
        return sb2.toString();
    }

    /* renamed from: e */
    private static int m30841e(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 24) & (-16777216)) | ((((byte) inputStream.read()) << 16) & 16711680) | ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
    }

    /* renamed from: f */
    private static short m30840f(InputStream inputStream) {
        return (short) (inputStream.read() & 255);
    }

    /* renamed from: g */
    public static Pair<Integer, Integer> m30839g(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            try {
                try {
                    inputStream.read(bArr);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                if (inputStream != null) {
                    inputStream.close();
                }
            }
            if (!m30845a(bArr, "RIFF")) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return null;
            }
            m30841e(inputStream);
            inputStream.read(bArr);
            if (!m30845a(bArr, "WEBP")) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return null;
            }
            inputStream.read(bArr);
            String d = m30842d(bArr);
            if ("VP8 ".equals(d)) {
                Pair<Integer, Integer> h = m30838h(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
                return h;
            } else if ("VP8L".equals(d)) {
                Pair<Integer, Integer> i = m30837i(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
                return i;
            } else if ("VP8X".equals(d)) {
                Pair<Integer, Integer> j = m30836j(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                return j;
            } else {
                inputStream.close();
                return null;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
            }
            throw th2;
        }
    }

    /* renamed from: h */
    private static Pair<Integer, Integer> m30838h(InputStream inputStream) {
        inputStream.skip(7L);
        short f = m30840f(inputStream);
        short f2 = m30840f(inputStream);
        short f3 = m30840f(inputStream);
        if (f == 157 && f2 == 1 && f3 == 42) {
            return new Pair<>(Integer.valueOf(m30844b(inputStream)), Integer.valueOf(m30844b(inputStream)));
        }
        return null;
    }

    /* renamed from: i */
    private static Pair<Integer, Integer> m30837i(InputStream inputStream) {
        m30841e(inputStream);
        if (m30843c(inputStream) != 47) {
            return null;
        }
        int read = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf(((((byte) inputStream.read()) & 255) | ((read & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((read & 192) >> 6)) + 1));
    }

    /* renamed from: j */
    private static Pair<Integer, Integer> m30836j(InputStream inputStream) {
        inputStream.skip(8L);
        return new Pair<>(Integer.valueOf(m30835k(inputStream) + 1), Integer.valueOf(m30835k(inputStream) + 1));
    }

    /* renamed from: k */
    private static int m30835k(InputStream inputStream) {
        byte c = m30843c(inputStream);
        return ((m30843c(inputStream) << 16) & 16711680) | ((m30843c(inputStream) << 8) & 65280) | (c & 255);
    }
}
