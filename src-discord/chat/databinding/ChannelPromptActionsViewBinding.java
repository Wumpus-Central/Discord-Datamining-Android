package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import u0.a;


public final class ChannelPromptActionsViewBinding {
    public final DCDButton cameraButton;
    public final DCDButton emojiButton;
    public final DCDButton gamingStatsButton;
    private final View rootView;

    private ChannelPromptActionsViewBinding(View view, DCDButton dCDButton, DCDButton dCDButton2, DCDButton dCDButton3) {
        this.rootView = view;
        this.cameraButton = dCDButton;
        this.emojiButton = dCDButton2;
        this.gamingStatsButton = dCDButton3;
    }

    public static ChannelPromptActionsViewBinding bind(View view) {
        int i10 = R.id.camera_button;
        DCDButton dCDButton = (DCDButton) a.a(view, i10);
        if (dCDButton != null) {
            i10 = R.id.emoji_button;
            DCDButton dCDButton2 = (DCDButton) a.a(view, i10);
            if (dCDButton2 != null) {
                i10 = R.id.gaming_stats_button;
                DCDButton dCDButton3 = (DCDButton) a.a(view, i10);
                if (dCDButton3 != null) {
                    return new ChannelPromptActionsViewBinding(view, dCDButton, dCDButton2, dCDButton3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ChannelPromptActionsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.channel_prompt_actions_view, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
