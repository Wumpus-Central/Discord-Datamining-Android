package com.discord.media.engine.types;

import com.discord.logging.Log;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9677q;

@Metadata(m15074d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\nH\u0086\bJ.\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086\bø\u0001\u0000J#\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0013H\u0086\bJ6\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0086\bø\u0001\u0000J\u0006\u0010\u0014\u001a\u00020\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, m15073d2 = {"Lcom/discord/media/engine/types/Debug;", "", "()V", "ENABLE", "", "ENABLE_ON_FRAME_DEBUG", "LOG_ON_FRAME_INTERVAL", "", "LOG_ON_FRAME_RESET_INTERVAL", "LOG_TAG", "", "TAG", "log", "", "tag", "method", "lazyMsg", "Lkotlin/Function0;", "startNs", "", "logDebugLoggingConfig", "media_engine_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class Debug {
    public static final boolean ENABLE = false;
    public static final boolean ENABLE_ON_FRAME_DEBUG = false;
    public static final Debug INSTANCE = new Debug();
    public static final int LOG_ON_FRAME_INTERVAL = 100;
    public static final int LOG_ON_FRAME_RESET_INTERVAL = 500;
    private static final String LOG_TAG = "media_engine";
    private static final String TAG = "Debug";

    private Debug() {
    }

    public static /* synthetic */ void log$default(Debug debug, String tag, String method, Function0 lazyMsg, int i, Object obj) {
        if ((i & 2) != 0) {
            method = "";
        }
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(method, "method");
        C9677q.m14633g(lazyMsg, "lazyMsg");
    }

    public final void log(String tag, String method) {
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(method, "method");
    }

    public final void log(String tag, String method, long j) {
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(method, "method");
    }

    public final void log(String tag, String method, long j, Function0<? extends Object> lazyMsg) {
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(method, "method");
        C9677q.m14633g(lazyMsg, "lazyMsg");
    }

    public final void log(String tag, String method, Function0<? extends Object> lazyMsg) {
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(method, "method");
        C9677q.m14633g(lazyMsg, "lazyMsg");
    }

    public final void logDebugLoggingConfig() {
        Log.i$default(Log.INSTANCE, TAG, "MediaEngine debug logging disabled.", (Throwable) null, 4, (Object) null);
    }

    public static /* synthetic */ void log$default(Debug debug, String tag, String method, long j, Function0 lazyMsg, int i, Object obj) {
        if ((i & 2) != 0) {
            method = "";
        }
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(method, "method");
        C9677q.m14633g(lazyMsg, "lazyMsg");
    }

    public static /* synthetic */ void log$default(Debug debug, String tag, String method, int i, Object obj) {
        if ((i & 2) != 0) {
            method = "";
        }
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(method, "method");
    }

    public static /* synthetic */ void log$default(Debug debug, String tag, String method, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            method = "";
        }
        C9677q.m14633g(tag, "tag");
        C9677q.m14633g(method, "method");
    }
}
