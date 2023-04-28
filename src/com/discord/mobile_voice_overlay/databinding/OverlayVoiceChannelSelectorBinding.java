package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.mobile_voice_overlay.C3521R;
import com.facebook.drawee.view.SimpleDraweeView;
import p413x1.C13836a;

/* loaded from: classes5.dex */
public final class OverlayVoiceChannelSelectorBinding {
    public final TextView channelSelect;
    public final SimpleDraweeView close;
    public final CardView dialogCard;
    public final TextView emptyResults;
    public final LinearLayout menuContainer;
    public final EditText overlayChannelSearch;
    public final RecyclerView resultsRv;
    private final CardView rootView;

    private OverlayVoiceChannelSelectorBinding(CardView cardView, TextView textView, SimpleDraweeView simpleDraweeView, CardView cardView2, TextView textView2, LinearLayout linearLayout, EditText editText, RecyclerView recyclerView) {
        this.rootView = cardView;
        this.channelSelect = textView;
        this.close = simpleDraweeView;
        this.dialogCard = cardView2;
        this.emptyResults = textView2;
        this.menuContainer = linearLayout;
        this.overlayChannelSearch = editText;
        this.resultsRv = recyclerView;
    }

    public static OverlayVoiceChannelSelectorBinding bind(View view) {
        int i = C3521R.C3523id.channel_select;
        TextView textView = (TextView) C13836a.m2313a(view, i);
        if (textView != null) {
            i = C3521R.C3523id.close;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) C13836a.m2313a(view, i);
            if (simpleDraweeView != null) {
                CardView cardView = (CardView) view;
                i = C3521R.C3523id.empty_results;
                TextView textView2 = (TextView) C13836a.m2313a(view, i);
                if (textView2 != null) {
                    i = C3521R.C3523id.menu_container;
                    LinearLayout linearLayout = (LinearLayout) C13836a.m2313a(view, i);
                    if (linearLayout != null) {
                        i = C3521R.C3523id.overlay_channel_search;
                        EditText editText = (EditText) C13836a.m2313a(view, i);
                        if (editText != null) {
                            i = C3521R.C3523id.results_rv;
                            RecyclerView recyclerView = (RecyclerView) C13836a.m2313a(view, i);
                            if (recyclerView != null) {
                                return new OverlayVoiceChannelSelectorBinding(cardView, textView, simpleDraweeView, cardView, textView2, linearLayout, editText, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static OverlayVoiceChannelSelectorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OverlayVoiceChannelSelectorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C3521R.layout.overlay_voice_channel_selector, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}
