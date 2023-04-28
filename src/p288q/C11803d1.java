package p288q;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Size;
import androidx.core.util.C2517g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p308r.C12306v0;
import p390w.AbstractC13579c0;
import p390w.AbstractC13658q2;
import p390w.AbstractC13697x2;

/* renamed from: q.d1 */
/* loaded from: classes.dex */
public final class C11803d1 implements AbstractC13579c0 {

    /* renamed from: a */
    private final Map<String, C11898q2> f26343a;

    /* renamed from: b */
    private final AbstractC11808e f26344b;

    /* renamed from: q.d1$a */
    /* loaded from: classes.dex */
    class C11804a implements AbstractC11808e {
        C11804a() {
        }

        @Override // p288q.AbstractC11808e
        /* renamed from: a */
        public CamcorderProfile mo8597a(int i, int i2) {
            return CamcorderProfile.get(i, i2);
        }

        @Override // p288q.AbstractC11808e
        /* renamed from: b */
        public boolean mo8596b(int i, int i2) {
            return CamcorderProfile.hasProfile(i, i2);
        }
    }

    public C11803d1(Context context, Object obj, Set<String> set) {
        this(context, new C11804a(), obj, set);
    }

    /* renamed from: c */
    private void m8599c(Context context, C12306v0 v0Var, Set<String> set) {
        C2517g.m37588g(context);
        for (String str : set) {
            this.f26343a.put(str, new C11898q2(context, str, v0Var, this.f26344b));
        }
    }

    @Override // p390w.AbstractC13579c0
    /* renamed from: a */
    public AbstractC13658q2 mo3317a(String str, int i, Size size) {
        C11898q2 q2Var = this.f26343a.get(str);
        if (q2Var != null) {
            return q2Var.m8371L(i, size);
        }
        return null;
    }

    @Override // p390w.AbstractC13579c0
    /* renamed from: b */
    public Map<AbstractC13697x2<?>, Size> mo3316b(String str, List<AbstractC13658q2> list, List<AbstractC13697x2<?>> list2) {
        C2517g.m37593b(!list2.isEmpty(), "No new use cases to be bound.");
        C11898q2 q2Var = this.f26343a.get(str);
        if (q2Var != null) {
            return q2Var.m8346y(list, list2);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    C11803d1(Context context, AbstractC11808e eVar, Object obj, Set<String> set) {
        C12306v0 v0Var;
        this.f26343a = new HashMap();
        C2517g.m37588g(eVar);
        this.f26344b = eVar;
        if (obj instanceof C12306v0) {
            v0Var = (C12306v0) obj;
        } else {
            v0Var = C12306v0.m7182a(context);
        }
        m8599c(context, v0Var, set);
    }
}
