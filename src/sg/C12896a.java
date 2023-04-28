package sg;

import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11362n1;
import p268og.C11348m1;

/* renamed from: sg.a */
/* loaded from: classes8.dex */
public final class C12896a extends AbstractC11362n1 {

    /* renamed from: c */
    public static final C12896a f28970c = new C12896a();

    private C12896a() {
        super("package", false);
    }

    @Override // p268og.AbstractC11362n1
    /* renamed from: a */
    public Integer mo5177a(AbstractC11362n1 visibility) {
        C9971q.m14633g(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        if (C11348m1.f25274a.m10188b(visibility)) {
            return 1;
        }
        return -1;
    }

    @Override // p268og.AbstractC11362n1
    /* renamed from: b */
    public String mo5176b() {
        return "public/*package*/";
    }

    @Override // p268og.AbstractC11362n1
    /* renamed from: d */
    public AbstractC11362n1 mo5175d() {
        return C11348m1.C11355g.f25283c;
    }
}
