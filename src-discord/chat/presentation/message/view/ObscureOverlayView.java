package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.discord.chat.databinding.ObscureOverlayViewBinding;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import eightbitlab.com.blurview.BlurView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u0011\u001a\u00020\fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/discord/chat/presentation/message/view/ObscureOverlayView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ObscureOverlayViewBinding;", "isObscureRevealed", "", "configure", "", "parent", "Landroid/view/ViewGroup;", "header", "", "makeHideButtonHidden", "onObscureRevealClick", "Lkotlin/Function0;", "showImage", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ObscureOverlayView extends FrameLayout {
    private final ObscureOverlayViewBinding binding;
    private boolean isObscureRevealed;

    
    public ObscureOverlayView(Context context) {
        this(context, null, 2, null);
        q.h(context, "context");
    }

    public  ObscureOverlayView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    
    public static final void _init_$lambda$0(View view) {
    }

    private final Function0<Unit> onObscureRevealClick(boolean z10) {
        return new ObscureOverlayView$onObscureRevealClick$1(this, z10);
    }

    public final void configure(ViewGroup parent, String str) {
        q.h(parent, "parent");
        this.binding.blurView.setupWith(parent).g(24.0f).a(Color.argb(80, 0, 0, 0)).d(parent.getBackground()).c(true);
        if (str != null) {
            this.binding.descriptionLabel.setText(str);
            TextView textView = this.binding.descriptionLabel;
            q.g(textView, "binding.descriptionLabel");
            textView.setVisibility(0);
            return;
        }
        TextView textView2 = this.binding.descriptionLabel;
        q.g(textView2, "binding.descriptionLabel");
        textView2.setVisibility(8);
    }

    public final void makeHideButtonHidden() {
        IconButtonView iconButtonView = this.binding.hideButton;
        q.g(iconButtonView, "binding.hideButton");
        iconButtonView.setVisibility(8);
    }

    
    public ObscureOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        ObscureOverlayViewBinding inflate = ObscureOverlayViewBinding.inflate(LayoutInflater.from(context), this);
        q.g(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        BlurView blurView = inflate.blurView;
        q.g(blurView, "binding.blurView");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(blurView, false, new View.OnClickListener() { 
            @Override 
            public final void onClick(View view) {
                ObscureOverlayView._init_$lambda$0(view);
            }
        }, 1, null);
        SimpleDraweeView it = inflate.mediaWarningIcon;
        q.g(it, "it");
        ReactAssetUtilsKt.setReactAsset(it, ReactAsset.MediaChannelNSFW);
        ColorUtilsKt.setTintColor(it, Integer.valueOf(ThemeManagerKt.getTheme().getWhite()));
        it.getHierarchy().w(0);
        inflate.hideButton.configure(ReactAsset.HideMedia, I18nMessage.OBSCURED_CONTENT_HIDE_CONTENT_ALT, onObscureRevealClick(false));
        inflate.revealButton.configure(ReactAsset.ShowMedia, I18nMessage.OBSCURED_CONTENT_SHOW_CONTENT_ALT, onObscureRevealClick(true));
    }
}
