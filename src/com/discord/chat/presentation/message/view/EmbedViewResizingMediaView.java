package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.facebook.react.uimanager.events.TouchesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J&\u0010\u000b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView;", "Lcom/discord/chat/presentation/message/view/MediaView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", TouchesHelper.TARGET_KEY, "Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;", "getTarget", "()Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;", "setTarget", "(Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;)V", "", "width", "", "height", "maxHeightPx", "maxWidthPx", "Target", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class EmbedViewResizingMediaView extends MediaView {
    public Target target;

    @Metadata(m15074d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/EmbedViewResizingMediaView$Target;", "", "width", "", "height", "maxHeightPx", "maxWidthPx", "(IIII)V", "getHeight", "()I", "getMaxHeightPx", "getMaxWidthPx", "getWidth", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Target {
        private final int height;
        private final int maxHeightPx;
        private final int maxWidthPx;
        private final int width;

        public Target(int i, int i2, int i3, int i4) {
            this.width = i;
            this.height = i2;
            this.maxHeightPx = i3;
            this.maxWidthPx = i4;
        }

        public static /* synthetic */ Target copy$default(Target target, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = target.width;
            }
            if ((i5 & 2) != 0) {
                i2 = target.height;
            }
            if ((i5 & 4) != 0) {
                i3 = target.maxHeightPx;
            }
            if ((i5 & 8) != 0) {
                i4 = target.maxWidthPx;
            }
            return target.copy(i, i2, i3, i4);
        }

        public final int component1() {
            return this.width;
        }

        public final int component2() {
            return this.height;
        }

        public final int component3() {
            return this.maxHeightPx;
        }

        public final int component4() {
            return this.maxWidthPx;
        }

        public final Target copy(int i, int i2, int i3, int i4) {
            return new Target(i, i2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Target)) {
                return false;
            }
            Target target = (Target) obj;
            return this.width == target.width && this.height == target.height && this.maxHeightPx == target.maxHeightPx && this.maxWidthPx == target.maxWidthPx;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getMaxHeightPx() {
            return this.maxHeightPx;
        }

        public final int getMaxWidthPx() {
            return this.maxWidthPx;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return (((((this.width * 31) + this.height) * 31) + this.maxHeightPx) * 31) + this.maxWidthPx;
        }

        public String toString() {
            int i = this.width;
            int i2 = this.height;
            int i3 = this.maxHeightPx;
            int i4 = this.maxWidthPx;
            return "Target(width=" + i + ", height=" + i2 + ", maxHeightPx=" + i3 + ", maxWidthPx=" + i4 + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbedViewResizingMediaView(Context context) {
        this(context, null, 2, null);
        C9677q.m14633g(context, "context");
    }

    public /* synthetic */ EmbedViewResizingMediaView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    public final Target getTarget() {
        Target target = this.target;
        if (target != null) {
            return target;
        }
        C9677q.m14615y(TouchesHelper.TARGET_KEY);
        return null;
    }

    public final void setTarget(Target target) {
        C9677q.m14633g(target, "<set-?>");
        this.target = target;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedViewResizingMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        C9677q.m14633g(context, "context");
    }

    public final void setTarget(int i, int i2, int i3, int i4) {
        Target target = new Target(i, i2, i3, i4);
        if (this.target == null || !C9677q.m14638b(getTarget(), target)) {
            setTarget(target);
        }
        MediaContainingViewResizer.resizeLayoutParams$default(MediaContainingViewResizer.INSTANCE, this, getTarget().getWidth(), getTarget().getHeight(), i4, i3, null, 16, null);
    }
}
