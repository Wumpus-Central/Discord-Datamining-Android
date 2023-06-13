package com.discord.chat.presentation.message.decorations;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.messagebundling.MessageBundleConversationView;
import com.discord.chat.presentation.list.messagebundling.MessageBundleViewMoreView;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\f\u0010\u0017\u001a\u00020\b*\u00020\u0018H\u0002R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/presentation/message/decorations/MessageBundleSpineItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "contentStartPositionPx", "", "(Landroid/content/Context;I)V", "showThreadSpine", "", "getShowThreadSpine", "()Z", "setShowThreadSpine", "(Z)V", "spineDrawer", "Lcom/discord/chat/presentation/message/decorations/SpineDrawer;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "shouldDrawCurvedSpine", "Landroid/view/View;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MessageBundleSpineItemDecoration extends RecyclerView.ItemDecoration {
    private boolean showThreadSpine = true;
    private final SpineDrawer spineDrawer;

    public MessageBundleSpineItemDecoration(Context context, int i10) {
        q.g(context, "context");
        this.spineDrawer = new SpineDrawer(context, i10);
    }

    private final boolean shouldDrawCurvedSpine(View view) {
        if ((view instanceof MessageBundleConversationView) || (view instanceof MessageBundleViewMoreView)) {
            return true;
        }
        return false;
    }

    public final boolean getShowThreadSpine() {
        return this.showThreadSpine;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
        if (shouldDrawCurvedSpine(r3) == true) goto L_0x0091;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDraw(android.graphics.Canvas r21, androidx.recyclerview.widget.RecyclerView r22, androidx.recyclerview.widget.RecyclerView.State r23) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.decorations.MessageBundleSpineItemDecoration.onDraw(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$State):void");
    }

    public final void setShowThreadSpine(boolean z10) {
        this.showThreadSpine = z10;
    }
}
