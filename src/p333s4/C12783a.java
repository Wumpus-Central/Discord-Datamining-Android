package p333s4;

import android.graphics.drawable.Animatable;
import p293q4.C11990a;

/* renamed from: s4.a */
/* loaded from: classes7.dex */
public class C12783a extends C11990a {

    /* renamed from: l */
    private long f28706l = -1;

    /* renamed from: m */
    private long f28707m = -1;

    /* renamed from: n */
    private AbstractC12784b f28708n;

    public C12783a(AbstractC12784b bVar) {
        this.f28708n = bVar;
    }

    @Override // p293q4.C11990a, com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f28707m = currentTimeMillis;
        AbstractC12784b bVar = this.f28708n;
        if (bVar != null) {
            bVar.mo5481a(currentTimeMillis - this.f28706l);
        }
    }

    @Override // p293q4.C11990a, com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String str, Object obj) {
        this.f28706l = System.currentTimeMillis();
    }
}
