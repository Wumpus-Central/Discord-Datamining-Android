package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.C2899b;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.text.TypefaceStyle;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p163j$.util.DesugarTimeZone;
import p163j$.util.Spliterator;

/* renamed from: androidx.exifinterface.media.a */
/* loaded from: classes.dex */
public class C2892a {

    /* renamed from: U */
    private static SimpleDateFormat f35698U;

    /* renamed from: V */
    private static SimpleDateFormat f35699V;

    /* renamed from: Z */
    private static final C2896e[] f35703Z;

    /* renamed from: a0 */
    private static final C2896e[] f3915a0;

    /* renamed from: b0 */
    private static final C2896e[] f3916b0;

    /* renamed from: c0 */
    private static final C2896e[] f3917c0;

    /* renamed from: d0 */
    private static final C2896e[] f3918d0;

    /* renamed from: f0 */
    private static final C2896e[] f3920f0;

    /* renamed from: g0 */
    private static final C2896e[] f3921g0;

    /* renamed from: h0 */
    private static final C2896e[] f3922h0;

    /* renamed from: i0 */
    private static final C2896e[] f3923i0;

    /* renamed from: j0 */
    static final C2896e[][] f3924j0;

    /* renamed from: l0 */
    private static final HashMap<Integer, C2896e>[] f3926l0;

    /* renamed from: m0 */
    private static final HashMap<String, C2896e>[] f3927m0;

    /* renamed from: p0 */
    static final Charset f3930p0;

    /* renamed from: q0 */
    static final byte[] f3931q0;

    /* renamed from: r0 */
    private static final byte[] f3932r0;

    /* renamed from: s0 */
    private static final Pattern f3933s0;

    /* renamed from: t0 */
    private static final Pattern f3934t0;

    /* renamed from: u0 */
    private static final Pattern f3935u0;

    /* renamed from: v0 */
    private static final Pattern f3937v0;

    /* renamed from: a */
    private String f3942a;

    /* renamed from: b */
    private FileDescriptor f3943b;

    /* renamed from: c */
    private AssetManager.AssetInputStream f3944c;

    /* renamed from: d */
    private int f3945d;

    /* renamed from: e */
    private boolean f3946e;

    /* renamed from: f */
    private final HashMap<String, C2895d>[] f3947f;

    /* renamed from: g */
    private Set<Integer> f3948g;

    /* renamed from: h */
    private ByteOrder f3949h;

    /* renamed from: i */
    private boolean f3950i;

    /* renamed from: j */
    private boolean f3951j;

    /* renamed from: k */
    private boolean f3952k;

    /* renamed from: l */
    private int f3953l;

    /* renamed from: m */
    private int f3954m;

    /* renamed from: n */
    private byte[] f3955n;

    /* renamed from: o */
    private int f3956o;

    /* renamed from: p */
    private int f3957p;

    /* renamed from: q */
    private int f3958q;

    /* renamed from: r */
    private int f3959r;

    /* renamed from: s */
    private int f3960s;

    /* renamed from: t */
    private boolean f3961t;

    /* renamed from: u */
    private boolean f3962u;

    /* renamed from: v */
    private static final boolean f3936v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w */
    private static final List<Integer> f3938w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x */
    private static final List<Integer> f3939x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y */
    public static final int[] f3940y = {8, 8, 8};

    /* renamed from: z */
    public static final int[] f3941z = {4};

    /* renamed from: A */
    public static final int[] f35678A = {8};

    /* renamed from: B */
    static final byte[] f35679B = {-1, -40, -1};

    /* renamed from: C */
    private static final byte[] f35680C = {102, 116, 121, 112};

    /* renamed from: D */
    private static final byte[] f35681D = {109, 105, 102, 49};

    /* renamed from: E */
    private static final byte[] f35682E = {104, 101, 105, 99};

    /* renamed from: F */
    private static final byte[] f35683F = {79, 76, 89, 77, 80, 0};

    /* renamed from: G */
    private static final byte[] f35684G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: H */
    private static final byte[] f35685H = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: I */
    private static final byte[] f35686I = {101, 88, 73, 102};

    /* renamed from: J */
    private static final byte[] f35687J = {73, 72, 68, 82};

    /* renamed from: K */
    private static final byte[] f35688K = {73, 69, 78, 68};

    /* renamed from: L */
    private static final byte[] f35689L = {82, 73, 70, 70};

    /* renamed from: M */
    private static final byte[] f35690M = {87, 69, 66, 80};

    /* renamed from: N */
    private static final byte[] f35691N = {69, 88, 73, 70};

    /* renamed from: O */
    private static final byte[] f35692O = {-99, 1, 42};

    /* renamed from: P */
    private static final byte[] f35693P = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    private static final byte[] f35694Q = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: R */
    private static final byte[] f35695R = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: S */
    private static final byte[] f35696S = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: T */
    private static final byte[] f35697T = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: W */
    static final String[] f35700W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: X */
    static final int[] f35701X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: Y */
    static final byte[] f35702Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: e0 */
    private static final C2896e f3919e0 = new C2896e("StripOffsets", 273, 3);

    /* renamed from: k0 */
    private static final C2896e[] f3925k0 = {new C2896e("SubIFDPointer", 330, 4), new C2896e("ExifIFDPointer", 34665, 4), new C2896e("GPSInfoIFDPointer", 34853, 4), new C2896e("InteroperabilityIFDPointer", 40965, 4), new C2896e("CameraSettingsIFDPointer", 8224, 1), new C2896e("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: n0 */
    private static final HashSet<String> f3928n0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));

    /* renamed from: o0 */
    private static final HashMap<Integer, Integer> f3929o0 = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.exifinterface.media.a$a */
    /* loaded from: classes.dex */
    public class C0054a extends MediaDataSource {

        /* renamed from: k */
        long f3963k;

        /* renamed from: l */
        final /* synthetic */ C2898g f3964l;

        C0054a(C2898g gVar) {
            this.f3964l = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f3963k;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + this.f3964l.available()) {
                        return -1;
                    }
                    this.f3964l.m36272l(j);
                    this.f3963k = j;
                }
                if (i2 > this.f3964l.available()) {
                    i2 = this.f3964l.available();
                }
                int read = this.f3964l.read(bArr, i, i2);
                if (read >= 0) {
                    this.f3963k += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f3963k = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.a$b */
    /* loaded from: classes.dex */
    public static class C2893b extends InputStream implements DataInput {

        /* renamed from: o */
        private static final ByteOrder f3966o = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: p */
        private static final ByteOrder f3967p = ByteOrder.BIG_ENDIAN;

        /* renamed from: k */
        final DataInputStream f3968k;

        /* renamed from: l */
        private ByteOrder f3969l;

        /* renamed from: m */
        int f3970m;

        /* renamed from: n */
        private byte[] f3971n;

        C2893b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f3968k.available();
        }

        /* renamed from: b */
        public int m36300b() {
            return this.f3970m;
        }

        /* renamed from: g */
        public long m36299g() {
            return readInt() & 4294967295L;
        }

        /* renamed from: h */
        public void m36298h(ByteOrder byteOrder) {
            this.f3969l = byteOrder;
        }

        /* renamed from: i */
        public void m36297i(int i) {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int skip = (int) this.f3968k.skip(i3);
                if (skip <= 0) {
                    if (this.f3971n == null) {
                        this.f3971n = new byte[8192];
                    }
                    skip = this.f3968k.read(this.f3971n, 0, Math.min(8192, i3));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += skip;
            }
            this.f3970m += i2;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f3970m++;
            return this.f3968k.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f3970m++;
            return this.f3968k.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f3970m++;
            int read = this.f3968k.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f3970m += 2;
            return this.f3968k.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) {
            this.f3970m += i2;
            this.f3968k.readFully(bArr, i, i2);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f3970m += 4;
            int read = this.f3968k.read();
            int read2 = this.f3968k.read();
            int read3 = this.f3968k.read();
            int read4 = this.f3968k.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f3969l;
                if (byteOrder == f3966o) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f3967p) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f3969l);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f3970m += 8;
            int read = this.f3968k.read();
            int read2 = this.f3968k.read();
            int read3 = this.f3968k.read();
            int read4 = this.f3968k.read();
            int read5 = this.f3968k.read();
            int read6 = this.f3968k.read();
            int read7 = this.f3968k.read();
            int read8 = this.f3968k.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f3969l;
                if (byteOrder == f3966o) {
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == f3967p) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                throw new IOException("Invalid byte order: " + this.f3969l);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f3970m += 2;
            int read = this.f3968k.read();
            int read2 = this.f3968k.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f3969l;
                if (byteOrder == f3966o) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == f3967p) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f3969l);
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f3970m += 2;
            return this.f3968k.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f3970m++;
            return this.f3968k.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f3970m += 2;
            int read = this.f3968k.read();
            int read2 = this.f3968k.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f3969l;
                if (byteOrder == f3966o) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == f3967p) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f3969l);
            }
            throw new EOFException();
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        C2893b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        C2893b(InputStream inputStream, ByteOrder byteOrder) {
            this.f3969l = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f3968k = dataInputStream;
            dataInputStream.mark(0);
            this.f3970m = 0;
            this.f3969l = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = this.f3968k.read(bArr, i, i2);
            this.f3970m += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f3970m += bArr.length;
            this.f3968k.readFully(bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.a$c */
    /* loaded from: classes.dex */
    public static class C2894c extends FilterOutputStream {

        /* renamed from: k */
        final OutputStream f3972k;

        /* renamed from: l */
        private ByteOrder f3973l;

        public C2894c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f3972k = outputStream;
            this.f3973l = byteOrder;
        }

        /* renamed from: b */
        public void m36296b(ByteOrder byteOrder) {
            this.f3973l = byteOrder;
        }

        /* renamed from: g */
        public void m36295g(int i) {
            this.f3972k.write(i);
        }

        /* renamed from: h */
        public void m36294h(int i) {
            ByteOrder byteOrder = this.f3973l;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f3972k.write((i >>> 0) & 255);
                this.f3972k.write((i >>> 8) & 255);
                this.f3972k.write((i >>> 16) & 255);
                this.f3972k.write((i >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f3972k.write((i >>> 24) & 255);
                this.f3972k.write((i >>> 16) & 255);
                this.f3972k.write((i >>> 8) & 255);
                this.f3972k.write((i >>> 0) & 255);
            }
        }

        /* renamed from: i */
        public void m36293i(short s) {
            ByteOrder byteOrder = this.f3973l;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f3972k.write((s >>> 0) & 255);
                this.f3972k.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f3972k.write((s >>> 8) & 255);
                this.f3972k.write((s >>> 0) & 255);
            }
        }

        /* renamed from: l */
        public void m36292l(long j) {
            m36294h((int) j);
        }

        /* renamed from: n */
        public void m36291n(int i) {
            m36293i((short) i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f3972k.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            this.f3972k.write(bArr, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.a$d */
    /* loaded from: classes.dex */
    public static class C2895d {

        /* renamed from: a */
        public final int f3974a;

        /* renamed from: b */
        public final int f3975b;

        /* renamed from: c */
        public final long f3976c;

        /* renamed from: d */
        public final byte[] f3977d;

        C2895d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }

        /* renamed from: a */
        public static C2895d m36290a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new C2895d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C2892a.f3930p0);
            return new C2895d(1, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C2895d m36289b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2892a.f35701X[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d : dArr) {
                wrap.putDouble(d);
            }
            return new C2895d(12, dArr.length, wrap.array());
        }

        /* renamed from: c */
        public static C2895d m36288c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2892a.f35701X[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putInt(i);
            }
            return new C2895d(9, iArr.length, wrap.array());
        }

        /* renamed from: d */
        public static C2895d m36287d(C2897f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2892a.f35701X[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (C2897f fVar : fVarArr) {
                wrap.putInt((int) fVar.f3982a);
                wrap.putInt((int) fVar.f3983b);
            }
            return new C2895d(10, fVarArr.length, wrap.array());
        }

        /* renamed from: e */
        public static C2895d m36286e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C2892a.f3930p0);
            return new C2895d(2, bytes.length, bytes);
        }

        /* renamed from: f */
        public static C2895d m36285f(long j, ByteOrder byteOrder) {
            return m36284g(new long[]{j}, byteOrder);
        }

        /* renamed from: g */
        public static C2895d m36284g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2892a.f35701X[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C2895d(4, jArr.length, wrap.array());
        }

        /* renamed from: h */
        public static C2895d m36283h(C2897f fVar, ByteOrder byteOrder) {
            return m36282i(new C2897f[]{fVar}, byteOrder);
        }

        /* renamed from: i */
        public static C2895d m36282i(C2897f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2892a.f35701X[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (C2897f fVar : fVarArr) {
                wrap.putInt((int) fVar.f3982a);
                wrap.putInt((int) fVar.f3983b);
            }
            return new C2895d(5, fVarArr.length, wrap.array());
        }

        /* renamed from: j */
        public static C2895d m36281j(int i, ByteOrder byteOrder) {
            return m36280k(new int[]{i}, byteOrder);
        }

        /* renamed from: k */
        public static C2895d m36280k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C2892a.f35701X[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C2895d(3, iArr.length, wrap.array());
        }

        /* renamed from: l */
        public double m36279l(ByteOrder byteOrder) {
            Object o = m36276o(byteOrder);
            if (o == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (o instanceof String) {
                return Double.parseDouble((String) o);
            } else {
                if (o instanceof long[]) {
                    long[] jArr = (long[]) o;
                    if (jArr.length == 1) {
                        return jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o instanceof int[]) {
                    int[] iArr = (int[]) o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o instanceof double[]) {
                    double[] dArr = (double[]) o;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o instanceof C2897f[]) {
                    C2897f[] fVarArr = (C2897f[]) o;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].m36273a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: m */
        public int m36278m(ByteOrder byteOrder) {
            Object o = m36276o(byteOrder);
            if (o == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (o instanceof String) {
                return Integer.parseInt((String) o);
            } else {
                if (o instanceof long[]) {
                    long[] jArr = (long[]) o;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o instanceof int[]) {
                    int[] iArr = (int[]) o;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: n */
        public String m36277n(ByteOrder byteOrder) {
            Object o = m36276o(byteOrder);
            if (o == null) {
                return null;
            }
            if (o instanceof String) {
                return (String) o;
            }
            StringBuilder sb2 = new StringBuilder();
            int i = 0;
            if (o instanceof long[]) {
                long[] jArr = (long[]) o;
                while (i < jArr.length) {
                    sb2.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o instanceof int[]) {
                int[] iArr = (int[]) o;
                while (i < iArr.length) {
                    sb2.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o instanceof double[]) {
                double[] dArr = (double[]) o;
                while (i < dArr.length) {
                    sb2.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(o instanceof C2897f[])) {
                return null;
            } else {
                C2897f[] fVarArr = (C2897f[]) o;
                while (i < fVarArr.length) {
                    sb2.append(fVarArr[i].f3982a);
                    sb2.append('/');
                    sb2.append(fVarArr[i].f3983b);
                    i++;
                    if (i != fVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:136:0x0198 */
        /* JADX WARN: Removed duplicated region for block: B:166:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        java.lang.Object m36276o(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 448
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C2892a.C2895d.m36276o(java.nio.ByteOrder):java.lang.Object");
        }

        /* renamed from: p */
        public int m36275p() {
            return C2892a.f35701X[this.f3974a] * this.f3975b;
        }

        public String toString() {
            return "(" + C2892a.f35700W[this.f3974a] + ", data length:" + this.f3977d.length + ")";
        }

        C2895d(int i, int i2, long j, byte[] bArr) {
            this.f3974a = i;
            this.f3975b = i2;
            this.f3976c = j;
            this.f3977d = bArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.a$f */
    /* loaded from: classes.dex */
    public static class C2897f {

        /* renamed from: a */
        public final long f3982a;

        /* renamed from: b */
        public final long f3983b;

        C2897f(double d) {
            this((long) (d * 10000.0d), 10000L);
        }

        /* renamed from: a */
        public double m36273a() {
            return this.f3982a / this.f3983b;
        }

        public String toString() {
            return this.f3982a + "/" + this.f3983b;
        }

        C2897f(long j, long j2) {
            if (j2 == 0) {
                this.f3982a = 0L;
                this.f3983b = 1L;
                return;
            }
            this.f3982a = j;
            this.f3983b = j2;
        }
    }

    static {
        C2896e[] eVarArr;
        C2896e[] eVarArr2 = {new C2896e("NewSubfileType", 254, 4), new C2896e("SubfileType", 255, 4), new C2896e("ImageWidth", Spliterator.NONNULL, 3, 4), new C2896e("ImageLength", 257, 3, 4), new C2896e("BitsPerSample", 258, 3), new C2896e("Compression", 259, 3), new C2896e("PhotometricInterpretation", 262, 3), new C2896e("ImageDescription", 270, 2), new C2896e("Make", 271, 2), new C2896e("Model", 272, 2), new C2896e("StripOffsets", 273, 3, 4), new C2896e("Orientation", 274, 3), new C2896e("SamplesPerPixel", 277, 3), new C2896e("RowsPerStrip", 278, 3, 4), new C2896e("StripByteCounts", 279, 3, 4), new C2896e("XResolution", 282, 5), new C2896e("YResolution", 283, 5), new C2896e("PlanarConfiguration", 284, 3), new C2896e("ResolutionUnit", 296, 3), new C2896e("TransferFunction", 301, 3), new C2896e("Software", 305, 2), new C2896e("DateTime", 306, 2), new C2896e("Artist", 315, 2), new C2896e("WhitePoint", 318, 5), new C2896e("PrimaryChromaticities", 319, 5), new C2896e("SubIFDPointer", 330, 4), new C2896e("JPEGInterchangeFormat", 513, 4), new C2896e("JPEGInterchangeFormatLength", 514, 4), new C2896e("YCbCrCoefficients", 529, 5), new C2896e("YCbCrSubSampling", 530, 3), new C2896e("YCbCrPositioning", 531, 3), new C2896e("ReferenceBlackWhite", 532, 5), new C2896e("Copyright", 33432, 2), new C2896e("ExifIFDPointer", 34665, 4), new C2896e("GPSInfoIFDPointer", 34853, 4), new C2896e("SensorTopBorder", 4, 4), new C2896e("SensorLeftBorder", 5, 4), new C2896e("SensorBottomBorder", 6, 4), new C2896e("SensorRightBorder", 7, 4), new C2896e("ISO", 23, 3), new C2896e("JpgFromRaw", 46, 7), new C2896e("Xmp", TypefaceStyle.BOLD, 1)};
        f35703Z = eVarArr2;
        C2896e[] eVarArr3 = {new C2896e("ExposureTime", 33434, 5), new C2896e("FNumber", 33437, 5), new C2896e("ExposureProgram", 34850, 3), new C2896e("SpectralSensitivity", 34852, 2), new C2896e("PhotographicSensitivity", 34855, 3), new C2896e("OECF", 34856, 7), new C2896e("SensitivityType", 34864, 3), new C2896e("StandardOutputSensitivity", 34865, 4), new C2896e("RecommendedExposureIndex", 34866, 4), new C2896e("ISOSpeed", 34867, 4), new C2896e("ISOSpeedLatitudeyyy", 34868, 4), new C2896e("ISOSpeedLatitudezzz", 34869, 4), new C2896e("ExifVersion", 36864, 2), new C2896e("DateTimeOriginal", 36867, 2), new C2896e("DateTimeDigitized", 36868, 2), new C2896e("OffsetTime", 36880, 2), new C2896e("OffsetTimeOriginal", 36881, 2), new C2896e("OffsetTimeDigitized", 36882, 2), new C2896e("ComponentsConfiguration", 37121, 7), new C2896e("CompressedBitsPerPixel", 37122, 5), new C2896e("ShutterSpeedValue", 37377, 10), new C2896e("ApertureValue", 37378, 5), new C2896e("BrightnessValue", 37379, 10), new C2896e("ExposureBiasValue", 37380, 10), new C2896e("MaxApertureValue", 37381, 5), new C2896e("SubjectDistance", 37382, 5), new C2896e("MeteringMode", 37383, 3), new C2896e("LightSource", 37384, 3), new C2896e("Flash", 37385, 3), new C2896e("FocalLength", 37386, 5), new C2896e("SubjectArea", 37396, 3), new C2896e("MakerNote", 37500, 7), new C2896e("UserComment", 37510, 7), new C2896e("SubSecTime", 37520, 2), new C2896e("SubSecTimeOriginal", 37521, 2), new C2896e("SubSecTimeDigitized", 37522, 2), new C2896e("FlashpixVersion", 40960, 7), new C2896e("ColorSpace", 40961, 3), new C2896e("PixelXDimension", 40962, 3, 4), new C2896e("PixelYDimension", 40963, 3, 4), new C2896e("RelatedSoundFile", 40964, 2), new C2896e("InteroperabilityIFDPointer", 40965, 4), new C2896e("FlashEnergy", 41483, 5), new C2896e("SpatialFrequencyResponse", 41484, 7), new C2896e("FocalPlaneXResolution", 41486, 5), new C2896e("FocalPlaneYResolution", 41487, 5), new C2896e("FocalPlaneResolutionUnit", 41488, 3), new C2896e("SubjectLocation", 41492, 3), new C2896e("ExposureIndex", 41493, 5), new C2896e("SensingMethod", 41495, 3), new C2896e("FileSource", 41728, 7), new C2896e("SceneType", 41729, 7), new C2896e("CFAPattern", 41730, 7), new C2896e("CustomRendered", 41985, 3), new C2896e("ExposureMode", 41986, 3), new C2896e("WhiteBalance", 41987, 3), new C2896e("DigitalZoomRatio", 41988, 5), new C2896e("FocalLengthIn35mmFilm", 41989, 3), new C2896e("SceneCaptureType", 41990, 3), new C2896e("GainControl", 41991, 3), new C2896e("Contrast", 41992, 3), new C2896e("Saturation", 41993, 3), new C2896e("Sharpness", 41994, 3), new C2896e("DeviceSettingDescription", 41995, 7), new C2896e("SubjectDistanceRange", 41996, 3), new C2896e("ImageUniqueID", 42016, 2), new C2896e("CameraOwnerName", 42032, 2), new C2896e("BodySerialNumber", 42033, 2), new C2896e("LensSpecification", 42034, 5), new C2896e("LensMake", 42035, 2), new C2896e("LensModel", 42036, 2), new C2896e("Gamma", 42240, 5), new C2896e("DNGVersion", 50706, 1), new C2896e("DefaultCropSize", 50720, 3, 4)};
        f3915a0 = eVarArr3;
        C2896e[] eVarArr4 = {new C2896e("GPSVersionID", 0, 1), new C2896e("GPSLatitudeRef", 1, 2), new C2896e("GPSLatitude", 2, 5, 10), new C2896e("GPSLongitudeRef", 3, 2), new C2896e("GPSLongitude", 4, 5, 10), new C2896e("GPSAltitudeRef", 5, 1), new C2896e("GPSAltitude", 6, 5), new C2896e("GPSTimeStamp", 7, 5), new C2896e("GPSSatellites", 8, 2), new C2896e("GPSStatus", 9, 2), new C2896e("GPSMeasureMode", 10, 2), new C2896e("GPSDOP", 11, 5), new C2896e("GPSSpeedRef", 12, 2), new C2896e("GPSSpeed", 13, 5), new C2896e("GPSTrackRef", 14, 2), new C2896e("GPSTrack", 15, 5), new C2896e("GPSImgDirectionRef", 16, 2), new C2896e("GPSImgDirection", 17, 5), new C2896e("GPSMapDatum", 18, 2), new C2896e("GPSDestLatitudeRef", 19, 2), new C2896e("GPSDestLatitude", 20, 5), new C2896e("GPSDestLongitudeRef", 21, 2), new C2896e("GPSDestLongitude", 22, 5), new C2896e("GPSDestBearingRef", 23, 2), new C2896e("GPSDestBearing", 24, 5), new C2896e("GPSDestDistanceRef", 25, 2), new C2896e("GPSDestDistance", 26, 5), new C2896e("GPSProcessingMethod", 27, 7), new C2896e("GPSAreaInformation", 28, 7), new C2896e("GPSDateStamp", 29, 2), new C2896e("GPSDifferential", 30, 3), new C2896e("GPSHPositioningError", 31, 5)};
        f3916b0 = eVarArr4;
        C2896e[] eVarArr5 = {new C2896e("InteroperabilityIndex", 1, 2)};
        f3917c0 = eVarArr5;
        C2896e[] eVarArr6 = {new C2896e("NewSubfileType", 254, 4), new C2896e("SubfileType", 255, 4), new C2896e("ThumbnailImageWidth", Spliterator.NONNULL, 3, 4), new C2896e("ThumbnailImageLength", 257, 3, 4), new C2896e("BitsPerSample", 258, 3), new C2896e("Compression", 259, 3), new C2896e("PhotometricInterpretation", 262, 3), new C2896e("ImageDescription", 270, 2), new C2896e("Make", 271, 2), new C2896e("Model", 272, 2), new C2896e("StripOffsets", 273, 3, 4), new C2896e("ThumbnailOrientation", 274, 3), new C2896e("SamplesPerPixel", 277, 3), new C2896e("RowsPerStrip", 278, 3, 4), new C2896e("StripByteCounts", 279, 3, 4), new C2896e("XResolution", 282, 5), new C2896e("YResolution", 283, 5), new C2896e("PlanarConfiguration", 284, 3), new C2896e("ResolutionUnit", 296, 3), new C2896e("TransferFunction", 301, 3), new C2896e("Software", 305, 2), new C2896e("DateTime", 306, 2), new C2896e("Artist", 315, 2), new C2896e("WhitePoint", 318, 5), new C2896e("PrimaryChromaticities", 319, 5), new C2896e("SubIFDPointer", 330, 4), new C2896e("JPEGInterchangeFormat", 513, 4), new C2896e("JPEGInterchangeFormatLength", 514, 4), new C2896e("YCbCrCoefficients", 529, 5), new C2896e("YCbCrSubSampling", 530, 3), new C2896e("YCbCrPositioning", 531, 3), new C2896e("ReferenceBlackWhite", 532, 5), new C2896e("Xmp", TypefaceStyle.BOLD, 1), new C2896e("Copyright", 33432, 2), new C2896e("ExifIFDPointer", 34665, 4), new C2896e("GPSInfoIFDPointer", 34853, 4), new C2896e("DNGVersion", 50706, 1), new C2896e("DefaultCropSize", 50720, 3, 4)};
        f3918d0 = eVarArr6;
        C2896e[] eVarArr7 = {new C2896e("ThumbnailImage", Spliterator.NONNULL, 7), new C2896e("CameraSettingsIFDPointer", 8224, 4), new C2896e("ImageProcessingIFDPointer", 8256, 4)};
        f3920f0 = eVarArr7;
        C2896e[] eVarArr8 = {new C2896e("PreviewImageStart", 257, 4), new C2896e("PreviewImageLength", 258, 4)};
        f3921g0 = eVarArr8;
        C2896e[] eVarArr9 = {new C2896e("AspectFrame", 4371, 3)};
        f3922h0 = eVarArr9;
        C2896e[] eVarArr10 = {new C2896e("ColorSpace", 55, 3)};
        f3923i0 = eVarArr10;
        C2896e[][] eVarArr11 = {eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr6, eVarArr2, eVarArr7, eVarArr8, eVarArr9, eVarArr10};
        f3924j0 = eVarArr11;
        f3926l0 = new HashMap[eVarArr11.length];
        f3927m0 = new HashMap[eVarArr11.length];
        Charset forName = Charset.forName("US-ASCII");
        f3930p0 = forName;
        f3931q0 = "Exif\u0000\u0000".getBytes(forName);
        f3932r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f35698U = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f35699V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C2896e[][] eVarArr12 = f3924j0;
            if (i < eVarArr12.length) {
                f3926l0[i] = new HashMap<>();
                f3927m0[i] = new HashMap<>();
                for (C2896e eVar : eVarArr12[i]) {
                    f3926l0[i].put(Integer.valueOf(eVar.f3978a), eVar);
                    f3927m0[i].put(eVar.f3979b, eVar);
                }
                i++;
            } else {
                HashMap<Integer, Integer> hashMap = f3929o0;
                C2896e[] eVarArr13 = f3925k0;
                hashMap.put(Integer.valueOf(eVarArr13[0].f3978a), 5);
                hashMap.put(Integer.valueOf(eVarArr13[1].f3978a), 1);
                hashMap.put(Integer.valueOf(eVarArr13[2].f3978a), 2);
                hashMap.put(Integer.valueOf(eVarArr13[3].f3978a), 3);
                hashMap.put(Integer.valueOf(eVarArr13[4].f3978a), 7);
                hashMap.put(Integer.valueOf(eVarArr13[5].f3978a), 8);
                f3933s0 = Pattern.compile(".*[1-9].*");
                f3934t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f3935u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f3937v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
        }
    }

    public C2892a(File file) {
        C2896e[][] eVarArr = f3924j0;
        this.f3947f = new HashMap[eVarArr.length];
        this.f3948g = new HashSet(eVarArr.length);
        this.f3949h = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            m36359A(file.getAbsolutePath());
            return;
        }
        throw new NullPointerException("file cannot be null");
    }

    /* renamed from: A */
    private void m36359A(String str) {
        Throwable th2;
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f3944c = null;
            this.f3942a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (m36351I(fileInputStream2.getFD())) {
                        this.f3943b = fileInputStream2.getFD();
                    } else {
                        this.f3943b = null;
                    }
                    m36346N(fileInputStream2);
                    C2899b.m36269c(fileInputStream2);
                } catch (Throwable th3) {
                    th2 = th3;
                    fileInputStream = fileInputStream2;
                    C2899b.m36269c(fileInputStream);
                    throw th2;
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    /* renamed from: B */
    private static boolean m36358B(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f3931q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = f3931q0;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: C */
    private boolean m36357C(byte[] bArr) {
        Throwable th2;
        Exception e;
        C2893b bVar;
        long readInt;
        byte[] bArr2;
        long j;
        C2893b bVar2 = null;
        try {
            try {
                bVar = new C2893b(bArr);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e3) {
            e = e3;
            bVar2 = bVar;
            if (f3936v) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th4) {
            th2 = th4;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th2;
        }
        if (!Arrays.equals(bArr2, f35680C)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j2 = readInt - j;
        if (j2 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z = false;
        boolean z2 = false;
        for (long j3 = 0; j3 < j2 / 4; j3++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j3 != 1) {
                if (Arrays.equals(bArr3, f35681D)) {
                    z = true;
                } else if (Arrays.equals(bArr3, f35682E)) {
                    z2 = true;
                }
                if (z && z2) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    /* renamed from: D */
    private static boolean m36356D(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f35679B;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: E */
    private boolean m36355E(byte[] bArr) {
        Throwable th2;
        boolean z = false;
        C2893b bVar = null;
        try {
            C2893b bVar2 = new C2893b(bArr);
            try {
                ByteOrder Q = m36343Q(bVar2);
                this.f3949h = Q;
                bVar2.m36298h(Q);
                short readShort = bVar2.readShort();
                if (readShort == 20306 || readShort == 21330) {
                    z = true;
                }
                bVar2.close();
                return z;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th2;
            }
        } catch (Exception unused2) {
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    /* renamed from: F */
    private boolean m36354F(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f35685H;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: G */
    private boolean m36353G(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    private boolean m36352H(byte[] bArr) {
        Throwable th2;
        boolean z = false;
        C2893b bVar = null;
        try {
            C2893b bVar2 = new C2893b(bArr);
            try {
                ByteOrder Q = m36343Q(bVar2);
                this.f3949h = Q;
                bVar2.m36298h(Q);
                if (bVar2.readShort() == 85) {
                    z = true;
                }
                bVar2.close();
                return z;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th3) {
                th2 = th3;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th2;
            }
        } catch (Exception unused2) {
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    /* renamed from: I */
    private static boolean m36351I(FileDescriptor fileDescriptor) {
        try {
            C2899b.C2900a.m36262c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f3936v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    /* renamed from: J */
    private boolean m36350J(HashMap hashMap) {
        C2895d dVar;
        int m;
        C2895d dVar2 = (C2895d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.m36276o(this.f3949h);
            int[] iArr2 = f3940y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f3945d == 3 && (dVar = (C2895d) hashMap.get("PhotometricInterpretation")) != null && (((m = dVar.m36278m(this.f3949h)) == 1 && Arrays.equals(iArr, f35678A)) || (m == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f3936v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    /* renamed from: K */
    private static boolean m36349K(int i) {
        return i == 4 || i == 13 || i == 14 || i == 3 || i == 0;
    }

    /* renamed from: L */
    private boolean m36348L(HashMap hashMap) {
        C2895d dVar = (C2895d) hashMap.get("ImageLength");
        C2895d dVar2 = (C2895d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        int m = dVar.m36278m(this.f3949h);
        int m2 = dVar2.m36278m(this.f3949h);
        if (m > 512 || m2 > 512) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    private boolean m36347M(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f35689L;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = f35690M;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f35689L.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else if (bArr[i] != bArr2[i]) {
                return false;
            } else {
                i++;
            }
        }
    }

    /* renamed from: N */
    private void m36346N(InputStream inputStream) {
        boolean z;
        if (inputStream != null) {
            for (int i = 0; i < f3924j0.length; i++) {
                try {
                    try {
                        this.f3947f[i] = new HashMap<>();
                    } finally {
                        m36333a();
                        if (f3936v) {
                            m36344P();
                        }
                    }
                } catch (IOException | UnsupportedOperationException e) {
                    boolean z2 = f3936v;
                    if (z2) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                    m36333a();
                    if (!z2) {
                        return;
                    }
                }
            }
            if (!this.f3946e) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
                this.f3945d = m36313n(bufferedInputStream);
                inputStream = bufferedInputStream;
            }
            if (m36328c0(this.f3945d)) {
                C2898g gVar = new C2898g(inputStream);
                if (this.f3946e) {
                    m36307t(gVar);
                } else {
                    int i2 = this.f3945d;
                    if (i2 == 12) {
                        m36316k(gVar);
                    } else if (i2 == 7) {
                        m36312o(gVar);
                    } else if (i2 == 10) {
                        m36308s(gVar);
                    } else {
                        m36309r(gVar);
                    }
                }
                gVar.m36272l(this.f3957p);
                m36330b0(gVar);
            } else {
                C2893b bVar = new C2893b(inputStream);
                int i3 = this.f3945d;
                if (i3 == 4) {
                    m36315l(bVar, 0, 0);
                } else if (i3 == 13) {
                    m36311p(bVar);
                } else if (i3 == 9) {
                    m36310q(bVar);
                } else if (i3 == 14) {
                    m36304w(bVar);
                }
            }
            if (!z) {
                return;
            }
            return;
        }
        throw new NullPointerException("inputstream shouldn't be null");
    }

    /* renamed from: O */
    private void m36345O(C2893b bVar) {
        ByteOrder Q = m36343Q(bVar);
        this.f3949h = Q;
        bVar.m36298h(Q);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i = this.f3945d;
        if (i == 7 || i == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i2 = readInt - 8;
                if (i2 > 0) {
                    bVar.m36297i(i2);
                    return;
                }
                return;
            }
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    /* renamed from: P */
    private void m36344P() {
        for (int i = 0; i < this.f3947f.length; i++) {
            Log.d("ExifInterface", "The size of tag group[" + i + "]: " + this.f3947f[i].size());
            for (Map.Entry<String, C2895d> entry : this.f3947f[i].entrySet()) {
                C2895d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m36277n(this.f3949h) + "'");
            }
        }
    }

    /* renamed from: Q */
    private ByteOrder m36343Q(C2893b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f3936v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f3936v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    /* renamed from: R */
    private void m36342R(byte[] bArr, int i) {
        C2898g gVar = new C2898g(bArr);
        m36345O(gVar);
        m36341S(gVar, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0282  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m36341S(androidx.exifinterface.media.C2892a.C2898g r30, int r31) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C2892a.m36341S(androidx.exifinterface.media.a$g, int):void");
    }

    /* renamed from: T */
    private void m36340T(String str) {
        for (int i = 0; i < f3924j0.length; i++) {
            this.f3947f[i].remove(str);
        }
    }

    /* renamed from: U */
    private void m36339U(int i, String str, String str2) {
        if (!this.f3947f[i].isEmpty() && this.f3947f[i].get(str) != null) {
            HashMap<String, C2895d> hashMap = this.f3947f[i];
            hashMap.put(str2, hashMap.get(str));
            this.f3947f[i].remove(str);
        }
    }

    /* renamed from: V */
    private void m36338V(C2898g gVar, int i) {
        C2895d dVar = this.f3947f[i].get("ImageLength");
        C2895d dVar2 = this.f3947f[i].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            C2895d dVar3 = this.f3947f[i].get("JPEGInterchangeFormat");
            C2895d dVar4 = this.f3947f[i].get("JPEGInterchangeFormatLength");
            if (dVar3 != null && dVar4 != null) {
                int m = dVar3.m36278m(this.f3949h);
                int m2 = dVar3.m36278m(this.f3949h);
                gVar.m36272l(m);
                byte[] bArr = new byte[m2];
                gVar.read(bArr);
                m36315l(new C2893b(bArr), m, i);
            }
        }
    }

    /* renamed from: X */
    private void m36336X(InputStream inputStream, OutputStream outputStream) {
        C2895d dVar;
        if (f3936v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        C2893b bVar = new C2893b(inputStream);
        C2894c cVar = new C2894c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            cVar.m36295g(-1);
            if (bVar.readByte() == -40) {
                cVar.m36295g(-40);
                if (m36323f("Xmp") == null || !this.f3962u) {
                    dVar = null;
                } else {
                    dVar = this.f3947f[0].remove("Xmp");
                }
                cVar.m36295g(-1);
                cVar.m36295g(-31);
                m36320g0(cVar);
                if (dVar != null) {
                    this.f3947f[0].put("Xmp", dVar);
                }
                byte[] bArr = new byte[4096];
                while (bVar.readByte() == -1) {
                    byte readByte = bVar.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.m36295g(-1);
                        cVar.m36295g(readByte);
                        C2899b.m36267e(bVar, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.m36295g(-1);
                        cVar.m36295g(readByte);
                        int readUnsignedShort = bVar.readUnsignedShort();
                        cVar.m36291n(readUnsignedShort);
                        int i = readUnsignedShort - 2;
                        if (i >= 0) {
                            while (i > 0) {
                                int read = bVar.read(bArr, 0, Math.min(i, 4096));
                                if (read >= 0) {
                                    cVar.write(bArr, 0, read);
                                    i -= read;
                                }
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (bVar.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, f3931q0)) {
                                    bVar.m36297i(readUnsignedShort2 - 6);
                                }
                            }
                            cVar.m36295g(-1);
                            cVar.m36295g(readByte);
                            cVar.m36291n(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                cVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = bVar.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                                if (read2 >= 0) {
                                    cVar.write(bArr, 0, read2);
                                    readUnsignedShort2 -= read2;
                                }
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    /* renamed from: Y */
    private void m36335Y(InputStream inputStream, OutputStream outputStream) {
        Throwable th2;
        ByteArrayOutputStream byteArrayOutputStream;
        if (f3936v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        C2893b bVar = new C2893b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C2894c cVar = new C2894c(outputStream, byteOrder);
        byte[] bArr = f35685H;
        C2899b.m36266f(bVar, cVar, bArr.length);
        int i = this.f3957p;
        if (i == 0) {
            int readInt = bVar.readInt();
            cVar.m36294h(readInt);
            C2899b.m36266f(bVar, cVar, readInt + 4 + 4);
        } else {
            C2899b.m36266f(bVar, cVar, ((i - bArr.length) - 4) - 4);
            bVar.m36297i(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            C2894c cVar2 = new C2894c(byteArrayOutputStream, byteOrder);
            m36320g0(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f3972k).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.m36294h((int) crc32.getValue());
            C2899b.m36269c(byteArrayOutputStream);
            C2899b.m36267e(bVar, cVar);
        } catch (Throwable th4) {
            th2 = th4;
            byteArrayOutputStream2 = byteArrayOutputStream;
            C2899b.m36269c(byteArrayOutputStream2);
            throw th2;
        }
    }

    /* renamed from: Z */
    private void m36334Z(InputStream inputStream, OutputStream outputStream) {
        Throwable th2;
        Exception e;
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (f3936v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C2893b bVar = new C2893b(inputStream, byteOrder);
        C2894c cVar = new C2894c(outputStream, byteOrder);
        byte[] bArr = f35689L;
        C2899b.m36266f(bVar, cVar, bArr.length);
        byte[] bArr2 = f35690M;
        bVar.m36297i(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            C2894c cVar2 = new C2894c(byteArrayOutputStream, byteOrder);
            int i7 = this.f3957p;
            if (i7 != 0) {
                C2899b.m36266f(bVar, cVar2, ((i7 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                bVar.m36297i(4);
                bVar.m36297i(bVar.readInt());
                m36320g0(cVar2);
            } else {
                byte[] bArr3 = new byte[4];
                if (bVar.read(bArr3) == 4) {
                    byte[] bArr4 = f35693P;
                    boolean z = false;
                    if (Arrays.equals(bArr3, bArr4)) {
                        int readInt = bVar.readInt();
                        if (readInt % 2 == 1) {
                            i6 = readInt + 1;
                        } else {
                            i6 = readInt;
                        }
                        byte[] bArr5 = new byte[i6];
                        bVar.read(bArr5);
                        byte b = (byte) (8 | bArr5[0]);
                        bArr5[0] = b;
                        if (((b >> 1) & 1) == 1) {
                            z = true;
                        }
                        cVar2.write(bArr4);
                        cVar2.m36294h(readInt);
                        cVar2.write(bArr5);
                        if (z) {
                            m36329c(bVar, cVar2, f35696S, null);
                            while (true) {
                                byte[] bArr6 = new byte[4];
                                inputStream.read(bArr6);
                                if (!Arrays.equals(bArr6, f35697T)) {
                                    break;
                                }
                                m36327d(bVar, cVar2, bArr6);
                            }
                            m36320g0(cVar2);
                        } else {
                            m36329c(bVar, cVar2, f35695R, f35694Q);
                            m36320g0(cVar2);
                        }
                    } else {
                        byte[] bArr7 = f35695R;
                        if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f35694Q)) {
                            int readInt2 = bVar.readInt();
                            if (readInt2 % 2 == 1) {
                                i = readInt2 + 1;
                            } else {
                                i = readInt2;
                            }
                            byte[] bArr8 = new byte[3];
                            if (Arrays.equals(bArr3, bArr7)) {
                                bVar.read(bArr8);
                                byte[] bArr9 = new byte[3];
                                if (bVar.read(bArr9) != 3 || !Arrays.equals(f35692O, bArr9)) {
                                    throw new IOException("Encountered error while checking VP8 signature");
                                }
                                i5 = bVar.readInt();
                                i4 = (i5 << 18) >> 18;
                                i3 = (i5 << 2) >> 18;
                                i -= 10;
                                i2 = 0;
                            } else if (!Arrays.equals(bArr3, f35694Q)) {
                                i5 = 0;
                                i4 = 0;
                                i3 = 0;
                                i2 = 0;
                            } else if (bVar.readByte() == 47) {
                                i5 = bVar.readInt();
                                i2 = i5 & 8;
                                i -= 5;
                                i3 = ((i5 << 4) >> 18) + 1;
                                i4 = ((i5 << 18) >> 18) + 1;
                            } else {
                                throw new IOException("Encountered error while checking VP8L signature");
                            }
                            cVar2.write(bArr4);
                            cVar2.m36294h(10);
                            byte[] bArr10 = new byte[10];
                            byte b2 = (byte) (bArr10[0] | 8);
                            bArr10[0] = b2;
                            bArr10[0] = (byte) (b2 | (i2 << 4));
                            int i8 = i4 - 1;
                            int i9 = i3 - 1;
                            bArr10[4] = (byte) i8;
                            bArr10[5] = (byte) (i8 >> 8);
                            bArr10[6] = (byte) (i8 >> 16);
                            bArr10[7] = (byte) i9;
                            bArr10[8] = (byte) (i9 >> 8);
                            bArr10[9] = (byte) (i9 >> 16);
                            cVar2.write(bArr10);
                            cVar2.write(bArr3);
                            cVar2.m36294h(readInt2);
                            if (Arrays.equals(bArr3, bArr7)) {
                                cVar2.write(bArr8);
                                cVar2.write(f35692O);
                                cVar2.m36294h(i5);
                            } else if (Arrays.equals(bArr3, f35694Q)) {
                                cVar2.write(47);
                                cVar2.m36294h(i5);
                            }
                            C2899b.m36266f(bVar, cVar2, i);
                            m36320g0(cVar2);
                        }
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
            }
            C2899b.m36267e(bVar, cVar2);
            int size = byteArrayOutputStream.size();
            byte[] bArr11 = f35690M;
            cVar.m36294h(size + bArr11.length);
            cVar.write(bArr11);
            byteArrayOutputStream.writeTo(cVar);
            C2899b.m36269c(byteArrayOutputStream);
        } catch (Exception e3) {
            e = e3;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th4) {
            th2 = th4;
            byteArrayOutputStream2 = byteArrayOutputStream;
            C2899b.m36269c(byteArrayOutputStream2);
            throw th2;
        }
    }

    /* renamed from: a */
    private void m36333a() {
        String f = m36323f("DateTimeOriginal");
        if (f != null && m36323f("DateTime") == null) {
            this.f3947f[0].put("DateTime", C2895d.m36286e(f));
        }
        if (m36323f("ImageWidth") == null) {
            this.f3947f[0].put("ImageWidth", C2895d.m36285f(0L, this.f3949h));
        }
        if (m36323f("ImageLength") == null) {
            this.f3947f[0].put("ImageLength", C2895d.m36285f(0L, this.f3949h));
        }
        if (m36323f("Orientation") == null) {
            this.f3947f[0].put("Orientation", C2895d.m36285f(0L, this.f3949h));
        }
        if (m36323f("LightSource") == null) {
            this.f3947f[1].put("LightSource", C2895d.m36285f(0L, this.f3949h));
        }
    }

    /* renamed from: b */
    private static double m36331b(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return parseDouble;
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b0 */
    private void m36330b0(C2893b bVar) {
        HashMap<String, C2895d> hashMap = this.f3947f[4];
        C2895d dVar = hashMap.get("Compression");
        if (dVar != null) {
            int m = dVar.m36278m(this.f3949h);
            this.f3956o = m;
            if (m != 1) {
                if (m == 6) {
                    m36302y(bVar, hashMap);
                    return;
                } else if (m != 7) {
                    return;
                }
            }
            if (m36350J(hashMap)) {
                m36301z(bVar, hashMap);
                return;
            }
            return;
        }
        this.f3956o = 6;
        m36302y(bVar, hashMap);
    }

    /* renamed from: c */
    private void m36329c(C2893b bVar, C2894c cVar, byte[] bArr, byte[] bArr2) {
        Charset charset;
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                sb2.append(new String(bArr, f3930p0));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
            m36327d(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* renamed from: c0 */
    private static boolean m36328c0(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    /* renamed from: d */
    private void m36327d(C2893b bVar, C2894c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.m36294h(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        C2899b.m36266f(bVar, cVar, readInt);
    }

    /* renamed from: d0 */
    private void m36326d0(int i, int i2) {
        if (!this.f3947f[i].isEmpty() && !this.f3947f[i2].isEmpty()) {
            C2895d dVar = this.f3947f[i].get("ImageLength");
            C2895d dVar2 = this.f3947f[i].get("ImageWidth");
            C2895d dVar3 = this.f3947f[i2].get("ImageLength");
            C2895d dVar4 = this.f3947f[i2].get("ImageWidth");
            if (dVar == null || dVar2 == null) {
                if (f3936v) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (dVar3 != null && dVar4 != null) {
                int m = dVar.m36278m(this.f3949h);
                int m2 = dVar2.m36278m(this.f3949h);
                int m3 = dVar3.m36278m(this.f3949h);
                int m4 = dVar4.m36278m(this.f3949h);
                if (m < m3 && m2 < m4) {
                    HashMap<String, C2895d>[] hashMapArr = this.f3947f;
                    HashMap<String, C2895d> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            } else if (f3936v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f3936v) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    /* renamed from: e0 */
    private void m36324e0(C2898g gVar, int i) {
        C2895d dVar;
        C2895d dVar2;
        C2895d dVar3 = this.f3947f[i].get("DefaultCropSize");
        C2895d dVar4 = this.f3947f[i].get("SensorTopBorder");
        C2895d dVar5 = this.f3947f[i].get("SensorLeftBorder");
        C2895d dVar6 = this.f3947f[i].get("SensorBottomBorder");
        C2895d dVar7 = this.f3947f[i].get("SensorRightBorder");
        if (dVar3 != null) {
            if (dVar3.f3974a == 5) {
                C2897f[] fVarArr = (C2897f[]) dVar3.m36276o(this.f3949h);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                }
                dVar2 = C2895d.m36283h(fVarArr[0], this.f3949h);
                dVar = C2895d.m36283h(fVarArr[1], this.f3949h);
            } else {
                int[] iArr = (int[]) dVar3.m36276o(this.f3949h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVar2 = C2895d.m36281j(iArr[0], this.f3949h);
                dVar = C2895d.m36281j(iArr[1], this.f3949h);
            }
            this.f3947f[i].put("ImageWidth", dVar2);
            this.f3947f[i].put("ImageLength", dVar);
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            m36338V(gVar, i);
        } else {
            int m = dVar4.m36278m(this.f3949h);
            int m2 = dVar6.m36278m(this.f3949h);
            int m3 = dVar7.m36278m(this.f3949h);
            int m4 = dVar5.m36278m(this.f3949h);
            if (m2 > m && m3 > m4) {
                C2895d j = C2895d.m36281j(m2 - m, this.f3949h);
                C2895d j2 = C2895d.m36281j(m3 - m4, this.f3949h);
                this.f3947f[i].put("ImageLength", j);
                this.f3947f[i].put("ImageWidth", j2);
            }
        }
    }

    /* renamed from: f0 */
    private void m36322f0() {
        m36326d0(0, 5);
        m36326d0(0, 4);
        m36326d0(5, 4);
        C2895d dVar = this.f3947f[1].get("PixelXDimension");
        C2895d dVar2 = this.f3947f[1].get("PixelYDimension");
        if (!(dVar == null || dVar2 == null)) {
            this.f3947f[0].put("ImageWidth", dVar);
            this.f3947f[0].put("ImageLength", dVar2);
        }
        if (this.f3947f[4].isEmpty() && m36348L(this.f3947f[5])) {
            HashMap<String, C2895d>[] hashMapArr = this.f3947f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m36348L(this.f3947f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m36339U(0, "ThumbnailOrientation", "Orientation");
        m36339U(0, "ThumbnailImageLength", "ImageLength");
        m36339U(0, "ThumbnailImageWidth", "ImageWidth");
        m36339U(5, "ThumbnailOrientation", "Orientation");
        m36339U(5, "ThumbnailImageLength", "ImageLength");
        m36339U(5, "ThumbnailImageWidth", "ImageWidth");
        m36339U(4, "Orientation", "ThumbnailOrientation");
        m36339U(4, "ImageLength", "ThumbnailImageLength");
        m36339U(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: g0 */
    private int m36320g0(C2894c cVar) {
        short s;
        C2896e[][] eVarArr = f3924j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (C2896e eVar : f3925k0) {
            m36340T(eVar.f3979b);
        }
        if (this.f3950i) {
            if (this.f3951j) {
                m36340T("StripOffsets");
                m36340T("StripByteCounts");
            } else {
                m36340T("JPEGInterchangeFormat");
                m36340T("JPEGInterchangeFormatLength");
            }
        }
        for (int i = 0; i < f3924j0.length; i++) {
            for (Object obj : this.f3947f[i].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f3947f[i].remove(entry.getKey());
                }
            }
        }
        if (!this.f3947f[1].isEmpty()) {
            this.f3947f[0].put(f3925k0[1].f3979b, C2895d.m36285f(0L, this.f3949h));
        }
        if (!this.f3947f[2].isEmpty()) {
            this.f3947f[0].put(f3925k0[2].f3979b, C2895d.m36285f(0L, this.f3949h));
        }
        if (!this.f3947f[3].isEmpty()) {
            this.f3947f[1].put(f3925k0[3].f3979b, C2895d.m36285f(0L, this.f3949h));
        }
        if (this.f3950i) {
            if (this.f3951j) {
                this.f3947f[4].put("StripOffsets", C2895d.m36281j(0, this.f3949h));
                this.f3947f[4].put("StripByteCounts", C2895d.m36281j(this.f3954m, this.f3949h));
            } else {
                this.f3947f[4].put("JPEGInterchangeFormat", C2895d.m36285f(0L, this.f3949h));
                this.f3947f[4].put("JPEGInterchangeFormatLength", C2895d.m36285f(this.f3954m, this.f3949h));
            }
        }
        for (int i2 = 0; i2 < f3924j0.length; i2++) {
            int i3 = 0;
            for (Map.Entry<String, C2895d> entry2 : this.f3947f[i2].entrySet()) {
                int p = entry2.getValue().m36275p();
                if (p > 4) {
                    i3 += p;
                }
            }
            iArr2[i2] = iArr2[i2] + i3;
        }
        int i4 = 8;
        for (int i5 = 0; i5 < f3924j0.length; i5++) {
            if (!this.f3947f[i5].isEmpty()) {
                iArr[i5] = i4;
                i4 += (this.f3947f[i5].size() * 12) + 2 + 4 + iArr2[i5];
            }
        }
        if (this.f3950i) {
            if (this.f3951j) {
                this.f3947f[4].put("StripOffsets", C2895d.m36281j(i4, this.f3949h));
            } else {
                this.f3947f[4].put("JPEGInterchangeFormat", C2895d.m36285f(i4, this.f3949h));
            }
            this.f3953l = i4;
            i4 += this.f3954m;
        }
        if (this.f3945d == 4) {
            i4 += 8;
        }
        if (f3936v) {
            for (int i6 = 0; i6 < f3924j0.length; i6++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i6), Integer.valueOf(iArr[i6]), Integer.valueOf(this.f3947f[i6].size()), Integer.valueOf(iArr2[i6]), Integer.valueOf(i4)));
            }
        }
        if (!this.f3947f[1].isEmpty()) {
            this.f3947f[0].put(f3925k0[1].f3979b, C2895d.m36285f(iArr[1], this.f3949h));
        }
        if (!this.f3947f[2].isEmpty()) {
            this.f3947f[0].put(f3925k0[2].f3979b, C2895d.m36285f(iArr[2], this.f3949h));
        }
        if (!this.f3947f[3].isEmpty()) {
            this.f3947f[1].put(f3925k0[3].f3979b, C2895d.m36285f(iArr[3], this.f3949h));
        }
        int i7 = this.f3945d;
        if (i7 == 4) {
            cVar.m36291n(i4);
            cVar.write(f3931q0);
        } else if (i7 == 13) {
            cVar.m36294h(i4);
            cVar.write(f35686I);
        } else if (i7 == 14) {
            cVar.write(f35691N);
            cVar.m36294h(i4);
        }
        if (this.f3949h == ByteOrder.BIG_ENDIAN) {
            s = 19789;
        } else {
            s = 18761;
        }
        cVar.m36293i(s);
        cVar.m36296b(this.f3949h);
        cVar.m36291n(42);
        cVar.m36292l(8L);
        for (int i8 = 0; i8 < f3924j0.length; i8++) {
            if (!this.f3947f[i8].isEmpty()) {
                cVar.m36291n(this.f3947f[i8].size());
                int size = iArr[i8] + 2 + (this.f3947f[i8].size() * 12) + 4;
                for (Map.Entry<String, C2895d> entry3 : this.f3947f[i8].entrySet()) {
                    int i9 = f3927m0[i8].get(entry3.getKey()).f3978a;
                    C2895d value = entry3.getValue();
                    int p2 = value.m36275p();
                    cVar.m36291n(i9);
                    cVar.m36291n(value.f3974a);
                    cVar.m36294h(value.f3975b);
                    if (p2 > 4) {
                        cVar.m36292l(size);
                        size += p2;
                    } else {
                        cVar.write(value.f3977d);
                        if (p2 < 4) {
                            while (p2 < 4) {
                                cVar.m36295g(0);
                                p2++;
                            }
                        }
                    }
                }
                if (i8 != 0 || this.f3947f[4].isEmpty()) {
                    cVar.m36292l(0L);
                } else {
                    cVar.m36292l(iArr[4]);
                }
                for (Map.Entry<String, C2895d> entry4 : this.f3947f[i8].entrySet()) {
                    byte[] bArr = entry4.getValue().f3977d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f3950i) {
            cVar.write(m36305v());
        }
        if (this.f3945d == 14 && i4 % 2 == 1) {
            cVar.m36295g(0);
        }
        cVar.m36296b(ByteOrder.BIG_ENDIAN);
        return i4;
    }

    /* renamed from: j */
    private C2895d m36317j(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f3936v) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i = 0; i < f3924j0.length; i++) {
                C2895d dVar = this.f3947f[i].get(str);
                if (dVar != null) {
                    return dVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: k */
    private void m36316k(C2898g gVar) {
        String str;
        String str2;
        String str3;
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                try {
                    C2899b.C0055b.m36261a(mediaMetadataRetriever, new C0054a(gVar));
                    String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                    String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                    String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                    String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                    if ("yes".equals(extractMetadata3)) {
                        str3 = mediaMetadataRetriever.extractMetadata(29);
                        str2 = mediaMetadataRetriever.extractMetadata(30);
                        str = mediaMetadataRetriever.extractMetadata(31);
                    } else if ("yes".equals(extractMetadata4)) {
                        str3 = mediaMetadataRetriever.extractMetadata(18);
                        str2 = mediaMetadataRetriever.extractMetadata(19);
                        str = mediaMetadataRetriever.extractMetadata(24);
                    } else {
                        str3 = null;
                        str2 = null;
                        str = null;
                    }
                    if (str3 != null) {
                        this.f3947f[0].put("ImageWidth", C2895d.m36281j(Integer.parseInt(str3), this.f3949h));
                    }
                    if (str2 != null) {
                        this.f3947f[0].put("ImageLength", C2895d.m36281j(Integer.parseInt(str2), this.f3949h));
                    }
                    if (str != null) {
                        int parseInt = Integer.parseInt(str);
                        if (parseInt == 90) {
                            i = 6;
                        } else if (parseInt == 180) {
                            i = 3;
                        } else if (parseInt != 270) {
                            i = 1;
                        } else {
                            i = 8;
                        }
                        this.f3947f[0].put("Orientation", C2895d.m36281j(i, this.f3949h));
                    }
                    if (!(extractMetadata == null || extractMetadata2 == null)) {
                        int parseInt2 = Integer.parseInt(extractMetadata);
                        int parseInt3 = Integer.parseInt(extractMetadata2);
                        if (parseInt3 > 6) {
                            gVar.m36272l(parseInt2);
                            byte[] bArr = new byte[6];
                            if (gVar.read(bArr) == 6) {
                                int i2 = parseInt2 + 6;
                                int i3 = parseInt3 - 6;
                                if (Arrays.equals(bArr, f3931q0)) {
                                    byte[] bArr2 = new byte[i3];
                                    if (gVar.read(bArr2) == i3) {
                                        this.f3957p = i2;
                                        m36342R(bArr2, 0);
                                    } else {
                                        throw new IOException("Can't read exif");
                                    }
                                } else {
                                    throw new IOException("Invalid identifier");
                                }
                            } else {
                                throw new IOException("Can't read identifier");
                            }
                        } else {
                            throw new IOException("Invalid exif length");
                        }
                    }
                    if (f3936v) {
                        Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str2 + ", rotation " + str);
                    }
                } catch (RuntimeException unused) {
                    throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
                }
            } finally {
                mediaMetadataRetriever.release();
            }
        } else {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x019a, code lost:
        r22.m36298h(r21.f3949h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x019f, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184 A[LOOP:0: B:10:0x0038->B:62:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018e A[SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m36315l(androidx.exifinterface.media.C2892a.C2893b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C2892a.m36315l(androidx.exifinterface.media.a$b, int, int):void");
    }

    /* renamed from: n */
    private int m36313n(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m36356D(bArr)) {
            return 4;
        }
        if (m36353G(bArr)) {
            return 9;
        }
        if (m36357C(bArr)) {
            return 12;
        }
        if (m36355E(bArr)) {
            return 7;
        }
        if (m36352H(bArr)) {
            return 10;
        }
        if (m36354F(bArr)) {
            return 13;
        }
        if (m36347M(bArr)) {
            return 14;
        }
        return 0;
    }

    /* renamed from: o */
    private void m36312o(C2898g gVar) {
        int i;
        int i2;
        m36309r(gVar);
        C2895d dVar = this.f3947f[1].get("MakerNote");
        if (dVar != null) {
            C2898g gVar2 = new C2898g(dVar.f3977d);
            gVar2.m36298h(this.f3949h);
            byte[] bArr = f35683F;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.m36272l(0L);
            byte[] bArr3 = f35684G;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.m36272l(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.m36272l(12L);
            }
            m36341S(gVar2, 6);
            C2895d dVar2 = this.f3947f[7].get("PreviewImageStart");
            C2895d dVar3 = this.f3947f[7].get("PreviewImageLength");
            if (!(dVar2 == null || dVar3 == null)) {
                this.f3947f[5].put("JPEGInterchangeFormat", dVar2);
                this.f3947f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            C2895d dVar4 = this.f3947f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.m36276o(this.f3949h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 > i4 && (i = iArr[3]) > (i2 = iArr[1])) {
                    int i5 = (i3 - i4) + 1;
                    int i6 = (i - i2) + 1;
                    if (i5 < i6) {
                        int i7 = i5 + i6;
                        i6 = i7 - i6;
                        i5 = i7 - i6;
                    }
                    C2895d j = C2895d.m36281j(i5, this.f3949h);
                    C2895d j2 = C2895d.m36281j(i6, this.f3949h);
                    this.f3947f[0].put("ImageWidth", j);
                    this.f3947f[0].put("ImageLength", j2);
                }
            }
        }
    }

    /* renamed from: p */
    private void m36311p(C2893b bVar) {
        if (f3936v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.m36298h(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f35685H;
        bVar.m36297i(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int i2 = i + 4;
                    if (i2 == 16 && !Arrays.equals(bArr2, f35687J)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                    if (!Arrays.equals(bArr2, f35688K)) {
                        if (Arrays.equals(bArr2, f35686I)) {
                            byte[] bArr3 = new byte[readInt];
                            if (bVar.read(bArr3) == readInt) {
                                int readInt2 = bVar.readInt();
                                CRC32 crc32 = new CRC32();
                                crc32.update(bArr2);
                                crc32.update(bArr3);
                                if (((int) crc32.getValue()) == readInt2) {
                                    this.f3957p = i2;
                                    m36342R(bArr3, 0);
                                    m36322f0();
                                    m36330b0(new C2893b(bArr3));
                                    return;
                                }
                                throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                            }
                            throw new IOException("Failed to read given length for given PNG chunk type: " + C2899b.m36271a(bArr2));
                        }
                        int i3 = readInt + 4;
                        bVar.m36297i(i3);
                        length = i2 + i3;
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: q */
    private void m36310q(C2893b bVar) {
        boolean z = f3936v;
        if (z) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.m36297i(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.m36297i(i - bVar.m36300b());
        bVar.read(bArr4);
        m36315l(new C2893b(bArr4), i, 5);
        bVar.m36297i(i3 - bVar.m36300b());
        bVar.m36298h(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f3919e0.f3978a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                C2895d j = C2895d.m36281j(readShort, this.f3949h);
                C2895d j2 = C2895d.m36281j(readShort2, this.f3949h);
                this.f3947f[0].put("ImageLength", j);
                this.f3947f[0].put("ImageWidth", j2);
                if (f3936v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.m36297i(readUnsignedShort2);
        }
    }

    /* renamed from: r */
    private void m36309r(C2898g gVar) {
        C2895d dVar;
        m36345O(gVar);
        m36341S(gVar, 0);
        m36324e0(gVar, 0);
        m36324e0(gVar, 5);
        m36324e0(gVar, 4);
        m36322f0();
        if (this.f3945d == 8 && (dVar = this.f3947f[1].get("MakerNote")) != null) {
            C2898g gVar2 = new C2898g(dVar.f3977d);
            gVar2.m36298h(this.f3949h);
            gVar2.m36297i(6);
            m36341S(gVar2, 9);
            C2895d dVar2 = this.f3947f[9].get("ColorSpace");
            if (dVar2 != null) {
                this.f3947f[1].put("ColorSpace", dVar2);
            }
        }
    }

    /* renamed from: s */
    private void m36308s(C2898g gVar) {
        if (f3936v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m36309r(gVar);
        C2895d dVar = this.f3947f[0].get("JpgFromRaw");
        if (dVar != null) {
            m36315l(new C2893b(dVar.f3977d), (int) dVar.f3976c, 5);
        }
        C2895d dVar2 = this.f3947f[0].get("ISO");
        C2895d dVar3 = this.f3947f[1].get("PhotographicSensitivity");
        if (dVar2 != null && dVar3 == null) {
            this.f3947f[1].put("PhotographicSensitivity", dVar2);
        }
    }

    /* renamed from: t */
    private void m36307t(C2898g gVar) {
        byte[] bArr = f3931q0;
        gVar.m36297i(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f3957p = bArr.length;
        m36342R(bArr2, 0);
    }

    /* renamed from: w */
    private void m36304w(C2893b bVar) {
        if (f3936v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.m36298h(ByteOrder.LITTLE_ENDIAN);
        bVar.m36297i(f35689L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f35690M;
        bVar.m36297i(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) == 4) {
                    int readInt2 = bVar.readInt();
                    int i = length + 4 + 4;
                    if (Arrays.equals(f35691N, bArr2)) {
                        byte[] bArr3 = new byte[readInt2];
                        if (bVar.read(bArr3) == readInt2) {
                            this.f3957p = i;
                            m36342R(bArr3, 0);
                            m36330b0(new C2893b(bArr3));
                            return;
                        }
                        throw new IOException("Failed to read given length for given PNG chunk type: " + C2899b.m36271a(bArr2));
                    }
                    if (readInt2 % 2 == 1) {
                        readInt2++;
                    }
                    length = i + readInt2;
                    if (length != readInt) {
                        if (length <= readInt) {
                            bVar.m36297i(readInt2);
                        } else {
                            throw new IOException("Encountered WebP file with invalid chunk size");
                        }
                    } else {
                        return;
                    }
                } else {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: x */
    private static Pair<Integer, Integer> m36303x(String str) {
        int i;
        int i2;
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> x = m36303x(split[0]);
            if (((Integer) x.first).intValue() == 2) {
                return x;
            }
            for (int i3 = 1; i3 < split.length; i3++) {
                Pair<Integer, Integer> x2 = m36303x(split[i3]);
                if (((Integer) x2.first).equals(x.first) || ((Integer) x2.second).equals(x.first)) {
                    i = ((Integer) x.first).intValue();
                } else {
                    i = -1;
                }
                if (((Integer) x.second).intValue() == -1 || (!((Integer) x2.first).equals(x.second) && !((Integer) x2.second).equals(x.second))) {
                    i2 = -1;
                } else {
                    i2 = ((Integer) x.second).intValue();
                }
                if (i == -1 && i2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (i == -1) {
                    x = new Pair<>(Integer.valueOf(i2), -1);
                } else if (i2 == -1) {
                    x = new Pair<>(Integer.valueOf(i), -1);
                }
            }
            return x;
        } else if (str.contains("/")) {
            String[] split2 = str.split("/", -1);
            if (split2.length == 2) {
                try {
                    long parseDouble = (long) Double.parseDouble(split2[0]);
                    long parseDouble2 = (long) Double.parseDouble(split2[1]);
                    if (parseDouble >= 0 && parseDouble2 >= 0) {
                        if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                            return new Pair<>(10, 5);
                        }
                        return new Pair<>(5, -1);
                    }
                    return new Pair<>(10, -1);
                } catch (NumberFormatException unused) {
                }
            }
            return new Pair<>(2, -1);
        } else {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    if (valueOf.longValue() >= 0 && valueOf.longValue() <= 65535) {
                        return new Pair<>(3, 4);
                    }
                    if (valueOf.longValue() < 0) {
                        return new Pair<>(9, -1);
                    }
                    return new Pair<>(4, -1);
                } catch (NumberFormatException unused2) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused3) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
    }

    /* renamed from: y */
    private void m36302y(C2893b bVar, HashMap hashMap) {
        C2895d dVar = (C2895d) hashMap.get("JPEGInterchangeFormat");
        C2895d dVar2 = (C2895d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int m = dVar.m36278m(this.f3949h);
            int m2 = dVar2.m36278m(this.f3949h);
            if (this.f3945d == 7) {
                m += this.f3958q;
            }
            if (m > 0 && m2 > 0) {
                this.f3950i = true;
                if (this.f3942a == null && this.f3944c == null && this.f3943b == null) {
                    byte[] bArr = new byte[m2];
                    bVar.skip(m);
                    bVar.read(bArr);
                    this.f3955n = bArr;
                }
                this.f3953l = m;
                this.f3954m = m2;
            }
            if (f3936v) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m + ", length: " + m2);
            }
        }
    }

    /* renamed from: z */
    private void m36301z(C2893b bVar, HashMap hashMap) {
        C2895d dVar = (C2895d) hashMap.get("StripOffsets");
        C2895d dVar2 = (C2895d) hashMap.get("StripByteCounts");
        if (dVar != null && dVar2 != null) {
            long[] d = C2899b.m36268d(dVar.m36276o(this.f3949h));
            long[] d2 = C2899b.m36268d(dVar2.m36276o(this.f3949h));
            if (d == null || d.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (d2 == null || d2.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (d.length != d2.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j = 0;
                for (long j2 : d2) {
                    j += j2;
                }
                int i = (int) j;
                byte[] bArr = new byte[i];
                this.f3952k = true;
                this.f3951j = true;
                this.f3950i = true;
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < d.length; i4++) {
                    int i5 = (int) d[i4];
                    int i6 = (int) d2[i4];
                    if (i4 < d.length - 1 && i5 + i6 != d[i4 + 1]) {
                        this.f3952k = false;
                    }
                    int i7 = i5 - i2;
                    if (i7 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i7;
                    if (bVar.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i7 + " bytes.");
                        return;
                    }
                    int i8 = i2 + i7;
                    byte[] bArr2 = new byte[i6];
                    if (bVar.read(bArr2) != i6) {
                        Log.d("ExifInterface", "Failed to read " + i6 + " bytes.");
                        return;
                    }
                    i2 = i8 + i6;
                    System.arraycopy(bArr2, 0, bArr, i3, i6);
                    i3 += i6;
                }
                this.f3955n = bArr;
                if (this.f3952k) {
                    this.f3953l = (int) d[0];
                    this.f3954m = i;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00f4 A[Catch: all -> 0x011c, Exception -> 0x011e, TryCatch #17 {Exception -> 0x011e, all -> 0x011c, blocks: (B:64:0x00f0, B:66:0x00f4, B:67:0x0103, B:68:0x010a), top: B:124:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0103 A[Catch: all -> 0x011c, Exception -> 0x011e, TryCatch #17 {Exception -> 0x011e, all -> 0x011c, blocks: (B:64:0x00f0, B:66:0x00f4, B:67:0x0103, B:68:0x010a), top: B:124:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* renamed from: W */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m36337W() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C2892a.m36337W():void");
    }

    /* renamed from: a0 */
    public void m36332a0(String str, String str2) {
        C2896e eVar;
        int i;
        Matcher matcher;
        String str3 = str;
        String str4 = str2;
        if (str3 != null) {
            if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
                boolean find = f3935u0.matcher(str4).find();
                boolean find2 = f3937v0.matcher(str4).find();
                if (str2.length() != 19 || (!find && !find2)) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                    return;
                } else if (find2) {
                    str4 = str4.replaceAll("-", ":");
                }
            }
            if ("ISOSpeedRatings".equals(str3)) {
                if (f3936v) {
                    Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str3 = "PhotographicSensitivity";
            }
            int i2 = 2;
            int i3 = 1;
            if (str4 != null && f3928n0.contains(str3)) {
                if (str3.equals("GPSTimeStamp")) {
                    if (!f3934t0.matcher(str4).find()) {
                        Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                        return;
                    }
                    str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
                } else {
                    try {
                        str4 = new C2897f(Double.parseDouble(str4)).toString();
                    } catch (NumberFormatException unused) {
                        Log.w("ExifInterface", "Invalid value for " + str3 + " : " + str4);
                        return;
                    }
                }
            }
            int i4 = 0;
            int i5 = 0;
            while (i5 < f3924j0.length) {
                if ((i5 != 4 || this.f3950i) && (eVar = f3927m0[i5].get(str3)) != null) {
                    if (str4 == null) {
                        this.f3947f[i5].remove(str3);
                    } else {
                        Pair<Integer, Integer> x = m36303x(str4);
                        int i6 = -1;
                        if (eVar.f3980c == ((Integer) x.first).intValue() || eVar.f3980c == ((Integer) x.second).intValue()) {
                            i = eVar.f3980c;
                        } else {
                            int i7 = eVar.f3981d;
                            if (i7 == -1 || !(i7 == ((Integer) x.first).intValue() || eVar.f3981d == ((Integer) x.second).intValue())) {
                                int i8 = eVar.f3980c;
                                if (i8 == i3 || i8 == 7 || i8 == i2) {
                                    i = i8;
                                } else if (f3936v) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Given tag (");
                                    sb2.append(str3);
                                    sb2.append(") value didn't match with one of expected formats: ");
                                    String[] strArr = f35700W;
                                    sb2.append(strArr[eVar.f3980c]);
                                    String str5 = "";
                                    sb2.append(eVar.f3981d == -1 ? str5 : ", " + strArr[eVar.f3981d]);
                                    sb2.append(" (guess: ");
                                    sb2.append(strArr[((Integer) x.first).intValue()]);
                                    if (((Integer) x.second).intValue() != -1) {
                                        str5 = ", " + strArr[((Integer) x.second).intValue()];
                                    }
                                    sb2.append(str5);
                                    sb2.append(")");
                                    Log.d("ExifInterface", sb2.toString());
                                }
                            } else {
                                i = eVar.f3981d;
                            }
                        }
                        switch (i) {
                            case 1:
                                i3 = i3;
                                this.f3947f[i5].put(str3, C2895d.m36290a(str4));
                                break;
                            case 2:
                            case 7:
                                i3 = i3;
                                this.f3947f[i5].put(str3, C2895d.m36286e(str4));
                                break;
                            case 3:
                                i3 = i3;
                                String[] split = str4.split(",", -1);
                                int[] iArr = new int[split.length];
                                for (int i9 = 0; i9 < split.length; i9++) {
                                    iArr[i9] = Integer.parseInt(split[i9]);
                                }
                                this.f3947f[i5].put(str3, C2895d.m36280k(iArr, this.f3949h));
                                break;
                            case 4:
                                i3 = i3;
                                String[] split2 = str4.split(",", -1);
                                long[] jArr = new long[split2.length];
                                for (int i10 = 0; i10 < split2.length; i10++) {
                                    jArr[i10] = Long.parseLong(split2[i10]);
                                }
                                this.f3947f[i5].put(str3, C2895d.m36284g(jArr, this.f3949h));
                                break;
                            case 5:
                                String[] split3 = str4.split(",", -1);
                                C2897f[] fVarArr = new C2897f[split3.length];
                                int i11 = 0;
                                while (i11 < split3.length) {
                                    String[] split4 = split3[i11].split("/", i6);
                                    fVarArr[i11] = new C2897f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                    i11++;
                                    i6 = -1;
                                }
                                i3 = 1;
                                this.f3947f[i5].put(str3, C2895d.m36282i(fVarArr, this.f3949h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                i3 = i3;
                                if (f3936v) {
                                    Log.d("ExifInterface", "Data format isn't one of expected formats: " + i);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                String[] split5 = str4.split(",", -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i12 = 0; i12 < split5.length; i12++) {
                                    iArr2[i12] = Integer.parseInt(split5[i12]);
                                }
                                this.f3947f[i5].put(str3, C2895d.m36288c(iArr2, this.f3949h));
                                i3 = 1;
                                break;
                            case 10:
                                String[] split6 = str4.split(",", -1);
                                C2897f[] fVarArr2 = new C2897f[split6.length];
                                int i13 = i4;
                                while (i13 < split6.length) {
                                    String[] split7 = split6[i13].split("/", -1);
                                    fVarArr2[i13] = new C2897f((long) Double.parseDouble(split7[i4]), (long) Double.parseDouble(split7[i3]));
                                    i13++;
                                    split6 = split6;
                                    i4 = 0;
                                    i3 = 1;
                                }
                                this.f3947f[i5].put(str3, C2895d.m36287d(fVarArr2, this.f3949h));
                                i3 = 1;
                                break;
                            case 12:
                                String[] split8 = str4.split(",", -1);
                                double[] dArr = new double[split8.length];
                                for (int i14 = i4; i14 < split8.length; i14++) {
                                    dArr[i14] = Double.parseDouble(split8[i14]);
                                }
                                this.f3947f[i5].put(str3, C2895d.m36289b(dArr, this.f3949h));
                                break;
                        }
                        i5++;
                        i2 = 2;
                        i4 = 0;
                    }
                }
                i3 = i3;
                i5++;
                i2 = 2;
                i4 = 0;
            }
            return;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: e */
    public double m36325e(double d) {
        double g = m36321g("GPSAltitude", -1.0d);
        int i = -1;
        int h = m36319h("GPSAltitudeRef", -1);
        if (g < 0.0d || h < 0) {
            return d;
        }
        if (h != 1) {
            i = 1;
        }
        return g * i;
    }

    /* renamed from: f */
    public String m36323f(String str) {
        if (str != null) {
            C2895d j = m36317j(str);
            if (j != null) {
                if (!f3928n0.contains(str)) {
                    return j.m36277n(this.f3949h);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i = j.f3974a;
                    if (i == 5 || i == 10) {
                        C2897f[] fVarArr = (C2897f[]) j.m36276o(this.f3949h);
                        if (fVarArr == null || fVarArr.length != 3) {
                            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                            return null;
                        }
                        C2897f fVar = fVarArr[0];
                        C2897f fVar2 = fVarArr[1];
                        C2897f fVar3 = fVarArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) fVar.f3982a) / ((float) fVar.f3983b))), Integer.valueOf((int) (((float) fVar2.f3982a) / ((float) fVar2.f3983b))), Integer.valueOf((int) (((float) fVar3.f3982a) / ((float) fVar3.f3983b))));
                    }
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + j.f3974a);
                    return null;
                }
                try {
                    return Double.toString(j.m36279l(this.f3949h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    /* renamed from: g */
    public double m36321g(String str, double d) {
        if (str != null) {
            C2895d j = m36317j(str);
            if (j == null) {
                return d;
            }
            try {
                return j.m36279l(this.f3949h);
            } catch (NumberFormatException unused) {
                return d;
            }
        } else {
            throw new NullPointerException("tag shouldn't be null");
        }
    }

    /* renamed from: h */
    public int m36319h(String str, int i) {
        if (str != null) {
            C2895d j = m36317j(str);
            if (j == null) {
                return i;
            }
            try {
                return j.m36278m(this.f3949h);
            } catch (NumberFormatException unused) {
                return i;
            }
        } else {
            throw new NullPointerException("tag shouldn't be null");
        }
    }

    /* renamed from: i */
    public long[] m36318i(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        } else if (!this.f3961t) {
            C2895d j = m36317j(str);
            if (j != null) {
                return new long[]{j.f3976c, j.f3977d.length};
            }
            return null;
        } else {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
    }

    /* renamed from: m */
    public double[] m36314m() {
        String f = m36323f("GPSLatitude");
        String f2 = m36323f("GPSLatitudeRef");
        String f3 = m36323f("GPSLongitude");
        String f4 = m36323f("GPSLongitudeRef");
        if (f == null || f2 == null || f3 == null || f4 == null) {
            return null;
        }
        try {
            return new double[]{m36331b(f, f2), m36331b(f3, f4)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", f, f2, f3, f4));
            return null;
        }
    }

    /* renamed from: u */
    public byte[] m36306u() {
        int i = this.f3956o;
        if (i == 6 || i == 7) {
            return m36305v();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[Catch: Exception -> 0x0088, all -> 0x00a7, TRY_ENTER, TryCatch #3 {all -> 0x00a7, blocks: (B:27:0x004f, B:30:0x0065, B:32:0x0071, B:37:0x007c, B:38:0x0081, B:39:0x0082, B:40:0x0087, B:50:0x0099), top: B:61:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082 A[Catch: Exception -> 0x0088, all -> 0x00a7, TryCatch #3 {all -> 0x00a7, blocks: (B:27:0x004f, B:30:0x0065, B:32:0x0071, B:37:0x007c, B:38:0x0081, B:39:0x0082, B:40:0x0087, B:50:0x0099), top: B:61:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] m36305v() {
        /*
            r9 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r9.f3950i
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            byte[] r1 = r9.f3955n
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            android.content.res.AssetManager$AssetInputStream r1 = r9.f3944c     // Catch: all -> 0x0092, Exception -> 0x0095
            if (r1 == 0) goto L_0x002e
            boolean r3 = r1.markSupported()     // Catch: all -> 0x0025, Exception -> 0x0029
            if (r3 == 0) goto L_0x001c
            r1.reset()     // Catch: all -> 0x0025, Exception -> 0x0029
        L_0x001a:
            r3 = r2
            goto L_0x004f
        L_0x001c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: all -> 0x0025, Exception -> 0x0029
            androidx.exifinterface.media.C2899b.m36269c(r1)
            return r2
        L_0x0025:
            r0 = move-exception
            r3 = r2
            goto L_0x00a8
        L_0x0029:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L_0x0099
        L_0x002e:
            java.lang.String r1 = r9.f3942a     // Catch: all -> 0x0092, Exception -> 0x0095
            if (r1 == 0) goto L_0x003a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: all -> 0x0092, Exception -> 0x0095
            java.lang.String r3 = r9.f3942a     // Catch: all -> 0x0092, Exception -> 0x0095
            r1.<init>(r3)     // Catch: all -> 0x0092, Exception -> 0x0095
            goto L_0x001a
        L_0x003a:
            java.io.FileDescriptor r1 = r9.f3943b     // Catch: all -> 0x0092, Exception -> 0x0095
            java.io.FileDescriptor r1 = androidx.exifinterface.media.C2899b.C2900a.m36263b(r1)     // Catch: all -> 0x0092, Exception -> 0x0095
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: all -> 0x008a, Exception -> 0x008d
            r4 = 0
            androidx.exifinterface.media.C2899b.C2900a.m36262c(r1, r4, r3)     // Catch: all -> 0x008a, Exception -> 0x008d
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: all -> 0x008a, Exception -> 0x008d
            r3.<init>(r1)     // Catch: all -> 0x008a, Exception -> 0x008d
            r8 = r3
            r3 = r1
            r1 = r8
        L_0x004f:
            int r4 = r9.f3953l     // Catch: Exception -> 0x0088, all -> 0x00a7
            int r5 = r9.f3957p     // Catch: Exception -> 0x0088, all -> 0x00a7
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch: Exception -> 0x0088, all -> 0x00a7
            long r4 = r1.skip(r4)     // Catch: Exception -> 0x0088, all -> 0x00a7
            int r6 = r9.f3953l     // Catch: Exception -> 0x0088, all -> 0x00a7
            int r7 = r9.f3957p     // Catch: Exception -> 0x0088, all -> 0x00a7
            int r6 = r6 + r7
            long r6 = (long) r6
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            java.lang.String r5 = "Corrupted image"
            if (r4 != 0) goto L_0x0082
            int r4 = r9.f3954m     // Catch: Exception -> 0x0088, all -> 0x00a7
            byte[] r4 = new byte[r4]     // Catch: Exception -> 0x0088, all -> 0x00a7
            int r6 = r1.read(r4)     // Catch: Exception -> 0x0088, all -> 0x00a7
            int r7 = r9.f3954m     // Catch: Exception -> 0x0088, all -> 0x00a7
            if (r6 != r7) goto L_0x007c
            r9.f3955n = r4     // Catch: Exception -> 0x0088, all -> 0x00a7
            androidx.exifinterface.media.C2899b.m36269c(r1)
            if (r3 == 0) goto L_0x007b
            androidx.exifinterface.media.C2899b.m36270b(r3)
        L_0x007b:
            return r4
        L_0x007c:
            java.io.IOException r4 = new java.io.IOException     // Catch: Exception -> 0x0088, all -> 0x00a7
            r4.<init>(r5)     // Catch: Exception -> 0x0088, all -> 0x00a7
            throw r4     // Catch: Exception -> 0x0088, all -> 0x00a7
        L_0x0082:
            java.io.IOException r4 = new java.io.IOException     // Catch: Exception -> 0x0088, all -> 0x00a7
            r4.<init>(r5)     // Catch: Exception -> 0x0088, all -> 0x00a7
            throw r4     // Catch: Exception -> 0x0088, all -> 0x00a7
        L_0x0088:
            r4 = move-exception
            goto L_0x0099
        L_0x008a:
            r0 = move-exception
            r3 = r1
            goto L_0x00a9
        L_0x008d:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L_0x0099
        L_0x0092:
            r0 = move-exception
            r3 = r2
            goto L_0x00a9
        L_0x0095:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        L_0x0099:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: all -> 0x00a7
            androidx.exifinterface.media.C2899b.m36269c(r1)
            if (r3 == 0) goto L_0x00a6
            androidx.exifinterface.media.C2899b.m36270b(r3)
        L_0x00a6:
            return r2
        L_0x00a7:
            r0 = move-exception
        L_0x00a8:
            r2 = r1
        L_0x00a9:
            androidx.exifinterface.media.C2899b.m36269c(r2)
            if (r3 == 0) goto L_0x00b1
            androidx.exifinterface.media.C2899b.m36270b(r3)
        L_0x00b1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.C2892a.m36305v():byte[]");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.exifinterface.media.a$g */
    /* loaded from: classes.dex */
    public static class C2898g extends C2893b {
        C2898g(byte[] bArr) {
            super(bArr);
            this.f3968k.mark(ViewDefaults.NUMBER_OF_LINES);
        }

        /* renamed from: l */
        public void m36272l(long j) {
            int i = this.f3970m;
            if (i > j) {
                this.f3970m = 0;
                this.f3968k.reset();
            } else {
                j -= i;
            }
            m36297i((int) j);
        }

        C2898g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f3968k.mark(ViewDefaults.NUMBER_OF_LINES);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.exifinterface.media.a$e */
    /* loaded from: classes.dex */
    public static class C2896e {

        /* renamed from: a */
        public final int f3978a;

        /* renamed from: b */
        public final String f3979b;

        /* renamed from: c */
        public final int f3980c;

        /* renamed from: d */
        public final int f3981d;

        C2896e(String str, int i, int i2) {
            this.f3979b = str;
            this.f3978a = i;
            this.f3980c = i2;
            this.f3981d = -1;
        }

        /* renamed from: a */
        boolean m36274a(int i) {
            int i2;
            int i3 = this.f3980c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f3981d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            if ((i3 == 12 || i2 == 12) && i == 11) {
                return true;
            }
            return false;
        }

        C2896e(String str, int i, int i2, int i3) {
            this.f3979b = str;
            this.f3978a = i;
            this.f3980c = i2;
            this.f3981d = i3;
        }
    }

    public C2892a(String str) {
        C2896e[][] eVarArr = f3924j0;
        this.f3947f = new HashMap[eVarArr.length];
        this.f3948g = new HashSet(eVarArr.length);
        this.f3949h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            m36359A(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public C2892a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public C2892a(InputStream inputStream, int i) {
        C2896e[][] eVarArr = f3924j0;
        this.f3947f = new HashMap[eVarArr.length];
        this.f3948g = new HashSet(eVarArr.length);
        this.f3949h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f3942a = null;
            if (i == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f3931q0.length);
                if (!m36358B(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f3946e = true;
                this.f3944c = null;
                this.f3943b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f3944c = (AssetManager.AssetInputStream) inputStream;
                this.f3943b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m36351I(fileInputStream.getFD())) {
                        this.f3944c = null;
                        this.f3943b = fileInputStream.getFD();
                    }
                }
                this.f3944c = null;
                this.f3943b = null;
            }
            m36346N(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
