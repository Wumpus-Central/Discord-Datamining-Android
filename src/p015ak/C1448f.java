package p015ak;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p307qj.EnumC12246q;

@Metadata(m15074d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u000bB7\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u001d"}, m15073d2 = {"Lak/f;", "Lak/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lqj/q;", "protocols", "", "e", "b", "h", "Ljava/lang/reflect/Method;", "d", "Ljava/lang/reflect/Method;", "putMethod", "getMethod", "f", "removeMethod", "Ljava/lang/Class;", "g", "Ljava/lang/Class;", "clientProviderClass", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "i", "a", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: ak.f */
/* loaded from: classes8.dex */
public final class C1448f extends C1457k {

    /* renamed from: i */
    public static final C1450b f501i = new C1450b(null);

    /* renamed from: d */
    private final Method f502d;

    /* renamed from: e */
    private final Method f503e;

    /* renamed from: f */
    private final Method f504f;

    /* renamed from: g */
    private final Class<?> f505g;

    /* renamed from: h */
    private final Class<?> f506h;

    @Metadata(m15074d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m15073d2 = {"Lak/f$a;", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "a", "Z", "b", "()Z", "setUnsupported", "(Z)V", "unsupported", "", "Ljava/lang/String;", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", "selected", "", "c", "Ljava/util/List;", "protocols", "<init>", "(Ljava/util/List;)V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ak.f$a */
    /* loaded from: classes8.dex */
    private static final class C1449a implements InvocationHandler {

        /* renamed from: a */
        private boolean f507a;

        /* renamed from: b */
        private String f508b;

        /* renamed from: c */
        private final List<String> f509c;

        public C1449a(List<String> protocols) {
            C9971q.m14633g(protocols, "protocols");
            this.f509c = protocols;
        }

        /* renamed from: a */
        public final String m41112a() {
            return this.f508b;
        }

        /* renamed from: b */
        public final boolean m41111b() {
            return this.f507a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object proxy, Method method, Object[] objArr) {
            boolean z;
            C9971q.m14633g(proxy, "proxy");
            C9971q.m14633g(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (C9971q.m14638b(name, "supports") && C9971q.m14638b(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (!C9971q.m14638b(name, "unsupported") || !C9971q.m14638b(Void.TYPE, returnType)) {
                if (C9971q.m14638b(name, "protocols")) {
                    if (objArr.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return this.f509c;
                    }
                }
                if ((C9971q.m14638b(name, "selectProtocol") || C9971q.m14638b(name, "select")) && C9971q.m14638b(String.class, returnType) && objArr.length == 1) {
                    Object obj = objArr[0];
                    if (obj instanceof List) {
                        if (obj != null) {
                            List list = (List) obj;
                            int size = list.size();
                            if (size >= 0) {
                                int i = 0;
                                while (true) {
                                    Object obj2 = list.get(i);
                                    if (obj2 != null) {
                                        String str = (String) obj2;
                                        if (!this.f509c.contains(str)) {
                                            if (i == size) {
                                                break;
                                            }
                                            i++;
                                        } else {
                                            this.f508b = str;
                                            return str;
                                        }
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                    }
                                }
                            }
                            String str2 = this.f509c.get(0);
                            this.f508b = str2;
                            return str2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                }
                if ((!C9971q.m14638b(name, "protocolSelected") && !C9971q.m14638b(name, "selected")) || objArr.length != 1) {
                    return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
                }
                Object obj3 = objArr[0];
                if (obj3 != null) {
                    this.f508b = (String) obj3;
                    return null;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            this.f507a = true;
            return null;
        }
    }

    @Metadata(m15074d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, m15073d2 = {"Lak/f$b;", "", "Lak/k;", "a", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: ak.f$b */
    /* loaded from: classes8.dex */
    public static final class C1450b {
        private C1450b() {
        }

        public /* synthetic */ C1450b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C1457k m41110a() {
            String jvmVersion = System.getProperty("java.specification.version", "unknown");
            try {
                C9971q.m14634f(jvmVersion, "jvmVersion");
                if (Integer.parseInt(jvmVersion) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> clientProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> serverProviderClass = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method putMethod = cls.getMethod("put", SSLSocket.class, cls2);
                Method getMethod = cls.getMethod("get", SSLSocket.class);
                Method removeMethod = cls.getMethod("remove", SSLSocket.class);
                C9971q.m14634f(putMethod, "putMethod");
                C9971q.m14634f(getMethod, "getMethod");
                C9971q.m14634f(removeMethod, "removeMethod");
                C9971q.m14634f(clientProviderClass, "clientProviderClass");
                C9971q.m14634f(serverProviderClass, "serverProviderClass");
                return new C1448f(putMethod, getMethod, removeMethod, clientProviderClass, serverProviderClass);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public C1448f(Method putMethod, Method getMethod, Method removeMethod, Class<?> clientProviderClass, Class<?> serverProviderClass) {
        C9971q.m14633g(putMethod, "putMethod");
        C9971q.m14633g(getMethod, "getMethod");
        C9971q.m14633g(removeMethod, "removeMethod");
        C9971q.m14633g(clientProviderClass, "clientProviderClass");
        C9971q.m14633g(serverProviderClass, "serverProviderClass");
        this.f502d = putMethod;
        this.f503e = getMethod;
        this.f504f = removeMethod;
        this.f505g = clientProviderClass;
        this.f506h = serverProviderClass;
    }

    @Override // p015ak.C1457k
    /* renamed from: b */
    public void mo41100b(SSLSocket sslSocket) {
        C9971q.m14633g(sslSocket, "sslSocket");
        try {
            this.f504f.invoke(null, sslSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // p015ak.C1457k
    /* renamed from: e */
    public void mo41097e(SSLSocket sslSocket, String str, List<? extends EnumC12246q> protocols) {
        C9971q.m14633g(sslSocket, "sslSocket");
        C9971q.m14633g(protocols, "protocols");
        try {
            this.f502d.invoke(null, sslSocket, Proxy.newProxyInstance(C1457k.class.getClassLoader(), new Class[]{this.f505g, this.f506h}, new C1449a(C1457k.f517c.m41084b(protocols))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // p015ak.C1457k
    /* renamed from: h */
    public String mo41094h(SSLSocket sslSocket) {
        C9971q.m14633g(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f503e.invoke(null, sslSocket));
            if (invocationHandler != null) {
                C1449a aVar = (C1449a) invocationHandler;
                if (!aVar.m41111b() && aVar.m41112a() == null) {
                    C1457k.m41090l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                    return null;
                } else if (aVar.m41111b()) {
                    return null;
                } else {
                    return aVar.m41112a();
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
