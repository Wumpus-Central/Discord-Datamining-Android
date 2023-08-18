package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;
import u0.a;


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
        int i10 = R.id.channel_select;
        TextView textView = (TextView) a.a(view, i10);
        if (textView != null) {
            i10 = R.id.close;
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
            if (simpleDraweeView != null) {
                CardView cardView = (CardView) view;
                i10 = R.id.empty_results;
                TextView textView2 = (TextView) a.a(view, i10);
                if (textView2 != null) {
                    i10 = R.id.menu_container;
                    LinearLayout linearLayout = (LinearLayout) a.a(view, i10);
                    if (linearLayout != null) {
                        i10 = R.id.overlay_channel_search;
                        EditText editText = (EditText) a.a(view, i10);
                        if (editText != null) {
                            i10 = R.id.results_rv;
                            RecyclerView recyclerView = (RecyclerView) a.a(view, i10);
                            if (recyclerView != null) {
                                return new OverlayVoiceChannelSelectorBinding(cardView, textView, simpleDraweeView, cardView, textView2, linearLayout, editText, recyclerView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static OverlayVoiceChannelSelectorBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static OverlayVoiceChannelSelectorBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View inflate = layoutInflater.inflate(R.layout.overlay_voice_channel_selector, viewGroup, false);
        if (z10) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}
