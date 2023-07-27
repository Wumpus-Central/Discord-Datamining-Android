package com.discord.chat.presentation.invitetospeak;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.Message;
import com.discord.chat.databinding.InviteToSpeakViewBinding;
import com.discord.chat.presentation.invitetospeak.InviteToSpeakView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004ø\u0001\u0000R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/discord/chat/presentation/invitetospeak/InviteToSpeakView;", "Landroid/widget/LinearLayout;", "Lcom/discord/chat/bridge/Message;", "message", "Lkotlin/Function1;", "Lcom/discord/primitives/MessageId;", "", "onInviteToSpeakClicked", "setProps", "Lcom/discord/chat/databinding/InviteToSpeakViewBinding;", "binding", "Lcom/discord/chat/databinding/InviteToSpeakViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class InviteToSpeakView extends LinearLayout {
    private final InviteToSpeakViewBinding binding;

    
    public InviteToSpeakView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public  InviteToSpeakView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    
    public static final void setProps$lambda$1(Function1 onInviteToSpeakClicked, Message message, View view) {
        q.g(onInviteToSpeakClicked, "$onInviteToSpeakClicked");
        q.g(message, "$message");
        onInviteToSpeakClicked.invoke(MessageId.m592boximpl(message.m16getId3Eiw7ao()));
    }

    public final void setProps(final Message message, final Function1<? super MessageId, Unit> onInviteToSpeakClicked) {
        q.g(message, "message");
        q.g(onInviteToSpeakClicked, "onInviteToSpeakClicked");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                InviteToSpeakView.setProps$lambda$1(Function1.this, message, view);
            }
        }, 1, null);
        this.binding.inviteToSpeakText.setText(message.getButtonLabel());
        SimpleDraweeView simpleDraweeView = this.binding.moveToSpeakerIcon;
        q.f(simpleDraweeView, "binding.moveToSpeakerIcon");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.MoveToSpeaker);
        SimpleDraweeView simpleDraweeView2 = this.binding.moveToSpeakerIcon;
        q.f(simpleDraweeView2, "binding.moveToSpeakerIcon");
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(ThemeManagerKt.getTheme().getHeaderPrimary()));
    }

    
    public InviteToSpeakView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        InviteToSpeakViewBinding inflate = InviteToSpeakViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        RippleUtilsKt.addRipple$default(this, true, 0, 2, null);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8));
        TextView _init_$lambda$0 = inflate.inviteToSpeakText;
        q.f(_init_$lambda$0, "_init_$lambda$0");
        _init_$lambda$0.setTextColor(ColorUtilsKt.getColorCompat(_init_$lambda$0, R.color.white));
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimarySemibold);
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getBackgroundAccent(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
    }
}
