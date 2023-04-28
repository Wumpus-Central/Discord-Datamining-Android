package p233mi;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C9971q;
import p233mi.AbstractC10628f;
import p268og.AbstractC11335j1;
import p268og.AbstractC11397y;
import p388vh.C13508c;

/* renamed from: mi.m */
/* loaded from: classes8.dex */
final class C10646m implements AbstractC10628f {

    /* renamed from: a */
    public static final C10646m f23540a = new C10646m();

    /* renamed from: b */
    private static final String f23541b = "should not have varargs or parameters with default values";

    private C10646m() {
    }

    @Override // p233mi.AbstractC10628f
    /* renamed from: a */
    public boolean mo12674a(AbstractC11397y functionDescriptor) {
        boolean z;
        C9971q.m14633g(functionDescriptor, "functionDescriptor");
        List<AbstractC11335j1> i = functionDescriptor.mo6242i();
        C9971q.m14634f(i, "functionDescriptor.valueParameters");
        if ((i instanceof Collection) && i.isEmpty()) {
            return true;
        }
        for (AbstractC11335j1 it : i) {
            C9971q.m14634f(it, "it");
            if (C13508c.m3538c(it) || it.mo6304r0() != null) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // p233mi.AbstractC10628f
    /* renamed from: b */
    public String mo12675b(AbstractC11397y yVar) {
        return AbstractC10628f.C10629a.m12707a(this, yVar);
    }

    @Override // p233mi.AbstractC10628f
    public String getDescription() {
        return f23541b;
    }
}
