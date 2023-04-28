package tg;

import java.util.Set;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6895g;
import p086eh.AbstractC6909u;
import p249nh.C11136b;
import p249nh.C11137c;
import p326ri.C12718u;
import p427xg.AbstractC14146p;
import ug.C13294l;
import ug.C13313w;

/* renamed from: tg.d */
/* loaded from: classes8.dex */
public final class C13084d implements AbstractC14146p {

    /* renamed from: a */
    private final ClassLoader f29392a;

    public C13084d(ClassLoader classLoader) {
        C9971q.m14633g(classLoader, "classLoader");
        this.f29392a = classLoader;
    }

    @Override // p427xg.AbstractC14146p
    /* renamed from: a */
    public AbstractC6895g mo1525a(AbstractC14146p.C14147a request) {
        String C;
        C9971q.m14633g(request, "request");
        C11136b a = request.m1522a();
        C11137c h = a.m10810h();
        C9971q.m14634f(h, "classId.packageFqName");
        String b = a.m10809i().m10803b();
        C9971q.m14634f(b, "classId.relativeClassName.asString()");
        C = C12718u.m5741C(b, '.', '$', false, 4, null);
        if (!h.m10801d()) {
            C = h.m10803b() + '.' + C;
        }
        Class<?> a2 = C13085e.m4634a(this.f29392a, C);
        if (a2 != null) {
            return new C13294l(a2);
        }
        return null;
    }

    @Override // p427xg.AbstractC14146p
    /* renamed from: b */
    public AbstractC6909u mo1524b(C11137c fqName, boolean z) {
        C9971q.m14633g(fqName, "fqName");
        return new C13313w(fqName);
    }

    @Override // p427xg.AbstractC14146p
    /* renamed from: c */
    public Set<String> mo1523c(C11137c packageFqName) {
        C9971q.m14633g(packageFqName, "packageFqName");
        return null;
    }
}
