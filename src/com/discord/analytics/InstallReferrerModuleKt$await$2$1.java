package com.discord.analytics;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9973s;
import nf.C11090s;
import nf.C11093t;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class InstallReferrerModuleKt$await$2$1 extends AbstractC9973s implements Function1<Throwable, Unit> {
    final /* synthetic */ InstallReferrerClient $this_await;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallReferrerModuleKt$await$2$1(InstallReferrerClient installReferrerClient) {
        super(1);
        this.$this_await = installReferrerClient;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        InstallReferrerClient installReferrerClient = this.$this_await;
        try {
            C11090s.C11091a aVar = C11090s.f24606l;
            installReferrerClient.mo32667a();
            C11090s.m10940b(Unit.f22042a);
        } catch (Throwable th3) {
            C11090s.C11091a aVar2 = C11090s.f24606l;
            C11090s.m10940b(C11093t.m10931a(th3));
        }
    }
}
