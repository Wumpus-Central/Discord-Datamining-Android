package com.discord.chat.input.utils;

import android.text.Editable;
import android.text.TextUtils;
import android.widget.EditText;
import com.discord.chat.input.bridge.ChatInputNode;
import com.discord.chat.input.bridge.ChatInputNodeFontWeight;
import com.discord.chat.input.bridge.ChatInputNodeStyle;
import com.discord.chat.input.spans.DCDBackgroundSpan;
import com.discord.chat.input.spans.DCDBoldSpan;
import com.discord.chat.input.spans.DCDColorSpan;
import com.discord.chat.input.spans.DCDDeleteOnBackspaceSpan;
import com.discord.chat.input.spans.DCDInputSpan;
import com.discord.chat.input.spans.DCDNoSelectionSpan;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;

@Metadata(m15074d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a \u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0000\u001a\u0014\u0010\u0010\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0000¨\u0006\u0011"}, m15073d2 = {"addEllipsizedHint", "", "Landroid/widget/EditText;", "hint", "", "hintTruncateAt", "Landroid/text/TextUtils$TruncateAt;", "applyDCDSpan", "Landroid/text/Editable;", "span", "Lcom/discord/chat/input/spans/DCDInputSpan;", "node", "Lcom/discord/chat/input/bridge/ChatInputNode;", "removeEllipsizedHint", "maxLines", "", "setChatInputNodeStyle", "chat_input_release"}, m15072k = 2, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes4.dex */
public final class EditTextUtilsKt {

    @Metadata(m15072k = 3, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatInputNodeFontWeight.values().length];
            try {
                iArr[ChatInputNodeFontWeight.Bold.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void addEllipsizedHint(EditText editText, CharSequence charSequence, TextUtils.TruncateAt hintTruncateAt) {
        C9971q.m14633g(editText, "<this>");
        C9971q.m14633g(hintTruncateAt, "hintTruncateAt");
        if (editText.getMaxLines() != 1) {
            editText.setMaxLines(1);
        }
        editText.setEllipsize(hintTruncateAt);
        editText.setHint(charSequence);
    }

    public static /* synthetic */ void addEllipsizedHint$default(EditText editText, CharSequence charSequence, TextUtils.TruncateAt truncateAt, int i, Object obj) {
        if ((i & 2) != 0) {
            truncateAt = TextUtils.TruncateAt.END;
        }
        addEllipsizedHint(editText, charSequence, truncateAt);
    }

    public static final void applyDCDSpan(Editable editable, DCDInputSpan span, ChatInputNode node) {
        C9971q.m14633g(editable, "<this>");
        C9971q.m14633g(span, "span");
        C9971q.m14633g(node, "node");
        if (node.getLocation() <= editable.length() && node.getLocation() + node.getLength() <= editable.length()) {
            editable.setSpan(span, node.getLocation(), node.getLocation() + node.getLength(), 33);
        }
    }

    public static final void removeEllipsizedHint(EditText editText, int i) {
        C9971q.m14633g(editText, "<this>");
        if (editText.getMaxLines() != i) {
            editText.setMaxLines(i);
        }
        editText.setEllipsize(null);
        editText.setHint((CharSequence) null);
    }

    public static final void setChatInputNodeStyle(Editable editable, ChatInputNode node) {
        int i;
        C9971q.m14633g(editable, "<this>");
        C9971q.m14633g(node, "node");
        ChatInputNodeStyle style = node.getStyle();
        if (style != null) {
            applyDCDSpan(editable, new DCDColorSpan(style.getColor()), node);
            if (style.getBackgroundStyle() != null) {
                applyDCDSpan(editable, new DCDBackgroundSpan(style.getBackgroundStyle()), node);
            }
            ChatInputNodeFontWeight fontWeight = style.getFontWeight();
            if (fontWeight == null) {
                i = -1;
            } else {
                i = WhenMappings.$EnumSwitchMapping$0[fontWeight.ordinal()];
            }
            if (i == 1) {
                applyDCDSpan(editable, new DCDBoldSpan(), node);
            }
        }
        if (node.getDeleteNodeOnBackspace()) {
            applyDCDSpan(editable, new DCDDeleteOnBackspaceSpan(), node);
        }
        if (node.getEditDisabled()) {
            applyDCDSpan(editable, new DCDNoSelectionSpan(), node);
        }
    }
}
