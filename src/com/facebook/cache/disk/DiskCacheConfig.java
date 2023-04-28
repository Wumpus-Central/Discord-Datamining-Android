package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.common.internal.Supplier;
import java.io.File;
import p292q3.AbstractC11980a;
import p292q3.AbstractC11982c;
import p292q3.C11986f;
import p292q3.C11987g;
import p312r3.AbstractC12383g;
import p312r3.C12371b;
import p344t3.AbstractC12955b;
import p344t3.C12956c;
import p394w3.C13740j;
import p394w3.C13743m;

/* loaded from: classes7.dex */
public class DiskCacheConfig {

    /* renamed from: a */
    private final int f7551a;

    /* renamed from: b */
    private final String f7552b;

    /* renamed from: c */
    private final Supplier<File> f7553c;

    /* renamed from: d */
    private final long f7554d;

    /* renamed from: e */
    private final long f7555e;

    /* renamed from: f */
    private final long f7556f;

    /* renamed from: g */
    private final AbstractC12383g f7557g;

    /* renamed from: h */
    private final AbstractC11980a f7558h;

    /* renamed from: i */
    private final AbstractC11982c f7559i;

    /* renamed from: j */
    private final AbstractC12955b f7560j;

    /* renamed from: k */
    private final Context f7561k;

    /* renamed from: l */
    private final boolean f7562l;

    /* renamed from: com.facebook.cache.disk.DiskCacheConfig$a */
    /* loaded from: classes7.dex */
    class C4765a implements Supplier<File> {
        C4765a() {
        }

        /* renamed from: a */
        public File get() {
            C13740j.m2834g(DiskCacheConfig.this.f7561k);
            return DiskCacheConfig.this.f7561k.getApplicationContext().getCacheDir();
        }
    }

    /* renamed from: com.facebook.cache.disk.DiskCacheConfig$b */
    /* loaded from: classes7.dex */
    public static class C4766b {

        /* renamed from: a */
        private int f7564a;

        /* renamed from: b */
        private String f7565b;

        /* renamed from: c */
        private Supplier<File> f7566c;

        /* renamed from: d */
        private long f7567d;

        /* renamed from: e */
        private long f7568e;

        /* renamed from: f */
        private long f7569f;

        /* renamed from: g */
        private AbstractC12383g f7570g;

        /* renamed from: h */
        private AbstractC11980a f7571h;

        /* renamed from: i */
        private AbstractC11982c f7572i;

        /* renamed from: j */
        private AbstractC12955b f7573j;

        /* renamed from: k */
        private boolean f7574k;

        /* renamed from: l */
        private final Context f7575l;

        /* synthetic */ C4766b(Context context, C4765a aVar) {
            this(context);
        }

        /* renamed from: n */
        public DiskCacheConfig m32043n() {
            return new DiskCacheConfig(this);
        }

        /* renamed from: o */
        public C4766b m32042o(String str) {
            this.f7565b = str;
            return this;
        }

        /* renamed from: p */
        public C4766b m32041p(File file) {
            this.f7566c = C13743m.m2826a(file);
            return this;
        }

        /* renamed from: q */
        public C4766b m32040q(long j) {
            this.f7567d = j;
            return this;
        }

        private C4766b(Context context) {
            this.f7564a = 1;
            this.f7565b = "image_cache";
            this.f7567d = 41943040L;
            this.f7568e = 10485760L;
            this.f7569f = 2097152L;
            this.f7570g = new C12371b();
            this.f7575l = context;
        }
    }

    protected DiskCacheConfig(C4766b bVar) {
        boolean z;
        AbstractC11980a aVar;
        AbstractC11982c cVar;
        AbstractC12955b bVar2;
        Context context = bVar.f7575l;
        this.f7561k = context;
        if (bVar.f7566c == null && context == null) {
            z = false;
        } else {
            z = true;
        }
        C13740j.m2831j(z, "Either a non-null context or a base directory path or supplier must be provided.");
        if (bVar.f7566c == null && context != null) {
            bVar.f7566c = new C4765a();
        }
        this.f7551a = bVar.f7564a;
        this.f7552b = (String) C13740j.m2834g(bVar.f7565b);
        this.f7553c = (Supplier) C13740j.m2834g(bVar.f7566c);
        this.f7554d = bVar.f7567d;
        this.f7555e = bVar.f7568e;
        this.f7556f = bVar.f7569f;
        this.f7557g = (AbstractC12383g) C13740j.m2834g(bVar.f7570g);
        if (bVar.f7571h == null) {
            aVar = C11986f.m8069b();
        } else {
            aVar = bVar.f7571h;
        }
        this.f7558h = aVar;
        if (bVar.f7572i == null) {
            cVar = C11987g.m8060i();
        } else {
            cVar = bVar.f7572i;
        }
        this.f7559i = cVar;
        if (bVar.f7573j == null) {
            bVar2 = C12956c.m4952b();
        } else {
            bVar2 = bVar.f7573j;
        }
        this.f7560j = bVar2;
        this.f7562l = bVar.f7574k;
    }

    /* renamed from: m */
    public static C4766b m32058m(Context context) {
        return new C4766b(context, null);
    }

    /* renamed from: b */
    public String m32069b() {
        return this.f7552b;
    }

    /* renamed from: c */
    public Supplier<File> m32068c() {
        return this.f7553c;
    }

    /* renamed from: d */
    public AbstractC11980a m32067d() {
        return this.f7558h;
    }

    /* renamed from: e */
    public AbstractC11982c m32066e() {
        return this.f7559i;
    }

    /* renamed from: f */
    public long m32065f() {
        return this.f7554d;
    }

    /* renamed from: g */
    public AbstractC12955b m32064g() {
        return this.f7560j;
    }

    /* renamed from: h */
    public AbstractC12383g m32063h() {
        return this.f7557g;
    }

    /* renamed from: i */
    public boolean m32062i() {
        return this.f7562l;
    }

    /* renamed from: j */
    public long m32061j() {
        return this.f7555e;
    }

    /* renamed from: k */
    public long m32060k() {
        return this.f7556f;
    }

    /* renamed from: l */
    public int m32059l() {
        return this.f7551a;
    }
}
