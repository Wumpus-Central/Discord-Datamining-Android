package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.mobile_voice_overlay.R;
import x1.a;

/* loaded from: classes7.dex */
public final class OverlayVoiceChannelSearchResultBinding {
    public final TextView categoryName;
    public final TextView channelName;
    public final ConstraintLayout container;
    public final TextView guildName;
    private final ConstraintLayout rootView;

    private OverlayVoiceChannelSearchResultBinding(ConstraintLayout constraintLayout, TextView textView, TextView textView2, ConstraintLayout constraintLayout2, TextView textView3) {
        this.rootView = constraintLayout;
        this.categoryName = textView;
        this.channelName = textView2;
        this.container = constraintLayout2;
        this.guildName = textView3;
    }

    public static OverlayVoiceChannelSearchResultBinding bind(View view) {
        int i10 = R.id.category_name;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.channel_name;
            TextView textView2 = (TextView) a.a(view, i10);
            if (textView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i10 = R.id.guild_name;
                TextView textView3 = (TextView) a.a(view, i10);
                if (textView3 != null) {
                    return new OverlayVoiceChannelSearchResultBinding(constraintLayout, textView, textView2, constraintLayout, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OverlayVoiceChannelSearchResultBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OverlayVoiceChannelSearchResultBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.overlay_voice_channel_search_result, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
