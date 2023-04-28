package io.sentry;

import io.sentry.util.C9111k;
import java.net.URI;

/* renamed from: io.sentry.l */
/* loaded from: classes8.dex */
final class C8923l {

    /* renamed from: a */
    private final String f19616a;

    /* renamed from: b */
    private final String f19617b;

    /* renamed from: c */
    private final String f19618c;

    /* renamed from: d */
    private final String f19619d;

    /* renamed from: e */
    private final URI f19620e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8923l(String str) {
        String str2;
        try {
            C9111k.m16995a(str, "The DSN is required.");
            URI normalize = new URI(str).normalize();
            String userInfo = normalize.getUserInfo();
            if (userInfo == null || userInfo.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            String[] split = userInfo.split(":", -1);
            String str3 = split[0];
            this.f19619d = str3;
            if (str3 == null || str3.isEmpty()) {
                throw new IllegalArgumentException("Invalid DSN: No public key provided.");
            }
            if (split.length > 1) {
                str2 = split[1];
            } else {
                str2 = null;
            }
            this.f19618c = str2;
            String path = normalize.getPath();
            path = path.endsWith("/") ? path.substring(0, path.length() - 1) : path;
            int lastIndexOf = path.lastIndexOf("/") + 1;
            String substring = path.substring(0, lastIndexOf);
            if (!substring.endsWith("/")) {
                substring = substring + "/";
            }
            this.f19617b = substring;
            String substring2 = path.substring(lastIndexOf);
            this.f19616a = substring2;
            if (!substring2.isEmpty()) {
                this.f19620e = new URI(normalize.getScheme(), null, normalize.getHost(), normalize.getPort(), substring + "api/" + substring2, null, null);
                return;
            }
            throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");
        } catch (Throwable th2) {
            throw new IllegalArgumentException(th2);
        }
    }

    /* renamed from: a */
    public String m17677a() {
        return this.f19619d;
    }

    /* renamed from: b */
    public String m17676b() {
        return this.f19618c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public URI m17675c() {
        return this.f19620e;
    }
}
