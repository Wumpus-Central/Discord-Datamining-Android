package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.discord.chat.databinding.AltTextButtonViewBinding;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0007\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/discord/chat/presentation/message/view/AltTextButtonView;", "Landroid/widget/FrameLayout;", "", "description", "Lkotlin/Function1;", "", "onTapShowAltText", "configure", "Lcom/discord/chat/databinding/AltTextButtonViewBinding;", "binding", "Lcom/discord/chat/databinding/AltTextButtonViewBinding;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chat_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final class AltTextButtonView extends FrameLayout {
    private final AltTextButtonViewBinding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AltTextButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        AltTextButtonViewBinding inflate = AltTextButtonViewBinding.inflate(LayoutInflater.from(context), this, true);
        q.f(inflate, "inflate(LayoutInflater.from(context), this, true)");
        this.binding = inflate;
        FrameLayout frameLayout = inflate.altTextContainer;
        q.f(frameLayout, "binding.altTextContainer");
        ViewClippingUtilsKt.clipToRoundedRectangle(frameLayout, SizeUtilsKt.getDpToPx(8));
        inflate.altTextLabel.setText(I18nUtilsKt.i18nFormat$default(context, I18nMessage.MEDIA_MOSAIC_ALT_TEXT_CTA, null, 2, null));
        inflate.altTextLabel.setContentDescription(I18nUtilsKt.i18nFormat$default(context, I18nMessage.MEDIA_MOSAIC_ALT_TEXT_POPOUT_TITLE, null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void configure$lambda$0(String str, Function1 onTapShowAltText, View view) {
        q.g(onTapShowAltText, "$onTapShowAltText");
        if (str != null) {
            onTapShowAltText.invoke(str);
        }
    }

    public final void configure(final String str, final Function1<? super String, Unit> onTapShowAltText) {
        boolean z10;
        int i10;
        q.g(onTapShowAltText, "onTapShowAltText");
        if (str != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        setVisibility(i10);
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AltTextButtonView.configure$lambda$0(str, onTapShowAltText, view);
            }
        }, 1, null);
    }

    public /* synthetic */ AltTextButtonView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }
}
