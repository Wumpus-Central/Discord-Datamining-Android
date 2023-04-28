package io.sentry.config;

import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: io.sentry.config.e */
/* loaded from: classes8.dex */
final class C8837e {

    /* renamed from: a */
    private final String f19519a;

    /* renamed from: b */
    private final AbstractC8869g0 f19520b;

    public C8837e(String str, AbstractC8869g0 g0Var) {
        this.f19519a = str;
        this.f19520b = g0Var;
    }

    /* renamed from: a */
    public Properties m17932a() {
        try {
            File file = new File(this.f19519a);
            if (!file.isFile() || !file.canRead()) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            Properties properties = new Properties();
            properties.load(bufferedInputStream);
            bufferedInputStream.close();
            return properties;
        } catch (IOException e) {
            this.f19520b.mo17724a(EnumC8942n3.ERROR, e, "Failed to load Sentry configuration from file: %s", this.f19519a);
            return null;
        }
    }
}
