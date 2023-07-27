package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.structurabletext.StructurableText;
import com.discord.chat.databinding.FlaggedMessageEmbedViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.message.ConnectionsRoleTagView;
import com.discord.chat.presentation.message.RoleIconView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.react.FontManager;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\"\u0010\u0018\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\b\u001a\u00020\tJ\r\u0010\u0019\u001a\u00020\u001aH\u0016¢\u0006\u0002\u0010\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/chat/presentation/message/view/FlaggedMessageEmbedView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "allowChildGestures", "", "binding", "Lcom/discord/chat/databinding/FlaggedMessageEmbedViewBinding;", "configureAuthor", "", "message", "Lcom/discord/chat/bridge/Message;", "eventHandler", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "configureCommunicationDisabled", "isCommunicationDisabled", "configureMessageContent", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "setMessage", "spacingPxOverride", "", "()Ljava/lang/Integer;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class FlaggedMessageEmbedView extends ConstraintLayout implements VerticalSpacingItemDecoration.SpacingProviderView {
    private boolean allowChildGestures;
    private final FlaggedMessageEmbedViewBinding binding;

    
    public FlaggedMessageEmbedView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public  FlaggedMessageEmbedView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final void configureAuthor(final Message message, final ChatEventHandler chatEventHandler) {
        boolean z10;
        int i10;
        SimpleDraweeView configureAuthor$lambda$7 = this.binding.authorAvatar;
        Context context = configureAuthor$lambda$7.getContext();
        q.f(context, "context");
        configureAuthor$lambda$7.setImageURI(MessageKt.avatarUrl(message, context));
        q.f(configureAuthor$lambda$7, "configureAuthor$lambda$7");
        int i11 = 0;
        boolean z11 = true;
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(configureAuthor$lambda$7, false, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                FlaggedMessageEmbedView.configureAuthor$lambda$7$lambda$5(Message.this, chatEventHandler, view);
            }
        }, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(configureAuthor$lambda$7, false, new View.OnLongClickListener() { 
            @Override 
            public final boolean onLongClick(View view) {
                boolean configureAuthor$lambda$7$lambda$6;
                configureAuthor$lambda$7$lambda$6 = FlaggedMessageEmbedView.configureAuthor$lambda$7$lambda$6(Message.this, chatEventHandler, view);
                return configureAuthor$lambda$7$lambda$6;
            }
        }, 1, null);
        TextView configureAuthor$lambda$9 = this.binding.authorName;
        configureAuthor$lambda$9.setTextColor(MessageKt.usernameColor$default(message, 0, 1, null));
        configureAuthor$lambda$9.setText(message.getUsername());
        q.f(configureAuthor$lambda$9, "configureAuthor$lambda$9");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(configureAuthor$lambda$9, false, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                FlaggedMessageEmbedView.configureAuthor$lambda$9$lambda$8(Message.this, chatEventHandler, view);
            }
        }, 1, null);
        RoleIconView configureAuthor$lambda$10 = this.binding.roleIcon;
        q.f(configureAuthor$lambda$10, "configureAuthor$lambda$10");
        if (message.getRoleIcon() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        configureAuthor$lambda$10.setVisibility(i10);
        if (message.getRoleIcon() != null) {
            configureAuthor$lambda$10.configureRoleIcon(message.getRoleIcon(), chatEventHandler);
        }
        ConnectionsRoleTagView configureAuthor$lambda$11 = this.binding.connectionsRoleTag;
        q.f(configureAuthor$lambda$11, "configureAuthor$lambda$11");
        if (message.getConnectionsRoleTag() == null) {
            z11 = false;
        }
        if (!z11) {
            i11 = 8;
        }
        configureAuthor$lambda$11.setVisibility(i11);
        if (message.getConnectionsRoleTag() != null) {
            configureAuthor$lambda$11.m194configureConnectionsRoleTaguESh2Cg(message.m13getAuthorIdwUX8bhU(), message.m15getGuildIdqOKuAAo(), ChannelId.m565boximpl(message.m14getChannelIdo4g7jtM()), message.getConnectionsRoleTag(), chatEventHandler);
        }
    }

    
    public static final void configureAuthor$lambda$7$lambda$5(Message message, ChatEventHandler eventHandler, View view) {
        q.g(message, "$message");
        q.g(eventHandler, "$eventHandler");
        if (message.m13getAuthorIdwUX8bhU() != null) {
            eventHandler.mo158onTapAvatarx5gers8(message.m16getId3Eiw7ao(), message.m13getAuthorIdwUX8bhU().m638unboximpl());
        }
    }

    
    public static final boolean configureAuthor$lambda$7$lambda$6(Message message, ChatEventHandler eventHandler, View view) {
        q.g(message, "$message");
        q.g(eventHandler, "$eventHandler");
        if (message.m13getAuthorIdwUX8bhU() == null) {
            return true;
        }
        eventHandler.mo150onLongPressAvatarx5gers8(message.m16getId3Eiw7ao(), message.m13getAuthorIdwUX8bhU().m638unboximpl());
        return true;
    }

    
    public static final void configureAuthor$lambda$9$lambda$8(Message message, ChatEventHandler eventHandler, View view) {
        q.g(message, "$message");
        q.g(eventHandler, "$eventHandler");
        if (message.m13getAuthorIdwUX8bhU() != null) {
            eventHandler.mo152onLongPressUsernamex5gers8(message.m16getId3Eiw7ao(), message.m13getAuthorIdwUX8bhU().m638unboximpl());
        }
    }

    private final void configureCommunicationDisabled(boolean z10) {
        int i10;
        float f10;
        float f11;
        SimpleDraweeView simpleDraweeView = this.binding.guildCommunicationDisabledIcon;
        q.f(simpleDraweeView, "binding.guildCommunicationDisabledIcon");
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        simpleDraweeView.setVisibility(i10);
        SimpleDraweeView simpleDraweeView2 = this.binding.guildCommunicationDisabledIcon;
        q.f(simpleDraweeView2, "binding.guildCommunicationDisabledIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.ClockTimeout);
        SimpleDraweeView simpleDraweeView3 = this.binding.authorAvatar;
        float f12 = 0.5f;
        if (z10) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        simpleDraweeView3.setAlpha(f10);
        RoleIconView roleIconView = this.binding.roleIcon;
        if (z10) {
            f11 = 0.5f;
        } else {
            f11 = 1.0f;
        }
        roleIconView.setAlpha(f11);
        ConnectionsRoleTagView connectionsRoleTagView = this.binding.connectionsRoleTag;
        if (!z10) {
            f12 = 1.0f;
        }
        connectionsRoleTagView.setAlpha(f12);
    }

    private final void configureMessageContent(Message message) {
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        int i12;
        MessageContentView configureMessageContent$lambda$3 = this.binding.contentView;
        Integer constrainedWidth = message.getConstrainedWidth();
        if (constrainedWidth != null) {
            i10 = constrainedWidth.intValue();
        } else {
            i10 = configureMessageContent$lambda$3.getResources().getDisplayMetrics().widthPixels;
        }
        q.f(configureMessageContent$lambda$3, "configureMessageContent$lambda$3");
        StructurableText content = message.getContent();
        if (content == null || !content.getHasContent()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        configureMessageContent$lambda$3.setVisibility(i11);
        StructurableText content2 = message.getContent();
        if (content2 == null || !content2.getHasContent()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            z12 = true;
            configureMessageContent$lambda$3.m316setMessageContent2i9KL1s(message.getContent(), message.m16getId3Eiw7ao(), MessageKt.shouldAnimateEmoji(message), message.getShouldShowRoleDot(), message.getShouldShowRoleOnName(), FlaggedMessageEmbedView$configureMessageContent$1$1.INSTANCE, FlaggedMessageEmbedView$configureMessageContent$1$2.INSTANCE, FlaggedMessageEmbedView$configureMessageContent$1$3.INSTANCE, FlaggedMessageEmbedView$configureMessageContent$1$4.INSTANCE, FlaggedMessageEmbedView$configureMessageContent$1$5.INSTANCE, FlaggedMessageEmbedView$configureMessageContent$1$6.INSTANCE, FlaggedMessageEmbedView$configureMessageContent$1$7.INSTANCE, FlaggedMessageEmbedView$configureMessageContent$1$8.INSTANCE, FlaggedMessageEmbedView$configureMessageContent$1$9.INSTANCE, FlaggedMessageEmbedView$configureMessageContent$1$10.INSTANCE, FlaggedMessageEmbedView$configureMessageContent$1$11.INSTANCE, (r47 & 65536) != 0 ? MessageContentView$setMessageContent$1.INSTANCE : FlaggedMessageEmbedView$configureMessageContent$1$12.INSTANCE, configureMessageContent$lambda$3.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing), i10, (r47 & 524288) != 0 ? null : null, (r47 & 1048576) != 0 ? null : null, (r47 & 2097152) != 0 ? ThemeManagerKt.getTheme() : null);
        } else {
            z12 = true;
        }
        FlaggedMessageEmbedFooterView configureMessageContent$lambda$4 = this.binding.contentFooterView;
        q.f(configureMessageContent$lambda$4, "configureMessageContent$lambda$4");
        if (message.getAutoModerationContext() != null) {
            z13 = z12;
        } else {
            z13 = false;
        }
        if (z13) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        configureMessageContent$lambda$4.setVisibility(i12);
        if (message.getAutoModerationContext() != null) {
            configureMessageContent$lambda$4.setAutomodContext(message.getAutoModerationContext());
        }
    }

    public static  void setMessage$default(FlaggedMessageEmbedView flaggedMessageEmbedView, Message message, ChatEventHandler chatEventHandler, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            chatEventHandler = ChatEventHandler.Empty.INSTANCE;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        flaggedMessageEmbedView.setMessage(message, chatEventHandler, z10);
    }

    @Override 
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        q.g(ev, "ev");
        return !this.allowChildGestures;
    }

    public final void setMessage(Message message, ChatEventHandler eventHandler, boolean z10) {
        q.g(message, "message");
        q.g(eventHandler, "eventHandler");
        this.allowChildGestures = z10;
        configureAuthor(message, eventHandler);
        configureCommunicationDisabled(q.b(message.getCommunicationDisabled(), Boolean.TRUE));
        configureMessageContent(message);
    }

    @Override 
    public Integer spacingPxOverride() {
        return Integer.valueOf(SizeUtilsKt.getDpToPx(4));
    }

    
    public FlaggedMessageEmbedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        FlaggedMessageEmbedViewBinding inflate = FlaggedMessageEmbedViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.allowChildGestures = true;
        RippleUtilsKt.addRipple$default(this, false, SizeUtilsKt.getDpToPx(8), 1, null);
        View _init_$lambda$0 = inflate.getRoot();
        _init_$lambda$0.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
        q.f(_init_$lambda$0, "_init_$lambda$0");
        ViewClippingUtilsKt.clipToRoundedRectangle(_init_$lambda$0, SizeUtilsKt.getDpToPx(8));
        int dpToPx = SizeUtilsKt.getDpToPx(12);
        _init_$lambda$0.setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
        TextView _init_$lambda$1 = inflate.authorName;
        q.f(_init_$lambda$1, "_init_$lambda$1");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, DiscordFont.PrimarySemibold);
        float f10 = 16.0f;
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 16.0f, 20.0f);
        _init_$lambda$1.setLineSpacing(0.0f, 1.05f);
        SimpleDraweeView simpleDraweeView = inflate.authorAvatar;
        q.f(simpleDraweeView, "binding.authorAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        MessageContentView _init_$lambda$2 = inflate.contentView;
        _init_$lambda$2.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        q.f(_init_$lambda$2, "_init_$lambda$2");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$2, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$2, FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(context) ? 14.0f : f10);
    }
}
