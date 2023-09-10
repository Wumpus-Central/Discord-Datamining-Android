package com.discord.security_key;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.q;


@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)

public  class SecurityKeyManagerModule$webauthn$2 extends n implements Function1<String, Unit> {
    
    public SecurityKeyManagerModule$webauthn$2(Object obj) {
        super(1, obj, SecurityKeyManagerModule.class, "reject", "reject(Ljava/lang/String;)V", 0);
    }

    @Override 
    public   Unit invoke(String str) {
        invoke2(str);
        return Unit.f21442a;
    }

    
    public final void invoke2(String p02) {
        q.h(p02, "p0");
        ((SecurityKeyManagerModule) this.receiver).reject(p02);
    }
}
