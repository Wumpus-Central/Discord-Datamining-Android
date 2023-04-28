package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.C2359e;
import androidx.core.provider.C2476g;
import com.facebook.react.uimanager.ViewDefaults;
import com.facebook.react.views.text.TypefaceStyle;
import java.io.File;
import java.io.InputStream;
import p163j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.c0 */
/* loaded from: classes.dex */
public class C2388c0 {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    private ConcurrentHashMap<Long, C2359e.C2362c> f3332a = new ConcurrentHashMap<>();

    /* renamed from: androidx.core.graphics.c0$a */
    /* loaded from: classes.dex */
    class C2389a implements AbstractC2390b<C2476g.C2478b> {
        C2389a() {
        }

        /* renamed from: c */
        public int mo37907b(C2476g.C2478b bVar) {
            return bVar.m37670e();
        }

        /* renamed from: d */
        public boolean mo37908a(C2476g.C2478b bVar) {
            return bVar.m37669f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.graphics.c0$b */
    /* loaded from: classes.dex */
    public interface AbstractC2390b<T> {
        /* renamed from: a */
        boolean mo37908a(T t);

        /* renamed from: b */
        int mo37907b(T t);
    }

    /* renamed from: e */
    private static <T> T m37912e(T[] tArr, int i, AbstractC2390b<T> bVar) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = TypefaceStyle.NORMAL;
        } else {
            i2 = TypefaceStyle.BOLD;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        T t = null;
        int i4 = ViewDefaults.NUMBER_OF_LINES;
        for (T t2 : tArr) {
            int abs = Math.abs(bVar.mo37907b(t2) - i2) * 2;
            if (bVar.mo37908a(t2) == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (t == null || i4 > i5) {
                t = t2;
                i4 = i5;
            }
        }
        return t;
    }

    /* renamed from: a */
    public Typeface mo37780a(Context context, C2359e.C2362c cVar, Resources resources, int i) {
        throw null;
    }

    /* renamed from: b */
    public Typeface mo37779b(Context context, CancellationSignal cancellationSignal, C2476g.C2478b[] bVarArr, int i) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public Typeface m37913c(Context context, InputStream inputStream) {
        File e = C2394d0.m37887e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C2394d0.m37888d(e, inputStream)) {
                return null;
            }
            return Typeface.createFromFile(e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo37778d(Context context, Resources resources, int i, String str, int i2) {
        File e = C2394d0.m37887e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C2394d0.m37889c(e, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(e.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public C2476g.C2478b mo37911f(C2476g.C2478b[] bVarArr, int i) {
        return (C2476g.C2478b) m37912e(bVarArr, i, new C2389a());
    }
}
