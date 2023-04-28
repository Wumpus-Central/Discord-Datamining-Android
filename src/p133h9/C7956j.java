package p133h9;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* renamed from: h9.j */
/* loaded from: classes5.dex */
public class C7956j extends GLSurfaceView {

    /* renamed from: k */
    private final C7955i f17128k;

    public C7956j(Context context) {
        this(context, null);
    }

    public AbstractC7958l getVideoDecoderOutputBufferRenderer() {
        return this.f17128k;
    }

    public C7956j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C7955i iVar = new C7955i(this);
        this.f17128k = iVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(iVar);
        setRenderMode(0);
    }
}
