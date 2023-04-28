package p288q;

import androidx.core.util.C2517g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p288q.C11920t1;
import p390w.AbstractC13614j2;
import p390w.C13637m2;

/* renamed from: q.e1 */
/* loaded from: classes.dex */
public class C11810e1 implements AbstractC13614j2 {

    /* renamed from: a */
    private final C11920t1 f26351a;

    /* renamed from: b */
    private final List<C13637m2> f26352b;

    /* renamed from: c */
    private volatile boolean f26353c = false;

    public C11810e1(C11920t1 t1Var, List<C13637m2> list) {
        boolean z = false;
        z = t1Var.f26654l == C11920t1.EnumC11924d.OPENED ? true : z;
        C2517g.m37593b(z, "CaptureSession state must be OPENED. Current state:" + t1Var.f26654l);
        this.f26351a = t1Var;
        this.f26352b = Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public void m8595a() {
        this.f26353c = true;
    }
}
