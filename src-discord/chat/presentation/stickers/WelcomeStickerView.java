package com.discord.chat.presentation.stickers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.bridge.Message;
import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.bridge.sticker.StickerFormatType;
import com.discord.chat.databinding.WelcomeStickerViewBinding;
import com.discord.chat.presentation.stickers.WelcomeStickerView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt;
import com.discord.primitives.MessageId;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.ripple.RippleUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J3\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\bø\u0001\u0000R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/stickers/WelcomeStickerView;", "Landroid/widget/LinearLayout;", "Lcom/discord/chat/bridge/sticker/Sticker;", "sticker", "", "bindSticker", "Lcom/discord/chat/bridge/Message;", "message", "Lkotlin/Function2;", "Lcom/discord/primitives/MessageId;", "onWelcomeReplyClicked", "setSticker", "Lcom/discord/chat/databinding/WelcomeStickerViewBinding;", "binding", "Lcom/discord/chat/databinding/WelcomeStickerViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chat_release"}, k = 1, mv = {1, 8, 0})

public final class WelcomeStickerView extends LinearLayout {
    private final WelcomeStickerViewBinding binding;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    
    public  class WhenMappings {
        public static final  int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerFormatType.values().length];
            try {
                iArr[StickerFormatType.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerFormatType.APNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerFormatType.LOTTIE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerFormatType.GIF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    
    public WelcomeStickerView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public  WelcomeStickerView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final void bindSticker(Sticker sticker) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[sticker.getFormatType().ordinal()];
        if (i10 == 1) {
            this.binding.stickerView.asPng(sticker.getUrl(), sticker.getWidth(), sticker.getHeight());
        } else if (i10 == 2) {
            this.binding.stickerView.asApng(sticker.getUrl(), 32, 32, true);
        } else if (i10 == 3) {
            this.binding.stickerView.asLottie(sticker.getUrl(), 32, 32, true, sticker.getAsset(), sticker.getRenderMode());
        } else if (i10 == 4) {
            this.binding.stickerView.asGif(sticker.getUrl(), 32, 32, true);
        }
    }

    
    public static final void setSticker$lambda$1(Function2 onWelcomeReplyClicked, Sticker sticker, Message message, View view) {
        q.g(onWelcomeReplyClicked, "$onWelcomeReplyClicked");
        q.g(sticker, "$sticker");
        q.g(message, "$message");
        onWelcomeReplyClicked.invoke(sticker, MessageId.m592boximpl(message.m16getId3Eiw7ao()));
    }

    public final void setSticker(final Sticker sticker, final Message message, final Function2<? super Sticker, ? super MessageId, Unit> onWelcomeReplyClicked) {
        q.g(sticker, "sticker");
        q.g(message, "message");
        q.g(onWelcomeReplyClicked, "onWelcomeReplyClicked");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                WelcomeStickerView.setSticker$lambda$1(Function2.this, sticker, message, view);
            }
        }, 1, null);
        this.binding.welcomeReplyText.setText(message.getStickerLabel());
        bindSticker(sticker);
    }

    
    public WelcomeStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        WelcomeStickerViewBinding inflate = WelcomeStickerViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        RippleUtilsKt.addRipple$default(this, true, 0, 2, null);
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8));
        TextView _init_$lambda$0 = inflate.welcomeReplyText;
        q.f(_init_$lambda$0, "_init_$lambda$0");
        _init_$lambda$0.setTextColor(ColorUtilsKt.getColorCompat(_init_$lambda$0, R.color.white));
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$0, 16.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimarySemibold);
        ViewBackgroundUtilsKt.setBackgroundRectangle$default(this, ThemeManagerKt.getTheme().getBackgroundAccent(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null);
    }
}
