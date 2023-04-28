package com.discord.chat.input.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.input.C4263R;
import com.discord.chat.input.views.DCDChatInput;
import p412x1.C13922a;

/* loaded from: classes4.dex */
public final class ChatInputRootViewBinding {
    public final DCDChatInput chatInputEditText;
    private final View rootView;

    private ChatInputRootViewBinding(View view, DCDChatInput dCDChatInput) {
        this.rootView = view;
        this.chatInputEditText = dCDChatInput;
    }

    public static ChatInputRootViewBinding bind(View view) {
        int i = C4263R.C4265id.chat_input_edit_text;
        DCDChatInput dCDChatInput = (DCDChatInput) C13922a.m2313a(view, i);
        if (dCDChatInput != null) {
            return new ChatInputRootViewBinding(view, dCDChatInput);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ChatInputRootViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(C4263R.layout.chat_input_root_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
