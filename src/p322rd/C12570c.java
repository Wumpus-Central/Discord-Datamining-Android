package p322rd;

import java.util.ArrayList;
import java.util.List;

/* renamed from: rd.c */
/* loaded from: classes3.dex */
final class C12570c {

    /* renamed from: a */
    private final List<C12569b> f28260a;

    /* renamed from: b */
    private final int f28261b;

    /* renamed from: c */
    private final boolean f28262c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12570c(List<C12569b> list, int i, boolean z) {
        this.f28260a = new ArrayList(list);
        this.f28261b = i;
        this.f28262c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<C12569b> m6525a() {
        return this.f28260a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m6524b() {
        return this.f28261b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m6523c(List<C12569b> list) {
        return this.f28260a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C12570c)) {
            return false;
        }
        C12570c cVar = (C12570c) obj;
        if (!this.f28260a.equals(cVar.m6525a()) || this.f28262c != cVar.f28262c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f28260a.hashCode() ^ Boolean.valueOf(this.f28262c).hashCode();
    }

    public String toString() {
        return "{ " + this.f28260a + " }";
    }
}
