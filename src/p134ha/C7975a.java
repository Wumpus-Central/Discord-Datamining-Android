package p134ha;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.AbstractC5389h;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p155ia.C8359p;
import p155ia.C8366s;
import p384v9.AbstractC13468e;
import p384v9.C13456a;
import p400w9.AbstractC13827i;
import p400w9.AbstractC13831k;
import p400w9.C13811a;
import qa.AbstractC12093t0;
import qa.C12087q0;
import qa.C12091s0;

/* renamed from: ha.a */
/* loaded from: classes5.dex */
public class C7975a extends AbstractC13468e<C13456a.AbstractC13459d.C13461c> {

    /* renamed from: k */
    private static final C13456a.C13464g<C12087q0> f17186k;

    /* renamed from: l */
    private static final C13456a<C13456a.AbstractC13459d.C13461c> f17187l;

    static {
        C13456a.C13464g<C12087q0> gVar = new C13456a.C13464g<>();
        f17186k = gVar;
        f17187l = new C13456a<>("Fido.FIDO2_API", new C12091s0(), gVar);
    }

    @Deprecated
    public C7975a(Activity activity) {
        super(activity, (C13456a<C13456a.AbstractC13459d>) f17187l, (C13456a.AbstractC13459d) null, (AbstractC13831k) new C13811a());
    }

    /* renamed from: C */
    public Task<PendingIntent> m20978C(final C8359p pVar) {
        return m3632l(AbstractC5389h.m29036a().m29030b(new AbstractC13827i(this, pVar) { // from class: ha.c

            /* renamed from: a */
            private final C7975a f17190a;

            /* renamed from: b */
            private final C8359p f17191b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f17190a = this;
                this.f17191b = pVar;
            }

            @Override // p400w9.AbstractC13827i
            public final void accept(Object obj, Object obj2) {
                C7975a aVar = this.f17190a;
                C8359p pVar2 = this.f17191b;
                ((AbstractC12093t0) ((C12087q0) obj).m2189C()).mo7849c0(new BinderC7978d(aVar, (TaskCompletionSource) obj2), pVar2);
            }
        }).m29031a());
    }

    /* renamed from: D */
    public Task<PendingIntent> m20977D(final C8366s sVar) {
        return m3632l(AbstractC5389h.m29036a().m29030b(new AbstractC13827i(this, sVar) { // from class: ha.b

            /* renamed from: a */
            private final C7975a f17188a;

            /* renamed from: b */
            private final C8366s f17189b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f17188a = this;
                this.f17189b = sVar;
            }

            @Override // p400w9.AbstractC13827i
            public final void accept(Object obj, Object obj2) {
                C7975a aVar = this.f17188a;
                C8366s sVar2 = this.f17189b;
                ((AbstractC12093t0) ((C12087q0) obj).m2189C()).mo7848x(new BinderC7979e(aVar, (TaskCompletionSource) obj2), sVar2);
            }
        }).m29031a());
    }
}
