package qa;

import java.util.Arrays;

/* renamed from: qa.l0 */
/* loaded from: classes3.dex */
public final class C12077l0 extends AbstractC12081n0 {

    /* renamed from: k */
    private final String f27118k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12077l0(String str) {
        this.f27118k = (String) C12080n.m7871b(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // qa.AbstractC12081n0
    /* renamed from: a */
    public final int mo7865a() {
        return 3;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(AbstractC12081n0 n0Var) {
        AbstractC12081n0 n0Var2 = n0Var;
        n0Var2.mo7865a();
        C12077l0 l0Var = (C12077l0) n0Var2;
        if (this.f27118k.length() != l0Var.f27118k.length()) {
            return this.f27118k.length() - l0Var.f27118k.length();
        }
        return this.f27118k.compareTo(l0Var.f27118k);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12077l0.class == obj.getClass()) {
            return this.f27118k.equals(((C12077l0) obj).f27118k);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{3, this.f27118k});
    }

    public final String toString() {
        String str = this.f27118k;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }
}
