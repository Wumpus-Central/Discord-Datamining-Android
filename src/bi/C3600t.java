package bi;

import kotlin.jvm.internal.C9971q;
import p249nh.C11136b;

/* renamed from: bi.t */
/* loaded from: classes8.dex */
public final class C3600t<T> {

    /* renamed from: a */
    private final T f5864a;

    /* renamed from: b */
    private final T f5865b;

    /* renamed from: c */
    private final String f5866c;

    /* renamed from: d */
    private final C11136b f5867d;

    public C3600t(T t, T t2, String filePath, C11136b classId) {
        C9971q.m14633g(filePath, "filePath");
        C9971q.m14633g(classId, "classId");
        this.f5864a = t;
        this.f5865b = t2;
        this.f5866c = filePath;
        this.f5867d = classId;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3600t)) {
            return false;
        }
        C3600t tVar = (C3600t) obj;
        return C9971q.m14638b(this.f5864a, tVar.f5864a) && C9971q.m14638b(this.f5865b, tVar.f5865b) && C9971q.m14638b(this.f5866c, tVar.f5866c) && C9971q.m14638b(this.f5867d, tVar.f5867d);
    }

    public int hashCode() {
        T t = this.f5864a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f5865b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return ((((hashCode + i) * 31) + this.f5866c.hashCode()) * 31) + this.f5867d.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f5864a + ", expectedVersion=" + this.f5865b + ", filePath=" + this.f5866c + ", classId=" + this.f5867d + ')';
    }
}
