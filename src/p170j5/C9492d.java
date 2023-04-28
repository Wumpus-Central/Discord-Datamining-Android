package p170j5;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p170j5.C9490c;
import p394w3.C13728a;
import p394w3.C13740j;
import p394w3.C13747n;

/* renamed from: j5.d */
/* loaded from: classes7.dex */
public class C9492d {

    /* renamed from: d */
    private static C9492d f21026d;

    /* renamed from: a */
    private int f21027a;

    /* renamed from: b */
    private List<C9490c.AbstractC9491a> f21028b;

    /* renamed from: c */
    private final C9488a f21029c = new C9488a();

    private C9492d() {
        m16136f();
    }

    /* renamed from: b */
    public static C9490c m16140b(InputStream inputStream) {
        return m16138d().m16141a(inputStream);
    }

    /* renamed from: c */
    public static C9490c m16139c(InputStream inputStream) {
        try {
            return m16140b(inputStream);
        } catch (IOException e) {
            throw C13747n.m2823a(e);
        }
    }

    /* renamed from: d */
    public static synchronized C9492d m16138d() {
        C9492d dVar;
        synchronized (C9492d.class) {
            if (f21026d == null) {
                f21026d = new C9492d();
            }
            dVar = f21026d;
        }
        return dVar;
    }

    /* renamed from: e */
    private static int m16137e(int i, InputStream inputStream, byte[] bArr) {
        boolean z;
        C13740j.m2834g(inputStream);
        C13740j.m2834g(bArr);
        if (bArr.length >= i) {
            z = true;
        } else {
            z = false;
        }
        C13740j.m2839b(Boolean.valueOf(z));
        if (!inputStream.markSupported()) {
            return C13728a.m2858b(inputStream, bArr, 0, i);
        }
        try {
            inputStream.mark(i);
            return C13728a.m2858b(inputStream, bArr, 0, i);
        } finally {
            inputStream.reset();
        }
    }

    /* renamed from: f */
    private void m16136f() {
        this.f21027a = this.f21029c.mo16142b();
        List<C9490c.AbstractC9491a> list = this.f21028b;
        if (list != null) {
            for (C9490c.AbstractC9491a aVar : list) {
                this.f21027a = Math.max(this.f21027a, aVar.mo16142b());
            }
        }
    }

    /* renamed from: a */
    public C9490c m16141a(InputStream inputStream) {
        C13740j.m2834g(inputStream);
        int i = this.f21027a;
        byte[] bArr = new byte[i];
        int e = m16137e(i, inputStream, bArr);
        C9490c a = this.f21029c.mo16143a(bArr, e);
        if (!(a == null || a == C9490c.f21023c)) {
            return a;
        }
        List<C9490c.AbstractC9491a> list = this.f21028b;
        if (list != null) {
            for (C9490c.AbstractC9491a aVar : list) {
                C9490c a2 = aVar.mo16143a(bArr, e);
                if (!(a2 == null || a2 == C9490c.f21023c)) {
                    return a2;
                }
            }
        }
        return C9490c.f21023c;
    }
}
