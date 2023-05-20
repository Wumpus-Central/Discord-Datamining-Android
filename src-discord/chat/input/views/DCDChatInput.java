package com.discord.chat.input.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.k;
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import com.discord.misc.utilities.view.ViewUtilsKt;
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0007\u001a\u00020\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004J\u0014\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\r\u001a\u00020\u0002H\u0014J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0014J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0017J\b\u0010\u0016\u001a\u00020\u0002H\u0016R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R*\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lcom/discord/chat/input/views/DCDChatInput;", "Landroidx/appcompat/widget/k;", "", "setupExternalKeyboardSendRequests", "Lkotlin/Function2;", "", "onSelectionChanged", "setOnSelectionChanged", "Lkotlin/Function0;", "onRequestSend", "setOnRequestSend", "requestLayout", "forceLayout", "onDetachedFromWindow", "selStart", "selEnd", "id", "", "onTextContextMenuItem", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "clearFocus", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/Runnable;", "measureAndLayoutRunnable", "Ljava/lang/Runnable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "chat_input_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class DCDChatInput extends k {
    private final Runnable measureAndLayoutRunnable;
    private Function0<Unit> onRequestSend;
    private Function2<? super Integer, ? super Integer, Unit> onSelectionChanged;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DCDChatInput(Context context) {
        this(context, null, 2, null);
        q.g(context, "context");
    }

    public /* synthetic */ DCDChatInput(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void measureAndLayoutRunnable$lambda$0(DCDChatInput this$0) {
        q.g(this$0, "this$0");
        ViewMeasureExtensionsKt.measureAndLayout(this$0);
    }

    private final void setupExternalKeyboardSendRequests() {
        final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        setOnKeyListener(new View.OnKeyListener() { // from class: com.discord.chat.input.views.e
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
                boolean z10;
                z10 = DCDChatInput.setupExternalKeyboardSendRequests$lambda$2(Ref$BooleanRef.this, this, view, i10, keyEvent);
                return z10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupExternalKeyboardSendRequests$lambda$2(Ref$BooleanRef isEnterHeldDown, DCDChatInput this$0, View view, int i10, KeyEvent event) {
        boolean z10;
        boolean z11;
        Function0<Unit> function0;
        q.g(isEnterHeldDown, "$isEnterHeldDown");
        q.g(this$0, "this$0");
        q.g(event, "event");
        if ((event.getFlags() & 2) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        if (i10 == 66) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        boolean z12 = isEnterHeldDown.f22101k;
        if (event.getAction() == 0) {
            isEnterHeldDown.f22101k = true;
            if (event.hasModifiers(1)) {
                return false;
            }
            if (!z12 && (function0 = this$0.onRequestSend) != null) {
                function0.invoke();
            }
            return true;
        }
        if (event.getAction() == 1) {
            isEnterHeldDown.f22101k = false;
        }
        return false;
    }

    @Override // android.view.View
    public void clearFocus() {
        super.clearFocus();
        Window window = ViewUtilsKt.getWindow(getContext());
        if (window != null) {
            KeyboardExtensionsKt.hideKeyboard(this, window);
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        boolean z10 = !isLayoutRequested();
        super.forceLayout();
        if (z10) {
            post(this.measureAndLayoutRunnable);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.measureAndLayoutRunnable);
    }

    @Override // android.widget.TextView
    protected void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        Function2<? super Integer, ? super Integer, Unit> function2 = this.onSelectionChanged;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i10), Integer.valueOf(i11));
        }
    }

    @Override // androidx.appcompat.widget.k, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (i10 == 16908322) {
            i10 = 16908337;
        }
        return super.onTextContextMenuItem(i10);
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        q.g(event, "event");
        if (event.getAction() == 0) {
            GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this).requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(event);
    }

    @Override // android.view.View
    public void requestLayout() {
        boolean z10 = !isLayoutRequested();
        super.requestLayout();
        if (z10) {
            post(this.measureAndLayoutRunnable);
        }
    }

    public final void setOnRequestSend(Function0<Unit> onRequestSend) {
        q.g(onRequestSend, "onRequestSend");
        this.onRequestSend = onRequestSend;
    }

    public final void setOnSelectionChanged(Function2<? super Integer, ? super Integer, Unit> onSelectionChanged) {
        q.g(onSelectionChanged, "onSelectionChanged");
        this.onSelectionChanged = onSelectionChanged;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DCDChatInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.g(context, "context");
        this.measureAndLayoutRunnable = new Runnable() { // from class: com.discord.chat.input.views.d
            @Override // java.lang.Runnable
            public final void run() {
                DCDChatInput.measureAndLayoutRunnable$lambda$0(DCDChatInput.this);
            }
        };
        setupExternalKeyboardSendRequests();
    }
}
