package ph;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ph.AbstractC11702i;

/* renamed from: ph.g */
/* loaded from: classes8.dex */
public class C11697g {

    /* renamed from: b */
    private static final C11697g f26133b = new C11697g(true);

    /* renamed from: a */
    private final Map<C11698a, AbstractC11702i.C11709f<?, ?>> f26134a;

    /* renamed from: ph.g$a */
    /* loaded from: classes8.dex */
    private static final class C11698a {

        /* renamed from: a */
        private final Object f26135a;

        /* renamed from: b */
        private final int f26136b;

        C11698a(Object obj, int i) {
            this.f26135a = obj;
            this.f26136b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11698a)) {
                return false;
            }
            C11698a aVar = (C11698a) obj;
            if (this.f26135a == aVar.f26135a && this.f26136b == aVar.f26136b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f26135a) * 65535) + this.f26136b;
        }
    }

    C11697g() {
        this.f26134a = new HashMap();
    }

    /* renamed from: c */
    public static C11697g m8880c() {
        return f26133b;
    }

    /* renamed from: d */
    public static C11697g m8879d() {
        return new C11697g();
    }

    /* renamed from: a */
    public final void m8882a(AbstractC11702i.C11709f<?, ?> fVar) {
        this.f26134a.put(new C11698a(fVar.m8818b(), fVar.m8816d()), fVar);
    }

    /* renamed from: b */
    public <ContainingType extends AbstractC11724q> AbstractC11702i.C11709f<ContainingType, ?> m8881b(ContainingType containingtype, int i) {
        return (AbstractC11702i.C11709f<ContainingType, ?>) this.f26134a.get(new C11698a(containingtype, i));
    }

    private C11697g(boolean z) {
        this.f26134a = Collections.emptyMap();
    }
}
