package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imageutils.C5064a;
import com.facebook.imageutils.C5066c;
import com.facebook.soloader.AbstractC5089e;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;
import p076e4.C6706f;
import p170j5.C9489b;
import p380v5.C13434e;
import p394w3.C13733f;
import p394w3.C13740j;
import p414x3.C13925a;
import p455z3.AbstractC14535g;
import p455z3.AbstractC14537h;
import p455z3.C14538i;

/* loaded from: classes7.dex */
public class LocalExifThumbnailProducer implements AbstractC5059z0<C13434e> {

    /* renamed from: a */
    private final Executor f8371a;

    /* renamed from: b */
    private final AbstractC14537h f8372b;

    /* renamed from: c */
    private final ContentResolver f8373c;

    /* JADX INFO: Access modifiers changed from: private */
    @AbstractC5089e
    /* loaded from: classes7.dex */
    public class Api24Utils {
        private Api24Utils() {
        }

        /* renamed from: a */
        ExifInterface m31209a(FileDescriptor fileDescriptor) {
            if (Build.VERSION.SDK_INT >= 24) {
                return new ExifInterface(fileDescriptor);
            }
            return null;
        }

        /* synthetic */ Api24Utils(LocalExifThumbnailProducer localExifThumbnailProducer, C4948a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$a */
    /* loaded from: classes7.dex */
    public class C4948a extends AbstractC5028s0<C13434e> {

        /* renamed from: p */
        final /* synthetic */ ImageRequest f8375p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4948a(Consumer consumer, AbstractC5011n0 n0Var, ProducerContext producerContext, String str, ImageRequest imageRequest) {
            super(consumer, n0Var, producerContext, str);
            this.f8375p = imageRequest;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: j */
        public void mo4381b(C13434e eVar) {
            C13434e.m3706h(eVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: k */
        public Map<String, String> mo30961i(C13434e eVar) {
            return C13733f.m2852of("createdThumbnail", Boolean.toString(eVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: l */
        public C13434e mo4380c() {
            ExifInterface g = LocalExifThumbnailProducer.this.m31211g(this.f8375p.getSourceUri());
            if (g == null || !g.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.m31213e(LocalExifThumbnailProducer.this.f8372b.mo260d((byte[]) C13740j.m2834g(g.getThumbnail())), g);
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.LocalExifThumbnailProducer$b */
    /* loaded from: classes7.dex */
    class C4949b extends C4965e {

        /* renamed from: a */
        final /* synthetic */ AbstractC5028s0 f8377a;

        C4949b(AbstractC5028s0 s0Var) {
            this.f8377a = s0Var;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
        /* renamed from: b */
        public void mo30945b() {
            this.f8377a.m4382a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, AbstractC14537h hVar, ContentResolver contentResolver) {
        this.f8371a = executor;
        this.f8372b = hVar;
        this.f8373c = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    /* renamed from: e */
    public C13434e m31213e(AbstractC14535g gVar, ExifInterface exifInterface) {
        int i;
        Pair<Integer, Integer> a = C5064a.m30863a(new C14538i(gVar));
        int h = m31210h(exifInterface);
        int i2 = -1;
        if (a != null) {
            i = ((Integer) a.first).intValue();
        } else {
            i = -1;
        }
        if (a != null) {
            i2 = ((Integer) a.second).intValue();
        }
        CloseableReference S = CloseableReference.m32035S(gVar);
        try {
            C13434e eVar = new C13434e(S);
            CloseableReference.m32025t(S);
            eVar.m3719K0(C9489b.f21011a);
            eVar.m3718L0(h);
            eVar.m3716N0(i);
            eVar.m3720J0(i2);
            return eVar;
        } catch (Throwable th2) {
            CloseableReference.m32025t(S);
            throw th2;
        }
    }

    /* renamed from: h */
    private int m31210h(ExifInterface exifInterface) {
        return C5066c.m30856a(Integer.parseInt((String) C13740j.m2834g(exifInterface.getAttribute("Orientation"))));
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5059z0
    /* renamed from: a */
    public boolean mo30906a(ResizeOptions resizeOptions) {
        return C4953a1.m31202b(512, 512, resizeOptions);
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<C13434e> consumer, ProducerContext producerContext) {
        AbstractC5011n0 h = producerContext.mo31163h();
        ImageRequest l = producerContext.mo31159l();
        producerContext.mo31166e("local", "exif");
        C4948a aVar = new C4948a(consumer, h, producerContext, "LocalExifThumbnailProducer", l);
        producerContext.mo31168c(new C4949b(aVar));
        this.f8371a.execute(aVar);
    }

    /* renamed from: f */
    boolean m31212f(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !file.canRead()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    ExifInterface m31211g(Uri uri) {
        String b = C6706f.m24608b(this.f8373c, uri);
        if (b == null) {
            return null;
        }
        try {
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            C13925a.m2292f(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        if (m31212f(b)) {
            return new ExifInterface(b);
        }
        AssetFileDescriptor a = C6706f.m24609a(this.f8373c, uri);
        if (a != null && Build.VERSION.SDK_INT >= 24) {
            ExifInterface a2 = new Api24Utils(this, null).m31209a(a.getFileDescriptor());
            a.close();
            return a2;
        }
        return null;
    }
}
