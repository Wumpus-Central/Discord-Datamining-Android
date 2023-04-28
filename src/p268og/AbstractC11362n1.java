package p268og;

import kotlin.jvm.internal.C9971q;

/* renamed from: og.n1 */
/* loaded from: classes8.dex */
public abstract class AbstractC11362n1 {

    /* renamed from: a */
    private final String f25289a;

    /* renamed from: b */
    private final boolean f25290b;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC11362n1(String name, boolean z) {
        C9971q.m14633g(name, "name");
        this.f25289a = name;
        this.f25290b = z;
    }

    /* renamed from: a */
    public Integer mo5177a(AbstractC11362n1 visibility) {
        C9971q.m14633g(visibility, "visibility");
        return C11348m1.f25274a.m10189a(this, visibility);
    }

    /* renamed from: b */
    public String mo5176b() {
        return this.f25289a;
    }

    /* renamed from: c */
    public final boolean m10185c() {
        return this.f25290b;
    }

    /* renamed from: d */
    public AbstractC11362n1 mo5175d() {
        return this;
    }

    public final String toString() {
        return mo5176b();
    }
}
