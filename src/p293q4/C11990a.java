package p293q4;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.ControllerListener;

/* renamed from: q4.a */
/* loaded from: classes7.dex */
public class C11990a<INFO> implements ControllerListener<INFO> {

    /* renamed from: k */
    private static final ControllerListener<Object> f26841k = new C11990a();

    /* renamed from: a */
    public static <INFO> ControllerListener<INFO> m8058a() {
        return (ControllerListener<INFO>) f26841k;
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFailure(String str, Throwable th2) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(String str, INFO info, Animatable animatable) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageFailed(String str, Throwable th2) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageSet(String str, INFO info) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onRelease(String str) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String str, Object obj) {
    }
}
