package p380v5;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imageutils.C5064a;
import com.facebook.imageutils.C5065b;
import com.facebook.imageutils.C5066c;
import com.facebook.imageutils.C5071f;
import com.facebook.imageutils.HeifExifUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import p170j5.C9489b;
import p170j5.C9490c;
import p170j5.C9492d;
import p394w3.C13740j;
import p455z3.AbstractC14535g;
import p455z3.C14538i;

/* renamed from: v5.e */
/* loaded from: classes7.dex */
public class C13434e implements Closeable {

    /* renamed from: w */
    private static boolean f29985w;

    /* renamed from: k */
    private final CloseableReference<AbstractC14535g> f29986k;

    /* renamed from: l */
    private final Supplier<FileInputStream> f29987l;

    /* renamed from: m */
    private C9490c f29988m;

    /* renamed from: n */
    private int f29989n;

    /* renamed from: o */
    private int f29990o;

    /* renamed from: p */
    private int f29991p;

    /* renamed from: q */
    private int f29992q;

    /* renamed from: r */
    private int f29993r;

    /* renamed from: s */
    private int f29994s;

    /* renamed from: t */
    private BytesRange f29995t;

    /* renamed from: u */
    private ColorSpace f29996u;

    /* renamed from: v */
    private boolean f29997v;

    public C13434e(CloseableReference<AbstractC14535g> closeableReference) {
        this.f29988m = C9490c.f21023c;
        this.f29989n = -1;
        this.f29990o = 0;
        this.f29991p = -1;
        this.f29992q = -1;
        this.f29993r = 1;
        this.f29994s = -1;
        C13740j.m2839b(Boolean.valueOf(CloseableReference.m32036R(closeableReference)));
        this.f29986k = closeableReference.clone();
        this.f29987l = null;
    }

    /* renamed from: F0 */
    private C5065b m3725F0() {
        Throwable th2;
        InputStream inputStream;
        try {
            inputStream = m3696z();
        } catch (Throwable th3) {
            th2 = th3;
            inputStream = null;
        }
        try {
            C5065b b = C5064a.m30862b(inputStream);
            this.f29996u = b.m30858a();
            Pair<Integer, Integer> b2 = b.m30857b();
            if (b2 != null) {
                this.f29991p = ((Integer) b2.first).intValue();
                this.f29992q = ((Integer) b2.second).intValue();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return b;
        } catch (Throwable th4) {
            th2 = th4;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }

    /* renamed from: G0 */
    private Pair<Integer, Integer> m3724G0() {
        Pair<Integer, Integer> g = C5071f.m30839g(m3696z());
        if (g != null) {
            this.f29991p = ((Integer) g.first).intValue();
            this.f29992q = ((Integer) g.second).intValue();
        }
        return g;
    }

    /* renamed from: U */
    private void m3712U() {
        Pair<Integer, Integer> pair;
        C9490c c = C9492d.m16139c(m3696z());
        this.f29988m = c;
        if (C9489b.m16145b(c)) {
            pair = m3724G0();
        } else {
            pair = m3725F0().m30857b();
        }
        if (c == C9489b.f21011a && this.f29989n == -1) {
            if (pair != null) {
                int b = C5066c.m30855b(m3696z());
                this.f29990o = b;
                this.f29989n = C5066c.m30856a(b);
            }
        } else if (c == C9489b.f21021k && this.f29989n == -1) {
            int a = HeifExifUtil.m30865a(m3696z());
            this.f29990o = a;
            this.f29989n = C5066c.m30856a(a);
        } else if (this.f29989n == -1) {
            this.f29989n = 0;
        }
    }

    /* renamed from: b0 */
    public static boolean m3709b0(C13434e eVar) {
        return eVar.f29989n >= 0 && eVar.f29991p >= 0 && eVar.f29992q >= 0;
    }

    /* renamed from: g */
    public static C13434e m3707g(C13434e eVar) {
        if (eVar != null) {
            return eVar.m3710b();
        }
        return null;
    }

    /* renamed from: h */
    public static void m3706h(C13434e eVar) {
        if (eVar != null) {
            eVar.close();
        }
    }

    /* renamed from: j0 */
    public static boolean m3704j0(C13434e eVar) {
        return eVar != null && eVar.m3708f0();
    }

    /* renamed from: z0 */
    private void m3695z0() {
        if (this.f29991p < 0 || this.f29992q < 0) {
            m3697w0();
        }
    }

    /* renamed from: C */
    public InputStream m3726C() {
        return (InputStream) C13740j.m2834g(m3696z());
    }

    /* renamed from: H */
    public int m3723H() {
        m3695z0();
        return this.f29989n;
    }

    /* renamed from: H0 */
    public void m3722H0(BytesRange bytesRange) {
        this.f29995t = bytesRange;
    }

    /* renamed from: I0 */
    public void m3721I0(int i) {
        this.f29990o = i;
    }

    /* renamed from: J0 */
    public void m3720J0(int i) {
        this.f29992q = i;
    }

    /* renamed from: K0 */
    public void m3719K0(C9490c cVar) {
        this.f29988m = cVar;
    }

    /* renamed from: L0 */
    public void m3718L0(int i) {
        this.f29989n = i;
    }

    /* renamed from: M0 */
    public void m3717M0(int i) {
        this.f29993r = i;
    }

    /* renamed from: N0 */
    public void m3716N0(int i) {
        this.f29991p = i;
    }

    /* renamed from: Q */
    public int m3715Q() {
        return this.f29993r;
    }

    /* renamed from: R */
    public int m3714R() {
        CloseableReference<AbstractC14535g> closeableReference = this.f29986k;
        if (closeableReference == null || closeableReference.m32039C() == null) {
            return this.f29994s;
        }
        return this.f29986k.m32039C().size();
    }

    /* renamed from: S */
    protected boolean m3713S() {
        return this.f29997v;
    }

    /* renamed from: Y */
    public boolean m3711Y(int i) {
        C9490c cVar = this.f29988m;
        if ((cVar != C9489b.f21011a && cVar != C9489b.f21022l) || this.f29987l != null) {
            return true;
        }
        C13740j.m2834g(this.f29986k);
        AbstractC14535g C = this.f29986k.m32039C();
        if (C.mo265j(i - 2) == -1 && C.mo265j(i - 1) == -39) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public C13434e m3710b() {
        C13434e eVar;
        Supplier<FileInputStream> supplier = this.f29987l;
        if (supplier != null) {
            eVar = new C13434e(supplier, this.f29994s);
        } else {
            CloseableReference r = CloseableReference.m32027r(this.f29986k);
            if (r == null) {
                eVar = null;
            } else {
                try {
                    eVar = new C13434e(r);
                } finally {
                    CloseableReference.m32025t(r);
                }
            }
        }
        if (eVar != null) {
            eVar.m3705i(this);
        }
        return eVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CloseableReference.m32025t(this.f29986k);
    }

    /* renamed from: f0 */
    public synchronized boolean m3708f0() {
        boolean z;
        if (!CloseableReference.m32036R(this.f29986k)) {
            if (this.f29987l == null) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public int getHeight() {
        m3695z0();
        return this.f29992q;
    }

    public int getWidth() {
        m3695z0();
        return this.f29991p;
    }

    /* renamed from: i */
    public void m3705i(C13434e eVar) {
        this.f29988m = eVar.m3698t();
        this.f29991p = eVar.getWidth();
        this.f29992q = eVar.getHeight();
        this.f29989n = eVar.m3723H();
        this.f29990o = eVar.m3700r();
        this.f29993r = eVar.m3715Q();
        this.f29994s = eVar.m3714R();
        this.f29995t = eVar.m3702n();
        this.f29996u = eVar.m3701p();
        this.f29997v = eVar.m3713S();
    }

    /* renamed from: l */
    public CloseableReference<AbstractC14535g> m3703l() {
        return CloseableReference.m32027r(this.f29986k);
    }

    /* renamed from: n */
    public BytesRange m3702n() {
        return this.f29995t;
    }

    /* renamed from: p */
    public ColorSpace m3701p() {
        m3695z0();
        return this.f29996u;
    }

    /* renamed from: r */
    public int m3700r() {
        m3695z0();
        return this.f29990o;
    }

    /* renamed from: s */
    public String m3699s(int i) {
        CloseableReference<AbstractC14535g> l = m3703l();
        if (l == null) {
            return "";
        }
        int min = Math.min(m3714R(), i);
        byte[] bArr = new byte[min];
        try {
            AbstractC14535g C = l.m32039C();
            if (C == null) {
                return "";
            }
            C.mo266f(0, bArr, 0, min);
            l.close();
            StringBuilder sb2 = new StringBuilder(min * 2);
            for (int i2 = 0; i2 < min; i2++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i2])));
            }
            return sb2.toString();
        } finally {
            l.close();
        }
    }

    /* renamed from: t */
    public C9490c m3698t() {
        m3695z0();
        return this.f29988m;
    }

    /* renamed from: w0 */
    public void m3697w0() {
        if (!f29985w) {
            m3712U();
        } else if (!this.f29997v) {
            m3712U();
            this.f29997v = true;
        }
    }

    /* renamed from: z */
    public InputStream m3696z() {
        Supplier<FileInputStream> supplier = this.f29987l;
        if (supplier != null) {
            return supplier.get();
        }
        CloseableReference r = CloseableReference.m32027r(this.f29986k);
        if (r == null) {
            return null;
        }
        try {
            return new C14538i((AbstractC14535g) r.m32039C());
        } finally {
            CloseableReference.m32025t(r);
        }
    }

    public C13434e(Supplier<FileInputStream> supplier) {
        this.f29988m = C9490c.f21023c;
        this.f29989n = -1;
        this.f29990o = 0;
        this.f29991p = -1;
        this.f29992q = -1;
        this.f29993r = 1;
        this.f29994s = -1;
        C13740j.m2834g(supplier);
        this.f29986k = null;
        this.f29987l = supplier;
    }

    public C13434e(Supplier<FileInputStream> supplier, int i) {
        this(supplier);
        this.f29994s = i;
    }
}
