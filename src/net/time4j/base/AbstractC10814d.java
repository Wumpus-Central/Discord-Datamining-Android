package net.time4j.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ServiceLoader;

/* renamed from: net.time4j.base.d */
/* loaded from: classes8.dex */
public abstract class AbstractC10814d {

    /* renamed from: a */
    private static final boolean f23999a;

    /* renamed from: b */
    private static final AbstractC10814d f24000b;

    /* renamed from: c */
    private static final boolean f24001c;

    /* renamed from: net.time4j.base.d$a */
    /* loaded from: classes8.dex */
    private static class C10815a extends AbstractC10814d {
        C10815a() {
            if (AbstractC10814d.f23999a) {
                throw new IllegalStateException("The module time4j-android is not active. Check your configuration.");
            }
        }

        @Override // net.time4j.base.AbstractC10814d
        /* renamed from: e */
        public InputStream mo12185e(URI uri, boolean z) {
            if (uri != null && !AbstractC10814d.f24001c) {
                try {
                    URL url = uri.toURL();
                    if (!z) {
                        return url.openStream();
                    }
                    URLConnection openConnection = url.openConnection();
                    openConnection.setUseCaches(false);
                    openConnection.connect();
                    return openConnection.getInputStream();
                } catch (IOException e) {
                    if (uri.toString().contains(".repository")) {
                        PrintStream printStream = System.err;
                        printStream.println("Warning: Loading of resource " + uri + " failed (" + e.getMessage() + "). Consider setting the system property \"net.time4j.base.useClassloaderOnly\" for reducing overhead.");
                        e.printStackTrace(System.err);
                    }
                }
            }
            return null;
        }

        @Override // net.time4j.base.AbstractC10814d
        /* renamed from: f */
        public URI mo12184f(String str, Class<?> cls, String str2) {
            String str3;
            CodeSource codeSource;
            try {
                try {
                    ProtectionDomain protectionDomain = cls.getProtectionDomain();
                    if (protectionDomain == null) {
                        codeSource = null;
                    } else {
                        codeSource = protectionDomain.getCodeSource();
                    }
                    if (codeSource != null) {
                        String externalForm = codeSource.getLocation().toExternalForm();
                        try {
                            if (externalForm.endsWith(".jar")) {
                                externalForm = "jar:" + externalForm + "!/";
                            }
                            str3 = externalForm + str2;
                            return new URI(str3);
                        } catch (URISyntaxException unused) {
                            System.err.println("Warning: malformed resource path = " + str3);
                            return null;
                        }
                    }
                } catch (SecurityException unused2) {
                }
            } catch (URISyntaxException unused3) {
                str3 = null;
            }
            return null;
        }

        @Override // net.time4j.base.AbstractC10814d
        /* renamed from: g */
        public <S> Iterable<S> mo12183g(Class<S> cls) {
            return ServiceLoader.load(cls, cls.getClassLoader());
        }
    }

    static {
        boolean z;
        boolean equalsIgnoreCase = "Dalvik".equalsIgnoreCase(System.getProperty("java.vm.name"));
        f23999a = equalsIgnoreCase;
        if (equalsIgnoreCase || !Boolean.getBoolean("net.time4j.base.useClassloaderOnly")) {
            z = false;
        } else {
            z = true;
        }
        f24001c = z;
        String property = System.getProperty("net.time4j.base.ResourceLoader");
        if (property == null) {
            f24000b = new C10815a();
            return;
        }
        try {
            f24000b = (AbstractC10814d) Class.forName(property).newInstance();
        } catch (Exception e) {
            throw new AssertionError("Wrong configuration of external resource loader: " + e.getMessage());
        }
    }

    /* renamed from: c */
    public static AbstractC10814d m12187c() {
        return f24000b;
    }

    /* renamed from: d */
    public final InputStream m12186d(Class<?> cls, String str, boolean z) {
        if (!f23999a) {
            URL resource = cls.getClassLoader().getResource(str);
            if (resource == null) {
                throw new FileNotFoundException(str);
            } else if (!z) {
                return resource.openStream();
            } else {
                URLConnection openConnection = resource.openConnection();
                openConnection.setUseCaches(false);
                openConnection.connect();
                return openConnection.getInputStream();
            }
        } else {
            throw new FileNotFoundException(str);
        }
    }

    /* renamed from: e */
    public abstract InputStream mo12185e(URI uri, boolean z);

    /* renamed from: f */
    public abstract URI mo12184f(String str, Class<?> cls, String str2);

    /* renamed from: g */
    public abstract <S> Iterable<S> mo12183g(Class<S> cls);
}
