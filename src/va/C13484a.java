package va;

import android.content.Context;
import com.google.android.gms.nearby.messages.internal.C5467u;
import com.google.android.gms.nearby.messages.internal.C5469w;
import p082ea.C6801d;
import p319ra.AbstractC12538t;
import p319ra.C12495b0;
import p319ra.C12517i1;
import p319ra.C12544w;
import p384v9.C13456a;
import p401wa.AbstractC13849a;
import p401wa.C13850b;
import p420x9.C14004p;
import p442ya.AbstractC14328c;
import p442ya.AbstractC14329d;
import p442ya.AbstractC14339l;
import p442ya.C14330e;
import za.C14602j;

/* renamed from: va.a */
/* loaded from: classes3.dex */
public final class C13484a {
    @Deprecated

    /* renamed from: a */
    public static final C13456a<C13850b> f30087a = new C13456a<>("Nearby.CONNECTIONS_API", C12544w.f28231b, C12544w.f28230a);
    @Deprecated

    /* renamed from: b */
    public static final AbstractC13849a f30088b = new C12544w();
    @Deprecated

    /* renamed from: c */
    public static final C13456a<C14330e> f30089c = new C13456a<>("Nearby.MESSAGES_API", C5469w.f10354c, C5469w.f10353b);
    @Deprecated

    /* renamed from: d */
    public static final AbstractC14328c f30090d = C5469w.f10352a;

    /* renamed from: e */
    public static final AbstractC14339l f30091e = new C14602j();
    @Deprecated

    /* renamed from: f */
    public static final C13456a f30092f = new C13456a("Nearby.BOOTSTRAP_API", C12495b0.f28148b, C12495b0.f28147a);
    @Deprecated

    /* renamed from: g */
    public static final AbstractC12538t f30093g = new C12495b0();

    /* renamed from: a */
    public static final AbstractC14329d m3605a(Context context) {
        C14004p.m2050k(context, "Context must not be null");
        return new C5467u(context, null);
    }

    /* renamed from: b */
    public static boolean m3604b(Context context) {
        if (C6801d.m24304a(context).m24310a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
            return C12517i1.m6595b(context.getContentResolver(), "gms:nearby:requires_gms_check", true);
        }
        return true;
    }
}
