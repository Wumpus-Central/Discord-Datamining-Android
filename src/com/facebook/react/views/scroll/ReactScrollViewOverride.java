package com.facebook.react.views.scroll;

import kotlin.Metadata;

@Metadata(m15074d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m15073d2 = {"Lcom/facebook/react/views/scroll/ReactScrollViewOverride;", "", "()V", "override", "", "flingVelocityLimit", "", "react_fork_overrides_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class ReactScrollViewOverride {
    public static final ReactScrollViewOverride INSTANCE = new ReactScrollViewOverride();

    private ReactScrollViewOverride() {
    }

    public static /* synthetic */ void override$default(ReactScrollViewOverride reactScrollViewOverride, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 12500;
        }
        reactScrollViewOverride.override(i);
    }

    public final void override(int i) {
        ReactScrollView.MAX_FLING_VELOCITY = Integer.valueOf(i);
    }
}
