package com.discord.react_fork_overrides;

import com.discord.react_fork_overrides.forks.CustomLineHeightSpanOverride;
import com.discord.react_fork_overrides.forks.ImageSourceOverride;
import com.facebook.react.views.scroll.ReactScrollViewOverride;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/discord/react_fork_overrides/ReactForkOverrides;", "", "()V", "init", "", "react_fork_overrides_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReactForkOverrides {
    public static final ReactForkOverrides INSTANCE = new ReactForkOverrides();

    private ReactForkOverrides() {
    }

    public final void init() {
        CustomLineHeightSpanOverride.INSTANCE.override();
        ImageSourceOverride.INSTANCE.override();
        ReactScrollViewOverride.override$default(ReactScrollViewOverride.INSTANCE, 0, 1, null);
    }
}
