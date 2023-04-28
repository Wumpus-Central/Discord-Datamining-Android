package p126h2;

import androidx.collection.C2095b;
import androidx.core.util.C2515e;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p343t2.C12947h;

/* renamed from: h2.n0 */
/* loaded from: classes.dex */
public class C7774n0 {

    /* renamed from: a */
    private boolean f16918a = false;

    /* renamed from: b */
    private final Set<AbstractC7776b> f16919b = new C2095b();

    /* renamed from: c */
    private final Map<String, C12947h> f16920c = new HashMap();

    /* renamed from: d */
    private final Comparator<C2515e<String, Float>> f16921d = new C7775a();

    /* renamed from: h2.n0$a */
    /* loaded from: classes.dex */
    class C7775a implements Comparator<C2515e<String, Float>> {
        C7775a() {
        }

        /* renamed from: b */
        public int compare(C2515e<String, Float> eVar, C2515e<String, Float> eVar2) {
            float floatValue = eVar.f3486b.floatValue();
            float floatValue2 = eVar2.f3486b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: h2.n0$b */
    /* loaded from: classes.dex */
    public interface AbstractC7776b {
        /* renamed from: a */
        void m21364a(float f);
    }

    /* renamed from: a */
    public void m21367a(String str, float f) {
        if (this.f16918a) {
            C12947h hVar = this.f16920c.get(str);
            if (hVar == null) {
                hVar = new C12947h();
                this.f16920c.put(str, hVar);
            }
            hVar.m4983a(f);
            if (str.equals("__container")) {
                for (AbstractC7776b bVar : this.f16919b) {
                    bVar.m21364a(f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m21366b(boolean z) {
        this.f16918a = z;
    }
}
