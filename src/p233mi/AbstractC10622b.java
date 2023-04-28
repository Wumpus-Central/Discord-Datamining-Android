package p233mi;

import java.util.List;
import kotlin.jvm.internal.C9971q;
import p233mi.AbstractC10630g;
import p268og.AbstractC11397y;

/* renamed from: mi.b */
/* loaded from: classes8.dex */
public abstract class AbstractC10622b {
    /* renamed from: a */
    public final AbstractC10630g m12712a(AbstractC11397y functionDescriptor) {
        C9971q.m14633g(functionDescriptor, "functionDescriptor");
        for (C10634h hVar : mo12691b()) {
            if (hVar.m12704b(functionDescriptor)) {
                return hVar.m12705a(functionDescriptor);
            }
        }
        return AbstractC10630g.C10631a.f23522b;
    }

    /* renamed from: b */
    public abstract List<C10634h> mo12691b();
}
