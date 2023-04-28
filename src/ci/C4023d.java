package ci;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import kotlin.jvm.internal.C9971q;

/* renamed from: ci.d */
/* loaded from: classes8.dex */
public final class C4023d {
    /* renamed from: a */
    public final InputStream m33071a(String path) {
        C9971q.m14633g(path, "path");
        ClassLoader classLoader = C4023d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(path);
        }
        URL resource = classLoader.getResource(path);
        if (resource == null) {
            return null;
        }
        URLConnection openConnection = resource.openConnection();
        openConnection.setUseCaches(false);
        return openConnection.getInputStream();
    }
}
