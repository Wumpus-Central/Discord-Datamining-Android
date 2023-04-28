package pa;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: pa.r */
/* loaded from: classes3.dex */
public final class C11606r {

    /* renamed from: a */
    private final AbstractC11599k f25872a;

    /* renamed from: b */
    private final boolean f25873b;

    /* renamed from: c */
    private final C11603o f25874c;

    private C11606r(C11603o oVar, boolean z, AbstractC11599k kVar, int i, byte[] bArr) {
        this.f25874c = oVar;
        this.f25873b = z;
        this.f25872a = kVar;
    }

    /* renamed from: c */
    public static C11606r m9278c(AbstractC11599k kVar) {
        return new C11606r(new C11603o(kVar), false, C11598j.f25862b, ViewDefaults.NUMBER_OF_LINES, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final Iterator<String> m9273h(CharSequence charSequence) {
        return new C11602n(this.f25874c, this, charSequence);
    }

    /* renamed from: b */
    public final C11606r m9279b() {
        return new C11606r(this.f25874c, true, this.f25872a, ViewDefaults.NUMBER_OF_LINES, null);
    }

    /* renamed from: d */
    public final Iterable<String> m9277d(CharSequence charSequence) {
        return new C11604p(this, charSequence);
    }

    /* renamed from: f */
    public final List<String> m9275f(CharSequence charSequence) {
        charSequence.getClass();
        Iterator<String> h = m9273h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h.hasNext()) {
            arrayList.add(h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
