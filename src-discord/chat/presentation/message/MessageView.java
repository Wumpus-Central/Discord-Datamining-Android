package com.discord.chat.presentation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.MediaType;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.MessageKt;
import com.discord.chat.bridge.MessageState;
import com.discord.chat.bridge.messageframe.MessageFrame;
import com.discord.chat.bridge.messageframe.UnknownMessageFrame;
import com.discord.chat.databinding.MessageViewBinding;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.list.MaskedShadowView;
import com.discord.chat.presentation.list.SwipeReplyInitiator;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider;
import com.discord.chat.presentation.root.MessageContext;
import com.discord.chat.presentation.spine.SpineParentMessage;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.primitives.ChannelId;
import com.discord.primitives.MessageFlag;
import com.discord.primitives.MessageFlagKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001]B\u001d\b\u0007\u0012\u0006\u0010X\u001a\u00020W\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010Y¢\u0006\u0004\b[\u0010\\J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J]\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u001120\u0010\u0019\u001a,\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0013j\u0004\u0018\u0001`\u0018H\u0002ø\u0001\u0000J \u0010\u001f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0016\u0010!\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0018\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J \u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020&H\u0016J\b\u0010)\u001a\u00020\u0007H\u0016J\b\u0010*\u001a\u00020\u0007H\u0016J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0005H\u0016Jf\u00104\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\u000e\b\u0002\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0/2\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u0005J\u000e\u00107\u001a\u00020\u00072\u0006\u00106\u001a\u000205J\u000f\u00108\u001a\u00020\u0016H\u0016¢\u0006\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010DR\u0016\u00101\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010ER(\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070/8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010D\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR&\u0010R\u001a\u0012\u0012\u0004\u0012\u00020\u001b0Pj\b\u0012\u0004\u0012\u00020\u001b`Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010V\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006^"}, d2 = {"Lcom/discord/chat/presentation/message/MessageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/discord/recycler_view/decorations/VerticalSpacingItemDecoration$SpacingProviderView;", "Lcom/discord/chat/presentation/spine/SpineParentMessage;", "Lcom/discord/chat/presentation/list/SwipeReplyInitiator;", "", "showDivider", "", "configureDivider", "Landroid/view/View;", "Lcom/discord/chat/bridge/Message;", "message", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "configureAuthorClickListeners", "Lcom/discord/chat/presentation/root/MessageContext;", "messageContext", "Lcom/discord/chat/bridge/messageframe/MessageFrame;", "messageFrame", "Lkotlin/Function4;", "Lcom/discord/primitives/MessageId;", "Lcom/discord/primitives/ChannelId;", "", "Lcom/discord/chat/bridge/MediaType;", "Lcom/discord/chat/presentation/events/MessageLongPress;", "onLongClick", "", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "generateMessageAccessories", "Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "chainPart", "configureAuthor", "items", "configureAccessoriesMargin", "isCommunicationDisabled", "configureCommunicationDisabled", "isSuppressNotifications", "configureSuppressNotifications", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "onSwipeStart", "onSwipeEnd", "pressed", "setPressed", "Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;", "componentProvider", "Lkotlin/Function0;", "onChainPart", "allowChildGestures", "isHighlight", "renderContentOnly", "setMessage", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "recycledViewPool", "setAccessoriesRecycledViewPool", "spacingPxOverride", "()Ljava/lang/Integer;", "Lcom/discord/chat/databinding/MessageViewBinding;", "binding", "Lcom/discord/chat/databinding/MessageViewBinding;", "Lcom/discord/chat/presentation/list/MaskedShadowView;", "shadowView", "Lcom/discord/chat/presentation/list/MaskedShadowView;", "getShadowView", "()Lcom/discord/chat/presentation/list/MaskedShadowView;", "setShadowView", "(Lcom/discord/chat/presentation/list/MaskedShadowView;)V", "Lkotlin/jvm/functions/Function0;", "Z", "onInitiateReply", "getOnInitiateReply", "()Lkotlin/jvm/functions/Function0;", "setOnInitiateReply", "(Lkotlin/jvm/functions/Function0;)V", "enableSwipeToReply", "getEnableSwipeToReply", "()Z", "setEnableSwipeToReply", "(Z)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "accessories", "Ljava/util/ArrayList;", "getSpineOriginView", "()Landroid/view/View;", "spineOriginView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ChainPart", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class MessageView extends ConstraintLayout implements VerticalSpacingItemDecoration.SpacingProviderView, SpineParentMessage, SwipeReplyInitiator {
    private ArrayList<MessageAccessory> accessories;
    private boolean allowChildGestures;
    private final MessageViewBinding binding;
    private boolean enableSwipeToReply;
    private Function0<? extends ChainPart> onChainPart;
    private Function0<Unit> onInitiateReply;
    public MaskedShadowView shadowView;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/discord/chat/presentation/message/MessageView$ChainPart;", "", "(Ljava/lang/String;I)V", "ONLY", "START", "MIDDLE", "END", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public enum ChainPart {
        ONLY,
        START,
        MIDDLE,
        END
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public  class WhenMappings {
        public static final  int[] $EnumSwitchMapping$0;
        public static final  int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MessageState.values().length];
            try {
                iArr[MessageState.SendFailed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MessageState.Sending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ChainPart.values().length];
            try {
                iArr2[ChainPart.END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ChainPart.ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChainPart.START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChainPart.MIDDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    
    public MessageView(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  MessageView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final void configureAccessoriesMargin(List<? extends MessageAccessory> list) {
        Object U;
        boolean z10;
        boolean z11;
        int i10;
        U = r.U(list);
        boolean z12 = U instanceof MessageContentAccessory;
        int i11 = 0;
        boolean z13 = true;
        if (list.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || !z12) {
            z11 = true;
        } else {
            z11 = false;
        }
        ChainPart chainPart = (ChainPart) this.onChainPart.invoke();
        if (!(chainPart == ChainPart.MIDDLE || chainPart == ChainPart.START)) {
            z13 = false;
        }
        if (z12) {
            i10 = 0;
        } else {
            i10 = SizeUtilsKt.getDpToPx(8);
        }
        if (z11 && z13) {
            i11 = SizeUtilsKt.getDpToPx(4);
        }
        ViewGroup.LayoutParams layoutParams = this.binding.accessoriesView.getLayoutParams();
        q.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i12 = marginLayoutParams.topMargin;
        int i13 = marginLayoutParams.bottomMargin;
        if (i12 != i10 || i13 != i11) {
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i10, marginLayoutParams.rightMargin, i11);
            this.binding.accessoriesView.setLayoutParams(marginLayoutParams);
        }
    }

    private final void configureAuthor(final Message message, final ChatEventHandler chatEventHandler, ChainPart chainPart) {
        int i10;
        if (chainPart == ChainPart.START || chainPart == ChainPart.ONLY) {
            TextView configureAuthor$lambda$25 = this.binding.authorName;
            configureAuthor$lambda$25.setTextColor(MessageKt.usernameColor$default(message, 0, 1, null));
            configureAuthor$lambda$25.setText(message.getUsername());
            q.g(configureAuthor$lambda$25, "configureAuthor$lambda$25");
            configureAuthorClickListeners(configureAuthor$lambda$25, message, chatEventHandler);
            View view = this.binding.roleDot;
            q.g(view, "binding.roleDot");
            configureAuthorClickListeners(view, message, chatEventHandler);
            this.binding.timestamp.setText(message.getTimestamp());
            SimpleDraweeView configureAuthor$lambda$28 = this.binding.authorAvatar;
            Context context = configureAuthor$lambda$28.getContext();
            q.g(context, "context");
            configureAuthor$lambda$28.setImageURI(MessageKt.avatarUrl(message, context));
            q.g(configureAuthor$lambda$28, "configureAuthor$lambda$28");
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(configureAuthor$lambda$28, false, new View.OnClickListener() { 
                @Override 
                public final void onClick(View view2) {
                    MessageView.configureAuthor$lambda$28$lambda$26(Message.this, chatEventHandler, view2);
                }
            }, 1, null);
            NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(configureAuthor$lambda$28, false, new View.OnLongClickListener() { 
                @Override 
                public final boolean onLongClick(View view2) {
                    boolean configureAuthor$lambda$28$lambda$27;
                    configureAuthor$lambda$28$lambda$27 = MessageView.configureAuthor$lambda$28$lambda$27(Message.this, chatEventHandler, view2);
                    return configureAuthor$lambda$28$lambda$27;
                }
            }, 1, null);
            if (message.getAvatarDecorationURL() != null) {
                SimpleDraweeView simpleDraweeView = this.binding.authorAvatarDecoration;
                q.g(simpleDraweeView, "binding.authorAvatarDecoration");
                simpleDraweeView.setVisibility(0);
                this.binding.authorAvatarDecoration.setImageURI(message.getAvatarDecorationURL());
            } else {
                SimpleDraweeView simpleDraweeView2 = this.binding.authorAvatarDecoration;
                q.g(simpleDraweeView2, "binding.authorAvatarDecoration");
                simpleDraweeView2.setVisibility(8);
            }
            TextView textView = this.binding.timestamp;
            q.g(textView, "binding.timestamp");
            textView.setVisibility(0);
            TextView textView2 = this.binding.authorName;
            q.g(textView2, "binding.authorName");
            textView2.setVisibility(0);
            SimpleDraweeView simpleDraweeView3 = this.binding.authorAvatar;
            q.g(simpleDraweeView3, "binding.authorAvatar");
            simpleDraweeView3.setVisibility(0);
            if (message.getShouldShowRoleDot()) {
                RoleDotView roleDotView = this.binding.roleDot;
                q.g(roleDotView, "binding.roleDot");
                roleDotView.setVisibility(0);
                RoleDotView roleDotView2 = this.binding.roleDot;
                q.g(roleDotView2, "binding.roleDot");
                RoleDotView.configure$default(roleDotView2, MessageKt.roleDotColor$default(message, 0, 1, null), 0, 2, null);
            } else {
                RoleDotView roleDotView3 = this.binding.roleDot;
                q.g(roleDotView3, "binding.roleDot");
                roleDotView3.setVisibility(8);
            }
            if (message.getRoleIcon() != null) {
                this.binding.roleIcon.configureRoleIcon(message.getRoleIcon(), chatEventHandler);
                RoleIconView roleIconView = this.binding.roleIcon;
                q.g(roleIconView, "binding.roleIcon");
                roleIconView.setVisibility(0);
            } else {
                RoleIconView roleIconView2 = this.binding.roleIcon;
                q.g(roleIconView2, "binding.roleIcon");
                roleIconView2.setVisibility(8);
            }
            if (message.getConnectionsRoleTag() != null) {
                this.binding.connectionsRoleTag.m207configureConnectionsRoleTaguESh2Cg(message.m22getAuthorIdwUX8bhU(), message.m24getGuildIdqOKuAAo(), ChannelId.m591boximpl(message.m23getChannelIdo4g7jtM()), message.getConnectionsRoleTag(), chatEventHandler);
                ConnectionsRoleTagView connectionsRoleTagView = this.binding.connectionsRoleTag;
                q.g(connectionsRoleTagView, "binding.connectionsRoleTag");
                connectionsRoleTagView.setVisibility(0);
                i10 = 8;
            } else {
                ConnectionsRoleTagView connectionsRoleTagView2 = this.binding.connectionsRoleTag;
                q.g(connectionsRoleTagView2, "binding.connectionsRoleTag");
                i10 = 8;
                connectionsRoleTagView2.setVisibility(8);
            }
            if (message.getTagText() == null && message.getOpTagText() == null) {
                MessageTagView messageTagView = this.binding.messageTagView;
                q.g(messageTagView, "binding.messageTagView");
                messageTagView.setVisibility(i10);
                MessageAltRemixTagView messageAltRemixTagView = this.binding.messageAltRemixTagView;
                q.g(messageAltRemixTagView, "binding.messageAltRemixTagView");
                messageAltRemixTagView.setVisibility(i10);
            } else if (message.getTagType() == null || !q.c(message.getTagType(), "f")) {
                MessageTagView messageTagView2 = this.binding.messageTagView;
                q.g(messageTagView2, "binding.messageTagView");
                messageTagView2.setVisibility(0);
                this.binding.messageTagView.m227configureTagVieweCJZyo(message.getTagText(), message.getTagVerified(), message.getTagTextColor(), message.getTagBackgroundColor(), message.getOpTagText(), chatEventHandler, message.m25getId3Eiw7ao(), message.m23getChannelIdo4g7jtM(), message.getTagType());
                MessageAltRemixTagView messageAltRemixTagView2 = this.binding.messageAltRemixTagView;
                q.g(messageAltRemixTagView2, "binding.messageAltRemixTagView");
                messageAltRemixTagView2.setVisibility(8);
            } else {
                MessageAltRemixTagView messageAltRemixTagView3 = this.binding.messageAltRemixTagView;
                q.g(messageAltRemixTagView3, "binding.messageAltRemixTagView");
                messageAltRemixTagView3.setVisibility(0);
                this.binding.messageAltRemixTagView.m226configureTagViewe2j04IU(message.getTagText(), message.getTagTextColor(), message.getTagBackgroundColor(), chatEventHandler, message.m25getId3Eiw7ao(), message.m23getChannelIdo4g7jtM(), message.getTagType());
                MessageTagView messageTagView3 = this.binding.messageTagView;
                q.g(messageTagView3, "binding.messageTagView");
                messageTagView3.setVisibility(8);
            }
        } else {
            TextView textView3 = this.binding.timestamp;
            q.g(textView3, "binding.timestamp");
            textView3.setVisibility(8);
            TextView textView4 = this.binding.authorName;
            q.g(textView4, "binding.authorName");
            textView4.setVisibility(8);
            SimpleDraweeView simpleDraweeView4 = this.binding.authorAvatar;
            q.g(simpleDraweeView4, "binding.authorAvatar");
            simpleDraweeView4.setVisibility(8);
            SimpleDraweeView simpleDraweeView5 = this.binding.authorAvatarDecoration;
            q.g(simpleDraweeView5, "binding.authorAvatarDecoration");
            simpleDraweeView5.setVisibility(8);
            RoleDotView roleDotView4 = this.binding.roleDot;
            q.g(roleDotView4, "binding.roleDot");
            roleDotView4.setVisibility(8);
            RoleIconView roleIconView3 = this.binding.roleIcon;
            q.g(roleIconView3, "binding.roleIcon");
            roleIconView3.setVisibility(8);
            ConnectionsRoleTagView connectionsRoleTagView3 = this.binding.connectionsRoleTag;
            q.g(connectionsRoleTagView3, "binding.connectionsRoleTag");
            connectionsRoleTagView3.setVisibility(8);
            MessageTagView messageTagView4 = this.binding.messageTagView;
            q.g(messageTagView4, "binding.messageTagView");
            messageTagView4.setVisibility(8);
            MessageAltRemixTagView messageAltRemixTagView4 = this.binding.messageAltRemixTagView;
            q.g(messageAltRemixTagView4, "binding.messageAltRemixTagView");
            messageAltRemixTagView4.setVisibility(8);
        }
    }

    public static final void configureAuthor$lambda$28$lambda$26(Message message, ChatEventHandler eventHandler, View view) {
        q.h(message, "$message");
        q.h(eventHandler, "$eventHandler");
        if (message.m22getAuthorIdwUX8bhU() != null) {
            eventHandler.mo167onTapAvatarx5gers8(message.m25getId3Eiw7ao(), message.m22getAuthorIdwUX8bhU().m664unboximpl());
        }
    }

    public static final boolean configureAuthor$lambda$28$lambda$27(Message message, ChatEventHandler eventHandler, View view) {
        q.h(message, "$message");
        q.h(eventHandler, "$eventHandler");
        if (message.m22getAuthorIdwUX8bhU() == null) {
            return true;
        }
        eventHandler.mo159onLongPressAvatarx5gers8(message.m25getId3Eiw7ao(), message.m22getAuthorIdwUX8bhU().m664unboximpl());
        return true;
    }

    private final void configureAuthorClickListeners(View view, final Message message, final ChatEventHandler chatEventHandler) {
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(view, false, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view2) {
                MessageView.configureAuthorClickListeners$lambda$4(Message.this, chatEventHandler, view2);
            }
        }, 1, null);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(view, false, new View.OnLongClickListener() { 
            @Override 
            public final boolean onLongClick(View view2) {
                boolean configureAuthorClickListeners$lambda$5;
                configureAuthorClickListeners$lambda$5 = MessageView.configureAuthorClickListeners$lambda$5(Message.this, chatEventHandler, view2);
                return configureAuthorClickListeners$lambda$5;
            }
        }, 1, null);
    }

    public static final void configureAuthorClickListeners$lambda$4(Message message, ChatEventHandler eventHandler, View view) {
        q.h(message, "$message");
        q.h(eventHandler, "$eventHandler");
        if (message.m22getAuthorIdwUX8bhU() != null) {
            eventHandler.mo190onTapUsernamex5gers8(message.m25getId3Eiw7ao(), message.m22getAuthorIdwUX8bhU().m664unboximpl());
        }
    }

    public static final boolean configureAuthorClickListeners$lambda$5(Message message, ChatEventHandler eventHandler, View view) {
        q.h(message, "$message");
        q.h(eventHandler, "$eventHandler");
        if (message.m22getAuthorIdwUX8bhU() == null) {
            return true;
        }
        eventHandler.mo161onLongPressUsernamex5gers8(message.m25getId3Eiw7ao(), message.m22getAuthorIdwUX8bhU().m664unboximpl());
        return true;
    }

    private final void configureCommunicationDisabled(boolean z10, ChainPart chainPart) {
        boolean z11;
        float f10;
        float f11;
        float f12;
        int i10 = 0;
        if (!z10 || !(chainPart == ChainPart.START || chainPart == ChainPart.ONLY)) {
            z11 = false;
        } else {
            z11 = true;
        }
        SimpleDraweeView simpleDraweeView = this.binding.guildCommunicationDisabledIcon;
        q.g(simpleDraweeView, "binding.guildCommunicationDisabledIcon");
        if (!z11) {
            i10 = 8;
        }
        simpleDraweeView.setVisibility(i10);
        SimpleDraweeView simpleDraweeView2 = this.binding.guildCommunicationDisabledIcon;
        q.g(simpleDraweeView2, "binding.guildCommunicationDisabledIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.ClockTimeout);
        SimpleDraweeView simpleDraweeView3 = this.binding.authorAvatar;
        float f13 = 0.5f;
        if (z11) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        simpleDraweeView3.setAlpha(f10);
        RoleIconView roleIconView = this.binding.roleIcon;
        if (z11) {
            f11 = 0.5f;
        } else {
            f11 = 1.0f;
        }
        roleIconView.setAlpha(f11);
        SimpleDraweeView simpleDraweeView4 = this.binding.authorAvatarDecoration;
        if (z11) {
            f12 = 0.5f;
        } else {
            f12 = 1.0f;
        }
        simpleDraweeView4.setAlpha(f12);
        SimpleDraweeView simpleDraweeView5 = this.binding.suppressNotificationsIcon;
        if (!z11) {
            f13 = 1.0f;
        }
        simpleDraweeView5.setAlpha(f13);
    }

    private final void configureDivider(boolean z10) {
        int i10;
        View view = this.binding.messageHeaderDivider;
        q.g(view, "binding.messageHeaderDivider");
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        view.setVisibility(i10);
    }

    private final void configureSuppressNotifications(boolean z10, final ChatEventHandler chatEventHandler, ChainPart chainPart) {
        boolean z11;
        int i10;
        if (!z10 || !(chainPart == ChainPart.START || chainPart == ChainPart.ONLY)) {
            z11 = false;
        } else {
            z11 = true;
        }
        SimpleDraweeView simpleDraweeView = this.binding.suppressNotificationsIcon;
        q.g(simpleDraweeView, "binding.suppressNotificationsIcon");
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        simpleDraweeView.setVisibility(i10);
        if (z11) {
            SimpleDraweeView simpleDraweeView2 = this.binding.suppressNotificationsIcon;
            q.g(simpleDraweeView2, "binding.suppressNotificationsIcon");
            ReactAssetUtilsKt.setReactAsset(simpleDraweeView2, ReactAsset.BellSnooze);
            SimpleDraweeView simpleDraweeView3 = this.binding.suppressNotificationsIcon;
            q.g(simpleDraweeView3, "binding.suppressNotificationsIcon");
            ColorUtilsKt.setTintColor(simpleDraweeView3, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveNormal()));
        }
        SimpleDraweeView simpleDraweeView4 = this.binding.suppressNotificationsIcon;
        q.g(simpleDraweeView4, "binding.suppressNotificationsIcon");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView4, false, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                MessageView.configureSuppressNotifications$lambda$29(ChatEventHandler.this, view);
            }
        }, 1, null);
    }

    public static final void configureSuppressNotifications$lambda$29(ChatEventHandler eventHandler, View view) {
        q.h(eventHandler, "$eventHandler");
        eventHandler.onTapSuppressNotificationsIcon();
    }

    
    
    private final java.util.List<com.discord.chat.presentation.message.messagepart.MessageAccessory> generateMessageAccessories(com.discord.chat.bridge.Message r29, com.discord.chat.presentation.root.MessageContext r30, com.discord.chat.bridge.messageframe.MessageFrame r31, kotlin.jvm.functions.Function4<? super com.discord.primitives.MessageId, ? super com.discord.primitives.ChannelId, ? super java.lang.Integer, ? super com.discord.chat.bridge.MediaType, kotlin.Unit> r32) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.message.MessageView.generateMessageAccessories(com.discord.chat.bridge.Message, com.discord.chat.presentation.root.MessageContext, com.discord.chat.bridge.messageframe.MessageFrame, kotlin.jvm.functions.Function4):java.util.List");
    }

    private static final View.OnLongClickListener generateMessageAccessories$getLongClickListener(final Function4<? super MessageId, ? super ChannelId, ? super Integer, ? super MediaType, Unit> function4, final Message message, final int i10, final MediaType mediaType) {
        if (function4 != null) {
            return new View.OnLongClickListener() { 
                @Override 
                public final boolean onLongClick(View view) {
                    boolean generateMessageAccessories$getLongClickListener$lambda$7$lambda$6;
                    generateMessageAccessories$getLongClickListener$lambda$7$lambda$6 = MessageView.generateMessageAccessories$getLongClickListener$lambda$7$lambda$6(Function4.this, message, i10, mediaType, view);
                    return generateMessageAccessories$getLongClickListener$lambda$7$lambda$6;
                }
            };
        }
        return null;
    }

    public static final boolean generateMessageAccessories$getLongClickListener$lambda$7$lambda$6(Function4 function4, Message message, int i10, MediaType mediaType, View view) {
        q.h(message, "$message");
        q.h(mediaType, "$mediaType");
        function4.invoke(MessageId.m617boximpl(message.m25getId3Eiw7ao()), ChannelId.m591boximpl(message.m23getChannelIdo4g7jtM()), Integer.valueOf(i10), mediaType);
        return true;
    }

    public static  void setMessage$default(MessageView messageView, Message message, MessageContext messageContext, MessageFrame messageFrame, ChatEventHandler chatEventHandler, ComponentProvider componentProvider, Function0 function0, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        MessageFrame messageFrame2;
        ChatEventHandler.Empty empty;
        ComponentProvider componentProvider2;
        MessageView$setMessage$1 messageView$setMessage$1;
        boolean z13;
        boolean z14;
        boolean z15;
        if ((i10 & 4) != 0) {
            messageFrame2 = null;
        } else {
            messageFrame2 = messageFrame;
        }
        if ((i10 & 8) != 0) {
            empty = ChatEventHandler.Empty.INSTANCE;
        } else {
            empty = chatEventHandler;
        }
        if ((i10 & 16) != 0) {
            componentProvider2 = null;
        } else {
            componentProvider2 = componentProvider;
        }
        if ((i10 & 32) != 0) {
            messageView$setMessage$1 = MessageView$setMessage$1.INSTANCE;
        } else {
            messageView$setMessage$1 = function0;
        }
        if ((i10 & 64) != 0) {
            z13 = true;
        } else {
            z13 = z10;
        }
        if ((i10 & 128) != 0) {
            z14 = false;
        } else {
            z14 = z11;
        }
        if ((i10 & 256) != 0) {
            z15 = false;
        } else {
            z15 = z12;
        }
        messageView.setMessage(message, messageContext, messageFrame2, empty, componentProvider2, messageView$setMessage$1, z13, z14, z15);
    }

    public static final void setMessage$lambda$1$lambda$0(Function2 onMessageTapped, Message message, View view) {
        q.h(onMessageTapped, "$onMessageTapped");
        q.h(message, "$message");
        onMessageTapped.invoke(MessageId.m617boximpl(message.m25getId3Eiw7ao()), ChannelId.m591boximpl(message.m23getChannelIdo4g7jtM()));
    }

    public static final boolean setMessage$lambda$3$lambda$2(Function4 it, Message message, View view) {
        q.h(it, "$it");
        q.h(message, "$message");
        it.invoke(MessageId.m617boximpl(message.m25getId3Eiw7ao()), ChannelId.m591boximpl(message.m23getChannelIdo4g7jtM()), null, null);
        return true;
    }

    @Override 
    public boolean getEnableSwipeToReply() {
        return this.enableSwipeToReply;
    }

    @Override 
    public Function0<Unit> getOnInitiateReply() {
        return this.onInitiateReply;
    }

    @Override 
    public MaskedShadowView getShadowView() {
        MaskedShadowView maskedShadowView = this.shadowView;
        if (maskedShadowView != null) {
            return maskedShadowView;
        }
        q.z("shadowView");
        return null;
    }

    @Override 
    public View getSpineOriginView() {
        SimpleDraweeView simpleDraweeView = this.binding.authorAvatar;
        q.g(simpleDraweeView, "binding.authorAvatar");
        return simpleDraweeView;
    }

    @Override 
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        q.h(ev, "ev");
        return !this.allowChildGestures;
    }

    @Override 
    public void onSwipeEnd() {
        setClipChildren(true);
        setClipToPadding(true);
        getShadowView().setVisibility(4);
    }

    @Override 
    public void onSwipeStart() {
        setClipChildren(false);
        setClipToPadding(false);
        getShadowView().setVisibility(0);
    }

    public final void setAccessoriesRecycledViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        q.h(recycledViewPool, "recycledViewPool");
        this.binding.accessoriesView.setRecycledViewPool(recycledViewPool);
    }

    @Override 
    public void setEnableSwipeToReply(boolean z10) {
        this.enableSwipeToReply = z10;
    }

    public final void setMessage(final Message message, MessageContext messageContext, MessageFrame messageFrame, ChatEventHandler eventHandler, ComponentProvider componentProvider, Function0<? extends ChainPart> onChainPart, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        View.OnClickListener onClickListener;
        q.h(message, "message");
        q.h(messageContext, "messageContext");
        q.h(eventHandler, "eventHandler");
        q.h(onChainPart, "onChainPart");
        this.onChainPart = onChainPart;
        setOnInitiateReply(new MessageView$setMessage$2(eventHandler, message));
        setEnableSwipeToReply(messageContext.getEnableSwipeToReply());
        this.allowChildGestures = z10;
        ChainPart chainPart = (ChainPart) onChainPart.invoke();
        if (z12) {
            this.binding.accessoriesView.updateLeftMargin(getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing));
        } else {
            this.binding.accessoriesView.updateLeftMargin(getResources().getDimensionPixelSize(R.dimen.message_start_guideline));
        }
        int i10 = 8;
        if (messageFrame == null || (messageFrame instanceof UnknownMessageFrame)) {
            MessageFrameHeaderView messageFrameHeaderView = this.binding.messageFrameHeader;
            q.g(messageFrameHeaderView, "binding.messageFrameHeader");
            messageFrameHeaderView.setVisibility(8);
        } else {
            MessageFrameHeaderView messageFrameHeaderView2 = this.binding.messageFrameHeader;
            q.g(messageFrameHeaderView2, "binding.messageFrameHeader");
            messageFrameHeaderView2.setVisibility(0);
            this.binding.messageFrameHeader.configure(messageFrame);
        }
        configureAuthor(message, eventHandler, chainPart);
        configureDivider(messageContext.getShowDivider());
        String threadStarterMessageHeader = message.getThreadStarterMessageHeader();
        ThreadStarterMessageHeaderView threadStarterMessageHeaderView = this.binding.threadStarterHeader;
        if (message.getReferencedMessage() != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        threadStarterMessageHeaderView.configure(threadStarterMessageHeader, z13);
        MessageHighlightHeader messageHighlightHeader = this.binding.highlightHeader;
        q.g(messageHighlightHeader, "binding.highlightHeader");
        if (z11) {
            i10 = 0;
        }
        messageHighlightHeader.setVisibility(i10);
        if (message.getReferencedMessage() != null) {
            MessageViewReplyPreview messageViewReplyPreview = this.binding.replyPreview;
            q.g(messageViewReplyPreview, "binding.replyPreview");
            MessageViewReplyPreview.configureReply$default(messageViewReplyPreview, message.getReferencedMessage(), false, new MessageView$setMessage$3(eventHandler, message), 2, null);
        } else if (message.getExecutedCommand() != null) {
            this.binding.replyPreview.m228configureExecutedCommandLdU2QRA(message.m25getId3Eiw7ao(), message.getExecutedCommand(), MessageKt.shouldAnimateEmoji(message), message.getShouldShowRoleDot(), message.getShouldShowRoleOnName(), eventHandler);
        } else {
            this.binding.replyPreview.clear();
        }
        final Function2<MessageId, ChannelId, Unit> onMessageTapped = eventHandler.getOnMessageTapped();
        View.OnLongClickListener onLongClickListener = null;
        if (onMessageTapped != null) {
            onClickListener = new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MessageView.setMessage$lambda$1$lambda$0(Function2.this, message, view);
                }
            };
        } else {
            onClickListener = null;
        }
        final Function4<MessageId, ChannelId, Integer, MediaType, Unit> onMessageLongPressed = eventHandler.getOnMessageLongPressed();
        if (onMessageLongPressed != null) {
            onLongClickListener = new View.OnLongClickListener() { 
                @Override 
                public final boolean onLongClick(View view) {
                    boolean message$lambda$3$lambda$2;
                    message$lambda$3$lambda$2 = MessageView.setMessage$lambda$3$lambda$2(Function4.this, message, view);
                    return message$lambda$3$lambda$2;
                }
            };
        }
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, onClickListener);
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, onLongClickListener);
        List<MessageAccessory> generateMessageAccessories = generateMessageAccessories(message, messageContext, messageFrame, eventHandler.getOnMessageLongPressed());
        this.binding.accessoriesView.m225setAccessoriesRC8ZMxU(message.m25getId3Eiw7ao(), message.m23getChannelIdo4g7jtM(), message.m24getGuildIdqOKuAAo(), generateMessageAccessories, eventHandler, componentProvider);
        configureAccessoriesMargin(generateMessageAccessories);
        configureCommunicationDisabled(q.c(message.getCommunicationDisabled(), Boolean.TRUE), chainPart);
        configureSuppressNotifications(MessageFlagKt.hasMessageFlag(Long.valueOf(message.getFlags()), MessageFlag.SUPPRESS_NOTIFICATIONS), eventHandler, chainPart);
        this.binding.accessoriesView.setOnCurrentContentViewChanged(new MessageView$setMessage$4(this, message, onClickListener, onLongClickListener));
    }

    @Override 
    public void setOnInitiateReply(Function0<Unit> function0) {
        q.h(function0, "<set-?>");
        this.onInitiateReply = function0;
    }

    @Override 
    public void setPressed(boolean z10) {
        super.setPressed(z10 && (isClickable() || isFocusable()));
    }

    @Override 
    public void setShadowView(MaskedShadowView maskedShadowView) {
        q.h(maskedShadowView, "<set-?>");
        this.shadowView = maskedShadowView;
    }

    @Override 
    public Integer spacingPxOverride() {
        int i10;
        int i11 = WhenMappings.$EnumSwitchMapping$1[((ChainPart) this.onChainPart.invoke()).ordinal()];
        if (i11 == 1 || i11 == 2) {
            i10 = SizeUtilsKt.getDpToPx(16);
        } else if (i11 == 3 || i11 == 4) {
            i10 = 0;
        } else {
            throw new jf.q();
        }
        return Integer.valueOf(i10);
    }

    
    public MessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        MessageViewBinding inflate = MessageViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        setPadding(0, SizeUtilsKt.getDpToPx(2), 0, SizeUtilsKt.getDpToPx(2));
        RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
        TextView textView = inflate.timestamp;
        q.g(textView, "binding.timestamp");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryMedium);
        inflate.timestamp.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
        TextView textView2 = inflate.timestamp;
        q.g(textView2, "binding.timestamp");
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f, 15.0f);
        TextView textView3 = inflate.authorName;
        q.g(textView3, "binding.authorName");
        DiscordFontUtilsKt.setDiscordFont(textView3, DiscordFont.PrimarySemibold);
        TextView textView4 = inflate.authorName;
        q.g(textView4, "binding.authorName");
        SetTextSizeSpKt.setTextSizeSp(textView4, 16.0f, 20.0f);
        SimpleDraweeView simpleDraweeView = inflate.authorAvatar;
        q.g(simpleDraweeView, "binding.authorAvatar");
        ViewClippingUtilsKt.clipToCircle(simpleDraweeView);
        inflate.messageHeaderDivider.setBackgroundColor(ColorUtilsKt.getThemeColor(context, R.color.message_divider_light, R.color.message_divider_dark));
        MaskedShadowView maskedShadowView = inflate.shadowView;
        q.g(maskedShadowView, "binding.shadowView");
        setShadowView(maskedShadowView);
        getShadowView().setVisibility(4);
        this.onChainPart = MessageView$onChainPart$1.INSTANCE;
        this.allowChildGestures = true;
        this.onInitiateReply = MessageView$onInitiateReply$1.INSTANCE;
        this.accessories = new ArrayList<>(2);
    }
}
