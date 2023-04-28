package p031bk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p015ak.C1440c;
import p015ak.C1457k;
import p031bk.C3743l;
import p307qj.EnumC12246q;
import p326ri.C12718u;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0003B\u0017\u0012\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001c\u0010\u0015\u001a\n \u0012*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u001c\u0010\u0019\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, m15073d2 = {"Lbk/h;", "Lbk/m;", "", "a", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "b", "", "hostname", "", "Lqj/q;", "protocols", "", "d", "c", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "kotlin.jvm.PlatformType", "setHostname", "getAlpnSelectedProtocol", "setAlpnProtocols", "Ljava/lang/Class;", "e", "Ljava/lang/Class;", "sslSocketClass", "<init>", "(Ljava/lang/Class;)V", "g", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
/* renamed from: bk.h */
/* loaded from: classes8.dex */
public class C3733h implements AbstractC3745m {

    /* renamed from: f */
    private static final C3743l.AbstractC3744a f6071f;

    /* renamed from: g */
    public static final C3734a f6072g;

    /* renamed from: a */
    private final Method f6073a;

    /* renamed from: b */
    private final Method f6074b;

    /* renamed from: c */
    private final Method f6075c;

    /* renamed from: d */
    private final Method f6076d;

    /* renamed from: e */
    private final Class<? super SSLSocket> f6077e;

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m15073d2 = {"Lbk/h$a;", "", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lbk/h;", "b", "", "packageName", "Lbk/l$a;", "c", "playProviderFactory", "Lbk/l$a;", "d", "()Lbk/l$a;", "<init>", "()V", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
    /* renamed from: bk.h$a */
    /* loaded from: classes8.dex */
    public static final class C3734a {

        @Metadata(m15074d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m15073d2 = {"bk/h$a$a", "Lbk/l$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "b", "Lbk/m;", "c", "okhttp"}, m15072k = 1, m15071mv = {1, 4, 0})
        /* renamed from: bk.h$a$a */
        /* loaded from: classes8.dex */
        public static final class C0094a implements C3743l.AbstractC3744a {

            /* renamed from: a */
            final /* synthetic */ String f6078a;

            C0094a(String str) {
                this.f6078a = str;
            }

            @Override // p031bk.C3743l.AbstractC3744a
            /* renamed from: b */
            public boolean mo33708b(SSLSocket sslSocket) {
                boolean H;
                C9971q.m14633g(sslSocket, "sslSocket");
                String name = sslSocket.getClass().getName();
                C9971q.m14634f(name, "sslSocket.javaClass.name");
                H = C12718u.m5736H(name, this.f6078a + '.', false, 2, null);
                return H;
            }

            @Override // p031bk.C3743l.AbstractC3744a
            /* renamed from: c */
            public AbstractC3745m mo33707c(SSLSocket sslSocket) {
                C9971q.m14633g(sslSocket, "sslSocket");
                return C3733h.f6072g.m33719b(sslSocket.getClass());
            }
        }

        private C3734a() {
        }

        public /* synthetic */ C3734a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final C3733h m33719b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && (!C9971q.m14638b(cls2.getSimpleName(), "OpenSSLSocketImpl"))) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            C9971q.m14636d(cls2);
            return new C3733h(cls2);
        }

        /* renamed from: c */
        public final C3743l.AbstractC3744a m33718c(String packageName) {
            C9971q.m14633g(packageName, "packageName");
            return new C0094a(packageName);
        }

        /* renamed from: d */
        public final C3743l.AbstractC3744a m33717d() {
            return C3733h.f6071f;
        }
    }

    static {
        C3734a aVar = new C3734a(null);
        f6072g = aVar;
        f6071f = aVar.m33718c("com.google.android.gms.org.conscrypt");
    }

    public C3733h(Class<? super SSLSocket> sslSocketClass) {
        C9971q.m14633g(sslSocketClass, "sslSocketClass");
        this.f6077e = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        C9971q.m14634f(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f6073a = declaredMethod;
        this.f6074b = sslSocketClass.getMethod("setHostname", String.class);
        this.f6075c = sslSocketClass.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.f6076d = sslSocketClass.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: a */
    public boolean mo33706a() {
        return C1440c.f489g.m41120b();
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: b */
    public boolean mo33705b(SSLSocket sslSocket) {
        C9971q.m14633g(sslSocket, "sslSocket");
        return this.f6077e.isInstance(sslSocket);
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: c */
    public String mo33704c(SSLSocket sslSocket) {
        C9971q.m14633g(sslSocket, "sslSocket");
        if (!mo33705b(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f6075c.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            Charset charset = StandardCharsets.UTF_8;
            C9971q.m14634f(charset, "StandardCharsets.UTF_8");
            return new String(bArr, charset);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (NullPointerException e2) {
            if (C9971q.m14638b(e2.getMessage(), "ssl == null")) {
                return null;
            }
            throw e2;
        } catch (InvocationTargetException e3) {
            throw new AssertionError(e3);
        }
    }

    @Override // p031bk.AbstractC3745m
    /* renamed from: d */
    public void mo33703d(SSLSocket sslSocket, String str, List<? extends EnumC12246q> protocols) {
        C9971q.m14633g(sslSocket, "sslSocket");
        C9971q.m14633g(protocols, "protocols");
        if (mo33705b(sslSocket)) {
            try {
                this.f6073a.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f6074b.invoke(sslSocket, str);
                }
                this.f6076d.invoke(sslSocket, C1457k.f517c.m41083c(protocols));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
