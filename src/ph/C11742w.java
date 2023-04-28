package ph;

import java.util.List;

/* renamed from: ph.w */
/* loaded from: classes8.dex */
public class C11742w extends RuntimeException {

    /* renamed from: k */
    private final List<String> f26216k = null;

    public C11742w(AbstractC11724q qVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* renamed from: a */
    public C11713k m8716a() {
        return new C11713k(getMessage());
    }
}
