package com.discord.security_key;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public /* synthetic */ class SecurityKeyManagerModule$webauthn$1 extends n implements Function1<String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SecurityKeyManagerModule$webauthn$1(Object obj) {
        super(1, obj, SecurityKeyManagerModule.class, "resolve", "resolve(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f22042a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p02) {
        q.g(p02, "p0");
        ((SecurityKeyManagerModule) this.receiver).resolve(p02);
    }
}