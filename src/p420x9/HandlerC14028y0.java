package p420x9;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p365u9.C13215a;
import p420x9.AbstractC13957c;
import pa.HandlerC11593e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x9.y0 */
/* loaded from: classes5.dex */
public final class HandlerC14028y0 extends HandlerC11593e {

    /* renamed from: a */
    final /* synthetic */ AbstractC13957c f31611a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC14028y0(AbstractC13957c cVar, Looper looper) {
        super(looper);
        this.f31611a = cVar;
    }

    /* renamed from: a */
    private static final void m2015a(Message message) {
        AbstractC14030z0 z0Var = (AbstractC14030z0) message.obj;
        z0Var.mo2012b();
        z0Var.m2009e();
    }

    /* renamed from: b */
    private static final boolean m2014b(Message message) {
        int i = message.what;
        return i == 2 || i == 1 || i == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        AbstractC13957c.AbstractC13958a aVar;
        AbstractC13957c.AbstractC13958a aVar2;
        C13215a aVar3;
        C13215a aVar4;
        C13215a aVar5;
        C13215a aVar6;
        boolean z;
        if (this.f31611a.f39438M.get() == message.arg1) {
            int i = message.what;
            if ((i == 1 || i == 7 || ((i == 4 && !this.f31611a.m2148s()) || message.what == 5)) && !this.f31611a.m2164c()) {
                m2015a(message);
                return;
            }
            int i2 = message.what;
            PendingIntent pendingIntent = null;
            if (i2 == 4) {
                this.f31611a.f39435J = new C13215a(message.arg2);
                if (AbstractC13957c.m2157f0(this.f31611a)) {
                    AbstractC13957c cVar = this.f31611a;
                    z = cVar.f39436K;
                    if (!z) {
                        cVar.m2155g0(3, null);
                        return;
                    }
                }
                AbstractC13957c cVar2 = this.f31611a;
                aVar5 = cVar2.f39435J;
                if (aVar5 != null) {
                    aVar6 = cVar2.f39435J;
                } else {
                    aVar6 = new C13215a(8);
                }
                this.f31611a.f31475z.mo2144c(aVar6);
                this.f31611a.m2184K(aVar6);
            } else if (i2 == 5) {
                AbstractC13957c cVar3 = this.f31611a;
                aVar3 = cVar3.f39435J;
                if (aVar3 != null) {
                    aVar4 = cVar3.f39435J;
                } else {
                    aVar4 = new C13215a(8);
                }
                this.f31611a.f31475z.mo2144c(aVar4);
                this.f31611a.m2184K(aVar4);
            } else if (i2 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                C13215a aVar7 = new C13215a(message.arg2, pendingIntent);
                this.f31611a.f31475z.mo2144c(aVar7);
                this.f31611a.m2184K(aVar7);
            } else if (i2 == 6) {
                this.f31611a.m2155g0(5, null);
                AbstractC13957c cVar4 = this.f31611a;
                aVar = cVar4.f39430E;
                if (aVar != null) {
                    aVar2 = cVar4.f39430E;
                    aVar2.mo2115e(message.arg2);
                }
                this.f31611a.mo2183L(message.arg2);
                AbstractC13957c.m2159e0(this.f31611a, 5, 1, null);
            } else if (i2 == 2 && !this.f31611a.m2168a()) {
                m2015a(message);
            } else if (m2014b(message)) {
                ((AbstractC14030z0) message.obj).m2011c();
            } else {
                int i3 = message.what;
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Don't know how to handle message: ");
                sb2.append(i3);
                Log.wtf("GmsClient", sb2.toString(), new Exception());
            }
        } else if (m2014b(message)) {
            m2015a(message);
        }
    }
}
