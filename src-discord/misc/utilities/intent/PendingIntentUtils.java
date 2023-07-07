package com.discord.misc.utilities.intent;

import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, d2 = {"Lcom/discord/misc/utilities/intent/PendingIntentUtils;", "", "()V", "immutablePendingIntentFlag", "", "flags", "mutablePendingIntentFlag", "misc_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PendingIntentUtils {
    public static final PendingIntentUtils INSTANCE = new PendingIntentUtils();

    private PendingIntentUtils() {
    }

    public static /* synthetic */ int immutablePendingIntentFlag$default(PendingIntentUtils pendingIntentUtils, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 134217728;
        }
        return pendingIntentUtils.immutablePendingIntentFlag(i10);
    }

    public static /* synthetic */ int mutablePendingIntentFlag$default(PendingIntentUtils pendingIntentUtils, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 134217728;
        }
        return pendingIntentUtils.mutablePendingIntentFlag(i10);
    }

    public final int immutablePendingIntentFlag(int i10) {
        return i10 | 67108864;
    }

    public final int mutablePendingIntentFlag(int i10) {
        return Build.VERSION.SDK_INT >= 31 ? i10 | 33554432 : i10;
    }
}
