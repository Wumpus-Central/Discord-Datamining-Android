package com.discord.analytics;

import com.android.installreferrer.api.InstallReferrerClient;
import jg.s;
import jg.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.p;
import pg.c;
import pg.d;
import x2.a;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"await", "", "Lcom/android/installreferrer/api/InstallReferrerClient;", "(Lcom/android/installreferrer/api/InstallReferrerClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analytics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InstallReferrerModuleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object await(InstallReferrerClient installReferrerClient, Continuation<? super Integer> continuation) {
        Continuation c10;
        Object obj;
        Object d10;
        c10 = c.c(continuation);
        final p pVar = new p(c10, 1);
        pVar.B();
        a installReferrerModuleKt$await$2$listener$1 = new a() { // from class: com.discord.analytics.InstallReferrerModuleKt$await$2$listener$1
            @Override // x2.a
            public void onInstallReferrerServiceDisconnected() {
                if (pVar.b()) {
                    CancellableContinuation.a.a(pVar, null, 1, null);
                }
            }

            @Override // x2.a
            public void onInstallReferrerSetupFinished(int i10) {
                pVar.resumeWith(s.b(Integer.valueOf(i10)));
            }
        };
        pVar.l(new InstallReferrerModuleKt$await$2$1(installReferrerClient));
        try {
            s.a aVar = s.f21287l;
            installReferrerClient.d(installReferrerModuleKt$await$2$listener$1);
            obj = s.b(Unit.f22080a);
        } catch (Throwable th2) {
            s.a aVar2 = s.f21287l;
            obj = s.b(t.a(th2));
        }
        Throwable e10 = s.e(obj);
        if (e10 != null) {
            pVar.resumeWith(s.b(t.a(e10)));
        }
        Object y10 = pVar.y();
        d10 = d.d();
        if (y10 == d10) {
            g.c(continuation);
        }
        return y10;
    }
}
