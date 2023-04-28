package com.discord.chat.presentation.uploadprogress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.databinding.UploadProgressViewBinding;
import com.discord.chat.presentation.uploadprogress.UploadProgressView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.react_strings.I18nMessage;
import com.discord.react_strings.I18nUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006JX\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u00102\b\b\u0001\u0010\u0014\u001a\u00020\u00102\b\b\u0001\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m15073d2 = {"Lcom/discord/chat/presentation/uploadprogress/UploadProgressView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/UploadProgressViewBinding;", "interpolator", "Landroid/view/animation/DecelerateInterpolator;", "set", "", "headerText", "", "headerColor", "", ViewProps.BACKGROUND_COLOR, "progressPercent", "progressBarColor", "progressTrackColor", "iconTintColor", "onProgressCancel", "Lkotlin/Function0;", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class UploadProgressView extends ConstraintLayout {
    private final UploadProgressViewBinding binding;
    private final DecelerateInterpolator interpolator;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadProgressView(Context context) {
        this(context, null, 2, null);
        C9971q.m14633g(context, "context");
    }

    public /* synthetic */ UploadProgressView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set$lambda$4(Function0 onProgressCancel, View view) {
        C9971q.m14633g(onProgressCancel, "$onProgressCancel");
        onProgressCancel.invoke();
    }

    public final void set(String headerText, int i, int i2, int i3, int i4, int i5, int i6, final Function0<Unit> onProgressCancel) {
        long j;
        C9971q.m14633g(headerText, "headerText");
        C9971q.m14633g(onProgressCancel, "onProgressCancel");
        setBackgroundColor(i2);
        SimpleDraweeView simpleDraweeView = this.binding.progressFileImage;
        C9971q.m14634f(simpleDraweeView, "binding.progressFileImage");
        ReactAssetUtilsKt.setReactAsset(simpleDraweeView, ReactAsset.Upload);
        SimpleDraweeView simpleDraweeView2 = this.binding.progressFileImage;
        C9971q.m14634f(simpleDraweeView2, "binding.progressFileImage");
        ColorUtilsKt.setTintColor(simpleDraweeView2, Integer.valueOf(i6));
        this.binding.progressText.setText(headerText);
        this.binding.progressText.setTextColor(i);
        TextView textView = this.binding.progressText;
        C9971q.m14634f(textView, "binding.progressText");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        TextView textView2 = this.binding.progressSubtext;
        textView2.setText("-- " + i3 + "%");
        this.binding.progressBg.setBackgroundColor(i5);
        this.binding.progressBar.setBackgroundColor(i4);
        float f = ((float) i3) / 100.0f;
        if (this.binding.progressBar.getScaleX() < f) {
            j = 150;
        } else {
            j = 0;
        }
        this.binding.progressBar.animate().setInterpolator(this.interpolator).setDuration(j).scaleX(f).start();
        SimpleDraweeView simpleDraweeView3 = this.binding.progressCancel;
        C9971q.m14634f(simpleDraweeView3, "binding.progressCancel");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(simpleDraweeView3, false, new View.OnClickListener() { // from class: g3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UploadProgressView.set$lambda$4(Function0.this, view);
            }
        }, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C9971q.m14633g(context, "context");
        UploadProgressViewBinding inflate = UploadProgressViewBinding.inflate(LayoutInflater.from(context), this);
        C9971q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        this.interpolator = new DecelerateInterpolator();
        TextView it = inflate.progressText;
        C9971q.m14634f(it, "it");
        SetTextSizeSpKt.setTextSizeSp(it, 16.0f);
        it.setTextColor(ThemeManagerKt.getTheme().getInteractiveActive());
        TextView it2 = inflate.progressSubtext;
        C9971q.m14634f(it2, "it");
        SetTextSizeSpKt.setTextSizeSp(it2, 16.0f);
        it2.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
        View view = inflate.progressBar;
        view.setPivotX(0.0f);
        view.setScaleX(0.0f);
        SimpleDraweeView it3 = inflate.progressCancel;
        C9971q.m14634f(it3, "it");
        ReactAssetUtilsKt.setReactAsset(it3, ReactAsset.Close);
        ColorUtilsKt.setTintColor(it3, Integer.valueOf(ThemeManagerKt.getTheme().getTextNormal()));
        I18nUtilsKt.i18nContentDescription$default(it3, I18nMessage.CANCEL, (Function1) null, 2, (Object) null);
        int dpToPx = SizeUtilsKt.getDpToPx(8);
        setPadding(dpToPx, dpToPx, dpToPx, dpToPx);
    }
}
