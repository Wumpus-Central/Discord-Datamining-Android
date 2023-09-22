package com.discord.chat.presentation.message.view;

import android.view.View;
import com.discord.chat.presentation.message.view.media.ViewAttachedListener;
import com.discord.portals.PortalViewContextUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;


@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)

public final class MediaView$registerForPortal$1 extends s implements Function1<View, Unit> {
    final  MediaView this$0;

    
    
    public MediaView$registerForPortal$1(MediaView mediaView) {
        super(1);
        this.this$0 = mediaView;
    }

    @Override 
    public   Unit invoke(View view) {
        invoke2(view);
        return Unit.f21600a;
    }

    
    public final void invoke2(View view) {
        ViewAttachedListener viewAttachedListener;
        q.h(view, "view");
        MediaView mediaView = this.this$0;
        viewAttachedListener = mediaView.attachStateChangeListener;
        mediaView.removeOnAttachStateChangeListener(viewAttachedListener);
        PortalViewContextUtilsKt.removeFromParent(view);
    }
}
