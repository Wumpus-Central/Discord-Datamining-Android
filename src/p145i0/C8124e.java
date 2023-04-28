package p145i0;

import p145i0.C8161n;

/* renamed from: i0.e */
/* loaded from: classes.dex */
final class C8124e extends C8161n.AbstractC8163b {

    /* renamed from: b */
    private final C8194v f17578b;

    /* renamed from: c */
    private final int f17579c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8124e(C8194v vVar, int i) {
        if (vVar != null) {
            this.f17578b = vVar;
            this.f17579c = i;
            return;
        }
        throw new NullPointerException("Null fallbackQuality");
    }

    @Override // p145i0.C8161n.AbstractC8163b
    /* renamed from: c */
    C8194v mo20497c() {
        return this.f17578b;
    }

    @Override // p145i0.C8161n.AbstractC8163b
    /* renamed from: d */
    int mo20496d() {
        return this.f17579c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8161n.AbstractC8163b)) {
            return false;
        }
        C8161n.AbstractC8163b bVar = (C8161n.AbstractC8163b) obj;
        if (!this.f17578b.equals(bVar.mo20497c()) || this.f17579c != bVar.mo20496d()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.f17578b.hashCode() ^ 1000003) * 1000003) ^ this.f17579c;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.f17578b + ", fallbackRule=" + this.f17579c + "}";
    }
}
