package com.discord.span.utilities.spannable;

import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import androidx.core.graphics.a;
import com.discord.react_gesture_handler.nested_touch.NestedClickableSpan;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BG\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b0\u00101J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006HÂ\u0003J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006HÂ\u0003J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\t\u0010\u0016\u001a\u00020\u0015HÆ\u0003JR\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00152\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u0006HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003R\u001a\u0010\u0017\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010&R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010'R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R(\u0010)\u001a\u0004\u0018\u00010\f2\b\u0010(\u001a\u0004\u0018\u00010\f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0019\u0010/\u001a\u00020\u0003*\u00020\u00038Ã\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/discord/span/utilities/spannable/ClickableSpan;", "Landroid/text/style/ClickableSpan;", "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan;", "", "component2", "()Ljava/lang/Integer;", "Lkotlin/Function1;", "Landroid/view/View;", "", "component3", "", "component4", "Landroid/widget/TextView;", "textView", "enableHighlight", "view", "onClick", "onLongClick", "Landroid/text/TextPaint;", "textPaint", "updateDrawState", "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;", "component1", "touchPriority", "textColor", "onLongClickListener", "onClickListener", "copy", "(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/discord/span/utilities/spannable/ClickableSpan;", "", "toString", "hashCode", "", "other", "equals", "Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;", "getTouchPriority", "()Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;", "Ljava/lang/Integer;", "Lkotlin/jvm/functions/Function1;", "value", "spanView", "Landroid/widget/TextView;", "setSpanView", "(Landroid/widget/TextView;)V", "getDarken", "(I)I", "darken", "<init>", "(Lcom/discord/react_gesture_handler/nested_touch/NestedClickableSpan$TouchPriority;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "span_utilities_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class ClickableSpan extends android.text.style.ClickableSpan implements NestedClickableSpan {
    private final Function1<View, Unit> onClickListener;
    private final Function1<View, Boolean> onLongClickListener;
    private TextView spanView;
    private final Integer textColor;
    private final NestedClickableSpan.TouchPriority touchPriority;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.span.utilities.spannable.ClickableSpan$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    static final class AnonymousClass1 extends s implements Function1<View, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        public final Boolean invoke(View it) {
            q.g(it, "it");
            return Boolean.FALSE;
        }
    }

    public /* synthetic */ ClickableSpan(NestedClickableSpan.TouchPriority touchPriority, Integer num, Function1 function1, Function1 function12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? NestedClickableSpan.TouchPriority.DEFAULT : touchPriority, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? AnonymousClass1.INSTANCE : function1, function12);
    }

    private final Integer component2() {
        return this.textColor;
    }

    private final Function1<View, Boolean> component3() {
        return this.onLongClickListener;
    }

    private final Function1<View, Unit> component4() {
        return this.onClickListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClickableSpan copy$default(ClickableSpan clickableSpan, NestedClickableSpan.TouchPriority touchPriority, Integer num, Function1 function1, Function1 function12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            touchPriority = clickableSpan.getTouchPriority();
        }
        if ((i10 & 2) != 0) {
            num = clickableSpan.textColor;
        }
        if ((i10 & 4) != 0) {
            function1 = clickableSpan.onLongClickListener;
        }
        if ((i10 & 8) != 0) {
            function12 = clickableSpan.onClickListener;
        }
        return clickableSpan.copy(touchPriority, num, function1, function12);
    }

    private final int getDarken(int i10) {
        return a.c(i10, -16777216, 0.1f);
    }

    private final void setSpanView(TextView textView) {
        if (textView != null) {
            textView.invalidate();
        } else {
            TextView textView2 = this.spanView;
            if (textView2 != null) {
                textView2.invalidate();
            }
        }
        this.spanView = textView;
    }

    public final NestedClickableSpan.TouchPriority component1() {
        return getTouchPriority();
    }

    public final ClickableSpan copy(NestedClickableSpan.TouchPriority touchPriority, Integer num, Function1<? super View, Boolean> onLongClickListener, Function1<? super View, Unit> onClickListener) {
        q.g(touchPriority, "touchPriority");
        q.g(onLongClickListener, "onLongClickListener");
        q.g(onClickListener, "onClickListener");
        return new ClickableSpan(touchPriority, num, onLongClickListener, onClickListener);
    }

    @Override // com.discord.react_gesture_handler.nested_touch.NestedClickableSpan
    public void enableHighlight(TextView textView) {
        q.g(textView, "textView");
        setSpanView(textView);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClickableSpan)) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) obj;
        return getTouchPriority() == clickableSpan.getTouchPriority() && q.b(this.textColor, clickableSpan.textColor) && q.b(this.onLongClickListener, clickableSpan.onLongClickListener) && q.b(this.onClickListener, clickableSpan.onClickListener);
    }

    @Override // com.discord.react_gesture_handler.nested_touch.NestedClickableSpan
    public NestedClickableSpan.TouchPriority getTouchPriority() {
        return this.touchPriority;
    }

    public int hashCode() {
        int hashCode = getTouchPriority().hashCode() * 31;
        Integer num = this.textColor;
        return ((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.onLongClickListener.hashCode()) * 31) + this.onClickListener.hashCode();
    }

    @Override // android.text.style.ClickableSpan, com.discord.react_gesture_handler.nested_touch.NestedClickableSpan
    public void onClick(View view) {
        q.g(view, "view");
        this.onClickListener.invoke(view);
        Unit unit = Unit.f22034a;
        setSpanView(null);
    }

    @Override // com.discord.react_gesture_handler.nested_touch.NestedClickableSpan
    public boolean onLongClick(View view) {
        q.g(view, "view");
        Boolean invoke = this.onLongClickListener.invoke(view);
        invoke.booleanValue();
        setSpanView(null);
        return invoke.booleanValue();
    }

    public String toString() {
        NestedClickableSpan.TouchPriority touchPriority = getTouchPriority();
        Integer num = this.textColor;
        Function1<View, Boolean> function1 = this.onLongClickListener;
        Function1<View, Unit> function12 = this.onClickListener;
        return "ClickableSpan(touchPriority=" + touchPriority + ", textColor=" + num + ", onLongClickListener=" + function1 + ", onClickListener=" + function12 + ")";
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        int i10;
        q.g(textPaint, "textPaint");
        super.updateDrawState(textPaint);
        Integer num = this.textColor;
        if (num != null) {
            if (this.spanView != null) {
                i10 = a.c(num.intValue(), -16777216, 0.1f);
            } else {
                i10 = num.intValue();
            }
            textPaint.setColor(i10);
        }
        textPaint.setUnderlineText(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ClickableSpan(NestedClickableSpan.TouchPriority touchPriority, Integer num, Function1<? super View, Boolean> onLongClickListener, Function1<? super View, Unit> onClickListener) {
        q.g(touchPriority, "touchPriority");
        q.g(onLongClickListener, "onLongClickListener");
        q.g(onClickListener, "onClickListener");
        this.touchPriority = touchPriority;
        this.textColor = num;
        this.onLongClickListener = onLongClickListener;
        this.onClickListener = onClickListener;
    }
}
