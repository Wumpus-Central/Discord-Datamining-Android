package com.discord.chat.presentation.loading;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.chat.R;
import com.discord.chat.bridge.row.LoadMoreButton;
import com.discord.chat.databinding.ChatLoadingViewBinding;
import com.discord.chat.presentation.loading.ChatLoadingView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.theme.ThemeManagerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eJ\u0006\u0010\u000f\u001a\u00020\nR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/loading/ChatLoadingView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/discord/chat/databinding/ChatLoadingViewBinding;", "showButton", "", "button", "Lcom/discord/chat/bridge/row/LoadMoreButton;", "onClick", "Lkotlin/Function0;", "showProgress", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatLoadingView extends ConstraintLayout {
    private final ChatLoadingViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatLoadingView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ ChatLoadingView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showButton$lambda$0(Function0 onClick, View view) {
        q.g(onClick, "$onClick");
        onClick.invoke();
    }

    public final void showButton(LoadMoreButton button, final Function0<Unit> onClick) {
        int i10;
        q.g(button, "button");
        q.g(onClick, "onClick");
        ProgressBar progressBar = this.binding.progressSpinner;
        q.f(progressBar, "binding.progressSpinner");
        progressBar.setVisibility(8);
        Button button2 = this.binding.button;
        q.f(button2, "binding.button");
        button2.setVisibility(0);
        this.binding.button.setText(button.getText());
        Button button3 = this.binding.button;
        q.f(button3, "binding.button");
        DiscordFontUtilsKt.setDiscordFont(button3, DiscordFont.PrimaryMedium);
        this.binding.button.setClickable(true);
        this.binding.button.setBackgroundTintList(ColorStateList.valueOf(button.getBackgroundColor()));
        Button button4 = this.binding.button;
        Integer color = button.getColor();
        if (color != null) {
            i10 = color.intValue();
        } else {
            i10 = -1;
        }
        button4.setTextColor(i10);
        Button button5 = this.binding.button;
        q.f(button5, "binding.button");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(button5, false, new View.OnClickListener() { // from class: e3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChatLoadingView.showButton$lambda$0(Function0.this, view);
            }
        }, 1, null);
    }

    public final void showProgress() {
        ProgressBar progressBar = this.binding.progressSpinner;
        q.f(progressBar, "binding.progressSpinner");
        progressBar.setVisibility(0);
        Button button = this.binding.button;
        q.f(button, "binding.button");
        button.setVisibility(8);
        Button button2 = this.binding.button;
        q.f(button2, "binding.button");
        NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(button2, false, null, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        ChatLoadingViewBinding inflate = ChatLoadingViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.message_horizontal_spacing);
        setPaddingRelative(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
        inflate.progressSpinner.setIndeterminateTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getTextMuted()));
    }
}
