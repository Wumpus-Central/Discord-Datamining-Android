package p312r3;

import com.facebook.cache.common.CacheKey;
import java.io.IOException;
import p292q3.AbstractC11981b;
import p292q3.AbstractC11982c;

/* renamed from: r3.i */
/* loaded from: classes7.dex */
public class C12385i implements AbstractC11981b {

    /* renamed from: i */
    private static final Object f27812i = new Object();

    /* renamed from: j */
    private static C12385i f27813j;

    /* renamed from: k */
    private static int f27814k;

    /* renamed from: a */
    private CacheKey f27815a;

    /* renamed from: b */
    private String f27816b;

    /* renamed from: c */
    private long f27817c;

    /* renamed from: d */
    private long f27818d;

    /* renamed from: e */
    private long f27819e;

    /* renamed from: f */
    private IOException f27820f;

    /* renamed from: g */
    private AbstractC11982c.EnumC11983a f27821g;

    /* renamed from: h */
    private C12385i f27822h;

    private C12385i() {
    }

    /* renamed from: a */
    public static C12385i m6996a() {
        synchronized (f27812i) {
            C12385i iVar = f27813j;
            if (iVar == null) {
                return new C12385i();
            }
            f27813j = iVar.f27822h;
            iVar.f27822h = null;
            f27814k--;
            return iVar;
        }
    }

    /* renamed from: c */
    private void m6994c() {
        this.f27815a = null;
        this.f27816b = null;
        this.f27817c = 0L;
        this.f27818d = 0L;
        this.f27819e = 0L;
        this.f27820f = null;
        this.f27821g = null;
    }

    /* renamed from: b */
    public void m6995b() {
        synchronized (f27812i) {
            if (f27814k < 5) {
                m6994c();
                f27814k++;
                C12385i iVar = f27813j;
                if (iVar != null) {
                    this.f27822h = iVar;
                }
                f27813j = this;
            }
        }
    }

    /* renamed from: d */
    public C12385i m6993d(CacheKey cacheKey) {
        this.f27815a = cacheKey;
        return this;
    }

    /* renamed from: e */
    public C12385i m6992e(long j) {
        this.f27818d = j;
        return this;
    }

    /* renamed from: f */
    public C12385i m6991f(long j) {
        this.f27819e = j;
        return this;
    }

    /* renamed from: g */
    public C12385i m6990g(AbstractC11982c.EnumC11983a aVar) {
        this.f27821g = aVar;
        return this;
    }

    /* renamed from: h */
    public C12385i m6989h(IOException iOException) {
        this.f27820f = iOException;
        return this;
    }

    /* renamed from: i */
    public C12385i m6988i(long j) {
        this.f27817c = j;
        return this;
    }

    /* renamed from: j */
    public C12385i m6987j(String str) {
        this.f27816b = str;
        return this;
    }
}
