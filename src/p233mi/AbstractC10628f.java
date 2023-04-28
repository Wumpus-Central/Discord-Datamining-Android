package p233mi;

import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11397y;

/* renamed from: mi.f */
/* loaded from: classes8.dex */
public interface AbstractC10628f {

    /* renamed from: mi.f$a */
    /* loaded from: classes8.dex */
    public static final class C10629a {
        /* renamed from: a */
        public static String m12707a(AbstractC10628f fVar, AbstractC11397y functionDescriptor) {
            C9971q.m14633g(functionDescriptor, "functionDescriptor");
            if (!fVar.mo12674a(functionDescriptor)) {
                return fVar.getDescription();
            }
            return null;
        }
    }

    /* renamed from: a */
    boolean mo12674a(AbstractC11397y yVar);

    /* renamed from: b */
    String mo12675b(AbstractC11397y yVar);

    String getDescription();
}
