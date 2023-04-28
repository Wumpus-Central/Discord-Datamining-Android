package p163j$.time.format;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.e */
/* loaded from: classes2.dex */
public final class C9184e implements AbstractC9186g {

    /* renamed from: a */
    private final char f20159a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9184e(char c) {
        this.f20159a = c;
    }

    @Override // p163j$.time.format.AbstractC9186g
    /* renamed from: a */
    public final boolean mo16712a(C9197r rVar, StringBuilder sb2) {
        sb2.append(this.f20159a);
        return true;
    }

    public final String toString() {
        char c = this.f20159a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
