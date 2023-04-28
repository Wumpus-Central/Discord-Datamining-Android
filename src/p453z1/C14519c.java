package p453z1;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p003a2.C1244a;

/* renamed from: z1.c */
/* loaded from: classes.dex */
public final class C14519c {

    /* renamed from: a */
    private final List<C14523e> f32930a;

    /* renamed from: z1.c$a */
    /* loaded from: classes.dex */
    public static final class C14520a implements AbstractC14522d {

        /* renamed from: a */
        private C1244a f32931a;

        public C14520a(Context context) {
            this.f32931a = new C1244a(context);
        }

        @Override // p453z1.C14519c.AbstractC14522d
        /* renamed from: a */
        public WebResourceResponse mo273a(String str) {
            try {
                return new WebResourceResponse(C1244a.m41542f(str), null, this.f32931a.m41540h(str));
            } catch (IOException e) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    /* renamed from: z1.c$b */
    /* loaded from: classes.dex */
    public static final class C14521b {

        /* renamed from: a */
        private boolean f32932a = false;

        /* renamed from: b */
        private String f32933b = "appassets.androidplatform.net";

        /* renamed from: c */
        private List<C14523e> f32934c = new ArrayList();

        /* renamed from: a */
        public C14521b m280a(String str, AbstractC14522d dVar) {
            this.f32934c.add(new C14523e(this.f32933b, str, this.f32932a, dVar));
            return this;
        }

        /* renamed from: b */
        public C14519c m279b() {
            return new C14519c(this.f32934c);
        }

        /* renamed from: c */
        public C14521b m278c(String str) {
            this.f32933b = str;
            return this;
        }

        /* renamed from: d */
        public C14521b m277d(boolean z) {
            this.f32932a = z;
            return this;
        }
    }

    /* renamed from: z1.c$c */
    /* loaded from: classes.dex */
    public static final class C0474c implements AbstractC14522d {

        /* renamed from: b */
        private static final String[] f32935b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* renamed from: a */
        private final File f32936a;

        public C0474c(Context context, File file) {
            try {
                this.f32936a = new File(C1244a.m41547a(file));
                if (!m276b(context)) {
                    throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
                }
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e);
            }
        }

        /* renamed from: b */
        private boolean m276b(Context context) {
            String a = C1244a.m41547a(this.f32936a);
            String a2 = C1244a.m41547a(context.getCacheDir());
            String a3 = C1244a.m41547a(C1244a.m41545c(context));
            if (!(a.startsWith(a2) || a.startsWith(a3)) || a.equals(a2) || a.equals(a3)) {
                return false;
            }
            for (String str : f32935b) {
                if (a.startsWith(a3 + str)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p453z1.C14519c.AbstractC14522d
        /* renamed from: a */
        public WebResourceResponse mo273a(String str) {
            File b;
            try {
                b = C1244a.m41546b(this.f32936a, str);
            } catch (IOException e) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e);
            }
            if (b != null) {
                return new WebResourceResponse(C1244a.m41542f(str), null, C1244a.m41539i(b));
            }
            Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, this.f32936a));
            return new WebResourceResponse(null, null, null);
        }
    }

    /* renamed from: z1.c$d */
    /* loaded from: classes.dex */
    public interface AbstractC14522d {
        /* renamed from: a */
        WebResourceResponse mo273a(String str);
    }

    /* renamed from: z1.c$e */
    /* loaded from: classes.dex */
    static class C14523e {

        /* renamed from: a */
        final boolean f32937a;

        /* renamed from: b */
        final String f32938b;

        /* renamed from: c */
        final String f32939c;

        /* renamed from: d */
        final AbstractC14522d f32940d;

        C14523e(String str, String str2, boolean z, AbstractC14522d dVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            } else if (str2.endsWith("/")) {
                this.f32938b = str;
                this.f32939c = str2;
                this.f32937a = z;
                this.f32940d = dVar;
            } else {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
        }

        /* renamed from: a */
        public String m275a(String str) {
            return str.replaceFirst(this.f32939c, "");
        }

        /* renamed from: b */
        public AbstractC14522d m274b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.f32937a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f32938b) && uri.getPath().startsWith(this.f32939c)) {
                return this.f32940d;
            }
            return null;
        }
    }

    /* renamed from: z1.c$f */
    /* loaded from: classes.dex */
    public static final class C14524f implements AbstractC14522d {

        /* renamed from: a */
        private C1244a f32941a;

        public C14524f(Context context) {
            this.f32941a = new C1244a(context);
        }

        @Override // p453z1.C14519c.AbstractC14522d
        /* renamed from: a */
        public WebResourceResponse mo273a(String str) {
            try {
                return new WebResourceResponse(C1244a.m41542f(str), null, this.f32941a.m41538j(str));
            } catch (Resources.NotFoundException e) {
                Log.e("WebViewAssetLoader", "Resource not found from the path: " + str, e);
                return new WebResourceResponse(null, null, null);
            } catch (IOException e2) {
                Log.e("WebViewAssetLoader", "Error opening resource from the path: " + str, e2);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    C14519c(List<C14523e> list) {
        this.f32930a = list;
    }

    /* renamed from: a */
    public WebResourceResponse m281a(Uri uri) {
        WebResourceResponse a;
        for (C14523e eVar : this.f32930a) {
            AbstractC14522d b = eVar.m274b(uri);
            if (!(b == null || (a = b.mo273a(eVar.m275a(uri.getPath()))) == null)) {
                return a;
            }
        }
        return null;
    }
}
