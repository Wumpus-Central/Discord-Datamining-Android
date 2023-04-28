package pa;

import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: pa.p */
/* loaded from: classes3.dex */
public final class C11604p implements Iterable<String> {

    /* renamed from: k */
    final /* synthetic */ CharSequence f25865k;

    /* renamed from: l */
    final /* synthetic */ C11606r f25866l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11604p(C11606r rVar, CharSequence charSequence) {
        this.f25866l = rVar;
        this.f25865k = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        Iterator<String> h;
        h = this.f25866l.m9273h(this.f25865k);
        return h;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator<String> it = iterator();
        try {
            if (it.hasNext()) {
                sb2.append(C11600l.m9286a(it.next(), ", "));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ", ");
                    sb2.append(C11600l.m9286a(it.next(), ", "));
                }
            }
            sb2.append(']');
            return sb2.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
