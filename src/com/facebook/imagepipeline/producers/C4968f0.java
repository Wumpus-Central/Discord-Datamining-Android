package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;
import p076e4.C6706f;
import p257o5.C11202e;
import p380v5.AbstractC13432c;
import p380v5.C13433d;
import p380v5.C13437h;
import p394w3.C13733f;

/* renamed from: com.facebook.imagepipeline.producers.f0 */
/* loaded from: classes7.dex */
public class C4968f0 implements AbstractC5001l0<CloseableReference<AbstractC13432c>> {

    /* renamed from: a */
    private final Executor f8421a;

    /* renamed from: b */
    private final ContentResolver f8422b;

    /* renamed from: com.facebook.imagepipeline.producers.f0$a */
    /* loaded from: classes7.dex */
    class C4969a extends AbstractC5028s0<CloseableReference<AbstractC13432c>> {

        /* renamed from: p */
        final /* synthetic */ AbstractC5011n0 f8423p;

        /* renamed from: q */
        final /* synthetic */ ProducerContext f8424q;

        /* renamed from: r */
        final /* synthetic */ ImageRequest f8425r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4969a(Consumer consumer, AbstractC5011n0 n0Var, ProducerContext producerContext, String str, AbstractC5011n0 n0Var2, ProducerContext producerContext2, ImageRequest imageRequest) {
            super(consumer, n0Var, producerContext, str);
            this.f8423p = n0Var2;
            this.f8424q = producerContext2;
            this.f8425r = imageRequest;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.AbstractC5028s0, p359u3.AbstractRunnableC13189g
        /* renamed from: e */
        public void mo4378e(Exception exc) {
            super.mo4378e(exc);
            this.f8423p.mo2246b(this.f8424q, "VideoThumbnailProducer", false);
            this.f8424q.mo31164g("local");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: j */
        public void mo4381b(CloseableReference<AbstractC13432c> closeableReference) {
            CloseableReference.m32025t(closeableReference);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: k */
        public Map<String, String> mo30961i(CloseableReference<AbstractC13432c> closeableReference) {
            return C13733f.m2852of("createdThumbnail", String.valueOf(closeableReference != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: l */
        public CloseableReference<AbstractC13432c> mo4380c() {
            String str;
            Bitmap bitmap;
            try {
                str = C4968f0.this.m31137i(this.f8425r);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                bitmap = ThumbnailUtils.createVideoThumbnail(str, C4968f0.m31139g(this.f8425r));
            } else {
                bitmap = C4968f0.m31138h(C4968f0.this.f8422b, this.f8425r.getSourceUri());
            }
            if (bitmap == null) {
                return null;
            }
            C13433d dVar = new C13433d(bitmap, C11202e.m10499a(), C13437h.f30004d, 0);
            this.f8424q.mo31169b("image_format", "thumbnail");
            dVar.m3736l(this.f8424q.getExtras());
            return CloseableReference.m32035S(dVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: m */
        public void mo4377f(CloseableReference<AbstractC13432c> closeableReference) {
            boolean z;
            super.mo4377f(closeableReference);
            AbstractC5011n0 n0Var = this.f8423p;
            ProducerContext producerContext = this.f8424q;
            if (closeableReference != null) {
                z = true;
            } else {
                z = false;
            }
            n0Var.mo2246b(producerContext, "VideoThumbnailProducer", z);
            this.f8424q.mo31164g("local");
        }
    }

    /* renamed from: com.facebook.imagepipeline.producers.f0$b */
    /* loaded from: classes7.dex */
    class C4970b extends C4965e {

        /* renamed from: a */
        final /* synthetic */ AbstractC5028s0 f8427a;

        C4970b(AbstractC5028s0 s0Var) {
            this.f8427a = s0Var;
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC5008m0
        /* renamed from: b */
        public void mo30945b() {
            this.f8427a.m4382a();
        }
    }

    public C4968f0(Executor executor, ContentResolver contentResolver) {
        this.f8421a = executor;
        this.f8422b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static int m31139g(ImageRequest imageRequest) {
        return (imageRequest.getPreferredWidth() > 96 || imageRequest.getPreferredHeight() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static Bitmap m31138h(ContentResolver contentResolver, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(openFileDescriptor.getFileDescriptor());
            return mediaMetadataRetriever.getFrameAtTime(-1L);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public String m31137i(ImageRequest imageRequest) {
        String[] strArr;
        String str;
        Uri uri;
        Uri sourceUri = imageRequest.getSourceUri();
        if (C6706f.m24599k(sourceUri)) {
            return imageRequest.getSourceFile().getPath();
        }
        if (C6706f.m24600j(sourceUri)) {
            if ("com.android.providers.media.documents".equals(sourceUri.getAuthority())) {
                String documentId = DocumentsContract.getDocumentId(sourceUri);
                str = "_id=?";
                uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                strArr = new String[]{documentId.split(":")[1]};
            } else {
                uri = sourceUri;
                str = null;
                strArr = null;
            }
            Cursor query = this.f8422b.query(uri, new String[]{"_data"}, str, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        return query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (query != null) {
            }
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.AbstractC5001l0
    /* renamed from: b */
    public void mo30917b(Consumer<CloseableReference<AbstractC13432c>> consumer, ProducerContext producerContext) {
        AbstractC5011n0 h = producerContext.mo31163h();
        ImageRequest l = producerContext.mo31159l();
        producerContext.mo31166e("local", MediaStreamTrack.VIDEO_TRACK_KIND);
        C4969a aVar = new C4969a(consumer, h, producerContext, "VideoThumbnailProducer", h, producerContext, l);
        producerContext.mo31168c(new C4970b(aVar));
        this.f8421a.execute(aVar);
    }
}
