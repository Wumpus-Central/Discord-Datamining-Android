package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.transition.Transition;
import androidx.transition.a0;
import androidx.transition.h;
import androidx.transition.z;
import com.discord.chat.R;
import com.discord.chat.bridge.spoiler.SpoilerConfig;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/discord/chat/presentation/message/view/SpoilerView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attributeSet", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "label", "Landroid/widget/TextView;", "onReveal", "Lkotlin/Function0;", "", "configure", "config", "Lcom/discord/chat/bridge/spoiler/SpoilerConfig;", "chat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SpoilerView extends FrameLayout {
    private final TextView label;
    private Function0<Unit> onReveal;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpoilerView(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ SpoilerView(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(final SpoilerView this$0, View it) {
        ViewParent viewParent;
        q.g(this$0, "this$0");
        if (this$0.getParent().getParent() instanceof ViewGroup) {
            viewParent = this$0.getParent().getParent();
        } else if (this$0.getParent() instanceof ViewGroup) {
            viewParent = this$0.getParent();
        } else {
            viewParent = this$0;
        }
        q.e(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
        h hVar = new h(2);
        hVar.setDuration(150L);
        hVar.addListener(new z() { // from class: com.discord.chat.presentation.message.view.SpoilerView$1$transition$1$1
            @Override // androidx.transition.z, androidx.transition.Transition.g
            public void onTransitionEnd(Transition transition) {
                Function0 function0;
                q.g(transition, "transition");
                function0 = SpoilerView.this.onReveal;
                function0.invoke();
            }
        });
        a0.a((ViewGroup) viewParent, hVar);
        q.f(it, "it");
        it.setVisibility(8);
    }

    public final void configure(SpoilerConfig spoilerConfig) {
        if (spoilerConfig != null) {
            this.label.setText(spoilerConfig.getAttributes().getLabel());
            this.onReveal = new SpoilerView$configure$1(spoilerConfig);
            setVisibility(0);
            return;
        }
        setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpoilerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        DiscordFontUtilsKt.setDiscordFont(textView, DiscordFont.PrimaryBold);
        ViewClippingUtilsKt.clipToCircle(textView);
        textView.setBackgroundColor(ColorUtilsKt.getColorCompat(context, R.color.primary_800));
        textView.setPadding(SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8), SizeUtilsKt.getDpToPx(12), SizeUtilsKt.getDpToPx(8));
        this.label = textView;
        this.onReveal = SpoilerView$onReveal$1.INSTANCE;
        setBackgroundColor(ThemeManagerKt.getTheme().getSpoilerHiddenBackground());
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        setOnClickListener(new View.OnClickListener() { // from class: com.discord.chat.presentation.message.view.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SpoilerView._init_$lambda$2(SpoilerView.this, view);
            }
        });
    }
}
