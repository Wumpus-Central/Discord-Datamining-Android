package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridLayout;
import com.discord.chat.R;
import com.discord.chat.bridge.attachment.Attachment;
import com.discord.chat.bridge.spoiler.SpoilerAttributes;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.chat.presentation.media.MediaContainingViewResizer;
import com.discord.chat.presentation.message.MessageAccessoriesView;
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory;
import com.discord.chat.presentation.message.viewholder.ImageAttachmentViewHolder;
import com.discord.chat.presentation.message.viewholder.ImageAttachmentViewHolder$bind$1;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import com.discord.chat.presentation.message.viewholder.VideoAttachmentViewHolder;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.collections.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import lf.m;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002JX\u0010\u0017\u001a\u00020\u00102\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u00132\u001e\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u0015R\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n0\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR.\u0010\u0016\u001a\u001a\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u001f¨\u0006&"}, d2 = {"Lcom/discord/chat/presentation/message/view/MediaMosaicView;", "Landroid/widget/GridLayout;", "", "Lcom/discord/chat/presentation/message/messagepart/MessageAccessory;", "attachments", "", "shouldOnlyUpdateBindings", "attachment", "Lcom/discord/chat/presentation/events/ChatEventHandler;", "eventHandler", "Lcom/discord/chat/presentation/message/viewholder/MessagePartViewHolder;", "createAttachmentHolder", "holder", "", "maxWidthPx", "maxHeightPx", "", "bindAttachmentHolder", "constrainedWidth", "Lkotlin/Function1;", "onAttachmentSpoilerClicked", "Lkotlin/Function3;", "onAttachmentClicked", "setAttachments", "spacingPx", "I", "", "", "attachmentHolders", "Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function3;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class MediaMosaicView extends GridLayout {
    private Map<Long, MessagePartViewHolder> attachmentHolders;
    private int constrainedWidth;
    private Function3<? super Integer, ? super MessageAccessory, ? super MessagePartViewHolder, Unit> onAttachmentClicked;
    private Function1<? super Integer, Unit> onAttachmentSpoilerClicked;
    private final int spacingPx;

    
    public MediaMosaicView(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  MediaMosaicView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final void bindAttachmentHolder(final MessagePartViewHolder messagePartViewHolder, MessageAccessory messageAccessory, int i10, int i11) {
        SpoilerConfig spoilerConfig = null;
        if (messagePartViewHolder instanceof ImageAttachmentViewHolder) {
            q.f(messageAccessory, "null cannot be cast to non-null type com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory");
            final ImageAttachmentMessageAccessory imageAttachmentMessageAccessory = (ImageAttachmentMessageAccessory) messageAccessory;
            ImageAttachmentViewHolder imageAttachmentViewHolder = (ImageAttachmentViewHolder) messagePartViewHolder;
            Attachment attachment = imageAttachmentMessageAccessory.getAttachment();
            View.OnClickListener d0Var = new View.OnClickListener() { 
                @Override 
                public final void onClick(View view) {
                    MediaMosaicView.bindAttachmentHolder$lambda$1(MediaMosaicView.this, imageAttachmentMessageAccessory, messagePartViewHolder, view);
                }
            };
            int radiusPx = imageAttachmentMessageAccessory.getRadiusPx();
            MediaContainingViewResizer.ResizeMode resizeMode = MediaContainingViewResizer.ResizeMode.Cover;
            View.OnLongClickListener onLongClick = imageAttachmentMessageAccessory.getOnLongClick();
            SpoilerAttributes spoilerAttributes = imageAttachmentMessageAccessory.getSpoilerAttributes();
            if (spoilerAttributes != null) {
                spoilerConfig = spoilerAttributes.configure(new MediaMosaicView$bindAttachmentHolder$2(this, imageAttachmentMessageAccessory));
            }
            imageAttachmentViewHolder.m359bindNlw0kPk(attachment, i10, i11, radiusPx, resizeMode, d0Var, onLongClick, spoilerConfig, true, imageAttachmentMessageAccessory.getAttachmentsOpacity(), false, true, imageAttachmentMessageAccessory.getRemixButtonIconColor(), imageAttachmentMessageAccessory.getRemixButtonBackgroundColor(), imageAttachmentMessageAccessory.mo233getMessageId3Eiw7ao(), (r35 & 32768) != 0 ? ImageAttachmentViewHolder$bind$1.INSTANCE : null);
        } else if (messagePartViewHolder instanceof VideoAttachmentViewHolder) {
            q.f(messageAccessory, "null cannot be cast to non-null type com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory");
            VideoAttachmentMessageAccessory videoAttachmentMessageAccessory = (VideoAttachmentMessageAccessory) messageAccessory;
            VideoAttachmentViewHolder videoAttachmentViewHolder = (VideoAttachmentViewHolder) messagePartViewHolder;
            int radiusPx2 = videoAttachmentMessageAccessory.getRadiusPx();
            MediaMosaicView$bindAttachmentHolder$3 mediaMosaicView$bindAttachmentHolder$3 = new MediaMosaicView$bindAttachmentHolder$3(this, videoAttachmentMessageAccessory, messagePartViewHolder);
            View.OnLongClickListener onLongClick2 = videoAttachmentMessageAccessory.getOnLongClick();
            SpoilerAttributes spoilerAttributes2 = videoAttachmentMessageAccessory.getSpoilerAttributes();
            if (spoilerAttributes2 != null) {
                spoilerConfig = spoilerAttributes2.configure(new MediaMosaicView$bindAttachmentHolder$4(this, videoAttachmentMessageAccessory));
            }
            videoAttachmentViewHolder.bind(videoAttachmentMessageAccessory, i10, i11, radiusPx2, mediaMosaicView$bindAttachmentHolder$3, onLongClick2, spoilerConfig, videoAttachmentMessageAccessory.getPortal(), false, true, videoAttachmentMessageAccessory.getHideMediaPlayButton(), videoAttachmentMessageAccessory.getAttachmentsOpacity());
        } else {
            throw new IllegalStateException(("Invalid accessory type: " + messagePartViewHolder).toString());
        }
    }

    
    public static final void bindAttachmentHolder$lambda$1(MediaMosaicView this$0, ImageAttachmentMessageAccessory item, MessagePartViewHolder holder, View view) {
        q.h(this$0, "this$0");
        q.h(item, "$item");
        q.h(holder, "$holder");
        Function3<? super Integer, ? super MessageAccessory, ? super MessagePartViewHolder, Unit> function3 = this$0.onAttachmentClicked;
        if (function3 == null) {
            q.z("onAttachmentClicked");
            function3 = null;
        }
        function3.invoke(Integer.valueOf(item.getAttachmentIndex()), item, holder);
    }

    private final MessagePartViewHolder createAttachmentHolder(MessageAccessory messageAccessory, ChatEventHandler chatEventHandler) {
        if (messageAccessory instanceof ImageAttachmentMessageAccessory) {
            Context context = getContext();
            q.g(context, "context");
            return new ImageAttachmentViewHolder(new ImageAttachmentView(context, null, 2, null), chatEventHandler);
        } else if (messageAccessory instanceof VideoAttachmentMessageAccessory) {
            Context context2 = getContext();
            q.g(context2, "context");
            return new VideoAttachmentViewHolder(new VideoAttachmentView(context2, null, 2, null), chatEventHandler);
        } else {
            throw new IllegalStateException(("Invalid accessory type: " + messageAccessory).toString());
        }
    }

    private final boolean shouldOnlyUpdateBindings(List<? extends MessageAccessory> list) {
        int s10;
        Set F0;
        Set F02;
        s10 = k.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (MessageAccessory messageAccessory : list) {
            arrayList.add(Long.valueOf(messageAccessory.getItemId().longValue()));
        }
        F0 = r.F0(arrayList);
        Map<Long, MessagePartViewHolder> map = this.attachmentHolders;
        if (map == null) {
            q.z("attachmentHolders");
            map = null;
        }
        F02 = r.F0(map.keySet());
        return F0.equals(F02);
    }

    public final void setAttachments(List<? extends MessageAccessory> attachments, int i10, ChatEventHandler eventHandler, Function1<? super Integer, Unit> onAttachmentSpoilerClicked, Function3<? super Integer, ? super MessageAccessory, ? super MessagePartViewHolder, Unit> onAttachmentClicked) {
        Iterable<m> H0;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        q.h(attachments, "attachments");
        q.h(eventHandler, "eventHandler");
        q.h(onAttachmentSpoilerClicked, "onAttachmentSpoilerClicked");
        q.h(onAttachmentClicked, "onAttachmentClicked");
        this.onAttachmentSpoilerClicked = onAttachmentSpoilerClicked;
        this.onAttachmentClicked = onAttachmentClicked;
        if (this.attachmentHolders == null || !shouldOnlyUpdateBindings(attachments) || this.constrainedWidth != i10) {
            this.constrainedWidth = i10;
            this.attachmentHolders = new LinkedHashMap();
            removeAllViews();
            int i18 = 6;
            setColumnCount(6);
            int size = attachments.size();
            int width = MessageAccessoriesView.Companion.getWidth(i10);
            int i19 = 2;
            int i20 = 3;
            int i21 = (width - (this.spacingPx * 2)) / 3;
            H0 = r.H0(attachments);
            int i22 = 0;
            int i23 = 0;
            for (m mVar : H0) {
                if (size == i19 || size == i20 || size == 4) {
                    i11 = i19;
                } else {
                    i11 = size % 3;
                    if (mVar.c() >= i11) {
                        i11 = i20;
                    }
                }
                if (size != i20) {
                    i12 = i18 / i11;
                } else if (mVar.c() == 0) {
                    i12 = 4;
                } else {
                    i12 = i19;
                }
                if (size == i20 && mVar.c() == 0) {
                    i13 = i19;
                } else {
                    i13 = 1;
                }
                if (size != i20) {
                    i14 = (width - ((i11 - 1) * this.spacingPx)) / i11;
                } else if (mVar.c() == 0) {
                    i14 = (i21 * 2) + this.spacingPx;
                } else {
                    i14 = i21;
                }
                if (size == i20) {
                    i15 = i14;
                } else if (size == 4 || i11 >= i20) {
                    i15 = i21;
                } else {
                    i15 = (i21 * 2) + this.spacingPx;
                }
                if (size == i20 && mVar.c() == 2) {
                    i22 += 4;
                }
                MessagePartViewHolder createAttachmentHolder = createAttachmentHolder((MessageAccessory) mVar.d(), eventHandler);
                bindAttachmentHolder(createAttachmentHolder, (MessageAccessory) mVar.d(), i14, i15);
                View view = createAttachmentHolder.itemView;
                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                layoutParams.width = i14;
                layoutParams.height = i15;
                layoutParams.columnSpec = GridLayout.spec(i22, i12);
                layoutParams.rowSpec = GridLayout.spec(i23, i13);
                if (i22 > 0) {
                    i16 = this.spacingPx;
                } else {
                    i16 = 0;
                }
                layoutParams.leftMargin = i16;
                if (i23 > 0) {
                    i17 = this.spacingPx;
                } else {
                    i17 = 0;
                }
                layoutParams.topMargin = i17;
                view.setLayoutParams(layoutParams);
                addView(createAttachmentHolder.itemView);
                Map<Long, MessagePartViewHolder> map = this.attachmentHolders;
                if (map == null) {
                    q.z("attachmentHolders");
                    map = null;
                }
                map.put(((MessageAccessory) mVar.d()).getItemId(), createAttachmentHolder);
                i22 += i12;
                if (i22 >= 6) {
                    i23++;
                    i18 = 6;
                    width = width;
                    i19 = 2;
                    i20 = 3;
                    i22 = 0;
                } else {
                    i18 = 6;
                    width = width;
                    i19 = 2;
                    i20 = 3;
                }
            }
            return;
        }
        for (MessageAccessory messageAccessory : attachments) {
            Map<Long, MessagePartViewHolder> map2 = this.attachmentHolders;
            if (map2 == null) {
                q.z("attachmentHolders");
                map2 = null;
            }
            MessagePartViewHolder messagePartViewHolder = map2.get(messageAccessory.getItemId());
            if (messagePartViewHolder != null) {
                bindAttachmentHolder(messagePartViewHolder, messageAccessory, messagePartViewHolder.itemView.getWidth(), messagePartViewHolder.itemView.getHeight());
            }
        }
    }

    
    public MediaMosaicView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        this.spacingPx = context.getResources().getDimensionPixelSize(R.dimen.message_media_grid_spacing);
        ViewClippingUtilsKt.clipToRoundedRectangle(this, context.getResources().getDimensionPixelSize(R.dimen.message_media_radius));
    }
}
