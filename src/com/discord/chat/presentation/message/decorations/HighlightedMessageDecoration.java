package com.discord.chat.presentation.message.decorations;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.ChatListAdapter;
import com.discord.chat.presentation.list.item.ChatListItem;
import com.discord.logging.Log;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9677q;
import kotlin.ranges.IntRange;
import p268of.AbstractC11047p;

@Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m15073d2 = {"Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "drawer", "Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;", "(Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public abstract class HighlightedMessageDecoration extends RecyclerView.ItemDecoration {
    private final HighlightedMessageDrawer drawer;

    public HighlightedMessageDecoration(HighlightedMessageDrawer drawer) {
        C9677q.m14633g(drawer, "drawer");
        this.drawer = drawer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView parent, RecyclerView.State state) {
        C9677q.m14633g(canvas, "canvas");
        C9677q.m14633g(parent, "parent");
        C9677q.m14633g(state, "state");
        super.onDraw(canvas, parent, state);
        canvas.save();
        RecyclerView.Adapter adapter = parent.getAdapter();
        C9677q.m14635e(adapter, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChatListAdapter");
        ChatListAdapter chatListAdapter = (ChatListAdapter) adapter;
        Iterator<Integer> it = new IntRange(0, parent.getChildCount()).iterator();
        while (it.hasNext()) {
            View child = parent.getChildAt(((AbstractC11047p) it).nextInt());
            int childAdapterPosition = parent.getChildAdapterPosition(child);
            if (childAdapterPosition >= 0 && childAdapterPosition < chatListAdapter.getChatListItems().size()) {
                ChatListItem chatListItem = chatListAdapter.getChatListItem(childAdapterPosition);
                if (chatListItem == null) {
                    Log log = Log.INSTANCE;
                    String simpleName = getClass().getSimpleName();
                    C9677q.m14634f(simpleName, "javaClass.simpleName");
                    Log.e$default(log, simpleName, "Missing item in position " + childAdapterPosition, (Throwable) null, 4, (Object) null);
                    return;
                } else if (this.drawer.getShouldRenderHighlight().invoke(chatListItem).booleanValue()) {
                    this.drawer.setPaintStyles(chatListItem);
                    HighlightedMessageDrawer highlightedMessageDrawer = this.drawer;
                    C9677q.m14634f(child, "child");
                    highlightedMessageDrawer.drawHighlight(canvas, child, 0, 0);
                }
            }
        }
        canvas.restore();
    }
}
