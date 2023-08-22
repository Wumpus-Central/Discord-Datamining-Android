package com.discord.analytics;

import com.android.installreferrer.api.InstallReferrerClient;
import jf.s;
import jf.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

final class InstallReferrerModuleKt$await$2$1 extends s implements Function1<Throwable, Unit> {
    final  InstallReferrerClient $this_await;

    
    
    public InstallReferrerModuleKt$await$2$1(InstallReferrerClient installReferrerClient) {
        super(1);
        this.$this_await = installReferrerClient;
    }

    @Override 
    public   Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f21213a;
    }

    
    public final void invoke2(Throwable th2) {
        InstallReferrerClient installReferrerClient = this.$this_await;
        try {
            s.a aVar = jf.s.f20302k;
            installReferrerClient.a();
            jf.s.b(Unit.f21213a);
        } catch (Throwable th3) {
            s.a aVar2 = jf.s.f20302k;
            jf.s.b(t.a(th3));
        }
    }
}
