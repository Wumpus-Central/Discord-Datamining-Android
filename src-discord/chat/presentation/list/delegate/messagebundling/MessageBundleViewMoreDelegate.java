package com.discord.chat.presentation.list.delegate.messagebundling;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.discord.chat.presentation.list.item.MessageBundleItem;
import com.discord.chat.presentation.list.item.MessageBundleViewMoreItem;
import com.discord.chat.presentation.list.messagebundling.MessageBundleViewMoreView;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u001e\u0010\u001a\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J.\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleViewMoreDelegate;", "Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleBaseDelegate;", "", "Lcom/discord/chat/presentation/list/item/MessageBundleItem;", "items", "", ViewProps.POSITION, "", "isForViewType", "Landroid/view/View;", "view", "item", "", "onBindViewHolder", "Landroid/content/Context;", "context", "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleViewMoreView;", "createView", "Landroid/view/View$OnClickListener;", "onTapViewMoreText", "Landroid/view/View$OnClickListener;", "getOnTapViewMoreText", "()Landroid/view/View$OnClickListener;", "setOnTapViewMoreText", "(Landroid/view/View$OnClickListener;)V", "Lkotlin/Function3;", "onMeasured", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class MessageBundleViewMoreDelegate extends MessageBundleBaseDelegate {
    private View.OnClickListener onTapViewMoreText = new View.OnClickListener() { 
        @Override 
        public final void onClick(View view) {
            MessageBundleViewMoreDelegate.onTapViewMoreText$lambda$0(view);
        }
    };

    
    public MessageBundleViewMoreDelegate(Function3<? super View, ? super Integer, ? super Integer, Unit> onMeasured) {
        super(onMeasured);
        q.h(onMeasured, "onMeasured");
    }

    
    public static final void onTapViewMoreText$lambda$0(View view) {
    }

    public final View.OnClickListener getOnTapViewMoreText() {
        return this.onTapViewMoreText;
    }

    @Override 
    public void onBindViewHolder(View view, MessageBundleItem item, List<? extends MessageBundleItem> items, int i10) {
        q.h(view, "view");
        q.h(item, "item");
        q.h(items, "items");
        if ((view instanceof TextView) && (item instanceof MessageBundleViewMoreItem)) {
            TextView textView = (TextView) view;
            textView.setText(((MessageBundleViewMoreItem) item).getViewMoreText());
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(textView, false, this.onTapViewMoreText, 1, null);
        }
    }

    public final void setOnTapViewMoreText(View.OnClickListener onClickListener) {
        q.h(onClickListener, "<set-?>");
        this.onTapViewMoreText = onClickListener;
    }

    @Override 
    public MessageBundleViewMoreView createView(Context context) {
        q.h(context, "context");
        return new MessageBundleViewMoreView(context, null, 0, 6, null);
    }

    
    public boolean isForViewType(List<? extends MessageBundleItem> items, int i10) {
        q.h(items, "items");
        return items.get(i10) instanceof MessageBundleViewMoreItem;
    }
}
