package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.C4254R;
import com.discord.chat.databinding.EmbedFieldViewBinding;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.image.fresco.SimpleDraweeSpanTextViewUtilsKt;
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m15074d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0014J,\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, m15073d2 = {"Lcom/discord/chat/presentation/message/view/EmbedFieldView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/databinding/EmbedFieldViewBinding;", "getBinding", "()Lcom/discord/chat/databinding/EmbedFieldViewBinding;", "setName", "", "rawName", "", "name", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "onTapCopyText", "Lkotlin/Function1;", "", "setValue", "rawValue", "value", "chat_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class EmbedFieldView extends LinearLayout {
    private final EmbedFieldViewBinding binding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbedFieldView(Context context) {
        this(context, null, 0, 6, null);
        C9971q.m14633g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmbedFieldView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        C9971q.m14633g(context, "context");
    }

    public /* synthetic */ EmbedFieldView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setName$lambda$4$lambda$3$lambda$2(Function1 onTapCopyText, String rawName, View view) {
        C9971q.m14633g(onTapCopyText, "$onTapCopyText");
        C9971q.m14633g(rawName, "$rawName");
        onTapCopyText.invoke(rawName);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setValue$lambda$8$lambda$7$lambda$6(Function1 onTapCopyText, String rawValue, View view) {
        C9971q.m14633g(onTapCopyText, "$onTapCopyText");
        C9971q.m14633g(rawValue, "$rawValue");
        onTapCopyText.invoke(rawValue);
        return true;
    }

    public final EmbedFieldViewBinding getBinding() {
        return this.binding;
    }

    public final void setName(final String rawName, DraweeSpanStringBuilder draweeSpanStringBuilder, final Function1<? super CharSequence, Unit> onTapCopyText) {
        View.OnLongClickListener onLongClickListener;
        C9971q.m14633g(rawName, "rawName");
        C9971q.m14633g(onTapCopyText, "onTapCopyText");
        SimpleDraweeSpanTextView setName$lambda$4 = this.binding.name;
        C9971q.m14634f(setName$lambda$4, "setName$lambda$4");
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setName$lambda$4, draweeSpanStringBuilder);
        if (draweeSpanStringBuilder != null) {
            onLongClickListener = new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.view.j
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean name$lambda$4$lambda$3$lambda$2;
                    name$lambda$4$lambda$3$lambda$2 = EmbedFieldView.setName$lambda$4$lambda$3$lambda$2(Function1.this, rawName, view);
                    return name$lambda$4$lambda$3$lambda$2;
                }
            };
        } else {
            onLongClickListener = null;
        }
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(setName$lambda$4, false, onLongClickListener, 1, null);
    }

    public final void setValue(final String rawValue, DraweeSpanStringBuilder draweeSpanStringBuilder, final Function1<? super CharSequence, Unit> onTapCopyText) {
        DraweeSpanStringBuilder draweeSpanStringBuilder2;
        View.OnLongClickListener onLongClickListener;
        C9971q.m14633g(rawValue, "rawValue");
        C9971q.m14633g(onTapCopyText, "onTapCopyText");
        SimpleDraweeSpanTextView setValue$lambda$8 = this.binding.value;
        C9971q.m14634f(setValue$lambda$8, "setValue$lambda$8");
        if (draweeSpanStringBuilder != null) {
            SpannableExtensionsKt.coverWithSpan(draweeSpanStringBuilder, new BackgroundSpanDrawer(setValue$lambda$8));
            draweeSpanStringBuilder2 = draweeSpanStringBuilder;
        } else {
            draweeSpanStringBuilder2 = null;
        }
        SimpleDraweeSpanTextViewUtilsKt.setOptionalText(setValue$lambda$8, draweeSpanStringBuilder2);
        if (draweeSpanStringBuilder != null) {
            onLongClickListener = new View.OnLongClickListener() { // from class: com.discord.chat.presentation.message.view.k
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean value$lambda$8$lambda$7$lambda$6;
                    value$lambda$8$lambda$7$lambda$6 = EmbedFieldView.setValue$lambda$8$lambda$7$lambda$6(Function1.this, rawValue, view);
                    return value$lambda$8$lambda$7$lambda$6;
                }
            };
        } else {
            onLongClickListener = null;
        }
        NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested$default(setValue$lambda$8, false, onLongClickListener, 1, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedFieldView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C9971q.m14633g(context, "context");
        EmbedFieldViewBinding inflate = EmbedFieldViewBinding.inflate(LayoutInflater.from(context), this);
        C9971q.m14634f(inflate, "inflate(LayoutInflater.from(context), this)");
        this.binding = inflate;
        setOrientation(1);
        SimpleDraweeSpanTextView _init_$lambda$0 = inflate.name;
        _init_$lambda$0.setTextColor(ColorUtilsKt.getThemeColor(context, C4254R.color.primary_500, C4254R.color.primary_100));
        C9971q.m14634f(_init_$lambda$0, "_init_$lambda$0");
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$0, DiscordFont.PrimarySemibold);
        SimpleDraweeSpanTextView _init_$lambda$1 = inflate.value;
        C9971q.m14634f(_init_$lambda$1, "_init_$lambda$1");
        SetTextSizeSpKt.setTextSizeSp(_init_$lambda$1, 14.0f);
        DiscordFontUtilsKt.setDiscordFont(_init_$lambda$1, DiscordFont.PrimaryMedium);
        _init_$lambda$1.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
    }
}
