package com.discord.chat.presentation.separator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.R;
import com.discord.chat.databinding.SeparatorViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/separator/SeparatorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/SeparatorViewBinding;", "setColor", "", ViewProps.COLOR, "", "setText", "text", "", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SeparatorView extends ConstraintLayout {
    private final SeparatorViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeparatorView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ SeparatorView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public final void setColor(int i10) {
        this.binding.leftBar.setBackgroundColor(i10);
        this.binding.rightBar.setBackgroundColor(i10);
        this.binding.middleText.setTextColor(i10);
    }

    public final void setText(CharSequence text) {
        q.g(text, "text");
        this.binding.middleText.setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        SeparatorViewBinding inflate = SeparatorViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.binding = inflate;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
        View root = inflate.getRoot();
        q.f(root, "binding.root");
        root.setPaddingRelative(dimensionPixelSize, root.getPaddingTop(), dimensionPixelSize, root.getPaddingBottom());
        TextView textView = inflate.middleText;
        q.f(textView, "binding.middleText");
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimarySemibold);
        TextView textView2 = inflate.middleText;
        q.f(textView2, "binding.middleText");
        SetTextSizeSpKt.setTextSizeSp(textView2, 12.0f);
    }
}
