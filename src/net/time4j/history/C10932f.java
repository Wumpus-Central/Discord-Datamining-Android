package net.time4j.history;

import net.time4j.C10892f0;
import p143hj.EnumC8042a0;

/* renamed from: net.time4j.history.f */
/* loaded from: classes8.dex */
final class C10932f {

    /* renamed from: a */
    final long f24273a;

    /* renamed from: b */
    final EnumC10926c f24274b;

    /* renamed from: c */
    final C10934h f24275c;

    /* renamed from: d */
    final C10934h f24276d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10932f(long j, EnumC10926c cVar, EnumC10926c cVar2) {
        this.f24273a = j;
        this.f24274b = cVar2;
        if (j == Long.MIN_VALUE) {
            C10934h hVar = new C10934h(EnumC10937j.BC, 1000000000, 1, 1);
            this.f24275c = hVar;
            this.f24276d = hVar;
            return;
        }
        this.f24275c = cVar2.mo11596c(j);
        this.f24276d = cVar.mo11596c(j - 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10932f)) {
            return false;
        }
        C10932f fVar = (C10932f) obj;
        if (this.f24273a == fVar.f24273a && this.f24274b == fVar.f24274b && this.f24276d.equals(fVar.f24276d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f24273a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return C10932f.class.getName() + "[start=" + this.f24273a + " (" + C10892f0.m11869Q0(this.f24273a, EnumC8042a0.MODIFIED_JULIAN_DATE) + "),algorithm=" + this.f24274b + ",date-before-cutover=" + this.f24276d + ",date-at-cutover=" + this.f24275c + ']';
    }
}
