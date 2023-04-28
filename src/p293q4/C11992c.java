package p293q4;

import android.graphics.drawable.Animatable;
import android.util.Log;
import com.facebook.drawee.controller.ControllerListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q4.c */
/* loaded from: classes7.dex */
public class C11992c<INFO> implements ControllerListener<INFO> {

    /* renamed from: k */
    private final List<ControllerListener<? super INFO>> f26842k = new ArrayList(2);

    /* renamed from: c */
    private synchronized void m8055c(String str, Throwable th2) {
        Log.e("FdingControllerListener", str, th2);
    }

    /* renamed from: a */
    public synchronized void m8057a(ControllerListener<? super INFO> controllerListener) {
        this.f26842k.add(controllerListener);
    }

    /* renamed from: b */
    public synchronized void m8056b() {
        this.f26842k.clear();
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public synchronized void onFailure(String str, Throwable th2) {
        int size = this.f26842k.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener<? super INFO> controllerListener = this.f26842k.get(i);
                if (controllerListener != null) {
                    controllerListener.onFailure(str, th2);
                }
            } catch (Exception e) {
                m8055c("InternalListener exception in onFailure", e);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public synchronized void onFinalImageSet(String str, INFO info, Animatable animatable) {
        int size = this.f26842k.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener<? super INFO> controllerListener = this.f26842k.get(i);
                if (controllerListener != null) {
                    controllerListener.onFinalImageSet(str, info, animatable);
                }
            } catch (Exception e) {
                m8055c("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageFailed(String str, Throwable th2) {
        int size = this.f26842k.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener<? super INFO> controllerListener = this.f26842k.get(i);
                if (controllerListener != null) {
                    controllerListener.onIntermediateImageFailed(str, th2);
                }
            } catch (Exception e) {
                m8055c("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageSet(String str, INFO info) {
        int size = this.f26842k.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener<? super INFO> controllerListener = this.f26842k.get(i);
                if (controllerListener != null) {
                    controllerListener.onIntermediateImageSet(str, info);
                }
            } catch (Exception e) {
                m8055c("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public synchronized void onRelease(String str) {
        int size = this.f26842k.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener<? super INFO> controllerListener = this.f26842k.get(i);
                if (controllerListener != null) {
                    controllerListener.onRelease(str);
                }
            } catch (Exception e) {
                m8055c("InternalListener exception in onRelease", e);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public synchronized void onSubmit(String str, Object obj) {
        int size = this.f26842k.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener<? super INFO> controllerListener = this.f26842k.get(i);
                if (controllerListener != null) {
                    controllerListener.onSubmit(str, obj);
                }
            } catch (Exception e) {
                m8055c("InternalListener exception in onSubmit", e);
            }
        }
    }
}
