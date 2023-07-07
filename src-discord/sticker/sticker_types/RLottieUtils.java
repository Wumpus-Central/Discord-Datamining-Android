package com.discord.sticker.sticker_types;

import com.discord.logging.Log;
import com.discord.rlottie.RLottie;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\f\u0010\u000b\u001a\u00020\n*\u00020\fH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/discord/sticker/sticker_types/RLottieUtils;", "", "()V", "initialized", "", "getInitialized$sticker_release", "()Z", "setInitialized$sticker_release", "(Z)V", "init", "", "warn", "Ljava/lang/UnsatisfiedLinkError;", "sticker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RLottieUtils {
    public static final RLottieUtils INSTANCE = new RLottieUtils();
    private static boolean initialized;

    private RLottieUtils() {
    }

    private final void warn(UnsatisfiedLinkError unsatisfiedLinkError) {
        Log.INSTANCE.w("RLottie", "Unable to load animated sticker library.", unsatisfiedLinkError);
    }

    public final boolean getInitialized$sticker_release() {
        return initialized;
    }

    public final void init() {
        try {
            RLottie.INSTANCE.init();
            initialized = true;
        } catch (UnsatisfiedLinkError e10) {
            warn(e10);
        }
    }

    public final void setInitialized$sticker_release(boolean z10) {
        initialized = z10;
    }
}
