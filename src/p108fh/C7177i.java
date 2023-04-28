package p108fh;

import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: fh.i */
/* loaded from: classes8.dex */
public final class C7177i {

    /* renamed from: a */
    private final EnumC7176h f15593a;

    /* renamed from: b */
    private final boolean f15594b;

    public C7177i(EnumC7176h qualifier, boolean z) {
        C9971q.m14633g(qualifier, "qualifier");
        this.f15593a = qualifier;
        this.f15594b = z;
    }

    /* renamed from: b */
    public static /* synthetic */ C7177i m23274b(C7177i iVar, EnumC7176h hVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            hVar = iVar.f15593a;
        }
        if ((i & 2) != 0) {
            z = iVar.f15594b;
        }
        return iVar.m23275a(hVar, z);
    }

    /* renamed from: a */
    public final C7177i m23275a(EnumC7176h qualifier, boolean z) {
        C9971q.m14633g(qualifier, "qualifier");
        return new C7177i(qualifier, z);
    }

    /* renamed from: c */
    public final EnumC7176h m23273c() {
        return this.f15593a;
    }

    /* renamed from: d */
    public final boolean m23272d() {
        return this.f15594b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7177i)) {
            return false;
        }
        C7177i iVar = (C7177i) obj;
        return this.f15593a == iVar.f15593a && this.f15594b == iVar.f15594b;
    }

    public int hashCode() {
        int hashCode = this.f15593a.hashCode() * 31;
        boolean z = this.f15594b;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f15593a + ", isForWarningOnly=" + this.f15594b + ')';
    }

    public /* synthetic */ C7177i(EnumC7176h hVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, (i & 2) != 0 ? false : z);
    }
}
