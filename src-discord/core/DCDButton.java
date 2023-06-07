package com.discord.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.discord.core.databinding.DcdButtonBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.button.MaterialButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u000e2\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0013\u001a\u00020\u000e2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000e2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\b\u0010\u0018\u001a\u00020\u000eH\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\b\b\u0001\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001dJ\u0010\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J\u0018\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\"2\b\b\u0001\u0010#\u001a\u00020\u0015J\u0010\u0010$\u001a\u00020\u000e2\b\b\u0001\u0010%\u001a\u00020\u0015J\u000e\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u0012J\u000e\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0015J\u0010\u0010*\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010,J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010,H\u0016J\u0012\u00100\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020\u000e2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u000107J\u0017\u00108\u001a\u00020\u000e2\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016J\u000e\u00109\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020;R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/discord/core/DCDButton;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/core/databinding/DcdButtonBinding;", "button", "Lcom/google/android/material/button/MaterialButton;", "progress", "Landroid/widget/ProgressBar;", "ellipsize", "", "behavior", "Landroid/text/TextUtils$TruncateAt;", "hasPadding", "", "setBackgroundColor", "colorInt", "", "(Ljava/lang/Integer;)V", "setBorderColor", "setButtonPadding", "setCornerRadius", "cornerRadius", "setDiscordFont", "font", "Lcom/discord/fonts/DiscordFont;", "setEnabled", ViewProps.ENABLED, "setIcon", "iconUrl", "", "iconSize", "setIconPadding", "iconPadding", "setLoading", "isLoading", "setMaxLines", "maxLines", "setOnClickButtonListener", "onClickListener", "Landroid/view/View$OnClickListener;", "setOnClickListener", "", "l", "setOnTouchListener", "Landroid/view/View$OnTouchListener;", "setProgressBarColor", "colorStateList", "Landroid/content/res/ColorStateList;", "setText", "text", "", "setTextColor", "setTextSizeSp", "sp", "", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DCDButton extends FrameLayout {
    private final DcdButtonBinding binding;
    private final MaterialButton button;
    private final ProgressBar progress;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DCDButton(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ DCDButton(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    private final boolean hasPadding() {
        return getPaddingStart() > 0 || getPaddingEnd() > 0 || getPaddingTop() > 0 || getPaddingBottom() > 0;
    }

    private final void setButtonPadding() {
        if (hasPadding()) {
            this.button.setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
            setPadding(0, 0, 0, 0);
        }
    }

    private final void setProgressBarColor(ColorStateList colorStateList) {
        this.progress.setIndeterminateTintList(colorStateList);
    }

    public final void ellipsize(TextUtils.TruncateAt behavior) {
        q.g(behavior, "behavior");
        this.button.setEllipsize(behavior);
    }

    public final void setBackgroundColor(Integer num) {
        if (num != null) {
            setBackgroundColor(num.intValue());
        }
    }

    public final void setBorderColor(Integer num) {
        Unit unit;
        if (num != null) {
            this.button.setStrokeColor(ColorStateList.valueOf(num.intValue()));
            this.button.setStrokeWidth(SizeUtilsKt.getDpToPx(1));
            unit = Unit.f22063a;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.button.setStrokeColor(null);
            this.button.setStrokeWidth(0);
        }
    }

    public final void setCornerRadius(int i10) {
        this.button.setCornerRadius(i10);
    }

    public final void setDiscordFont(DiscordFont font) {
        q.g(font, "font");
        DiscordFontUtilsKt.setDiscordFont(this.button, font);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        this.button.setEnabled(z10);
    }

    public final void setIcon(String iconUrl, int i10) {
        q.g(iconUrl, "iconUrl");
        ReactAssetUtilsKt.setReactIcon(this.button, iconUrl, i10);
    }

    public final void setIconPadding(int i10) {
        this.button.setIconPadding(i10);
    }

    public final void setLoading(boolean z10) {
        float f10;
        int i10;
        MaterialButton materialButton = this.button;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        materialButton.setTextScaleX(f10);
        setClickable(!z10);
        ProgressBar progressBar = this.progress;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        progressBar.setVisibility(i10);
    }

    public final void setMaxLines(int i10) {
        this.button.setMaxLines(i10);
    }

    public final void setOnClickButtonListener(View.OnClickListener onClickListener) {
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.button, false, onClickListener, 1, null);
    }

    public final void setText(CharSequence charSequence) {
        this.button.setText(charSequence);
    }

    public final void setTextColor(Integer num) {
        int i10;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = -1;
        }
        this.button.setTextColor(i10);
        this.button.setIconTint(ColorStateList.valueOf(i10));
        this.progress.setIndeterminateTintList(ColorStateList.valueOf(i10));
    }

    public final void setTextSizeSp(float f10) {
        this.button.setTextSize(2, f10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DCDButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        DcdButtonBinding inflate = DcdButtonBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        MaterialButton materialButton = inflate.button;
        q.f(materialButton, "binding.button");
        this.button = materialButton;
        ProgressBar progressBar = inflate.progress;
        q.f(progressBar, "binding.progress");
        this.progress = progressBar;
        materialButton.setStateListAnimator(null);
        materialButton.setMinimumHeight(progressBar.getHeight());
        materialButton.setMinHeight(progressBar.getHeight());
        materialButton.setMinimumWidth(progressBar.getWidth());
        materialButton.setMinWidth(progressBar.getWidth());
        materialButton.setInsetTop(0);
        materialButton.setInsetBottom(0);
        setTextSizeSp(14.0f);
        setDiscordFont(DiscordFont.PrimarySemibold);
        setButtonPadding();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.button.setBackgroundTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public Void setOnClickListener(View.OnClickListener onClickListener) {
        throw new IllegalAccessError("Use setButtonOnClickListener instead.");
    }

    @Override // android.view.View
    public Void setOnTouchListener(View.OnTouchListener onTouchListener) {
        throw new IllegalAccessError("Use setButtonOnClickListener instead.");
    }
}
