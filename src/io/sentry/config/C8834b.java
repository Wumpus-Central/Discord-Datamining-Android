package io.sentry.config;

import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* renamed from: io.sentry.config.b */
/* loaded from: classes8.dex */
final class C8834b {

    /* renamed from: a */
    private final String f19515a;

    /* renamed from: b */
    private final ClassLoader f19516b;

    /* renamed from: c */
    private final AbstractC8869g0 f19517c;

    public C8834b(String str, ClassLoader classLoader, AbstractC8869g0 g0Var) {
        this.f19515a = str;
        if (classLoader == null) {
            this.f19516b = ClassLoader.getSystemClassLoader();
        } else {
            this.f19516b = classLoader;
        }
        this.f19517c = g0Var;
    }

    /* renamed from: a */
    public Properties m17934a() {
        try {
            InputStream resourceAsStream = this.f19516b.getResourceAsStream(this.f19515a);
            if (resourceAsStream != null) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                try {
                    Properties properties = new Properties();
                    properties.load(bufferedInputStream);
                    bufferedInputStream.close();
                    resourceAsStream.close();
                    return properties;
                } catch (Throwable th2) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } else {
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
                return null;
            }
        } catch (IOException e) {
            this.f19517c.mo17724a(EnumC8942n3.ERROR, e, "Failed to load Sentry configuration from classpath resource: %s", this.f19515a);
            return null;
        }
    }

    public C8834b(AbstractC8869g0 g0Var) {
        this("sentry.properties", C8834b.class.getClassLoader(), g0Var);
    }
}
