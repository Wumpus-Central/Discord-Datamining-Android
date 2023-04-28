package th;

import kotlin.jvm.internal.C9971q;
import p249nh.C11136b;

/* renamed from: th.f */
/* loaded from: classes8.dex */
public final class C13103f {

    /* renamed from: a */
    private final C11136b f29407a;

    /* renamed from: b */
    private final int f29408b;

    public C13103f(C11136b classId, int i) {
        C9971q.m14633g(classId, "classId");
        this.f29407a = classId;
        this.f29408b = i;
    }

    /* renamed from: a */
    public final C11136b m4601a() {
        return this.f29407a;
    }

    /* renamed from: b */
    public final int m4600b() {
        return this.f29408b;
    }

    /* renamed from: c */
    public final int m4599c() {
        return this.f29408b;
    }

    /* renamed from: d */
    public final C11136b m4598d() {
        return this.f29407a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13103f)) {
            return false;
        }
        C13103f fVar = (C13103f) obj;
        return C9971q.m14638b(this.f29407a, fVar.f29407a) && this.f29408b == fVar.f29408b;
    }

    public int hashCode() {
        return (this.f29407a.hashCode() * 31) + this.f29408b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i = this.f29408b;
        for (int i2 = 0; i2 < i; i2++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f29407a);
        int i3 = this.f29408b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb2.append(">");
        }
        String sb3 = sb2.toString();
        C9971q.m14634f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
