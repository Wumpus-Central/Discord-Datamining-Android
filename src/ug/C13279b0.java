package ug;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import p086eh.AbstractC6888b0;
import p249nh.C11137c;
import p249nh.C11142f;

/* renamed from: ug.b0 */
/* loaded from: classes8.dex */
public final class C13279b0 extends AbstractC13306p implements AbstractC6888b0 {

    /* renamed from: a */
    private final AbstractC13316z f29812a;

    /* renamed from: b */
    private final Annotation[] f29813b;

    /* renamed from: c */
    private final String f29814c;

    /* renamed from: d */
    private final boolean f29815d;

    public C13279b0(AbstractC13316z type, Annotation[] reflectAnnotations, String str, boolean z) {
        C9971q.m14633g(type, "type");
        C9971q.m14633g(reflectAnnotations, "reflectAnnotations");
        this.f29812a = type;
        this.f29813b = reflectAnnotations;
        this.f29814c = str;
        this.f29815d = z;
    }

    @Override // p086eh.AbstractC6891d
    /* renamed from: D */
    public boolean mo3971D() {
        return false;
    }

    /* renamed from: P */
    public AbstractC13316z getType() {
        return this.f29812a;
    }

    @Override // p086eh.AbstractC6888b0
    /* renamed from: a */
    public boolean mo4062a() {
        return this.f29815d;
    }

    @Override // p086eh.AbstractC6888b0
    public C11142f getName() {
        String str = this.f29814c;
        if (str != null) {
            return C11142f.m10768e(str);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C13279b0.class.getName());
        sb2.append(": ");
        sb2.append(mo4062a() ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(getType());
        return sb2.toString();
    }

    @Override // p086eh.AbstractC6891d
    /* renamed from: c */
    public C13286e mo3966c(C11137c fqName) {
        C9971q.m14633g(fqName, "fqName");
        return C13291i.m4034a(this.f29813b, fqName);
    }

    @Override // p086eh.AbstractC6891d
    public List<C13286e> getAnnotations() {
        return C13291i.m4033b(this.f29813b);
    }
}
