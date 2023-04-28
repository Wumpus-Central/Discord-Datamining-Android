package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class ViewModelStore {

    /* renamed from: a */
    private final HashMap<String, AbstractC3055w> f4459a = new HashMap<>();

    /* renamed from: a */
    public final void m35792a() {
        for (AbstractC3055w wVar : this.f4459a.values()) {
            wVar.m35740a();
        }
        this.f4459a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final AbstractC3055w m35791b(String str) {
        return this.f4459a.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Set<String> m35790c() {
        return new HashSet(this.f4459a.keySet());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m35789d(String str, AbstractC3055w wVar) {
        AbstractC3055w put = this.f4459a.put(str, wVar);
        if (put != null) {
            put.mo35717d();
        }
    }
}
