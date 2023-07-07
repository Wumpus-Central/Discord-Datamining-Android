package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;
import v0.a;

/* loaded from: classes6.dex */
public final class ViewOverlayMenuBinding {
    public final SimpleDraweeView disconnectBtn;
    public final CardView menuBottom;
    public final CardView menuTop;
    public final ConstraintLayout menuTopStatusContainer;
    public final SimpleDraweeView muteToggle;
    public final TextView overlayChannelName;
    public final TextView overlayGuildName;
    public final TextView overlayInviteLink;
    public final SimpleDraweeView overlayNetworkIcon;
    public final TextView overlayOpenApp;
    public final TextView overlaySwitchChannels;
    private final View rootView;
    public final SimpleDraweeView srcToggle;

    private ViewOverlayMenuBinding(View view, SimpleDraweeView simpleDraweeView, CardView cardView, CardView cardView2, ConstraintLayout constraintLayout, SimpleDraweeView simpleDraweeView2, TextView textView, TextView textView2, TextView textView3, SimpleDraweeView simpleDraweeView3, TextView textView4, TextView textView5, SimpleDraweeView simpleDraweeView4) {
        this.rootView = view;
        this.disconnectBtn = simpleDraweeView;
        this.menuBottom = cardView;
        this.menuTop = cardView2;
        this.menuTopStatusContainer = constraintLayout;
        this.muteToggle = simpleDraweeView2;
        this.overlayChannelName = textView;
        this.overlayGuildName = textView2;
        this.overlayInviteLink = textView3;
        this.overlayNetworkIcon = simpleDraweeView3;
        this.overlayOpenApp = textView4;
        this.overlaySwitchChannels = textView5;
        this.srcToggle = simpleDraweeView4;
    }

    public static ViewOverlayMenuBinding bind(View view) {
        int i10 = R.id.disconnect_btn;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.a(view, i10);
        if (simpleDraweeView != null) {
            i10 = R.id.menu_bottom;
            CardView cardView = (CardView) a.a(view, i10);
            if (cardView != null) {
                i10 = R.id.menu_top;
                CardView cardView2 = (CardView) a.a(view, i10);
                if (cardView2 != null) {
                    i10 = R.id.menu_top_status_container;
                    ConstraintLayout constraintLayout = (ConstraintLayout) a.a(view, i10);
                    if (constraintLayout != null) {
                        i10 = R.id.mute_toggle;
                        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.a(view, i10);
                        if (simpleDraweeView2 != null) {
                            i10 = R.id.overlay_channel_name;
                            TextView textView = (TextView) a.a(view, i10);
                            if (textView != null) {
                                i10 = R.id.overlay_guild_name;
                                TextView textView2 = (TextView) a.a(view, i10);
                                if (textView2 != null) {
                                    i10 = R.id.overlay_invite_link;
                                    TextView textView3 = (TextView) a.a(view, i10);
                                    if (textView3 != null) {
                                        i10 = R.id.overlay_network_icon;
                                        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) a.a(view, i10);
                                        if (simpleDraweeView3 != null) {
                                            i10 = R.id.overlay_open_app;
                                            TextView textView4 = (TextView) a.a(view, i10);
                                            if (textView4 != null) {
                                                i10 = R.id.overlay_switch_channels;
                                                TextView textView5 = (TextView) a.a(view, i10);
                                                if (textView5 != null) {
                                                    i10 = R.id.src_toggle;
                                                    SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) a.a(view, i10);
                                                    if (simpleDraweeView4 != null) {
                                                        return new ViewOverlayMenuBinding(view, simpleDraweeView, cardView, cardView2, constraintLayout, simpleDraweeView2, textView, textView2, textView3, simpleDraweeView3, textView4, textView5, simpleDraweeView4);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static ViewOverlayMenuBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.view_overlay_menu, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    public View getRoot() {
        return this.rootView;
    }
}
