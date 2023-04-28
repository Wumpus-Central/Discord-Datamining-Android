package p256o4;

import com.facebook.imagepipeline.request.ImageRequest;
import p057d4.AbstractC6395b;
import p240n4.C10716i;
import p416x5.C13934a;

/* renamed from: o4.c */
/* loaded from: classes7.dex */
public class C11197c extends C13934a {

    /* renamed from: a */
    private final AbstractC6395b f24979a;

    /* renamed from: b */
    private final C10716i f24980b;

    public C11197c(AbstractC6395b bVar, C10716i iVar) {
        this.f24979a = bVar;
        this.f24980b = iVar;
    }

    @Override // p416x5.C13934a, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestCancellation(String str) {
        this.f24980b.m12586r(this.f24979a.now());
        this.f24980b.m12580x(str);
    }

    @Override // p416x5.C13934a, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th2, boolean z) {
        this.f24980b.m12586r(this.f24979a.now());
        this.f24980b.m12587q(imageRequest);
        this.f24980b.m12580x(str);
        this.f24980b.m12581w(z);
    }

    @Override // p416x5.C13934a, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        this.f24980b.m12585s(this.f24979a.now());
        this.f24980b.m12587q(imageRequest);
        this.f24980b.m12600d(obj);
        this.f24980b.m12580x(str);
        this.f24980b.m12581w(z);
    }

    @Override // p416x5.C13934a, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        this.f24980b.m12586r(this.f24979a.now());
        this.f24980b.m12587q(imageRequest);
        this.f24980b.m12580x(str);
        this.f24980b.m12581w(z);
    }
}
