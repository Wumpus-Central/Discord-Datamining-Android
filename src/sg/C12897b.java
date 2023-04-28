package sg;

import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11362n1;
import p268og.C11348m1;

/* renamed from: sg.b */
/* loaded from: classes8.dex */
public final class C12897b extends AbstractC11362n1 {

    /* renamed from: c */
    public static final C12897b f28971c = new C12897b();

    private C12897b() {
        super("protected_and_package", true);
    }

    @Override // p268og.AbstractC11362n1
    /* renamed from: a */
    public Integer mo5177a(AbstractC11362n1 visibility) {
        int i;
        C9971q.m14633g(visibility, "visibility");
        if (C9971q.m14638b(this, visibility)) {
            return 0;
        }
        if (visibility == C11348m1.C11350b.f25278c) {
            return null;
        }
        if (C11348m1.f25274a.m10188b(visibility)) {
            i = 1;
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }

    @Override // p268og.AbstractC11362n1
    /* renamed from: b */
    public String mo5176b() {
        return "protected/*protected and package*/";
    }

    @Override // p268og.AbstractC11362n1
    /* renamed from: d */
    public AbstractC11362n1 mo5175d() {
        return C11348m1.C11355g.f25283c;
    }
}
