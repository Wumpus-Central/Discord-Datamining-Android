package com.discord.chat.input.views;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.text.Editable;
import android.text.Layout;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.core.util.h;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.s0;
import androidx.core.view.w0;
import com.discord.SetTextSizeSpKt;
import com.discord.chat.input.bridge.ChatInputNode;
import com.discord.chat.input.databinding.ChatInputRootViewBinding;
import com.discord.chat.input.plugins.DeleteNodeOnBackspaceTextWatcher;
import com.discord.chat.input.plugins.SelectionGuardSpanWatcher;
import com.discord.chat.input.spans.DCDInputSpan;
import com.discord.chat.input.utils.EditTextUtilsKt;
import com.discord.chat.input.views.ChatInputRootView;
import com.discord.fonts.DiscordFont;
import com.discord.fonts.DiscordFontUtilsKt;
import com.discord.keyboard.KeyboardEvent;
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt;
import com.discord.misc.utilities.keyboard.KeyboardExtensionsKt;
import com.discord.span.utilities.BackgroundSpanDrawer;
import com.discord.span.utilities.SpannableExtensionsKt;
import com.facebook.react.uimanager.ViewProps;
import eg.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.s;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.l;
import of.p;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\\]B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0006\u0010>\u001a\u00020?J\u001e\u0010@\u001a\u00020?2\b\u0010A\u001a\u0004\u0018\u00010\u00172\f\u0010B\u001a\b\u0012\u0004\u0012\u00020D0CJ\u0006\u0010E\u001a\u00020?J\b\u0010F\u001a\u00020?H\u0014J\u0010\u0010G\u001a\u00020?2\u0006\u0010H\u001a\u00020%H\u0016J>\u0010I\u001a\u00020?2\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\u0006\u00108\u001a\u00020\u00172\f\u0010L\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010M\u001a\u00020%2\b\u0010A\u001a\u0004\u0018\u00010\u0017J\u0006\u0010N\u001a\u00020%J\u0018\u0010O\u001a\u00020?2\u0006\u0010P\u001a\u00020\b2\b\b\u0002\u0010Q\u001a\u00020\bJ\u000e\u0010R\u001a\u00020?2\u0006\u0010S\u001a\u00020TJ \u0010U\u001a\u00020?2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C2\b\b\u0002\u0010V\u001a\u00020\bH\u0002J\b\u0010W\u001a\u00020?H\u0002J!\u0010X\u001a\u00020?*\u00020$2\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020[\u0012\u0004\u0012\u00020?0ZH\u0082\bR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR&\u0010\u001d\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010&\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010*\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u000e\u0010,\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010-\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u00108\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010\u001a\"\u0004\b:\u0010\u001cR&\u0010;\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b<\u0010\u001f\"\u0004\b=\u0010!¨\u0006^"}, d2 = {"Lcom/discord/chat/input/views/ChatInputRootView;", "Landroid/widget/RelativeLayout;", "Lcom/discord/keyboard/KeyboardEvent;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/discord/chat/input/databinding/ChatInputRootViewBinding;", "blurJob", "Lkotlinx/coroutines/Job;", "currentTextFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;", "editText", "Lcom/discord/chat/input/views/DCDChatInput;", "editTextHint", "", "editTextMaxLines", "value", "", "hint", "getHint", "()Ljava/lang/String;", "setHint", "(Ljava/lang/String;)V", "hintTextColor", "getHintTextColor", "()I", "setHintTextColor", "(I)V", "insertedPayloads", "", "Landroidx/core/view/ContentInfoCompat;", "", "isCursorVisible", "()Z", "setCursorVisible", "(Z)V", "isEditTextEnabled", "setEditTextEnabled", "lastEditId", "lineCount", "getLineCount", "()Ljava/lang/Integer;", "lineHeightMeasurer", "Lcom/discord/chat/input/views/ChatInputRootViewMeasurer;", "listener", "Lcom/discord/chat/input/views/ChatInputRootView$ChatInputListener;", "getListener", "()Lcom/discord/chat/input/views/ChatInputRootView$ChatInputListener;", "setListener", "(Lcom/discord/chat/input/views/ChatInputRootView$ChatInputListener;)V", "text", "getText", "setText", "textColor", "getTextColor", "setTextColor", "backspace", "", "clearAndApplyChatNodes", "editId", "chatInputNodes", "", "Lcom/discord/chat/input/bridge/ChatInputNode;", "clearInputFocus", "onAttachedToWindow", "onKeyboardStateChanged", "opened", "replaceRange", "location", "length", "styleBlocks", "keepCursorPosition", "requestInputFocus", "setSelection", ViewProps.START, "stop", "showKeyboard", "window", "Landroid/view/Window;", "updateChatNodes", "offset", "updateHintEllipsis", "forEachUri", "action", "Lkotlin/Function1;", "Landroid/net/Uri;", "ChatInputListener", "CurrentTextAndSelection", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatInputRootView extends RelativeLayout implements KeyboardEvent {
    private final ChatInputRootViewBinding binding;
    private Job blurJob;
    private final MutableStateFlow<CurrentTextAndSelection> currentTextFlow;
    private final DCDChatInput editText;
    private CharSequence editTextHint;
    private int editTextMaxLines;
    private final Set<ContentInfoCompat> insertedPayloads;
    private String lastEditId;
    private ChatInputRootViewMeasurer lineHeightMeasurer;
    private ChatInputListener listener;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.chat.input.views.ChatInputRootView$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends s implements Function0<Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1() {
            super(0);
            ChatInputRootView.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final void invoke2() {
            ChatInputListener listener = ChatInputRootView.this.getListener();
            if (listener != null) {
                listener.onRequestSend();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "selStart", "", "selEnd", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.discord.chat.input.views.ChatInputRootView$2 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends s implements Function2<Integer, Integer, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2() {
            super(2);
            ChatInputRootView.this = r1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            invoke(num.intValue(), num2.intValue());
            return Unit.f22034a;
        }

        public final void invoke(int i10, int i11) {
            ChatInputRootView.this.currentTextFlow.setValue(new CurrentTextAndSelection(i10, i11, String.valueOf(ChatInputRootView.this.editText.getText()), ChatInputRootView.this.lastEditId));
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0003H&J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH&¨\u0006\u0013"}, d2 = {"Lcom/discord/chat/input/views/ChatInputRootView$ChatInputListener;", "", "onContentSizeChange", "", "width", "", "height", "onEndBlur", "text", "", "onFocus", ViewProps.START, ViewProps.END, "onImageInserted", "uri", "Landroid/net/Uri;", "onRequestSend", "onTextOrSelectionChanged", "editId", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public interface ChatInputListener {
        void onContentSizeChange(int i10, int i11);

        void onEndBlur(String str);

        void onFocus(int i10, int i11);

        void onImageInserted(Uri uri);

        void onRequestSend();

        void onTextOrSelectionChanged(int i10, int i11, String str, String str2);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/discord/chat/input/views/ChatInputRootView$CurrentTextAndSelection;", "", "selectionStart", "", "selectionEnd", "text", "", "editId", "(IILjava/lang/String;Ljava/lang/String;)V", "getEditId", "()Ljava/lang/String;", "getSelectionEnd", "()I", "getSelectionStart", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "chat_input_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CurrentTextAndSelection {
        private final String editId;
        private final int selectionEnd;
        private final int selectionStart;
        private final String text;

        public CurrentTextAndSelection(int i10, int i11, String text, String editId) {
            q.g(text, "text");
            q.g(editId, "editId");
            this.selectionStart = i10;
            this.selectionEnd = i11;
            this.text = text;
            this.editId = editId;
        }

        public static /* synthetic */ CurrentTextAndSelection copy$default(CurrentTextAndSelection currentTextAndSelection, int i10, int i11, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = currentTextAndSelection.selectionStart;
            }
            if ((i12 & 2) != 0) {
                i11 = currentTextAndSelection.selectionEnd;
            }
            if ((i12 & 4) != 0) {
                str = currentTextAndSelection.text;
            }
            if ((i12 & 8) != 0) {
                str2 = currentTextAndSelection.editId;
            }
            return currentTextAndSelection.copy(i10, i11, str, str2);
        }

        public final int component1() {
            return this.selectionStart;
        }

        public final int component2() {
            return this.selectionEnd;
        }

        public final String component3() {
            return this.text;
        }

        public final String component4() {
            return this.editId;
        }

        public final CurrentTextAndSelection copy(int i10, int i11, String text, String editId) {
            q.g(text, "text");
            q.g(editId, "editId");
            return new CurrentTextAndSelection(i10, i11, text, editId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CurrentTextAndSelection)) {
                return false;
            }
            CurrentTextAndSelection currentTextAndSelection = (CurrentTextAndSelection) obj;
            return this.selectionStart == currentTextAndSelection.selectionStart && this.selectionEnd == currentTextAndSelection.selectionEnd && q.b(this.text, currentTextAndSelection.text) && q.b(this.editId, currentTextAndSelection.editId);
        }

        public final String getEditId() {
            return this.editId;
        }

        public final int getSelectionEnd() {
            return this.selectionEnd;
        }

        public final int getSelectionStart() {
            return this.selectionStart;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return (((((this.selectionStart * 31) + this.selectionEnd) * 31) + this.text.hashCode()) * 31) + this.editId.hashCode();
        }

        public String toString() {
            int i10 = this.selectionStart;
            int i11 = this.selectionEnd;
            String str = this.text;
            String str2 = this.editId;
            return "CurrentTextAndSelection(selectionStart=" + i10 + ", selectionEnd=" + i11 + ", text=" + str + ", editId=" + str2 + ")";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatInputRootView(Context context) {
        this(context, null, 0, 6, null);
        q.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChatInputRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        q.g(context, "context");
    }

    public /* synthetic */ ChatInputRootView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static final void _init_$lambda$0(ChatInputRootView this$0, View view, boolean z10) {
        ChatInputListener chatInputListener;
        q.g(this$0, "this$0");
        if (z10 && (chatInputListener = this$0.listener) != null) {
            chatInputListener.onFocus(this$0.editText.getSelectionStart(), this$0.editText.getSelectionStart());
        }
    }

    public static final ContentInfoCompat _init_$lambda$3(ChatInputRootView this$0, final Context context, View view, ContentInfoCompat payload) {
        IntRange q10;
        q.g(this$0, "this$0");
        q.g(context, "$context");
        q.g(view, "<anonymous parameter 0>");
        q.g(payload, "payload");
        Pair<ContentInfoCompat, ContentInfoCompat> i10 = payload.i(new h() { // from class: com.discord.chat.input.views.a
            @Override // androidx.core.util.h
            public final boolean test(Object obj) {
                boolean lambda$3$lambda$1;
                lambda$3$lambda$1 = ChatInputRootView.lambda$3$lambda$1(context, (ClipData.Item) obj);
                return lambda$3$lambda$1;
            }
        });
        q.f(i10, "partition {\n            …/\") == true\n            }");
        ContentInfoCompat contentInfoCompat = (ContentInfoCompat) i10.first;
        ContentInfoCompat contentInfoCompat2 = (ContentInfoCompat) i10.second;
        if (contentInfoCompat != null) {
            this$0.insertedPayloads.add(payload);
            q10 = j.q(0, contentInfoCompat.c().getItemCount());
            Iterator<Integer> it = q10.iterator();
            while (it.hasNext()) {
                Uri uri = contentInfoCompat.c().getItemAt(((p) it).nextInt()).getUri();
                q.f(uri, "clip.getItemAt(itemIndex).uri");
                ChatInputListener chatInputListener = this$0.listener;
                if (chatInputListener != null) {
                    chatInputListener.onImageInserted(uri);
                }
            }
        }
        return contentInfoCompat2;
    }

    private final void forEachUri(ContentInfoCompat contentInfoCompat, Function1<? super Uri, Unit> function1) {
        IntRange q10;
        q10 = j.q(0, contentInfoCompat.c().getItemCount());
        Iterator<Integer> it = q10.iterator();
        while (it.hasNext()) {
            Uri uri = contentInfoCompat.c().getItemAt(((p) it).nextInt()).getUri();
            q.f(uri, "clip.getItemAt(itemIndex).uri");
            function1.invoke(uri);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean lambda$3$lambda$1(android.content.Context r4, android.content.ClipData.Item r5) {
        /*
            java.lang.String r0 = "$context"
            kotlin.jvm.internal.q.g(r4, r0)
            android.net.Uri r0 = r5.getUri()
            r1 = 0
            if (r0 == 0) goto L_0x002b
            android.content.ContentResolver r4 = r4.getContentResolver()
            android.net.Uri r5 = r5.getUri()
            java.lang.String r4 = r4.getType(r5)
            r5 = 1
            if (r4 == 0) goto L_0x0027
            r0 = 2
            r2 = 0
            java.lang.String r3 = "image/"
            boolean r4 = ri.l.H(r4, r3, r1, r0, r2)
            if (r4 != r5) goto L_0x0027
            r4 = r5
            goto L_0x0028
        L_0x0027:
            r4 = r1
        L_0x0028:
            if (r4 == 0) goto L_0x002b
            r1 = r5
        L_0x002b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.chat.input.views.ChatInputRootView.lambda$3$lambda$1(android.content.Context, android.content.ClipData$Item):boolean");
    }

    public static /* synthetic */ void setSelection$default(ChatInputRootView chatInputRootView, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = i10;
        }
        chatInputRootView.setSelection(i10, i11);
    }

    private final void updateChatNodes(List<ChatInputNode> list, int i10) {
        int t10;
        boolean z10;
        t10 = k.t(list, 10);
        ArrayList<ChatInputNode> arrayList = new ArrayList(t10);
        for (ChatInputNode chatInputNode : list) {
            arrayList.add(ChatInputNode.copy$default(chatInputNode, 0, chatInputNode.getLocation() + i10, 0, null, false, null, false, 125, null));
        }
        for (ChatInputNode chatInputNode2 : arrayList) {
            Editable editableText = this.editText.getEditableText();
            q.f(editableText, "editText.editableText");
            EditTextUtilsKt.setChatInputNodeStyle(editableText, chatInputNode2);
        }
        Editable editableText2 = this.editText.getEditableText();
        q.f(editableText2, "editText.editableText");
        boolean z11 = false;
        Object[] spans = editableText2.getSpans(0, editableText2.length(), BackgroundSpanDrawer.class);
        q.f(spans, "getSpans(0, length, T::class.java)");
        if (spans.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(!z10)) {
            Editable editableText3 = this.editText.getEditableText();
            q.f(editableText3, "editText.editableText");
            SpannableExtensionsKt.coverWithSpan(editableText3, new BackgroundSpanDrawer(this.editText));
        }
        Editable editableText4 = this.editText.getEditableText();
        q.f(editableText4, "editText.editableText");
        Object[] spans2 = editableText4.getSpans(0, editableText4.length(), SelectionGuardSpanWatcher.class);
        q.f(spans2, "getSpans(0, length, T::class.java)");
        if (spans2.length == 0) {
            z11 = true;
        }
        if (!(!z11)) {
            Editable editableText5 = this.editText.getEditableText();
            q.f(editableText5, "editText.editableText");
            SpannableExtensionsKt.coverWithSpan(editableText5, new SelectionGuardSpanWatcher());
        }
    }

    static /* synthetic */ void updateChatNodes$default(ChatInputRootView chatInputRootView, List list, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        chatInputRootView.updateChatNodes(list, i10);
    }

    public final void updateHintEllipsis() {
        boolean z10;
        if (this.editText.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            EditTextUtilsKt.addEllipsizedHint$default(this.editText, this.editTextHint, null, 2, null);
        } else {
            EditTextUtilsKt.removeEllipsizedHint(this.editText, this.editTextMaxLines);
        }
    }

    public final void backspace() {
        this.editText.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public final void clearAndApplyChatNodes(String str, List<ChatInputNode> chatInputNodes) {
        q.g(chatInputNodes, "chatInputNodes");
        if (q.b(this.lastEditId, str) || str == null) {
            Editable editableText = this.editText.getEditableText();
            DCDInputSpan[] dCDInputSpanArr = (DCDInputSpan[]) editableText.getSpans(0, editableText.length(), DCDInputSpan.class);
            if (dCDInputSpanArr != null) {
                q.f(dCDInputSpanArr, "getSpans(0, length, DCDInputSpan::class.java)");
                for (DCDInputSpan dCDInputSpan : dCDInputSpanArr) {
                    editableText.removeSpan(dCDInputSpan);
                }
            }
            updateChatNodes$default(this, chatInputNodes, 0, 2, null);
        }
    }

    public final void clearInputFocus() {
        this.editText.clearFocus();
    }

    public final String getHint() {
        CharSequence hint = this.editText.getHint();
        if (hint != null) {
            return hint.toString();
        }
        return null;
    }

    public final int getHintTextColor() {
        return this.editText.getCurrentHintTextColor();
    }

    public final Integer getLineCount() {
        Layout layout = this.editText.getLayout();
        if (layout != null) {
            return Integer.valueOf(layout.getLineCount());
        }
        return null;
    }

    public final ChatInputListener getListener() {
        return this.listener;
    }

    public final String getText() {
        return String.valueOf(this.editText.getText());
    }

    public final int getTextColor() {
        return this.editText.getCurrentTextColor();
    }

    public final boolean isCursorVisible() {
        return this.editText.isCursorVisible();
    }

    public final boolean isEditTextEnabled() {
        return this.editText.isEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new ChatInputRootView$onAttachedToWindow$1(this, null), 3, null);
    }

    @Override // com.discord.keyboard.KeyboardEvent
    public void onKeyboardStateChanged(boolean z10) {
        Job d10;
        Job job = this.blurJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        if (!z10) {
            d10 = l.d(CoroutineViewUtilsKt.getAttachedScope(this), null, null, new ChatInputRootView$onKeyboardStateChanged$1(this, null), 3, null);
            this.blurJob = d10;
        }
    }

    public final void replaceRange(int i10, int i11, String text, List<ChatInputNode> styleBlocks, boolean z10, String str) {
        int i12;
        int i13;
        q.g(text, "text");
        q.g(styleBlocks, "styleBlocks");
        if (q.b(str, this.lastEditId) || str == null) {
            Editable text2 = this.editText.getText();
            if (text2 != null) {
                i12 = text2.length();
            } else {
                i12 = 0;
            }
            if (i10 <= i12 && (i13 = i11 + i10) <= i12) {
                this.editText.getEditableText().replace(i10, i13, text);
                updateChatNodes(styleBlocks, i10);
            }
        }
    }

    public final boolean requestInputFocus() {
        return this.editText.requestFocus();
    }

    public final void setCursorVisible(boolean z10) {
        this.editText.setCursorVisible(z10);
    }

    public final void setEditTextEnabled(boolean z10) {
        this.editText.setEnabled(z10);
    }

    public final void setHint(String str) {
        this.editText.setHint(str);
        this.editTextHint = str;
        updateHintEllipsis();
    }

    public final void setHintTextColor(int i10) {
        this.editText.setHintTextColor(i10);
    }

    public final void setListener(ChatInputListener chatInputListener) {
        this.listener = chatInputListener;
    }

    public final void setSelection(int i10, int i11) {
        this.editText.setSelection(i10, i11);
    }

    public final void setText(String value) {
        q.g(value, "value");
        this.editText.setText(value);
    }

    public final void setTextColor(int i10) {
        this.editText.setTextColor(i10);
    }

    public final void showKeyboard(Window window) {
        q.g(window, "window");
        KeyboardExtensionsKt.showKeyboard(this.editText, window);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatInputRootView(final Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.g(context, "context");
        ChatInputRootViewBinding inflate = ChatInputRootViewBinding.inflate(LayoutInflater.from(context), this);
        q.f(inflate, "inflate(\n        LayoutI…ext),\n        this,\n    )");
        this.binding = inflate;
        this.lineHeightMeasurer = new ChatInputRootViewMeasurer(this, new ChatInputRootView$lineHeightMeasurer$1(this));
        DCDChatInput dCDChatInput = inflate.chatInputEditText;
        q.f(dCDChatInput, "binding.chatInputEditText");
        this.editText = dCDChatInput;
        this.insertedPayloads = new LinkedHashSet();
        this.editTextHint = dCDChatInput.getHint();
        this.editTextMaxLines = dCDChatInput.getMaxLines();
        String uuid = UUID.randomUUID().toString();
        q.f(uuid, "randomUUID().toString()");
        this.lastEditId = uuid;
        this.currentTextFlow = kotlinx.coroutines.flow.q.a(null);
        DiscordFontUtilsKt.setDiscordFont(dCDChatInput, DiscordFont.PrimaryMedium);
        SetTextSizeSpKt.setTextSizeSp(dCDChatInput, 16.0f);
        dCDChatInput.setOnRequestSend(new AnonymousClass1());
        dCDChatInput.setOnSelectionChanged(new AnonymousClass2());
        dCDChatInput.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.discord.chat.input.views.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                ChatInputRootView._init_$lambda$0(ChatInputRootView.this, view, z10);
            }
        });
        w0.E0(dCDChatInput, new String[]{"image/*"}, new s0() { // from class: com.discord.chat.input.views.c
            @Override // androidx.core.view.s0
            public final ContentInfoCompat a(View view, ContentInfoCompat contentInfoCompat) {
                ContentInfoCompat _init_$lambda$3;
                _init_$lambda$3 = ChatInputRootView._init_$lambda$3(ChatInputRootView.this, context, view, contentInfoCompat);
                return _init_$lambda$3;
            }
        });
        dCDChatInput.addTextChangedListener(new TextWatcher() { // from class: com.discord.chat.input.views.ChatInputRootView$special$$inlined$doAfterTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                String valueOf = String.valueOf(editable);
                ChatInputRootView chatInputRootView = ChatInputRootView.this;
                String uuid2 = UUID.randomUUID().toString();
                q.f(uuid2, "randomUUID().toString()");
                chatInputRootView.lastEditId = uuid2;
                ChatInputRootView.this.currentTextFlow.setValue(new ChatInputRootView.CurrentTextAndSelection(ChatInputRootView.this.editText.getSelectionStart(), ChatInputRootView.this.editText.getSelectionEnd(), valueOf, ChatInputRootView.this.lastEditId));
                ChatInputRootView.this.lineHeightMeasurer.measure(false);
                ChatInputRootView.this.updateHintEllipsis();
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
            }
        });
        dCDChatInput.addTextChangedListener(new DeleteNodeOnBackspaceTextWatcher());
        if (!w0.U(this) || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.chat.input.views.ChatInputRootView$special$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                    q.g(view, "view");
                    view.removeOnLayoutChangeListener(this);
                    ChatInputRootView.this.lineHeightMeasurer.measure(true);
                }
            });
        } else {
            this.lineHeightMeasurer.measure(true);
        }
    }
}
