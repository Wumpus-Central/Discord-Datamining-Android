package io.sentry.internal.modules;

import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: io.sentry.internal.modules.d */
/* loaded from: classes8.dex */
public final class C8903d extends AbstractC8901b {

    /* renamed from: c */
    private final ClassLoader f19588c;

    public C8903d(AbstractC8869g0 g0Var) {
        this(g0Var, C8903d.class.getClassLoader());
    }

    @Override // io.sentry.internal.modules.AbstractC8901b
    /* renamed from: b */
    protected Map<String, String> mo17753b() {
        TreeMap treeMap = new TreeMap();
        try {
            InputStream resourceAsStream = this.f19588c.getResourceAsStream("sentry-external-modules.txt");
            if (resourceAsStream != null) {
                return m17756c(resourceAsStream);
            }
            this.f19585a.mo17722c(EnumC8942n3.INFO, "%s file was not found.", "sentry-external-modules.txt");
            return treeMap;
        } catch (SecurityException e) {
            this.f19585a.mo17723b(EnumC8942n3.INFO, "Access to resources denied.", e);
            return treeMap;
        }
    }

    C8903d(AbstractC8869g0 g0Var, ClassLoader classLoader) {
        super(g0Var);
        if (classLoader == null) {
            this.f19588c = ClassLoader.getSystemClassLoader();
        } else {
            this.f19588c = classLoader;
        }
    }
}
