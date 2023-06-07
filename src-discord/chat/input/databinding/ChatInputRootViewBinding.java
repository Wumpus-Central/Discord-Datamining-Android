package com.discord.chat.input.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.input.R;
import com.discord.chat.input.views.DCDChatInput;
import x1.a;

/* loaded from: classes7.dex */
public final class ChatInputRootViewBinding {
    public final DCDChatInput chatInputEditText;
    private final View rootView;

    private ChatInputRootViewBinding(View view, DCDChatInput dCDChatInput) {
        this.rootView = view;
        this.chatInputEditText = dCDChatInput;
    }

    public static ChatInputRootViewBinding bind(View view) {
        int i10 = R.id.chat_input_edit_text;
        DCDChatInput dCDChatInput = (DCDChatInput) a.a(view, i10);
        if (dCDChatInput != null) {
            return new ChatInputRootViewBinding(view, dCDChatInput);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ChatInputRootViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.chat_input_root_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
