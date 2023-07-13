package com.discord.chat.presentation.list.delegate.messagebundling;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.presentation.list.delegate.ChatListItemViewHolder;
import com.discord.chat.presentation.list.item.MessageBundleItem;
import com.discord.misc.utilities.measure.ViewMeasuringWrapper;
import com.facebook.react.uimanager.ViewProps;
import com.hannesdorfmann.adapterdelegates4.AdapterDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B'\u0012\u001e\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J4\u0010\u0013\u001a\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0014J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H&J.\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0014R,\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/discord/chat/presentation/list/delegate/messagebundling/MessageBundleBaseDelegate;", "Lcom/hannesdorfmann/adapterdelegates4/AdapterDelegate;", "", "Lcom/discord/chat/presentation/list/item/MessageBundleItem;", "Landroid/view/ViewGroup;", "parent", "Lcom/discord/chat/presentation/list/delegate/ChatListItemViewHolder;", "Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;", "Landroid/view/View;", "onCreateViewHolder", "items", "", ViewProps.POSITION, "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "holder", "", "", "payloads", "", "onBindViewHolder", "Landroid/content/Context;", "context", "createView", "view", "item", "onViewRecycled", "Lkotlin/Function3;", "onMeasured", "Lkotlin/jvm/functions/Function3;", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public abstract class MessageBundleBaseDelegate extends AdapterDelegate<List<? extends MessageBundleItem>> {
    private final Function3<View, Integer, Integer, Unit> onMeasured;

    
    public MessageBundleBaseDelegate(Function3<? super View, ? super Integer, ? super Integer, Unit> onMeasured) {
        q.g(onMeasured, "onMeasured");
        this.onMeasured = onMeasured;
    }

    public abstract View createView(Context context);

    public abstract void onBindViewHolder(View view, MessageBundleItem messageBundleItem, List<? extends MessageBundleItem> list, int i10);

    @Override 
    public   void onBindViewHolder(List<? extends MessageBundleItem> list, int i10, RecyclerView.ViewHolder viewHolder, List list2) {
        onBindViewHolder2(list, i10, viewHolder, (List<Object>) list2);
    }

    
    @Override 
    public void onViewRecycled(RecyclerView.ViewHolder holder) {
        q.g(holder, "holder");
        super.onViewRecycled(holder);
        holder.itemView.setId(-1);
    }

    
    protected void onBindViewHolder2(List<? extends MessageBundleItem> items, int i10, RecyclerView.ViewHolder holder, List<Object> payloads) {
        q.g(items, "items");
        q.g(holder, "holder");
        q.g(payloads, "payloads");
        View view = holder.itemView;
        q.f(view, "holder.itemView");
        if (!(view instanceof ViewMeasuringWrapper)) {
            view = null;
        }
        ViewMeasuringWrapper viewMeasuringWrapper = (ViewMeasuringWrapper) view;
        if (viewMeasuringWrapper != null) {
            viewMeasuringWrapper.setId(i10);
            View view2 = viewMeasuringWrapper.getView();
            if (view2 != null) {
                onBindViewHolder(view2, (MessageBundleItem) items.get(i10), items, i10);
            }
        }
    }

    
    @Override 
    public ChatListItemViewHolder<ViewMeasuringWrapper<View>> onCreateViewHolder(ViewGroup parent) {
        q.g(parent, "parent");
        Context context = parent.getContext();
        q.f(context, "parent.context");
        View createView = createView(context);
        createView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ViewMeasuringWrapper viewMeasuringWrapper = new ViewMeasuringWrapper(createView, this.onMeasured);
        viewMeasuringWrapper.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new ChatListItemViewHolder<>(viewMeasuringWrapper);
    }
}
