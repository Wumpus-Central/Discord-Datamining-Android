package com.discord.analytics;

import com.android.installreferrer.api.InstallReferrerClient;
import jf.s;
import jf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.p;
import pf.c;
import pf.d;
import v1.a;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"await", "", "Lcom/android/installreferrer/api/InstallReferrerClient;", "(Lcom/android/installreferrer/api/InstallReferrerClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analytics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)

public final class InstallReferrerModuleKt {
    
    public static final Object await(InstallReferrerClient installReferrerClient, Continuation<? super Integer> continuation) {
        Continuation c10;
        Object obj;
        Object d10;
        c10 = c.c(continuation);
        final p pVar = new p(c10, 1);
        pVar.C();
        a installReferrerModuleKt$await$2$listener$1 = new a() { 
            @Override 
            public void onInstallReferrerServiceDisconnected() {
                if (pVar.a()) {
                    CancellableContinuation.a.a(pVar, null, 1, null);
                }
            }

            @Override 
            public void onInstallReferrerSetupFinished(int i10) {
                pVar.resumeWith(s.b(Integer.valueOf(i10)));
            }
        };
        pVar.n(new InstallReferrerModuleKt$await$2$1(installReferrerClient));
        try {
            s.a aVar = s.f20093l;
            installReferrerClient.d(installReferrerModuleKt$await$2$listener$1);
            obj = s.b(Unit.f21025a);
        } catch (Throwable th2) {
            s.a aVar2 = s.f20093l;
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
