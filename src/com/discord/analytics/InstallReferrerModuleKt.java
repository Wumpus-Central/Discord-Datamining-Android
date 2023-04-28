package com.discord.analytics;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9638g;
import kotlinx.coroutines.C9868p;
import kotlinx.coroutines.CancellableContinuation;
import nf.C10845s;
import nf.C10848t;
import p414x2.AbstractC13837a;
import tf.C12957c;
import tf.C12962d;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m15073d2 = {"await", "", "Lcom/android/installreferrer/api/InstallReferrerClient;", "(Lcom/android/installreferrer/api/InstallReferrerClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analytics_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class InstallReferrerModuleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object await(InstallReferrerClient installReferrerClient, Continuation<? super Integer> continuation) {
        Continuation c;
        Object obj;
        Object d;
        c = C12957c.m4647c(continuation);
        final C9868p pVar = new C9868p(c, 1);
        pVar.m14150C();
        AbstractC13837a installReferrerModuleKt$await$2$listener$1 = new AbstractC13837a() { // from class: com.discord.analytics.InstallReferrerModuleKt$await$2$listener$1
            @Override // p414x2.AbstractC13837a
            public void onInstallReferrerServiceDisconnected() {
                if (pVar.mo14135b()) {
                    CancellableContinuation.C9701a.m14574a(pVar, null, 1, null);
                }
            }

            @Override // p414x2.AbstractC13837a
            public void onInstallReferrerSetupFinished(int i) {
                pVar.resumeWith(C10845s.m10940b(Integer.valueOf(i)));
            }
        };
        pVar.mo14131k(new InstallReferrerModuleKt$await$2$1(installReferrerClient));
        try {
            C10845s.C10846a aVar = C10845s.f28533l;
            installReferrerClient.mo32665d(installReferrerModuleKt$await$2$listener$1);
            obj = C10845s.m10940b(Unit.f25780a);
        } catch (Throwable th2) {
            C10845s.C10846a aVar2 = C10845s.f28533l;
            obj = C10845s.m10940b(C10848t.m10931a(th2));
        }
        Throwable e = C10845s.m10937e(obj);
        if (e != null) {
            pVar.resumeWith(C10845s.m10940b(C10848t.m10931a(e)));
        }
        Object y = pVar.m14117y();
        d = C12962d.m4646d();
        if (y == d) {
            C9638g.m14691c(continuation);
        }
        return y;
    }
}
