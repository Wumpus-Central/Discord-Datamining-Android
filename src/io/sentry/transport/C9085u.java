package io.sentry.transport;

import io.sentry.util.C9111k;
import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* renamed from: io.sentry.transport.u */
/* loaded from: classes8.dex */
final class C9085u extends Authenticator {

    /* renamed from: a */
    private final String f19936a;

    /* renamed from: b */
    private final String f19937b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9085u(String str, String str2) {
        this.f19936a = (String) C9111k.m16995a(str, "user is required");
        this.f19937b = (String) C9111k.m16995a(str2, "password is required");
    }

    @Override // java.net.Authenticator
    protected PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() == Authenticator.RequestorType.PROXY) {
            return new PasswordAuthentication(this.f19936a, this.f19937b.toCharArray());
        }
        return null;
    }
}
