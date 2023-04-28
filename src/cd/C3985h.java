package cd;

import android.content.Context;
import p177jc.AbstractC9528e;
import p177jc.AbstractC9534h;
import p177jc.C9523d;
import p177jc.C9548q;

/* renamed from: cd.h */
/* loaded from: classes3.dex */
public class C3985h {

    /* renamed from: cd.h$a */
    /* loaded from: classes3.dex */
    public interface AbstractC3986a<T> {
        /* renamed from: a */
        String mo20944a(T t);
    }

    /* renamed from: b */
    public static C9523d<?> m33198b(String str, String str2) {
        return C9523d.m16086i(AbstractC3983f.m33202a(str, str2), AbstractC3983f.class);
    }

    /* renamed from: c */
    public static C9523d<?> m33197c(final String str, final AbstractC3986a<Context> aVar) {
        return C9523d.m16085j(AbstractC3983f.class).m16077b(C9548q.m16018i(Context.class)).m16074e(new AbstractC9534h() { // from class: cd.g
            @Override // p177jc.AbstractC9534h
            /* renamed from: a */
            public final Object mo4207a(AbstractC9528e eVar) {
                AbstractC3983f d;
                d = C3985h.m33196d(str, aVar, eVar);
                return d;
            }
        }).m16075d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ AbstractC3983f m33196d(String str, AbstractC3986a aVar, AbstractC9528e eVar) {
        return AbstractC3983f.m33202a(str, aVar.mo20944a((Context) eVar.mo16062a(Context.class)));
    }
}
