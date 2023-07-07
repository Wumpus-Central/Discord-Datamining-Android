package com.discord.misc.utilities.gradle;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/misc/utilities/gradle/GradleUtils;", "", "()V", "isProductionBuild", "", "misc_utilities_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GradleUtils {
    public static final GradleUtils INSTANCE = new GradleUtils();

    private GradleUtils() {
    }

    public final boolean isProductionBuild() {
        return false;
    }
}
