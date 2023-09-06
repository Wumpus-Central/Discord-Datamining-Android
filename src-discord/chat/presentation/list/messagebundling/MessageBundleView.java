package com.discord.chat.presentation.list.messagebundling;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.chat.R;
import com.discord.chat.bridge.row.MessageRow;
import com.discord.chat.databinding.MessageBundleViewBinding;
import com.discord.chat.presentation.list.ChatListUtilsKt;
import com.discord.chat.presentation.message.MessageFrameFeedHeaderView;
import com.discord.chat.presentation.message.decorations.MessageBundleHorizontalSpacingDecoration;
import com.discord.chat.presentation.message.decorations.MessageBundleSpineItemDecoration;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration;
import com.discord.ripple.RippleUtilsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import ui.f;
import xi.n1;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00013B'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00100\u001a\u00020\u0014¢\u0006\u0004\b1\u00102J=\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\f\u001a\u00020\u0004ø\u0001\u0000R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR.\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R.\u0010#\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 \"\u0004\b%\u0010\"R1\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006@\u0006X\u0086\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView;", "Landroid/widget/LinearLayout;", "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView$MessageBundle;", "messageBundle", "Landroid/view/View$OnClickListener;", "onClickListener", "Landroid/view/View$OnLongClickListener;", "onLongClickListener", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "", "onTapReply", "onTapViewMoreText", "setBundle", "Lcom/discord/chat/databinding/MessageBundleViewBinding;", "binding", "Lcom/discord/chat/databinding/MessageBundleViewBinding;", "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleAdapter;", "adapter", "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleAdapter;", "", "leftMarginPx", "I", "rightMarginPx", "Lcom/discord/chat/presentation/message/decorations/MessageBundleSpineItemDecoration;", "spineItemDecoration", "Lcom/discord/chat/presentation/message/decorations/MessageBundleSpineItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "value", "messageRowViewPool", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "getMessageRowViewPool", "()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "setMessageRowViewPool", "(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "messageAccessoriesViewPool", "getMessageAccessoriesViewPool", "setMessageAccessoriesViewPool", "onTruncateMessage", "Lkotlin/jvm/functions/Function1;", "getOnTruncateMessage", "()Lkotlin/jvm/functions/Function1;", "setOnTruncateMessage", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "MessageBundle", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class MessageBundleView extends LinearLayout {
    private final MessageBundleAdapter adapter;
    private final MessageBundleViewBinding binding;
    private final int leftMarginPx;
    private RecyclerView.RecycledViewPool messageAccessoriesViewPool;
    private RecyclerView.RecycledViewPool messageRowViewPool;
    private Function1<? super MessageId, Unit> onTruncateMessage;
    private final int rightMarginPx;
    private final MessageBundleSpineItemDecoration spineItemDecoration;

    
    public MessageBundleView(Context context) {
        this(context, null, 0, 6, null);
        q.h(context, "context");
    }

    
    public MessageBundleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.h(context, "context");
    }

    public  MessageBundleView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    
    public static final void setBundle$lambda$10$lambda$9$lambda$8(View.OnLongClickListener onLongClickListener, View view) {
        q.h(onLongClickListener, "$onLongClickListener");
        onLongClickListener.onLongClick(view);
    }

    public final RecyclerView.RecycledViewPool getMessageAccessoriesViewPool() {
        return this.messageAccessoriesViewPool;
    }

    public final RecyclerView.RecycledViewPool getMessageRowViewPool() {
        return this.messageRowViewPool;
    }

    public final Function1<MessageId, Unit> getOnTruncateMessage() {
        return this.onTruncateMessage;
    }

    
    
    
    
    
    
    public final void setBundle(com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle r14, android.view.View.OnClickListener r15, final android.view.View.OnLongClickListener r16, kotlin.jvm.functions.Function1<? super com.discord.primitives.MessageId, kotlin.Unit> r17, android.view.View.OnClickListener r18) {
        
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.list.messagebundling.MessageBundleView.setBundle(com.discord.chat.presentation.list.messagebundling.MessageBundleView$MessageBundle, android.view.View$OnClickListener, android.view.View$OnLongClickListener, kotlin.jvm.functions.Function1, android.view.View$OnClickListener):void");
    }

    public final void setMessageAccessoriesViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        if (recycledViewPool != null) {
            this.adapter.setMessageAccessoriesViewPool(recycledViewPool);
        }
        this.messageAccessoriesViewPool = recycledViewPool;
    }

    public final void setMessageRowViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        if (recycledViewPool != null) {
            this.binding.chatListView.setRecycledViewPool(recycledViewPool);
        }
        this.messageRowViewPool = recycledViewPool;
    }

    public final void setOnTruncateMessage(Function1<? super MessageId, Unit> function1) {
        q.h(function1, "<set-?>");
        this.onTruncateMessage = function1;
    }

    
    public MessageBundleView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        MessageBundleViewBinding inflate = MessageBundleViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        MessageBundleAdapter messageBundleAdapter = new MessageBundleAdapter();
        this.adapter = messageBundleAdapter;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.message_start_guideline);
        this.leftMarginPx = dimensionPixelSize;
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
        this.rightMarginPx = dimensionPixelSize2;
        MessageBundleSpineItemDecoration messageBundleSpineItemDecoration = new MessageBundleSpineItemDecoration(context, dimensionPixelSize);
        this.spineItemDecoration = messageBundleSpineItemDecoration;
        this.onTruncateMessage = MessageBundleView$onTruncateMessage$1.INSTANCE;
        RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
        setOrientation(1);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        MessageBundleRecyclerView _init_$lambda$2 = inflate.chatListView;
        q.g(_init_$lambda$2, "_init_$lambda$2");
        ChatListUtilsKt.configureMessageRecyclerView(_init_$lambda$2, context, new VerticalSpacingItemDecoration(SizeUtilsKt.getDpToPx(8), 0, SizeUtilsKt.getDpToPx(8), false, 10, null), messageBundleSpineItemDecoration, new MessageBundleHorizontalSpacingDecoration(dimensionPixelSize, dimensionPixelSize2));
        _init_$lambda$2.setLayoutManager(new LinearLayoutManager(context));
        _init_$lambda$2.setAdapter(messageBundleAdapter);
        _init_$lambda$2.setNestedScrollingEnabled(false);
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u0001:\u0002/0BW\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BG\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003JR\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\rHÖ\u0001J!\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.HÇ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061"}, d2 = {"Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView$MessageBundle;", "", "seen1", "", "messageFrame", "Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;", "rows", "", "Lcom/discord/chat/bridge/row/MessageRow;", "truncationThreshold", "", "referenceMessageRows", "viewMoreText", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/lang/String;)V", "getMessageFrame", "()Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;", "getReferenceMessageRows", "()Ljava/util/List;", "getRows", "getTruncationThreshold", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getViewMoreText", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/discord/chat/presentation/message/MessageFrameFeedHeaderView$MessageBundleHeader;Ljava/util/List;Ljava/lang/Float;Ljava/util/List;Ljava/lang/String;)Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView$MessageBundle;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @f
    
    public static final class MessageBundle {
        public static final Companion Companion = new Companion(null);
        private final MessageFrameFeedHeaderView.MessageBundleHeader messageFrame;
        private final List<MessageRow> referenceMessageRows;
        private final List<MessageRow> rows;
        private final Float truncationThreshold;
        private final String viewMoreText;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView$MessageBundle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/discord/chat/presentation/list/messagebundling/MessageBundleView$MessageBundle;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        
        public static final class Companion {
            private Companion() {
            }

            public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<MessageBundle> serializer() {
                return MessageBundleView$MessageBundle$$serializer.INSTANCE;
            }
        }

        public  MessageBundle(int i10, MessageFrameFeedHeaderView.MessageBundleHeader messageBundleHeader, List list, Float f10, List list2, String str, SerializationConstructorMarker serializationConstructorMarker) {
            List<MessageRow> h10;
            if (2 != (i10 & 2)) {
                n1.b(i10, 2, MessageBundleView$MessageBundle$$serializer.INSTANCE.getDescriptor());
            }
            if ((i10 & 1) == 0) {
                this.messageFrame = null;
            } else {
                this.messageFrame = messageBundleHeader;
            }
            this.rows = list;
            if ((i10 & 4) == 0) {
                this.truncationThreshold = null;
            } else {
                this.truncationThreshold = f10;
            }
            if ((i10 & 8) == 0) {
                h10 = j.h();
                this.referenceMessageRows = h10;
            } else {
                this.referenceMessageRows = list2;
            }
            if ((i10 & 16) == 0) {
                this.viewMoreText = null;
            } else {
                this.viewMoreText = str;
            }
        }

        
        public static  MessageBundle copy$default(MessageBundle messageBundle, MessageFrameFeedHeaderView.MessageBundleHeader messageBundleHeader, List list, Float f10, List list2, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                messageBundleHeader = messageBundle.messageFrame;
            }
            if ((i10 & 2) != 0) {
                list = messageBundle.rows;
            }
            if ((i10 & 4) != 0) {
                f10 = messageBundle.truncationThreshold;
            }
            if ((i10 & 8) != 0) {
                list2 = messageBundle.referenceMessageRows;
            }
            if ((i10 & 16) != 0) {
                str = messageBundle.viewMoreText;
            }
            return messageBundle.copy(messageBundleHeader, list, f10, list2, str);
        }

        
        
        
        
        public static final void write$Self(com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle r6, kotlinx.serialization.encoding.CompositeEncoder r7, kotlinx.serialization.descriptors.SerialDescriptor r8) {
            
            throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.presentation.list.messagebundling.MessageBundleView.MessageBundle.write$Self(com.discord.chat.presentation.list.messagebundling.MessageBundleView$MessageBundle, kotlinx.serialization.encoding.CompositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor):void");
        }

        public final MessageFrameFeedHeaderView.MessageBundleHeader component1() {
            return this.messageFrame;
        }

        public final List<MessageRow> component2() {
            return this.rows;
        }

        public final Float component3() {
            return this.truncationThreshold;
        }

        public final List<MessageRow> component4() {
            return this.referenceMessageRows;
        }

        public final String component5() {
            return this.viewMoreText;
        }

        public final MessageBundle copy(MessageFrameFeedHeaderView.MessageBundleHeader messageBundleHeader, List<MessageRow> rows, Float f10, List<MessageRow> referenceMessageRows, String str) {
            q.h(rows, "rows");
            q.h(referenceMessageRows, "referenceMessageRows");
            return new MessageBundle(messageBundleHeader, rows, f10, referenceMessageRows, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageBundle)) {
                return false;
            }
            MessageBundle messageBundle = (MessageBundle) obj;
            return q.c(this.messageFrame, messageBundle.messageFrame) && q.c(this.rows, messageBundle.rows) && q.c(this.truncationThreshold, messageBundle.truncationThreshold) && q.c(this.referenceMessageRows, messageBundle.referenceMessageRows) && q.c(this.viewMoreText, messageBundle.viewMoreText);
        }

        public final MessageFrameFeedHeaderView.MessageBundleHeader getMessageFrame() {
            return this.messageFrame;
        }

        public final List<MessageRow> getReferenceMessageRows() {
            return this.referenceMessageRows;
        }

        public final List<MessageRow> getRows() {
            return this.rows;
        }

        public final Float getTruncationThreshold() {
            return this.truncationThreshold;
        }

        public final String getViewMoreText() {
            return this.viewMoreText;
        }

        public int hashCode() {
            MessageFrameFeedHeaderView.MessageBundleHeader messageBundleHeader = this.messageFrame;
            int i10 = 0;
            int hashCode = (((messageBundleHeader == null ? 0 : messageBundleHeader.hashCode()) * 31) + this.rows.hashCode()) * 31;
            Float f10 = this.truncationThreshold;
            int hashCode2 = (((hashCode + (f10 == null ? 0 : f10.hashCode())) * 31) + this.referenceMessageRows.hashCode()) * 31;
            String str = this.viewMoreText;
            if (str != null) {
                i10 = str.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            MessageFrameFeedHeaderView.MessageBundleHeader messageBundleHeader = this.messageFrame;
            List<MessageRow> list = this.rows;
            Float f10 = this.truncationThreshold;
            List<MessageRow> list2 = this.referenceMessageRows;
            String str = this.viewMoreText;
            return "MessageBundle(messageFrame=" + messageBundleHeader + ", rows=" + list + ", truncationThreshold=" + f10 + ", referenceMessageRows=" + list2 + ", viewMoreText=" + str + ")";
        }

        public MessageBundle(MessageFrameFeedHeaderView.MessageBundleHeader messageBundleHeader, List<MessageRow> rows, Float f10, List<MessageRow> referenceMessageRows, String str) {
            q.h(rows, "rows");
            q.h(referenceMessageRows, "referenceMessageRows");
            this.messageFrame = messageBundleHeader;
            this.rows = rows;
            this.truncationThreshold = f10;
            this.referenceMessageRows = referenceMessageRows;
            this.viewMoreText = str;
        }

        public  MessageBundle(MessageFrameFeedHeaderView.MessageBundleHeader messageBundleHeader, List list, Float f10, List list2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : messageBundleHeader, list, (i10 & 4) != 0 ? null : f10, (i10 & 8) != 0 ? j.h() : list2, (i10 & 16) != 0 ? null : str);
        }
    }
}
