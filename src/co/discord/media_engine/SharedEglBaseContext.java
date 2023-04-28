package co.discord.media_engine;

import org.webrtc.EglBase;
import org.webrtc.EglHelper;

/* loaded from: classes.dex */
public final class SharedEglBaseContext {
    private static EglBase eglBase_;

    public static synchronized EglBase.Context getEglContext() {
        EglBase.Context eglBaseContext;
        synchronized (SharedEglBaseContext.class) {
            if (eglBase_ == null) {
                eglBase_ = EglHelper.create();
            }
            eglBaseContext = eglBase_.getEglBaseContext();
        }
        return eglBaseContext;
    }
}
