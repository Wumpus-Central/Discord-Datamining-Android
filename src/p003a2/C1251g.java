package p003a2;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import p184jk.C9687a;

/* renamed from: a2.g */
/* loaded from: classes.dex */
public class C1251g {

    /* renamed from: a2.g$a */
    /* loaded from: classes.dex */
    private static class C1252a {

        /* renamed from: a */
        static final C1256j f115a = new C1256j(C1251g.m41523d().getWebkitToCompatConverter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a2.g$b */
    /* loaded from: classes.dex */
    public static class C1253b {

        /* renamed from: a */
        static final AbstractC1254h f116a = C1251g.m41526a();
    }

    /* renamed from: a */
    static AbstractC1254h m41526a() {
        try {
            return new C1255i((WebViewProviderFactoryBoundaryInterface) C9687a.m15593a(WebViewProviderFactoryBoundaryInterface.class, m41525b()));
        } catch (ClassNotFoundException unused) {
            return new C1246c();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static InvocationHandler m41525b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, m41522e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    /* renamed from: c */
    public static C1256j m41524c() {
        return C1252a.f115a;
    }

    /* renamed from: d */
    public static AbstractC1254h m41523d() {
        return C1253b.f116a;
    }

    /* renamed from: e */
    public static ClassLoader m41522e() {
        ClassLoader webViewClassLoader;
        if (Build.VERSION.SDK_INT < 28) {
            return m41521f().getClass().getClassLoader();
        }
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    /* renamed from: f */
    private static Object m41521f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }
}
