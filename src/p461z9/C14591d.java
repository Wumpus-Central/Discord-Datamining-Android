package p461z9;

import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC5389h;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import na.C10770d;
import p384v9.AbstractC13468e;
import p384v9.C13456a;
import p400w9.AbstractC13827i;
import p420x9.AbstractC14020v;
import p420x9.C14016t;
import p420x9.C14022w;

/* renamed from: z9.d */
/* loaded from: classes5.dex */
public final class C14591d extends AbstractC13468e<C14022w> implements AbstractC14020v {

    /* renamed from: k */
    private static final C13456a.C13464g<C14592e> f33064k;

    /* renamed from: l */
    private static final C13456a.AbstractC0437a<C14592e, C14022w> f33065l;

    /* renamed from: m */
    private static final C13456a<C14022w> f33066m;

    /* renamed from: n */
    public static final /* synthetic */ int f33067n = 0;

    static {
        C13456a.C13464g<C14592e> gVar = new C13456a.C13464g<>();
        f33064k = gVar;
        C14590c cVar = new C14590c();
        f33065l = cVar;
        f33066m = new C13456a<>("ClientTelemetry.API", cVar, gVar);
    }

    public C14591d(Context context, C14022w wVar) {
        super(context, f33066m, wVar, AbstractC13468e.C13469a.f30078c);
    }

    @Override // p420x9.AbstractC14020v
    /* renamed from: f */
    public final Task<Void> mo147f(final C14016t tVar) {
        AbstractC5389h.C5390a a = AbstractC5389h.m29036a();
        a.m29028d(C10770d.f23922a);
        a.m29029c(false);
        a.m29030b(new AbstractC13827i() { // from class: z9.b
            @Override // p400w9.AbstractC13827i
            public final void accept(Object obj, Object obj2) {
                C14016t tVar2 = C14016t.this;
                int i = C14591d.f33067n;
                ((C14588a) ((C14592e) obj).m2189C()).m149e0(tVar2);
                ((TaskCompletionSource) obj2).m28900c(null);
            }
        });
        return m3634j(a.m29031a());
    }
}
