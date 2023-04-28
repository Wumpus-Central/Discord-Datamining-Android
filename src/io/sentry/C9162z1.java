package io.sentry;

import io.sentry.util.C9111k;
import java.net.URI;
import java.util.HashMap;

/* renamed from: io.sentry.z1 */
/* loaded from: classes8.dex */
final class C9162z1 {

    /* renamed from: a */
    private final C8951o3 f20119a;

    public C9162z1(C8951o3 o3Var) {
        this.f20119a = (C8951o3) C9111k.m16995a(o3Var, "options is required");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C9155y1 m16752a() {
        URI c;
        String str;
        C8923l lVar = new C8923l(this.f20119a.getDsn());
        String uri = lVar.m17675c().resolve(c.getPath() + "/envelope/").toString();
        String a = lVar.m17677a();
        String b = lVar.m17676b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Sentry sentry_version=7,sentry_client=");
        sb2.append(this.f20119a.getSentryClientName());
        sb2.append(",sentry_key=");
        sb2.append(a);
        if (b == null || b.length() <= 0) {
            str = "";
        } else {
            str = ",sentry_secret=" + b;
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        String sentryClientName = this.f20119a.getSentryClientName();
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", sentryClientName);
        hashMap.put("X-Sentry-Auth", sb3);
        return new C9155y1(uri, hashMap);
    }
}
