package com.discord.misc.utilities.intent;

import android.os.Build;
import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0004¨\u0006\u0007"}, m15073d2 = {"Lcom/discord/misc/utilities/intent/PendingIntentUtils;", "", "()V", "immutablePendingIntentFlag", "", "flags", "mutablePendingIntentFlag", "misc_utilities_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes5.dex */
public final class PendingIntentUtils {
    public static final PendingIntentUtils INSTANCE = new PendingIntentUtils();

    private PendingIntentUtils() {
    }

    public static /* synthetic */ int immutablePendingIntentFlag$default(PendingIntentUtils pendingIntentUtils, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 134217728;
        }
        return pendingIntentUtils.immutablePendingIntentFlag(i);
    }

    public static /* synthetic */ int mutablePendingIntentFlag$default(PendingIntentUtils pendingIntentUtils, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 134217728;
        }
        return pendingIntentUtils.mutablePendingIntentFlag(i);
    }

    public final int immutablePendingIntentFlag(int i) {
        return i | 67108864;
    }

    public final int mutablePendingIntentFlag(int i) {
        return Build.VERSION.SDK_INT >= 31 ? i | 33554432 : i;
    }
}
