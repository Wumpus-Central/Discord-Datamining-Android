package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import u0.a;


public final class DeadchatPromptActionsViewBinding {
    public final DCDButton cameraButton;
    public final DCDButton emojiButton;
    private final View rootView;

    private DeadchatPromptActionsViewBinding(View view, DCDButton dCDButton, DCDButton dCDButton2) {
        this.rootView = view;
        this.cameraButton = dCDButton;
        this.emojiButton = dCDButton2;
    }

    public static DeadchatPromptActionsViewBinding bind(View view) {
        int i10 = R.id.camera_button;
        DCDButton dCDButton = (DCDButton) a.a(view, i10);
        if (dCDButton != null) {
            i10 = R.id.emoji_button;
            DCDButton dCDButton2 = (DCDButton) a.a(view, i10);
            if (dCDButton2 != null) {
                return new DeadchatPromptActionsViewBinding(view, dCDButton, dCDButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static DeadchatPromptActionsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.deadchat_prompt_actions_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
