package com.discord.media.engine.video.egl_renderer;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/media/engine/video/egl_renderer/HandlerWithExceptionCallback;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "exceptionCallback", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "(Landroid/os/Looper;Lkotlin/jvm/functions/Function1;)V", "dispatchMessage", "msg", "Landroid/os/Message;", "media_engine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class HandlerWithExceptionCallback extends Handler {
    private final Function1<Exception, Unit> exceptionCallback;

    
    
    public HandlerWithExceptionCallback(Looper looper, Function1<? super Exception, Unit> exceptionCallback) {
        super(looper);
        q.g(looper, "looper");
        q.g(exceptionCallback, "exceptionCallback");
        this.exceptionCallback = exceptionCallback;
    }

    @Override 
    public void dispatchMessage(Message msg) {
        q.g(msg, "msg");
        try {
            super.dispatchMessage(msg);
        } catch (Exception e10) {
            this.exceptionCallback.invoke(e10);
            throw e10;
        }
    }
}
