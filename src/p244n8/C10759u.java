package p244n8;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p010a9.C1347i;
import p079e7.C6722k;
import p079e7.C6728o;
import p119g9.C7510a;
import p119g9.C7544l0;
import p119g9.C7570y;
import p163j$.util.Spliterator;
import p228m7.AbstractC10500b0;
import p228m7.AbstractC10514i;
import p228m7.AbstractC10515j;
import p228m7.AbstractC10516k;
import p228m7.AbstractC10534y;
import p228m7.C10533x;

/* renamed from: n8.u */
/* loaded from: classes7.dex */
public final class C10759u implements AbstractC10514i {

    /* renamed from: g */
    private static final Pattern f23910g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    private static final Pattern f23911h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* renamed from: a */
    private final String f23912a;

    /* renamed from: b */
    private final C7544l0 f23913b;

    /* renamed from: d */
    private AbstractC10516k f23915d;

    /* renamed from: f */
    private int f23917f;

    /* renamed from: c */
    private final C7570y f23914c = new C7570y();

    /* renamed from: e */
    private byte[] f23916e = new byte[Spliterator.IMMUTABLE];

    public C10759u(String str, C7544l0 l0Var) {
        this.f23912a = str;
        this.f23913b = l0Var;
    }

    /* renamed from: c */
    private AbstractC10500b0 m12371c(long j) {
        AbstractC10500b0 e = this.f23915d.mo7937e(0, 3);
        e.mo12388d(new C6722k.C6724b().m24488e0("text/vtt").m24502V(this.f23912a).m24480i0(j).m24519E());
        this.f23915d.mo7935s();
        return e;
    }

    /* renamed from: f */
    private void m12370f() {
        C7570y yVar = new C7570y(this.f23916e);
        C1347i.m41261e(yVar);
        long j = 0;
        long j2 = 0;
        for (String p = yVar.m22000p(); !TextUtils.isEmpty(p); p = yVar.m22000p()) {
            if (p.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f23910g.matcher(p);
                if (matcher.find()) {
                    Matcher matcher2 = f23911h.matcher(p);
                    if (matcher2.find()) {
                        j2 = C1347i.m41262d((String) C7510a.m22367e(matcher.group(1)));
                        j = C7544l0.m22260f(Long.parseLong((String) C7510a.m22367e(matcher2.group(1))));
                    } else {
                        throw new C6728o("X-TIMESTAMP-MAP doesn't contain media timestamp: " + p);
                    }
                } else {
                    throw new C6728o("X-TIMESTAMP-MAP doesn't contain local timestamp: " + p);
                }
            }
        }
        Matcher a = C1347i.m41265a(yVar);
        if (a == null) {
            m12371c(0L);
            return;
        }
        long d = C1347i.m41262d((String) C7510a.m22367e(a.group(1)));
        long b = this.f23913b.m22264b(C7544l0.m22256j((j + d) - j2));
        AbstractC10500b0 c = m12371c(b - d);
        this.f23914c.m22019N(this.f23916e, this.f23917f);
        c.mo12386f(this.f23914c, this.f23917f);
        c.mo12382c(b, 1, this.f23917f, 0, null);
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: a */
    public void mo2228a(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: b */
    public void mo2227b(AbstractC10516k kVar) {
        this.f23915d = kVar;
        kVar.mo7936j(new AbstractC10534y.C10536b(-9223372036854775807L));
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: d */
    public boolean mo2225d(AbstractC10515j jVar) {
        jVar.mo12937d(this.f23916e, 0, 6, false);
        this.f23914c.m22019N(this.f23916e, 6);
        if (C1347i.m41264b(this.f23914c)) {
            return true;
        }
        jVar.mo12937d(this.f23916e, 6, 3, false);
        this.f23914c.m22019N(this.f23916e, 9);
        return C1347i.m41264b(this.f23914c);
    }

    @Override // p228m7.AbstractC10514i
    /* renamed from: e */
    public int mo2224e(AbstractC10515j jVar, C10533x xVar) {
        int i;
        C7510a.m22367e(this.f23915d);
        int length = (int) jVar.getLength();
        int i2 = this.f23917f;
        byte[] bArr = this.f23916e;
        if (i2 == bArr.length) {
            if (length != -1) {
                i = length;
            } else {
                i = bArr.length;
            }
            this.f23916e = Arrays.copyOf(bArr, (i * 3) / 2);
        }
        byte[] bArr2 = this.f23916e;
        int i3 = this.f23917f;
        int read = jVar.read(bArr2, i3, bArr2.length - i3);
        if (read != -1) {
            int i4 = this.f23917f + read;
            this.f23917f = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        m12370f();
        return -1;
    }

    @Override // p228m7.AbstractC10514i
    public void release() {
    }
}
