package p355u;

import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p340t.C12917e;
import p390w.AbstractC13609j;

/* renamed from: u.c */
/* loaded from: classes.dex */
public class C13163c {

    /* renamed from: a */
    private final C12917e f29518a;

    /* renamed from: b */
    private final Set<Size> f29519b;

    public C13163c(C12917e eVar) {
        Set<Size> set;
        this.f29518a = eVar;
        if (eVar != null) {
            set = new HashSet<>(eVar.m5072a());
        } else {
            set = Collections.emptySet();
        }
        this.f29519b = set;
    }

    /* renamed from: a */
    public boolean m4435a() {
        return this.f29518a != null;
    }

    /* renamed from: b */
    public boolean m4434b(AbstractC13609j jVar) {
        if (jVar == null) {
            return false;
        }
        if (this.f29518a == null) {
            return true;
        }
        return this.f29519b.contains(new Size(jVar.mo3232p(), jVar.mo3234n()));
    }
}
