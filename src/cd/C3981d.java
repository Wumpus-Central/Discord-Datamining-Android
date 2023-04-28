package cd;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: cd.d */
/* loaded from: classes3.dex */
public class C3981d {

    /* renamed from: b */
    private static volatile C3981d f6540b;

    /* renamed from: a */
    private final Set<AbstractC3983f> f6541a = new HashSet();

    C3981d() {
    }

    /* renamed from: a */
    public static C3981d m33205a() {
        C3981d dVar = f6540b;
        if (dVar == null) {
            synchronized (C3981d.class) {
                dVar = f6540b;
                if (dVar == null) {
                    dVar = new C3981d();
                    f6540b = dVar;
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public Set<AbstractC3983f> m33204b() {
        Set<AbstractC3983f> unmodifiableSet;
        synchronized (this.f6541a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f6541a);
        }
        return unmodifiableSet;
    }
}
