package com.discord.chat.presentation.blockedmessage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.R;
import com.discord.chat.databinding.BlockedMessageGroupViewBinding;
import com.discord.chat.presentation.blockedmessage.BlockedMessageGroupView;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.BaseChatListAdapter;
import com.discord.chat.presentation.list.item.BlockedGroupChatListItem;
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDecoration;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J*\u0010\u0013\u001a\u00020\u000e2\u0010\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u00120\u0014j\u0002`\u00152\u0010\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u00170\u0014j\u0002`\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/presentation/blockedmessage/BlockedMessageGroupView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/BlockedMessageGroupViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/BlockedMessageGroupViewBinding;", "listAdapter", "Lcom/discord/chat/presentation/list/BaseChatListAdapter;", "bind", "", "item", "Lcom/discord/chat/presentation/list/item/BlockedGroupChatListItem;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "setupUI", "Lkotlin/Function0;", "Lcom/discord/chat/presentation/list/delegate/EventHandlerProvider;", "componentProvider", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "Lcom/discord/chat/presentation/list/delegate/MessageComponentProvider;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class BlockedMessageGroupView extends ConstraintLayout {
    private final BlockedMessageGroupViewBinding binding;
    private BaseChatListAdapter listAdapter;

    
    public BlockedMessageGroupView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public  BlockedMessageGroupView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    
    public static final void bind$lambda$2(ChatEventHandler eventHandler, BlockedGroupChatListItem item, View view) {
        q.g(eventHandler, "$eventHandler");
        q.g(item, "$item");
        eventHandler.mo178onTapToggleBlockedMessages1xi1bu0(MessageId.m592constructorimpl(item.getId()));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void bind(final BlockedGroupChatListItem item, final ChatEventHandler eventHandler) {
        int i10;
        q.g(item, "item");
        q.g(eventHandler, "eventHandler");
        setOnClickListener(new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                BlockedMessageGroupView.bind$lambda$2(ChatEventHandler.this, item, view);
            }
        });
        int i11 = 0;
        if (item.isRevealed()) {
            i10 = item.getBackgroundColor();
        } else {
            i10 = 0;
        }
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, i10, SizeUtilsKt.getDpToPx(8), null, 0, 12, null);
        SimpleDraweeView simpleDraweeView = this.binding.closeIcon;
        q.f(simpleDraweeView, "binding.closeIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Close);
        SimpleDraweeView simpleDraweeView2 = this.binding.closeIcon;
        q.f(simpleDraweeView2, "binding.closeIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
        this.binding.blockedMessageGroupButton.setText(item.getText());
        this.binding.blockedMessageGroupButton.setTextColor(item.getTextColor());
        RecyclerView recyclerView = this.binding.blockedMessages;
        q.f(recyclerView, "binding.blockedMessages");
        if (!item.isRevealed()) {
            i11 = 8;
        }
        recyclerView.setVisibility(i11);
        BaseChatListAdapter baseChatListAdapter = this.listAdapter;
        BaseChatListAdapter baseChatListAdapter2 = null;
        if (baseChatListAdapter == null) {
            q.y("listAdapter");
            baseChatListAdapter = null;
        }
        baseChatListAdapter.setItems(item.getContent());
        BaseChatListAdapter baseChatListAdapter3 = this.listAdapter;
        if (baseChatListAdapter3 == null) {
            q.y("listAdapter");
        } else {
            baseChatListAdapter2 = baseChatListAdapter3;
        }
        baseChatListAdapter2.notifyDataSetChanged();
    }

    public final BlockedMessageGroupViewBinding getBinding() {
        return this.binding;
    }

    public final void setupUI(Function0<? extends ChatEventHandler> eventHandler, Function0<ComponentProvider> componentProvider) {
        q.g(eventHandler, "eventHandler");
        q.g(componentProvider, "componentProvider");
        BaseChatListAdapter baseChatListAdapter = new BaseChatListAdapter(eventHandler, componentProvider);
        this.listAdapter = baseChatListAdapter;
        this.binding.blockedMessages.setAdapter(baseChatListAdapter);
    }

    
    public BlockedMessageGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        BlockedMessageGroupViewBinding inflate = BlockedMessageGroupViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
        setPaddingRelative(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
        TextView textView = inflate.blockedMessageGroupButton;
        q.f(textView, "binding.blockedMessageGroupButton");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        RecyclerView recyclerView = inflate.blockedMessages;
        recyclerView.setItemAnimator(null);
        recyclerView.addItemDecoration(new BackgroundHighlightDecoration(context));
        recyclerView.addItemDecoration(new VerticalSpacingItemDecoration(SizeUtilsKt.getDpToPx(16), 0, SizeUtilsKt.getDpToPx(16), true, 2, null));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        linearLayoutManager.M2(true);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}
