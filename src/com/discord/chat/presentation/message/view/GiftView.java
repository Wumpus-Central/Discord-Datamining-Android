package com.discord.chat.presentation.message.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.graphics.C1198a;
import bg.C2362c;
import co.discord.media_engine.C2968a;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.bridge.gift.GiftEmbed;
import com.discord.chat.databinding.GiftViewBinding;
import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory;
import com.discord.core.DCDButton;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.postprocessors.PostProcessor;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.drawee.controller.AbstractC3766a;
import com.facebook.drawee.generic.C3803a;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.views.image.ReactImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9677q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p209l4.C10061c;
import p327ri.C12587u;

@Metadata(m15074d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u001d\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J6\u0010\u0011\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00020\rR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006$"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/GiftView;", "Landroidx/cardview/widget/CardView;", "", "initTextStyling", "", "accessoryId", "", "didResolve", "Lcom/discord/chat/bridge/gift/GiftEmbed$Resolved$Valid;", "gift", "bindSplash", "Lcom/discord/chat/presentation/message/messagepart/GiftMessageAccessory;", "accessory", "Lkotlin/Function1;", "", "onTapEmbed", "onTapAccept", "bind", "Lcom/discord/chat/databinding/GiftViewBinding;", "binding", "Lcom/discord/chat/databinding/GiftViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/GiftViewBinding;", "Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;", "lastState", "Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;", "Landroid/animation/LayoutTransition;", "resolvedTransition", "Landroid/animation/LayoutTransition;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class GiftView extends CardView {
    public static final Companion Companion = new Companion(null);
    private final GiftViewBinding binding;
    private Companion.State lastState;
    private final LayoutTransition resolvedTransition;

    @Metadata(m15074d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/GiftView$Companion;", "", "()V", "State", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {

        /* JADX INFO: Access modifiers changed from: private */
        @Metadata(m15074d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;", "", "accessoryId", "", "getAccessoryId", "()J", "Resolved", "Resolving", "Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;", "Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolving;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
        /* loaded from: classes4.dex */
        public interface State {

            @Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolved;", "Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;", "accessoryId", "", "(J)V", "getAccessoryId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
            /* loaded from: classes4.dex */
            public static final class Resolved implements State {
                private final long accessoryId;

                public Resolved(long j) {
                    this.accessoryId = j;
                }

                public static /* synthetic */ Resolved copy$default(Resolved resolved, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = resolved.getAccessoryId();
                    }
                    return resolved.copy(j);
                }

                public final long component1() {
                    return getAccessoryId();
                }

                public final Resolved copy(long j) {
                    return new Resolved(j);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Resolved) && getAccessoryId() == ((Resolved) obj).getAccessoryId();
                }

                @Override // com.discord.chat.presentation.message.view.GiftView.Companion.State
                public long getAccessoryId() {
                    return this.accessoryId;
                }

                public int hashCode() {
                    return C2968a.m32873a(getAccessoryId());
                }

                public String toString() {
                    long accessoryId = getAccessoryId();
                    return "Resolved(accessoryId=" + accessoryId + ")";
                }
            }

            @Metadata(m15074d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/GiftView$Companion$State$Resolving;", "Lcom/discord/chat/presentation/message/view/GiftView$Companion$State;", "accessoryId", "", "(J)V", "getAccessoryId", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
            /* loaded from: classes4.dex */
            public static final class Resolving implements State {
                private final long accessoryId;

                public Resolving(long j) {
                    this.accessoryId = j;
                }

                public static /* synthetic */ Resolving copy$default(Resolving resolving, long j, int i, Object obj) {
                    if ((i & 1) != 0) {
                        j = resolving.getAccessoryId();
                    }
                    return resolving.copy(j);
                }

                public final long component1() {
                    return getAccessoryId();
                }

                public final Resolving copy(long j) {
                    return new Resolving(j);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Resolving) && getAccessoryId() == ((Resolving) obj).getAccessoryId();
                }

                @Override // com.discord.chat.presentation.message.view.GiftView.Companion.State
                public long getAccessoryId() {
                    return this.accessoryId;
                }

                public int hashCode() {
                    return C2968a.m32873a(getAccessoryId());
                }

                public String toString() {
                    long accessoryId = getAccessoryId();
                    return "Resolving(accessoryId=" + accessoryId + ")";
                }
            }

            long getAccessoryId();
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftView(Context context) {
        this(context, null, 2, null);
        C9677q.m14633g(context, "context");
    }

    public /* synthetic */ GiftView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$14(Function1 onTapEmbed, GiftEmbed gift, View view) {
        C9677q.m14633g(onTapEmbed, "$onTapEmbed");
        C9677q.m14633g(gift, "$gift");
        onTapEmbed.invoke(((GiftEmbed.Resolved.Valid) gift).getGiftCode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$17$lambda$16(Function1 onTapAccept, GiftEmbed gift, View view) {
        C9677q.m14633g(onTapAccept, "$onTapAccept");
        C9677q.m14633g(gift, "$gift");
        onTapAccept.invoke(((GiftEmbed.Resolved.Valid) gift).getGiftCode());
    }

    private final void bindSplash(GiftEmbed.Resolved.Valid valid, boolean z) {
        int i;
        int a;
        AbstractC3766a aVar;
        if (z) {
            i = ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS;
        } else {
            i = 0;
        }
        this.binding.splash.getHierarchy().m31771w(i);
        a = C2362c.m34305a(valid.getSplashOpacity() * 255);
        int k = C1198a.m37920k(valid.getBackgroundColor(), a);
        SimpleDraweeView simpleDraweeView = this.binding.splash;
        ImageRequest fromUri = ImageRequest.fromUri(valid.getSplashUrl());
        if (fromUri != null) {
            aVar = C10061c.m13583g().m31933D(ImageRequestBuilder.m30891b(fromUri).m30902A(new PostProcessor.Composite(PostProcessor.Grayscale.INSTANCE, new PostProcessor.Gradient(PostProcessor.Gradient.Direction.TopToBottom, k, valid.getBackgroundColor(), 0.0f, 0.5f, 8, null)).create()).m30892a()).m31936A("splash-" + valid.getGiftCode() + "-" + valid.getSplashUrl()).mo3741b(this.binding.splash.getController()).build();
        } else {
            aVar = null;
        }
        simpleDraweeView.setController(aVar);
    }

    private final boolean didResolve(long j) {
        Companion.State state = this.lastState;
        Companion.State.Resolving resolving = state instanceof Companion.State.Resolving ? (Companion.State.Resolving) state : null;
        return resolving != null && resolving.getAccessoryId() == j;
    }

    private final void initTextStyling() {
        TextView initTextStyling$lambda$1 = this.binding.header;
        C9677q.m14634f(initTextStyling$lambda$1, "initTextStyling$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(initTextStyling$lambda$1, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(initTextStyling$lambda$1, DiscordFont.PrimaryBold);
        TextView initTextStyling$lambda$2 = this.binding.title;
        C9677q.m14634f(initTextStyling$lambda$2, "initTextStyling$lambda$2");
        SetTextSizeSpKt.setTextSizeSp(initTextStyling$lambda$2, 16.0f);
        DiscordFont discordFont = DiscordFont.PrimarySemibold;
        DiscordFontUtilsKt.setDiscordFont(initTextStyling$lambda$2, discordFont);
        initTextStyling$lambda$2.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        initTextStyling$lambda$2.setMarqueeRepeatLimit(-1);
        TextView initTextStyling$lambda$3 = this.binding.subtitle;
        C9677q.m14634f(initTextStyling$lambda$3, "initTextStyling$lambda$3");
        SetTextSizeSpKt.setTextSizeSp(initTextStyling$lambda$3, 12.0f);
        DiscordFont discordFont2 = DiscordFont.PrimaryMedium;
        DiscordFontUtilsKt.setDiscordFont(initTextStyling$lambda$3, discordFont2);
        TextView initTextStyling$lambda$4 = this.binding.body;
        C9677q.m14634f(initTextStyling$lambda$4, "initTextStyling$lambda$4");
        SetTextSizeSpKt.setTextSizeSp(initTextStyling$lambda$4, 12.0f);
        DiscordFontUtilsKt.setDiscordFont(initTextStyling$lambda$4, discordFont2);
        DCDButton dCDButton = this.binding.acceptButton;
        dCDButton.setTextSizeSp(14.0f);
        dCDButton.setDiscordFont(discordFont);
    }

    public final void bind(GiftMessageAccessory accessory, final Function1<? super String, Unit> onTapEmbed, final Function1<? super String, Unit> onTapAccept) {
        boolean w;
        boolean w2;
        boolean w3;
        C9677q.m14633g(accessory, "accessory");
        C9677q.m14633g(onTapEmbed, "onTapEmbed");
        C9677q.m14633g(onTapAccept, "onTapAccept");
        setCardBackgroundColor(accessory.getGift().getBackgroundColor());
        ConstraintLayout constraintLayout = this.binding.content;
        C9677q.m14634f(constraintLayout, "binding.content");
        int i = 0;
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(constraintLayout, false, null, 1, null);
        final GiftEmbed gift = accessory.getGift();
        if (gift instanceof GiftEmbed.Resolving) {
            GiftEmbed.Resolving resolving = (GiftEmbed.Resolving) gift;
            GradientDrawable gradientDrawable = new GradientDrawable(ViewUtilsKt.isLtr(this) ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{resolving.getResolvingGradientStart(), resolving.getResolvingGradientEnd()});
            gradientDrawable.setCornerRadius(SizeUtilsKt.getDpToPx(4));
            int[] referencedIds = this.binding.gradients.getReferencedIds();
            C9677q.m14634f(referencedIds, "binding.gradients.referencedIds");
            for (int i2 : referencedIds) {
                this.binding.getRoot().findViewById(i2).setBackground(gradientDrawable);
            }
            Group bind$lambda$8 = this.binding.gradients;
            C9677q.m14634f(bind$lambda$8, "bind$lambda$8");
            bind$lambda$8.setVisibility(0);
            bind$lambda$8.setAlpha(0.5f);
            this.lastState = new Companion.State.Resolving(accessory.getItemId().longValue());
        } else if (gift instanceof GiftEmbed.Resolved) {
            boolean didResolve = didResolve(accessory.getItemId().longValue());
            ConstraintLayout constraintLayout2 = this.binding.content;
            LayoutTransition layoutTransition = this.resolvedTransition;
            if (!didResolve) {
                layoutTransition = null;
            }
            constraintLayout2.setLayoutTransition(layoutTransition);
            Group group = this.binding.gradients;
            C9677q.m14634f(group, "binding.gradients");
            group.setVisibility(8);
            TextView textView = this.binding.header;
            textView.setText(gift.getHeaderText());
            textView.setTextColor(gift.getHeaderColor());
            SimpleDraweeView simpleDraweeView = this.binding.thumbnail;
            GiftEmbed.Resolved resolved = (GiftEmbed.Resolved) gift;
            simpleDraweeView.setImageURI(resolved.getThumbnailUrl());
            simpleDraweeView.getHierarchy().m31788D(C3803a.m31729a(SizeUtilsKt.getDpToPx(gift.getThumbnailCornerRadius())));
            TextView bind$lambda$12 = this.binding.title;
            bind$lambda$12.setText(resolved.getTitleText());
            bind$lambda$12.setTextColor(resolved.getTitleColor());
            C9677q.m14634f(bind$lambda$12, "bind$lambda$12");
            CharSequence text = bind$lambda$12.getText();
            C9677q.m14634f(text, "text");
            w = C12587u.m5729w(text);
            bind$lambda$12.setVisibility(w ^ true ? 0 : 8);
            TextView bind$lambda$13 = this.binding.subtitle;
            bind$lambda$13.setText(resolved.getSubtitle());
            bind$lambda$13.setTextColor(resolved.getSubtitleColor());
            C9677q.m14634f(bind$lambda$13, "bind$lambda$13");
            CharSequence text2 = bind$lambda$13.getText();
            C9677q.m14634f(text2, "text");
            w2 = C12587u.m5729w(text2);
            bind$lambda$13.setVisibility(w2 ^ true ? 0 : 8);
            if (resolved instanceof GiftEmbed.Resolved.Invalid) {
                this.binding.thumbnail.getHierarchy().m31773u(new ColorDrawable(((GiftEmbed.Resolved.Invalid) gift).getThumbnailBackgroundColor()));
                TextView textView2 = this.binding.body;
                C9677q.m14634f(textView2, "binding.body");
                textView2.setVisibility(8);
                DCDButton dCDButton = this.binding.acceptButton;
                C9677q.m14634f(dCDButton, "binding.acceptButton");
                dCDButton.setVisibility(8);
            } else if (resolved instanceof GiftEmbed.Resolved.Valid) {
                ConstraintLayout constraintLayout3 = this.binding.content;
                C9677q.m14634f(constraintLayout3, "binding.content");
                NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(constraintLayout3, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.y
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GiftView.bind$lambda$14(Function1.this, gift, view);
                    }
                }, 1, null);
                GiftEmbed.Resolved.Valid valid = (GiftEmbed.Resolved.Valid) gift;
                bindSplash(valid, didResolve);
                this.binding.thumbnail.getHierarchy().m31773u(null);
                TextView bind$lambda$15 = this.binding.body;
                bind$lambda$15.setText(valid.getBodyText());
                bind$lambda$15.setTextColor(valid.getBodyTextColor());
                C9677q.m14634f(bind$lambda$15, "bind$lambda$15");
                CharSequence text3 = bind$lambda$15.getText();
                C9677q.m14634f(text3, "text");
                w3 = C12587u.m5729w(text3);
                if (!(!w3)) {
                    i = 8;
                }
                bind$lambda$15.setVisibility(i);
                DCDButton dCDButton2 = this.binding.acceptButton;
                dCDButton2.setText(valid.getAcceptLabelText());
                dCDButton2.setTextColor(Integer.valueOf(valid.getAcceptLabelColor()));
                dCDButton2.setBackgroundColor(valid.getAcceptLabelBackgroundColor());
                dCDButton2.setOnClickButtonListener(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        GiftView.bind$lambda$17$lambda$16(Function1.this, gift, view);
                    }
                });
                dCDButton2.setEnabled(valid.getCanBeAccepted());
            }
            this.lastState = new Companion.State.Resolved(accessory.getItemId().longValue());
        }
    }

    public final GiftViewBinding getBinding() {
        return this.binding;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9677q.m14633g(context, "context");
        GiftViewBinding inflate = GiftViewBinding.inflate(LayoutInflater.from(context), this, true);
        C9677q.m14634f(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.disableTransitionType(0);
        layoutTransition.disableTransitionType(1);
        this.resolvedTransition = layoutTransition;
        setUseCompatPadding(true);
        setClickable(true);
        setRadius(SizeUtilsKt.getDpToPx(4));
        setCardElevation(SizeUtilsKt.getDpToPx(1));
        initTextStyling();
    }
}
