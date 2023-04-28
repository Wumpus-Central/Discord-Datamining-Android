package com.discord.analytics;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9933g;
import kotlinx.coroutines.C10156p;
import kotlinx.coroutines.CancellableContinuation;
import nf.C11090s;
import nf.C11093t;
import p413x2.AbstractC13923a;
import tf.C13076c;
import tf.C13080d;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m15073d2 = {"await", "", "Lcom/android/installreferrer/api/InstallReferrerClient;", "(Lcom/android/installreferrer/api/InstallReferrerClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analytics_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class InstallReferrerModuleKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object await(InstallReferrerClient installReferrerClient, Continuation<? super Integer> continuation) {
        Continuation c;
        Object obj;
        Object d;
        c = C13076c.m4647c(continuation);
        final C10156p pVar = new C10156p(c, 1);
        pVar.m14150C();
        AbstractC13923a installReferrerModuleKt$await$2$listener$1 = new AbstractC13923a() { // from class: com.discord.analytics.InstallReferrerModuleKt$await$2$listener$1
            @Override // p413x2.AbstractC13923a
            public void onInstallReferrerServiceDisconnected() {
                if (pVar.mo14135b()) {
                    CancellableContinuation.C9994a.m14574a(pVar, null, 1, null);
                }
            }

            @Override // p413x2.AbstractC13923a
            public void onInstallReferrerSetupFinished(int i) {
                pVar.resumeWith(C11090s.m10940b(Integer.valueOf(i)));
            }
        };
        pVar.mo14131k(new InstallReferrerModuleKt$await$2$1(installReferrerClient));
        try {
            C11090s.C11091a aVar = C11090s.f24606l;
            installReferrerClient.mo32665d(installReferrerModuleKt$await$2$listener$1);
            obj = C11090s.m10940b(Unit.f22042a);
        } catch (Throwable th2) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            obj = C11090s.m10940b(C11093t.m10931a(th2));
        }
        Throwable e = C11090s.m10937e(obj);
        if (e != null) {
            pVar.resumeWith(C11090s.m10940b(C11093t.m10931a(e)));
        }
        Object y = pVar.m14117y();
        d = C13080d.m4646d();
        if (y == d) {
            C9933g.m14691c(continuation);
        }
        return y;
    }
}
