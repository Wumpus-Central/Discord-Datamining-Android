package p312r3;

import com.facebook.common.internal.Supplier;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import p276p3.AbstractC11526a;
import p292q3.AbstractC11980a;
import p312r3.AbstractC12373c;
import p378v3.C13422a;
import p378v3.C13424c;
import p394w3.C13740j;
import p414x3.C13925a;

/* renamed from: r3.e */
/* loaded from: classes7.dex */
public class C12380e implements AbstractC12373c {

    /* renamed from: f */
    private static final Class<?> f27804f = C12380e.class;

    /* renamed from: a */
    private final int f27805a;

    /* renamed from: b */
    private final Supplier<File> f27806b;

    /* renamed from: c */
    private final String f27807c;

    /* renamed from: d */
    private final AbstractC11980a f27808d;

    /* renamed from: e */
    volatile C12381a f27809e = new C12381a(null, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r3.e$a */
    /* loaded from: classes7.dex */
    public static class C12381a {

        /* renamed from: a */
        public final AbstractC12373c f27810a;

        /* renamed from: b */
        public final File f27811b;

        C12381a(File file, AbstractC12373c cVar) {
            this.f27810a = cVar;
            this.f27811b = file;
        }
    }

    public C12380e(int i, Supplier<File> supplier, String str, AbstractC11980a aVar) {
        this.f27805a = i;
        this.f27808d = aVar;
        this.f27806b = supplier;
        this.f27807c = str;
    }

    /* renamed from: j */
    private void m7007j() {
        File file = new File(this.f27806b.get(), this.f27807c);
        m7008i(file);
        this.f27809e = new C12381a(file, new C12364a(file, this.f27805a, this.f27808d));
    }

    /* renamed from: m */
    private boolean m7004m() {
        File file;
        C12381a aVar = this.f27809e;
        if (aVar.f27810a == null || (file = aVar.f27811b) == null || !file.exists()) {
            return true;
        }
        return false;
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: a */
    public void mo7016a() {
        m7005l().mo7016a();
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: b */
    public void mo7015b() {
        try {
            m7005l().mo7015b();
        } catch (IOException e) {
            C13925a.m2291g(f27804f, "purgeUnexpectedResources", e);
        }
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: c */
    public boolean mo7014c(String str, Object obj) {
        return m7005l().mo7014c(str, obj);
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: d */
    public AbstractC12373c.AbstractC12375b mo7013d(String str, Object obj) {
        return m7005l().mo7013d(str, obj);
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: e */
    public boolean mo7012e(String str, Object obj) {
        return m7005l().mo7012e(str, obj);
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: f */
    public AbstractC11526a mo7011f(String str, Object obj) {
        return m7005l().mo7011f(str, obj);
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: g */
    public Collection<AbstractC12373c.AbstractC12374a> mo7010g() {
        return m7005l().mo7010g();
    }

    @Override // p312r3.AbstractC12373c
    /* renamed from: h */
    public long mo7009h(AbstractC12373c.AbstractC12374a aVar) {
        return m7005l().mo7009h(aVar);
    }

    /* renamed from: i */
    void m7008i(File file) {
        try {
            C13424c.m3749a(file);
            C13925a.m2297a(f27804f, "Created cache directory %s", file.getAbsolutePath());
        } catch (C13424c.C13425a e) {
            this.f27808d.mo8070a(AbstractC11980a.EnumC0380a.WRITE_CREATE_DIR, f27804f, "createRootDirectoryIfNecessary", e);
            throw e;
        }
    }

    @Override // p312r3.AbstractC12373c
    public boolean isExternal() {
        try {
            return m7005l().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: k */
    void m7006k() {
        if (this.f27809e.f27810a != null && this.f27809e.f27811b != null) {
            C13422a.m3754b(this.f27809e.f27811b);
        }
    }

    /* renamed from: l */
    synchronized AbstractC12373c m7005l() {
        if (m7004m()) {
            m7006k();
            m7007j();
        }
        return (AbstractC12373c) C13740j.m2834g(this.f27809e.f27810a);
    }

    @Override // p312r3.AbstractC12373c
    public long remove(String str) {
        return m7005l().remove(str);
    }
}
