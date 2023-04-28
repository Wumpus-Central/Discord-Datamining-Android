package kotlinx.coroutines;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15074d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m15073d2 = {"Lkotlinx/coroutines/d1;", "Lkotlinx/coroutines/p1;", "", "toString", "", "k", "Z", "b", "()Z", "isActive", "Lkotlinx/coroutines/g2;", "d", "()Lkotlinx/coroutines/g2;", "list", "<init>", "(Z)V", "kotlinx-coroutines-core"}, m15072k = 1, m15071mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.d1 */
/* loaded from: classes8.dex */
public final class C10016d1 implements AbstractC10158p1 {

    /* renamed from: k */
    private final boolean f22149k;

    public C10016d1(boolean z) {
        this.f22149k = z;
    }

    @Override // kotlinx.coroutines.AbstractC10158p1
    /* renamed from: b */
    public boolean mo14113b() {
        return this.f22149k;
    }

    @Override // kotlinx.coroutines.AbstractC10158p1
    /* renamed from: d */
    public C10071g2 mo14112d() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(mo14113b() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
