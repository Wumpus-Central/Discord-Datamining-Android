package p427xg;

import java.util.Collection;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p108fh.C7177i;
import p108fh.EnumC7176h;

/* renamed from: xg.r */
/* loaded from: classes8.dex */
public final class C14150r {

    /* renamed from: a */
    private final C7177i f31956a;

    /* renamed from: b */
    private final Collection<EnumC14107b> f31957b;

    /* renamed from: c */
    private final boolean f31958c;

    /* JADX WARN: Multi-variable type inference failed */
    public C14150r(C7177i nullabilityQualifier, Collection<? extends EnumC14107b> qualifierApplicabilityTypes, boolean z) {
        C9971q.m14633g(nullabilityQualifier, "nullabilityQualifier");
        C9971q.m14633g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f31956a = nullabilityQualifier;
        this.f31957b = qualifierApplicabilityTypes;
        this.f31958c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ C14150r m1519b(C14150r rVar, C7177i iVar, Collection collection, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = rVar.f31956a;
        }
        if ((i & 2) != 0) {
            collection = rVar.f31957b;
        }
        if ((i & 4) != 0) {
            z = rVar.f31958c;
        }
        return rVar.m1520a(iVar, collection, z);
    }

    /* renamed from: a */
    public final C14150r m1520a(C7177i nullabilityQualifier, Collection<? extends EnumC14107b> qualifierApplicabilityTypes, boolean z) {
        C9971q.m14633g(nullabilityQualifier, "nullabilityQualifier");
        C9971q.m14633g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new C14150r(nullabilityQualifier, qualifierApplicabilityTypes, z);
    }

    /* renamed from: c */
    public final boolean m1518c() {
        return this.f31958c;
    }

    /* renamed from: d */
    public final C7177i m1517d() {
        return this.f31956a;
    }

    /* renamed from: e */
    public final Collection<EnumC14107b> m1516e() {
        return this.f31957b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14150r)) {
            return false;
        }
        C14150r rVar = (C14150r) obj;
        return C9971q.m14638b(this.f31956a, rVar.f31956a) && C9971q.m14638b(this.f31957b, rVar.f31957b) && this.f31958c == rVar.f31958c;
    }

    public int hashCode() {
        int hashCode = ((this.f31956a.hashCode() * 31) + this.f31957b.hashCode()) * 31;
        boolean z = this.f31958c;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f31956a + ", qualifierApplicabilityTypes=" + this.f31957b + ", definitelyNotNull=" + this.f31958c + ')';
    }

    public /* synthetic */ C14150r(C7177i iVar, Collection collection, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, collection, (i & 4) != 0 ? iVar.m23273c() == EnumC7176h.NOT_NULL : z);
    }
}
