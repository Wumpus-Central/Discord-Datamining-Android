package p390w;

import androidx.camera.core.C1909q1;
import androidx.camera.core.C1915r1;
import androidx.camera.core.C1933v;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: w.h0 */
/* loaded from: classes.dex */
public final class C13602h0 {

    /* renamed from: a */
    private final Object f30406a = new Object();

    /* renamed from: b */
    private final Map<String, AbstractC13597g0> f30407b = new LinkedHashMap();

    /* renamed from: c */
    private final Set<AbstractC13597g0> f30408c = new HashSet();

    /* renamed from: a */
    public LinkedHashSet<AbstractC13597g0> m3259a() {
        LinkedHashSet<AbstractC13597g0> linkedHashSet;
        synchronized (this.f30406a) {
            linkedHashSet = new LinkedHashSet<>(this.f30407b.values());
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public void m3258b(AbstractC13584d0 d0Var) {
        synchronized (this.f30406a) {
            try {
                try {
                    for (String str : d0Var.mo3307b()) {
                        C1915r1.m39527a("CameraRepository", "Added camera: " + str);
                        this.f30407b.put(str, d0Var.mo3308a(str));
                    }
                } catch (C1933v e) {
                    throw new C1909q1(e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
