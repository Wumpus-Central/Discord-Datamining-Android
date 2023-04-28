package p163j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.m */
/* loaded from: classes2.dex */
public final class C9192m implements AbstractC9186g {

    /* renamed from: a */
    private final String f20177a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9192m(String str) {
        this.f20177a = str;
    }

    @Override // p163j$.time.format.AbstractC9186g
    /* renamed from: a */
    public final boolean mo16712a(C9197r rVar, StringBuilder sb2) {
        sb2.append(this.f20177a);
        return true;
    }

    public final String toString() {
        String replace = this.f20177a.replace("'", "''");
        return "'" + replace + "'";
    }
}
