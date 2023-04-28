package p390w;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: w.v1 */
/* loaded from: classes.dex */
public abstract class AbstractC13684v1<C> {

    /* renamed from: a */
    private Set<C> f30558a = new HashSet();

    /* renamed from: a */
    public void m3055a(List<C> list) {
        this.f30558a.addAll(list);
    }

    /* renamed from: b */
    public abstract AbstractC13684v1<C> clone();

    /* renamed from: c */
    public List<C> m3053c() {
        return Collections.unmodifiableList(new ArrayList(this.f30558a));
    }
}
