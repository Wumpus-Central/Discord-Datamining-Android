package p209l5;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import java.util.ArrayList;
import java.util.List;
import p191k5.AbstractC9748a;
import p191k5.AbstractC9751c;
import p191k5.C9753e;
import p226m5.AbstractC10483b;
import p226m5.C10487d;
import p380v5.AbstractC13432c;
import p380v5.C13430a;
import p380v5.C13433d;
import p380v5.C13434e;
import p380v5.C13437h;
import p394w3.C13740j;
import p455z3.AbstractC14535g;

/* renamed from: l5.e */
/* loaded from: classes7.dex */
public class C10345e implements AbstractC10344d {

    /* renamed from: c */
    static AbstractC10343c f22679c = m13566g("com.facebook.animated.gif.GifImage");

    /* renamed from: d */
    static AbstractC10343c f22680d = m13566g("com.facebook.animated.webp.WebPImage");

    /* renamed from: a */
    private final AbstractC10483b f22681a;

    /* renamed from: b */
    private final PlatformBitmapFactory f22682b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l5.e$a */
    /* loaded from: classes7.dex */
    public class C10346a implements C10487d.AbstractC10489b {
        C10346a() {
        }

        @Override // p226m5.C10487d.AbstractC10489b
        /* renamed from: a */
        public void mo13048a(int i, Bitmap bitmap) {
        }

        @Override // p226m5.C10487d.AbstractC10489b
        /* renamed from: b */
        public CloseableReference<Bitmap> mo13047b(int i) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l5.e$b */
    /* loaded from: classes7.dex */
    public class C10347b implements C10487d.AbstractC10489b {

        /* renamed from: a */
        final /* synthetic */ List f22684a;

        C10347b(List list) {
            this.f22684a = list;
        }

        @Override // p226m5.C10487d.AbstractC10489b
        /* renamed from: a */
        public void mo13048a(int i, Bitmap bitmap) {
        }

        @Override // p226m5.C10487d.AbstractC10489b
        /* renamed from: b */
        public CloseableReference<Bitmap> mo13047b(int i) {
            return CloseableReference.m32027r((CloseableReference) this.f22684a.get(i));
        }
    }

    public C10345e(AbstractC10483b bVar, PlatformBitmapFactory platformBitmapFactory) {
        this.f22681a = bVar;
        this.f22682b = platformBitmapFactory;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    private CloseableReference<Bitmap> m13570c(int i, int i2, Bitmap.Config config) {
        CloseableReference<Bitmap> d = this.f22682b.mo10504d(i, i2, config);
        d.m32039C().eraseColor(0);
        d.m32039C().setHasAlpha(true);
        return d;
    }

    /* renamed from: d */
    private CloseableReference<Bitmap> m13569d(AbstractC9751c cVar, Bitmap.Config config, int i) {
        CloseableReference<Bitmap> c = m13570c(cVar.getWidth(), cVar.getHeight(), config);
        new C10487d(this.f22681a.mo13064a(C9753e.m15433b(cVar), null), new C10346a()).m13049g(i, c.m32039C());
        return c;
    }

    /* renamed from: e */
    private List<CloseableReference<Bitmap>> m13568e(AbstractC9751c cVar, Bitmap.Config config) {
        AbstractC9748a a = this.f22681a.mo13064a(C9753e.m15433b(cVar), null);
        ArrayList arrayList = new ArrayList(a.mo13078a());
        C10487d dVar = new C10487d(a, new C10347b(arrayList));
        for (int i = 0; i < a.mo13078a(); i++) {
            CloseableReference<Bitmap> c = m13570c(a.getWidth(), a.getHeight(), config);
            dVar.m13049g(i, c.m32039C());
            arrayList.add(c);
        }
        return arrayList;
    }

    /* renamed from: f */
    private AbstractC13432c m13567f(ImageDecodeOptions imageDecodeOptions, AbstractC9751c cVar, Bitmap.Config config) {
        Throwable th2;
        List<CloseableReference<Bitmap>> list;
        int i;
        CloseableReference<Bitmap> closeableReference;
        CloseableReference<Bitmap> closeableReference2 = null;
        try {
            if (imageDecodeOptions.f8129d) {
                i = cVar.mo15445a() - 1;
            } else {
                i = 0;
            }
            if (imageDecodeOptions.f8131f) {
                C13433d dVar = new C13433d(m13569d(cVar, config, i), C13437h.f30004d, 0);
                CloseableReference.m32025t(null);
                CloseableReference.m32023z(null);
                return dVar;
            }
            if (imageDecodeOptions.f8130e) {
                list = m13568e(cVar, config);
                try {
                    closeableReference = CloseableReference.m32027r(list.get(i));
                } catch (Throwable th3) {
                    th2 = th3;
                    CloseableReference.m32025t(closeableReference2);
                    CloseableReference.m32023z(list);
                    throw th2;
                }
            } else {
                list = null;
                closeableReference = null;
            }
            try {
                if (imageDecodeOptions.f8128c && closeableReference == null) {
                    closeableReference = m13569d(cVar, config, i);
                }
                C13430a aVar = new C13430a(C9753e.m15430e(cVar).m15420j(closeableReference).m15421i(i).m15422h(list).m15423g(null).m15429a());
                CloseableReference.m32025t(closeableReference);
                CloseableReference.m32023z(list);
                return aVar;
            } catch (Throwable th4) {
                th2 = th4;
                closeableReference2 = closeableReference;
                CloseableReference.m32025t(closeableReference2);
                CloseableReference.m32023z(list);
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
            list = null;
        }
    }

    /* renamed from: g */
    private static AbstractC10343c m13566g(String str) {
        try {
            return (AbstractC10343c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // p209l5.AbstractC10344d
    /* renamed from: a */
    public AbstractC13432c mo13572a(C13434e eVar, ImageDecodeOptions imageDecodeOptions, Bitmap.Config config) {
        AbstractC9751c cVar;
        if (f22679c != null) {
            CloseableReference<AbstractC14535g> l = eVar.m3703l();
            C13740j.m2834g(l);
            try {
                AbstractC14535g C = l.m32039C();
                if (C.mo267a() != null) {
                    cVar = f22679c.mo13574d(C.mo267a(), imageDecodeOptions);
                } else {
                    cVar = f22679c.mo13573f(C.mo264k(), C.size(), imageDecodeOptions);
                }
                return m13567f(imageDecodeOptions, cVar, config);
            } finally {
                CloseableReference.m32025t(l);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
    }

    @Override // p209l5.AbstractC10344d
    /* renamed from: b */
    public AbstractC13432c mo13571b(C13434e eVar, ImageDecodeOptions imageDecodeOptions, Bitmap.Config config) {
        AbstractC9751c cVar;
        if (f22680d != null) {
            CloseableReference<AbstractC14535g> l = eVar.m3703l();
            C13740j.m2834g(l);
            try {
                AbstractC14535g C = l.m32039C();
                if (C.mo267a() != null) {
                    cVar = f22680d.mo13574d(C.mo267a(), imageDecodeOptions);
                } else {
                    cVar = f22680d.mo13573f(C.mo264k(), C.size(), imageDecodeOptions);
                }
                return m13567f(imageDecodeOptions, cVar, config);
            } finally {
                CloseableReference.m32025t(l);
            }
        } else {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
    }
}
