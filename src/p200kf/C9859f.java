package p200kf;

import android.text.TextUtils;
import android.util.Log;
import androidx.exifinterface.media.C2892a;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: kf.f */
/* loaded from: classes8.dex */
public class C9859f {

    /* renamed from: b */
    private static final byte[] f21975b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c */
    private static final int[] f21976c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    private final AbstractC9861b f21977a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kf.f$a */
    /* loaded from: classes8.dex */
    public static class C9860a {

        /* renamed from: a */
        private final ByteBuffer f21978a;

        public C9860a(byte[] bArr, int i) {
            this.f21978a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        /* renamed from: a */
        public short m15175a(int i) {
            return this.f21978a.getShort(i);
        }

        /* renamed from: b */
        public int m15174b(int i) {
            return this.f21978a.getInt(i);
        }

        /* renamed from: c */
        public int m15173c() {
            return this.f21978a.remaining();
        }

        /* renamed from: d */
        public void m15172d(ByteOrder byteOrder) {
            this.f21978a.order(byteOrder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kf.f$b */
    /* loaded from: classes8.dex */
    public interface AbstractC9861b {
        /* renamed from: a */
        int mo15171a();

        /* renamed from: b */
        int mo15170b(byte[] bArr, int i);

        /* renamed from: c */
        short mo15169c();

        long skip(long j);
    }

    /* renamed from: kf.f$c */
    /* loaded from: classes8.dex */
    private static class C9862c implements AbstractC9861b {

        /* renamed from: a */
        private final InputStream f21979a;

        public C9862c(InputStream inputStream) {
            this.f21979a = inputStream;
        }

        @Override // p200kf.C9859f.AbstractC9861b
        /* renamed from: a */
        public int mo15171a() {
            return ((this.f21979a.read() << 8) & 65280) | (this.f21979a.read() & 255);
        }

        @Override // p200kf.C9859f.AbstractC9861b
        /* renamed from: b */
        public int mo15170b(byte[] bArr, int i) {
            int i2 = i;
            while (i2 > 0) {
                int read = this.f21979a.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }

        @Override // p200kf.C9859f.AbstractC9861b
        /* renamed from: c */
        public short mo15169c() {
            return (short) (this.f21979a.read() & 255);
        }

        @Override // p200kf.C9859f.AbstractC9861b
        public long skip(long j) {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.f21979a.skip(j2);
                if (skip <= 0) {
                    if (this.f21979a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    public C9859f(InputStream inputStream) {
        this.f21977a = new C9862c(inputStream);
    }

    /* renamed from: a */
    private static int m15183a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    /* renamed from: b */
    public static void m15182b(C2892a aVar, int i, int i2, String str) {
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        try {
            C2892a aVar2 = new C2892a(str);
            for (int i3 = 0; i3 < 22; i3++) {
                String str2 = strArr[i3];
                String f = aVar.m36323f(str2);
                if (!TextUtils.isEmpty(f)) {
                    aVar2.m36332a0(str2, f);
                }
            }
            aVar2.m36332a0("ImageWidth", String.valueOf(i));
            aVar2.m36332a0("ImageLength", String.valueOf(i2));
            aVar2.m36332a0("Orientation", "0");
            aVar2.m36337W();
        } catch (IOException e) {
            Log.d("ImageHeaderParser", e.getMessage());
        }
    }

    /* renamed from: d */
    private static boolean m15180d(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* renamed from: e */
    private boolean m15179e(byte[] bArr, int i) {
        boolean z;
        if (bArr == null || i <= f21975b.length) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f21975b;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    /* renamed from: f */
    private int m15178f() {
        short c;
        short c2;
        int a;
        long j;
        long skip;
        do {
            if (this.f21977a.mo15169c() != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unknown segmentId=" + ((int) c));
                }
                return -1;
            }
            c2 = this.f21977a.mo15169c();
            if (c2 == 218) {
                return -1;
            }
            if (c2 == 217) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a = this.f21977a.mo15171a() - 2;
            if (c2 == 225) {
                return a;
            }
            j = a;
            skip = this.f21977a.skip(j);
        } while (skip == j);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Unable to skip enough data, type: " + ((int) c2) + ", wanted to skip: " + a + ", but actually skipped: " + skip);
        }
        return -1;
    }

    /* renamed from: g */
    private static int m15177g(C9860a aVar) {
        ByteOrder byteOrder;
        short a = aVar.m15175a(6);
        if (a == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else if (a == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Unknown endianness = " + ((int) a));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        aVar.m15172d(byteOrder);
        int b = aVar.m15174b(10) + 6;
        short a2 = aVar.m15175a(b);
        for (int i = 0; i < a2; i++) {
            int a3 = m15183a(b, i);
            short a4 = aVar.m15175a(a3);
            if (a4 == 274) {
                short a5 = aVar.m15175a(a3 + 2);
                if (a5 >= 1 && a5 <= 12) {
                    int b2 = aVar.m15174b(a3 + 4);
                    if (b2 >= 0) {
                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Got tagIndex=" + i + " tagType=" + ((int) a4) + " formatCode=" + ((int) a5) + " componentCount=" + b2);
                        }
                        int i2 = b2 + f21976c[a5];
                        if (i2 <= 4) {
                            int i3 = a3 + 8;
                            if (i3 < 0 || i3 > aVar.m15173c()) {
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    Log.d("ImageHeaderParser", "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) a4));
                                }
                            } else if (i2 >= 0 && i2 + i3 <= aVar.m15173c()) {
                                return aVar.m15175a(i3);
                            } else {
                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    Log.d("ImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) a4));
                                }
                            }
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            Log.d("ImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) a5));
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        Log.d("ImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Got invalid format code = " + ((int) a5));
                }
            }
        }
        return -1;
    }

    /* renamed from: h */
    private int m15176h(byte[] bArr, int i) {
        int b = this.f21977a.mo15170b(bArr, i);
        if (b != i) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + b);
            }
            return -1;
        } else if (m15179e(bArr, i)) {
            return m15177g(new C9860a(bArr, i));
        } else {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
    }

    /* renamed from: c */
    public int m15181c() {
        int a = this.f21977a.mo15171a();
        if (!m15180d(a)) {
            if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Parser doesn't handle magic number: " + a);
            }
            return -1;
        }
        int f = m15178f();
        if (f != -1) {
            return m15176h(new byte[f], f);
        }
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
        }
        return -1;
    }
}
