package io.sentry;

import io.sentry.util.C9111k;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/* renamed from: io.sentry.y1 */
/* loaded from: classes8.dex */
public final class C9155y1 {

    /* renamed from: a */
    private final URL f20099a;

    /* renamed from: b */
    private final Map<String, String> f20100b;

    public C9155y1(String str, Map<String, String> map) {
        C9111k.m16995a(str, "url is required");
        C9111k.m16995a(map, "headers is required");
        try {
            this.f20099a = URI.create(str).toURL();
            this.f20100b = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    /* renamed from: a */
    public Map<String, String> m16773a() {
        return this.f20100b;
    }

    /* renamed from: b */
    public URL m16772b() {
        return this.f20099a;
    }
}
