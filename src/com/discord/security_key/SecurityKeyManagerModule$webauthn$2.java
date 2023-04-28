package com.discord.security_key;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9968n;
import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes6.dex */
public /* synthetic */ class SecurityKeyManagerModule$webauthn$2 extends C9968n implements Function1<String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SecurityKeyManagerModule$webauthn$2(Object obj) {
        super(1, obj, SecurityKeyManagerModule.class, "reject", "reject(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        C9971q.m14633g(p0, "p0");
        ((SecurityKeyManagerModule) this.receiver).reject(p0);
    }
}
