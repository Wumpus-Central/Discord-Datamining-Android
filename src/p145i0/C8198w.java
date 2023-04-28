package p145i0;

import android.util.Size;
import androidx.camera.core.AbstractC1911r;
import androidx.camera.core.C1915r1;
import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p145i0.C8161n;
import p390w.AbstractC13609j;

/* renamed from: i0.w */
/* loaded from: classes.dex */
public final class C8198w {

    /* renamed from: a */
    private final List<C8194v> f17730a;

    /* renamed from: b */
    private final C8161n f17731b;

    C8198w(List<C8194v> list, C8161n nVar) {
        boolean z;
        if (!list.isEmpty() || nVar != C8161n.f17643a) {
            z = true;
        } else {
            z = false;
        }
        C2517g.m37593b(z, "No preferred quality and fallback strategy.");
        this.f17730a = Collections.unmodifiableList(new ArrayList(list));
        this.f17731b = nVar;
    }

    /* renamed from: a */
    private void m20329a(List<C8194v> list, Set<C8194v> set) {
        C8194v vVar;
        if (!list.isEmpty() && !set.containsAll(list)) {
            C1915r1.m39527a("QualitySelector", "Select quality by fallbackStrategy = " + this.f17731b);
            C8161n nVar = this.f17731b;
            if (nVar != C8161n.f17643a) {
                C2517g.m37585j(nVar instanceof C8161n.AbstractC8163b, "Currently only support type RuleStrategy");
                C8161n.AbstractC8163b bVar = (C8161n.AbstractC8163b) this.f17731b;
                List<C8194v> b = C8194v.m20333b();
                boolean z = false;
                if (bVar.mo20497c() == C8194v.f17726f) {
                    vVar = b.get(0);
                } else if (bVar.mo20497c() == C8194v.f17725e) {
                    vVar = b.get(b.size() - 1);
                } else {
                    vVar = bVar.mo20497c();
                }
                int indexOf = b.indexOf(vVar);
                if (indexOf != -1) {
                    z = true;
                }
                C2517g.m37586i(z);
                ArrayList arrayList = new ArrayList();
                for (int i = indexOf - 1; i >= 0; i--) {
                    C8194v vVar2 = b.get(i);
                    if (list.contains(vVar2)) {
                        arrayList.add(vVar2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = indexOf + 1; i2 < b.size(); i2++) {
                    C8194v vVar3 = b.get(i2);
                    if (list.contains(vVar3)) {
                        arrayList2.add(vVar3);
                    }
                }
                C1915r1.m39527a("QualitySelector", "sizeSortedQualities = " + b + ", fallback quality = " + vVar + ", largerQualities = " + arrayList + ", smallerQualities = " + arrayList2);
                int d = bVar.mo20496d();
                if (d == 0) {
                    return;
                }
                if (d == 1) {
                    set.addAll(arrayList);
                    set.addAll(arrayList2);
                } else if (d == 2) {
                    set.addAll(arrayList);
                } else if (d == 3) {
                    set.addAll(arrayList2);
                    set.addAll(arrayList);
                } else if (d == 4) {
                    set.addAll(arrayList2);
                } else {
                    throw new AssertionError("Unhandled fallback strategy: " + this.f17731b);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m20328b(C8194v vVar) {
        boolean a = C8194v.m20334a(vVar);
        C2517g.m37593b(a, "Invalid quality: " + vVar);
    }

    /* renamed from: c */
    private static void m20327c(List<C8194v> list) {
        for (C8194v vVar : list) {
            boolean a = C8194v.m20334a(vVar);
            C2517g.m37593b(a, "qualities contain invalid quality: " + vVar);
        }
    }

    /* renamed from: d */
    public static C8198w m20326d(C8194v vVar) {
        return m20325e(vVar, C8161n.f17643a);
    }

    /* renamed from: e */
    public static C8198w m20325e(C8194v vVar, C8161n nVar) {
        C2517g.m37587h(vVar, "quality cannot be null");
        C2517g.m37587h(nVar, "fallbackStrategy cannot be null");
        m20328b(vVar);
        return new C8198w(Arrays.asList(vVar), nVar);
    }

    /* renamed from: f */
    public static C8198w m20324f(List<C8194v> list, C8161n nVar) {
        C2517g.m37587h(list, "qualities cannot be null");
        C2517g.m37587h(nVar, "fallbackStrategy cannot be null");
        C2517g.m37593b(!list.isEmpty(), "qualities cannot be empty");
        m20327c(list);
        return new C8198w(list, nVar);
    }

    /* renamed from: h */
    public static Size m20322h(AbstractC1911r rVar, C8194v vVar) {
        m20328b(vVar);
        AbstractC13609j d = C8107a1.m20587c(rVar).m20586d(vVar);
        if (d != null) {
            return new Size(d.mo3232p(), d.mo3234n());
        }
        return null;
    }

    /* renamed from: i */
    public static List<C8194v> m20321i(AbstractC1911r rVar) {
        return C8107a1.m20587c(rVar).m20585e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public List<C8194v> m20323g(AbstractC1911r rVar) {
        List<C8194v> e = C8107a1.m20587c(rVar).m20585e();
        if (e.isEmpty()) {
            C1915r1.m39517k("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        C1915r1.m39527a("QualitySelector", "supportedQualities = " + e);
        Set<C8194v> linkedHashSet = new LinkedHashSet<>();
        Iterator<C8194v> it = this.f17730a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C8194v next = it.next();
            if (next == C8194v.f17726f) {
                linkedHashSet.addAll(e);
                break;
            } else if (next == C8194v.f17725e) {
                ArrayList arrayList = new ArrayList(e);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            } else if (e.contains(next)) {
                linkedHashSet.add(next);
            } else {
                C1915r1.m39517k("QualitySelector", "quality is not supported and will be ignored: " + next);
            }
        }
        m20329a(e, linkedHashSet);
        return new ArrayList(linkedHashSet);
    }

    public String toString() {
        return "QualitySelector{preferredQualities=" + this.f17730a + ", fallbackStrategy=" + this.f17731b + "}";
    }
}
