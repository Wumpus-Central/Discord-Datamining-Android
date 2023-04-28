package tg;

import ci.C4018a;
import ci.C4023d;
import gh.AbstractC7633p;
import java.io.InputStream;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6895g;
import p217lg.C10434k;
import p249nh.C11136b;
import p249nh.C11137c;

/* renamed from: tg.g */
/* loaded from: classes8.dex */
public final class C13088g implements AbstractC7633p {

    /* renamed from: a */
    private final ClassLoader f29396a;

    /* renamed from: b */
    private final C4023d f29397b = new C4023d();

    public C13088g(ClassLoader classLoader) {
        C9971q.m14633g(classLoader, "classLoader");
        this.f29396a = classLoader;
    }

    /* renamed from: d */
    private final AbstractC7633p.AbstractC7634a m4623d(String str) {
        C13086f a;
        Class<?> a2 = C13085e.m4634a(this.f29396a, str);
        if (a2 == null || (a = C13086f.f29393c.m4627a(a2)) == null) {
            return null;
        }
        return new AbstractC7633p.AbstractC7634a.C7635b(a, null, 2, null);
    }

    @Override // bi.AbstractC3601u
    /* renamed from: a */
    public InputStream mo4626a(C11137c packageFqName) {
        C9971q.m14633g(packageFqName, "packageFqName");
        if (!packageFqName.m10796i(C10434k.f22893t)) {
            return null;
        }
        return this.f29397b.m33071a(C4018a.f6609n.m33076n(packageFqName));
    }

    @Override // gh.AbstractC7633p
    /* renamed from: b */
    public AbstractC7633p.AbstractC7634a mo4625b(C11136b classId) {
        String b;
        C9971q.m14633g(classId, "classId");
        b = C13089h.m4621b(classId);
        return m4623d(b);
    }

    @Override // gh.AbstractC7633p
    /* renamed from: c */
    public AbstractC7633p.AbstractC7634a mo4624c(AbstractC6895g javaClass) {
        String b;
        C9971q.m14633g(javaClass, "javaClass");
        C11137c e = javaClass.mo4017e();
        if (e == null || (b = e.m10803b()) == null) {
            return null;
        }
        return m4623d(b);
    }
}
