package p233mi;

import fi.AbstractC7267g0;
import ki.C9883a;
import kotlin.jvm.internal.C9971q;
import p217lg.C10430j;
import p233mi.AbstractC10628f;
import p268og.AbstractC11335j1;
import p268og.AbstractC11397y;
import p388vh.C13508c;

/* renamed from: mi.j */
/* loaded from: classes8.dex */
final class C10640j implements AbstractC10628f {

    /* renamed from: a */
    public static final C10640j f23534a = new C10640j();

    /* renamed from: b */
    private static final String f23535b = "second parameter must be of type KProperty<*> or its supertype";

    private C10640j() {
    }

    @Override // p233mi.AbstractC10628f
    /* renamed from: a */
    public boolean mo12674a(AbstractC11397y functionDescriptor) {
        C9971q.m14633g(functionDescriptor, "functionDescriptor");
        AbstractC11335j1 secondParameter = functionDescriptor.mo6242i().get(1);
        C10430j.C10432b bVar = C10430j.f22860k;
        C9971q.m14634f(secondParameter, "secondParameter");
        AbstractC7267g0 a = bVar.m13335a(C13508c.m3525p(secondParameter));
        if (a == null) {
            return false;
        }
        AbstractC7267g0 type = secondParameter.getType();
        C9971q.m14634f(type, "secondParameter.type");
        return C9883a.m15089p(a, C9883a.m15085t(type));
    }

    @Override // p233mi.AbstractC10628f
    /* renamed from: b */
    public String mo12675b(AbstractC11397y yVar) {
        return AbstractC10628f.C10629a.m12707a(this, yVar);
    }

    @Override // p233mi.AbstractC10628f
    public String getDescription() {
        return f23535b;
    }
}
