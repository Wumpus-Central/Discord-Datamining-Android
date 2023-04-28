package com.discord.analytics;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9679s;
import nf.C10845s;
import nf.C10848t;

@Metadata(m15074d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, m15073d2 = {"<anonymous>", "", "it", "", "invoke"}, m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
final class InstallReferrerModuleKt$await$2$1 extends AbstractC9679s implements Function1<Throwable, Unit> {
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
        return Unit.f25780a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        InstallReferrerClient installReferrerClient = this.$this_await;
        try {
            C10845s.C10846a aVar = C10845s.f28533l;
            installReferrerClient.mo32667a();
            C10845s.m10940b(Unit.f25780a);
        } catch (Throwable th3) {
            C10845s.C10846a aVar2 = C10845s.f28533l;
            C10845s.m10940b(C10848t.m10931a(th3));
        }
    }
}
