package com.discord.channel_spine;

import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/channel_spine/ChannelSpineViewManagerImpl;", "", "()V", "NAME", "", "createViewInstance", "Lcom/discord/channel_spine/ChannelSpineView;", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "numRows", "", "view", "", "rowHeight", "height", "", "channel_spine_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChannelSpineViewManagerImpl {
    public static final ChannelSpineViewManagerImpl INSTANCE = new ChannelSpineViewManagerImpl();
    public static final String NAME = "ChannelSpine";

    private ChannelSpineViewManagerImpl() {
    }

    public final ChannelSpineView createViewInstance(ThemedReactContext reactContext) {
        q.g(reactContext, "reactContext");
        return new ChannelSpineView(reactContext, null, 2, null);
    }

    public final void numRows(ChannelSpineView view, int i10) {
        q.g(view, "view");
        view.setNumRows(i10);
    }

    public final void rowHeight(ChannelSpineView view, float f10) {
        q.g(view, "view");
        view.setRowHeight(f10);
    }
}
