package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.android.exoplayer2.upstream.AbstractC5311f;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p030bc.AbstractC3459k;
import p081e9.AbstractC6771f;
import p081e9.AbstractC6795x;
import p081e9.C6778l;
import p119g9.C7510a;
import p119g9.C7557q0;
import p119g9.C7558r;

/* loaded from: classes5.dex */
public class DefaultHttpDataSource extends AbstractC6771f implements AbstractC5311f {

    /* renamed from: v */
    private static final Pattern f9714v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e */
    private final boolean f9715e;

    /* renamed from: f */
    private final int f9716f;

    /* renamed from: g */
    private final int f9717g;

    /* renamed from: h */
    private final String f9718h;

    /* renamed from: i */
    private final AbstractC5311f.C5317g f9719i;

    /* renamed from: j */
    private final AbstractC5311f.C5317g f9720j;

    /* renamed from: k */
    private AbstractC3459k<String> f9721k;

    /* renamed from: l */
    private C5288a f9722l;

    /* renamed from: m */
    private HttpURLConnection f9723m;

    /* renamed from: n */
    private InputStream f9724n;

    /* renamed from: o */
    private byte[] f9725o;

    /* renamed from: p */
    private boolean f9726p;

    /* renamed from: q */
    private int f9727q;

    /* renamed from: r */
    private long f9728r;

    /* renamed from: s */
    private long f9729s;

    /* renamed from: t */
    private long f9730t;

    /* renamed from: u */
    private long f9731u;

    /* loaded from: classes5.dex */
    public static final class Factory implements AbstractC5311f.AbstractC5314c {

        /* renamed from: b */
        private AbstractC6795x f9733b;

        /* renamed from: c */
        private AbstractC3459k<String> f9734c;

        /* renamed from: d */
        private String f9735d;

        /* renamed from: g */
        private boolean f9738g;

        /* renamed from: a */
        private final AbstractC5311f.C5317g f9732a = new AbstractC5311f.C5317g();

        /* renamed from: e */
        private int f9736e = 8000;

        /* renamed from: f */
        private int f9737f = 8000;

        /* renamed from: a */
        public DefaultHttpDataSource createDataSource() {
            DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.f9735d, this.f9736e, this.f9737f, this.f9738g, this.f9732a, this.f9734c);
            AbstractC6795x xVar = this.f9733b;
            if (xVar != null) {
                defaultHttpDataSource.mo12541c(xVar);
            }
            return defaultHttpDataSource;
        }

        /* renamed from: b */
        public Factory m29630b(String str) {
            this.f9735d = str;
            return this;
        }
    }

    /* renamed from: B */
    private int m29641B(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9729s;
        if (j != -1) {
            long j2 = j - this.f9731u;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) C7557q0.m22145j(this.f9724n)).read(bArr, i, i2);
        if (read != -1) {
            this.f9731u += read;
            m24360o(read);
            return read;
        } else if (this.f9729s == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: C */
    private void m29640C() {
        if (this.f9730t != this.f9728r) {
            if (this.f9725o == null) {
                this.f9725o = new byte[4096];
            }
            while (true) {
                long j = this.f9730t;
                long j2 = this.f9728r;
                if (j != j2) {
                    int read = ((InputStream) C7557q0.m22145j(this.f9724n)).read(this.f9725o, 0, (int) Math.min(j2 - j, this.f9725o.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f9730t += read;
                        m24360o(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: t */
    private void m29638t() {
        HttpURLConnection httpURLConnection = this.f9723m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C7558r.m22108d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f9723m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long m29637u(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L_0x002c
            long r4 = java.lang.Long.parseLong(r0)     // Catch: NumberFormatException -> 0x0015
            goto L_0x002e
        L_0x0015:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p119g9.C7558r.m22109c(r3, r1)
        L_0x002c:
            r4 = -1
        L_0x002e:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto L_0x00b0
            java.util.regex.Pattern r1 = com.google.android.exoplayer2.upstream.DefaultHttpDataSource.f9714v
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto L_0x00b0
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: NumberFormatException -> 0x0099
            java.lang.Object r6 = p119g9.C7510a.m22367e(r6)     // Catch: NumberFormatException -> 0x0099
            java.lang.String r6 = (java.lang.String) r6     // Catch: NumberFormatException -> 0x0099
            long r6 = java.lang.Long.parseLong(r6)     // Catch: NumberFormatException -> 0x0099
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: NumberFormatException -> 0x0099
            java.lang.Object r1 = p119g9.C7510a.m22367e(r1)     // Catch: NumberFormatException -> 0x0099
            java.lang.String r1 = (java.lang.String) r1     // Catch: NumberFormatException -> 0x0099
            long r8 = java.lang.Long.parseLong(r1)     // Catch: NumberFormatException -> 0x0099
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0070
            r4 = r6
            goto L_0x00b0
        L_0x0070:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x00b0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: NumberFormatException -> 0x0099
            r1.<init>()     // Catch: NumberFormatException -> 0x0099
            java.lang.String r8 = "Inconsistent headers ["
            r1.append(r8)     // Catch: NumberFormatException -> 0x0099
            r1.append(r0)     // Catch: NumberFormatException -> 0x0099
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch: NumberFormatException -> 0x0099
            r1.append(r10)     // Catch: NumberFormatException -> 0x0099
            r1.append(r2)     // Catch: NumberFormatException -> 0x0099
            java.lang.String r0 = r1.toString()     // Catch: NumberFormatException -> 0x0099
            p119g9.C7558r.m22104h(r3, r0)     // Catch: NumberFormatException -> 0x0099
            long r0 = java.lang.Math.max(r4, r6)     // Catch: NumberFormatException -> 0x0099
            r4 = r0
            goto L_0x00b0
        L_0x0099:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            p119g9.C7558r.m22109c(r3, r10)
        L_0x00b0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.DefaultHttpDataSource.m29637u(java.net.HttpURLConnection):long");
    }

    /* renamed from: v */
    private static URL m29636v(URL url, String str) {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if ("https".equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException("Unsupported protocol redirect: " + protocol);
        }
        throw new ProtocolException("Null location redirect");
    }

    /* renamed from: w */
    private static boolean m29635w(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* renamed from: x */
    private HttpURLConnection m29634x(C5288a aVar) {
        HttpURLConnection y;
        C5288a aVar2 = aVar;
        URL url = new URL(aVar2.f9746a.toString());
        int i = aVar2.f9748c;
        byte[] bArr = aVar2.f9749d;
        long j = aVar2.f9752g;
        long j2 = aVar2.f9753h;
        int i2 = 1;
        boolean d = aVar2.m29626d(1);
        if (!this.f9715e) {
            return m29633y(url, i, bArr, j, j2, d, true, aVar2.f9750e);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                byte[] bArr2 = bArr;
                y = m29633y(url, i, bArr, j, j2, d, false, aVar2.f9750e);
                int responseCode = y.getResponseCode();
                String headerField = y.getHeaderField("Location");
                if ((i == i2 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    y.disconnect();
                    url = m29636v(url, headerField);
                } else if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                } else {
                    y.disconnect();
                    url = m29636v(url, headerField);
                    bArr2 = null;
                    i = i2;
                }
                i3 = i4;
                i2 = i2;
                bArr = bArr2;
                j2 = j2;
                j = j;
                aVar2 = aVar;
            } else {
                throw new NoRouteToHostException("Too many redirects: " + i4);
            }
        }
        return y;
    }

    /* renamed from: y */
    private HttpURLConnection m29633y(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) {
        HttpURLConnection A = m29642A(url);
        A.setConnectTimeout(this.f9716f);
        A.setReadTimeout(this.f9717g);
        HashMap hashMap = new HashMap();
        AbstractC5311f.C5317g gVar = this.f9719i;
        if (gVar != null) {
            hashMap.putAll(gVar.m29491a());
        }
        hashMap.putAll(this.f9720j.m29491a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            A.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (!(j == 0 && j2 == -1)) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            A.setRequestProperty("Range", str);
        }
        String str2 = this.f9718h;
        if (str2 != null) {
            A.setRequestProperty("User-Agent", str2);
        }
        A.setRequestProperty("Accept-Encoding", z ? "gzip" : InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
        A.setInstanceFollowRedirects(z2);
        A.setDoOutput(bArr != null);
        A.setRequestMethod(C5288a.m29627c(i));
        if (bArr != null) {
            A.setFixedLengthStreamingMode(bArr.length);
            A.connect();
            OutputStream outputStream = A.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            A.connect();
        }
        return A;
    }

    /* renamed from: z */
    private static void m29632z(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = C7557q0.f16368a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) C7510a.m22367e(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: A */
    HttpURLConnection m29642A(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        byte[] bArr;
        this.f9722l = aVar;
        long j = 0;
        this.f9731u = 0L;
        this.f9730t = 0L;
        m24358q(aVar);
        try {
            HttpURLConnection x = m29634x(aVar);
            this.f9723m = x;
            try {
                this.f9727q = x.getResponseCode();
                String responseMessage = x.getResponseMessage();
                int i = this.f9727q;
                if (i < 200 || i > 299) {
                    Map<String, List<String>> headerFields = x.getHeaderFields();
                    InputStream errorStream = x.getErrorStream();
                    try {
                        if (errorStream != null) {
                            bArr = C7557q0.m22178S0(errorStream);
                        } else {
                            bArr = C7557q0.f16373f;
                        }
                    } catch (IOException unused) {
                        bArr = C7557q0.f16373f;
                    }
                    m29638t();
                    AbstractC5311f.C0146f fVar = new AbstractC5311f.C0146f(this.f9727q, responseMessage, headerFields, aVar, bArr);
                    if (this.f9727q == 416) {
                        fVar.initCause(new C6778l(0));
                    }
                    throw fVar;
                }
                String contentType = x.getContentType();
                AbstractC3459k<String> kVar = this.f9721k;
                if (kVar == null || kVar.apply(contentType)) {
                    if (this.f9727q == 200) {
                        long j2 = aVar.f9752g;
                        if (j2 != 0) {
                            j = j2;
                        }
                    }
                    this.f9728r = j;
                    boolean w = m29635w(x);
                    if (!w) {
                        long j3 = aVar.f9753h;
                        long j4 = -1;
                        if (j3 != -1) {
                            this.f9729s = j3;
                        } else {
                            long u = m29637u(x);
                            if (u != -1) {
                                j4 = u - this.f9728r;
                            }
                            this.f9729s = j4;
                        }
                    } else {
                        this.f9729s = aVar.f9753h;
                    }
                    try {
                        this.f9724n = x.getInputStream();
                        if (w) {
                            this.f9724n = new GZIPInputStream(this.f9724n);
                        }
                        this.f9726p = true;
                        m24357r(aVar);
                        return this.f9729s;
                    } catch (IOException e) {
                        m29638t();
                        throw new AbstractC5311f.C5315d(e, aVar, 1);
                    }
                } else {
                    m29638t();
                    throw new AbstractC5311f.C5316e(contentType, aVar);
                }
            } catch (IOException e2) {
                m29638t();
                throw new AbstractC5311f.C5315d("Unable to connect", e2, aVar, 1);
            }
        } catch (IOException e3) {
            String message = e3.getMessage();
            if (message == null || !C7557q0.m22174U0(message).matches("cleartext http traffic.*not permitted.*")) {
                throw new AbstractC5311f.C5315d("Unable to connect", e3, aVar, 1);
            }
            throw new AbstractC5311f.C5313b(e3, aVar);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        try {
            InputStream inputStream = this.f9724n;
            if (inputStream != null) {
                m29632z(this.f9723m, m29639s());
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new AbstractC5311f.C5315d(e, (C5288a) C7557q0.m22145j(this.f9722l), 3);
                }
            }
        } finally {
            this.f9724n = null;
            m29638t();
            if (this.f9726p) {
                this.f9726p = false;
                m24359p();
            }
        }
    }

    @Override // p081e9.AbstractC6771f, com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: e */
    public Map<String, List<String>> mo12540e() {
        HttpURLConnection httpURLConnection = this.f9723m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        HttpURLConnection httpURLConnection = this.f9723m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        try {
            m29640C();
            return m29641B(bArr, i, i2);
        } catch (IOException e) {
            throw new AbstractC5311f.C5315d(e, (C5288a) C7557q0.m22145j(this.f9722l), 2);
        }
    }

    /* renamed from: s */
    protected final long m29639s() {
        long j = this.f9729s;
        return j == -1 ? j : j - this.f9731u;
    }

    private DefaultHttpDataSource(String str, int i, int i2, boolean z, AbstractC5311f.C5317g gVar, AbstractC3459k<String> kVar) {
        super(true);
        this.f9718h = str;
        this.f9716f = i;
        this.f9717g = i2;
        this.f9715e = z;
        this.f9719i = gVar;
        this.f9721k = kVar;
        this.f9720j = new AbstractC5311f.C5317g();
    }
}
