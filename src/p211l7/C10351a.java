package p211l7;

import android.net.Uri;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.google.android.exoplayer2.upstream.AbstractC5311f;
import com.google.android.exoplayer2.upstream.C5288a;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import p030bc.AbstractC3459k;
import p079e7.C6720i;
import p081e9.AbstractC6771f;
import p081e9.C6778l;
import p119g9.C7510a;
import p119g9.C7557q0;

/* renamed from: l7.a */
/* loaded from: classes7.dex */
public class C10351a extends AbstractC6771f implements AbstractC5311f {

    /* renamed from: s */
    private static final byte[] f22715s = new byte[4096];

    /* renamed from: e */
    private final Call.Factory f22716e;

    /* renamed from: f */
    private final AbstractC5311f.C5317g f22717f;

    /* renamed from: g */
    private final String f22718g;

    /* renamed from: h */
    private final CacheControl f22719h;

    /* renamed from: i */
    private final AbstractC5311f.C5317g f22720i;

    /* renamed from: j */
    private AbstractC3459k<String> f22721j;

    /* renamed from: k */
    private C5288a f22722k;

    /* renamed from: l */
    private Response f22723l;

    /* renamed from: m */
    private InputStream f22724m;

    /* renamed from: n */
    private boolean f22725n;

    /* renamed from: o */
    private long f22726o;

    /* renamed from: p */
    private long f22727p;

    /* renamed from: q */
    private long f22728q;

    /* renamed from: r */
    private long f22729r;

    static {
        C6720i.m24534a("goog.exo.okhttp");
    }

    @Deprecated
    public C10351a(Call.Factory factory, String str, CacheControl cacheControl, AbstractC5311f.C5317g gVar) {
        this(factory, str, cacheControl, gVar, null);
    }

    /* renamed from: s */
    private void m13552s() {
        Response response = this.f22723l;
        if (response != null) {
            ((ResponseBody) C7510a.m22367e(response.m9845b())).close();
            this.f22723l = null;
        }
        this.f22724m = null;
    }

    /* renamed from: t */
    private Request m13551t(C5288a aVar) {
        long j = aVar.f9752g;
        long j2 = aVar.f9753h;
        HttpUrl l = HttpUrl.m10038l(aVar.f9746a.toString());
        if (l != null) {
            Request.Builder m = new Request.Builder().m9864m(l);
            CacheControl cacheControl = this.f22719h;
            if (cacheControl != null) {
                m.m9874c(cacheControl);
            }
            HashMap hashMap = new HashMap();
            AbstractC5311f.C5317g gVar = this.f22720i;
            if (gVar != null) {
                hashMap.putAll(gVar.m29491a());
            }
            hashMap.putAll(this.f22717f.m29491a());
            hashMap.putAll(aVar.f9750e);
            for (Map.Entry entry : hashMap.entrySet()) {
                m.m9872e((String) entry.getKey(), (String) entry.getValue());
            }
            if (!(j == 0 && j2 == -1)) {
                String str = "bytes=" + j + "-";
                if (j2 != -1) {
                    str = str + ((j + j2) - 1);
                }
                m.m9876a("Range", str);
            }
            String str2 = this.f22718g;
            if (str2 != null) {
                m.m9876a("User-Agent", str2);
            }
            if (!aVar.m29626d(1)) {
                m.m9876a("Accept-Encoding", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
            }
            byte[] bArr = aVar.f9749d;
            RequestBody requestBody = null;
            if (bArr != null) {
                requestBody = RequestBody.create((MediaType) null, bArr);
            } else if (aVar.f9748c == 2) {
                requestBody = RequestBody.create((MediaType) null, C7557q0.f16373f);
            }
            m.m9870g(aVar.m29628b(), requestBody);
            return m.m9875b();
        }
        throw new AbstractC5311f.C5315d("Malformed URL", aVar, 1);
    }

    /* renamed from: u */
    private int m13550u(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f22727p;
        if (j != -1) {
            long j2 = j - this.f22729r;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) C7557q0.m22145j(this.f22724m)).read(bArr, i, i2);
        if (read != -1) {
            this.f22729r += read;
            m24360o(read);
            return read;
        } else if (this.f22727p == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: v */
    private void m13549v() {
        byte[] bArr;
        if (this.f22728q != this.f22726o) {
            while (true) {
                long j = this.f22728q;
                long j2 = this.f22726o;
                if (j != j2) {
                    long j3 = j2 - j;
                    int read = ((InputStream) C7557q0.m22145j(this.f22724m)).read(f22715s, 0, (int) Math.min(j3, bArr.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.f22728q += read;
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

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: b */
    public long mo12542b(C5288a aVar) {
        byte[] bArr;
        String str;
        this.f22722k = aVar;
        long j = 0;
        this.f22729r = 0L;
        this.f22728q = 0L;
        m24358q(aVar);
        try {
            Response execute = this.f22716e.mo9954a(m13551t(aVar)).execute();
            this.f22723l = execute;
            ResponseBody responseBody = (ResponseBody) C7510a.m22367e(execute.m9845b());
            this.f22724m = responseBody.byteStream();
            int l = execute.m9839l();
            if (!execute.m9847X()) {
                try {
                    bArr = C7557q0.m22178S0((InputStream) C7510a.m22367e(this.f22724m));
                } catch (IOException unused) {
                    bArr = C7557q0.f16373f;
                }
                Map<String, List<String>> i = execute.m9833z().m10068i();
                m13552s();
                AbstractC5311f.C0146f fVar = new AbstractC5311f.C0146f(l, execute.m9852H(), i, aVar, bArr);
                if (l == 416) {
                    fVar.initCause(new C6778l(0));
                }
                throw fVar;
            }
            MediaType contentType = responseBody.contentType();
            if (contentType != null) {
                str = contentType.toString();
            } else {
                str = "";
            }
            AbstractC3459k<String> kVar = this.f22721j;
            if (kVar == null || kVar.apply(str)) {
                if (l == 200) {
                    long j2 = aVar.f9752g;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                this.f22726o = j;
                long j3 = aVar.f9753h;
                long j4 = -1;
                if (j3 != -1) {
                    this.f22727p = j3;
                } else {
                    long contentLength = responseBody.contentLength();
                    if (contentLength != -1) {
                        j4 = contentLength - this.f22726o;
                    }
                    this.f22727p = j4;
                }
                this.f22725n = true;
                m24357r(aVar);
                return this.f22727p;
            }
            m13552s();
            throw new AbstractC5311f.C5316e(str, aVar);
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null || !C7557q0.m22174U0(message).matches("cleartext communication.*not permitted.*")) {
                throw new AbstractC5311f.C5315d("Unable to connect", e, aVar, 1);
            }
            throw new AbstractC5311f.C5313b(e, aVar);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.f22725n) {
            this.f22725n = false;
            m24359p();
            m13552s();
        }
    }

    @Override // p081e9.AbstractC6771f, com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: e */
    public Map<String, List<String>> mo12540e() {
        Response response = this.f22723l;
        return response == null ? Collections.emptyMap() : response.m9833z().m10068i();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: m */
    public Uri mo12539m() {
        Response response = this.f22723l;
        if (response == null) {
            return null;
        }
        return Uri.parse(response.m9844b0().m9877l().toString());
    }

    @Override // p081e9.AbstractC6774h
    public int read(byte[] bArr, int i, int i2) {
        try {
            m13549v();
            return m13550u(bArr, i, i2);
        } catch (IOException e) {
            throw new AbstractC5311f.C5315d(e, (C5288a) C7510a.m22367e(this.f22722k), 2);
        }
    }

    private C10351a(Call.Factory factory, String str, CacheControl cacheControl, AbstractC5311f.C5317g gVar, AbstractC3459k<String> kVar) {
        super(true);
        this.f22716e = (Call.Factory) C7510a.m22367e(factory);
        this.f22718g = str;
        this.f22719h = cacheControl;
        this.f22720i = gVar;
        this.f22721j = kVar;
        this.f22717f = new AbstractC5311f.C5317g();
    }
}
