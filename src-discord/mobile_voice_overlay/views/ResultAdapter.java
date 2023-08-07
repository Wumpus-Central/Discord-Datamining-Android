package com.discord.mobile_voice_overlay.views;

import android.annotation.SuppressLint;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.discord.mobile_voice_overlay.MobileVoiceOverlaySelectorResult;
import com.discord.primitives.ChannelId;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;


@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001c\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\u0016\u0010\u0014\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/ResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/discord/mobile_voice_overlay/views/ResultViewHolder;", "onChannelSelected", "Lkotlin/Function1;", "Lcom/discord/primitives/ChannelId;", "", "(Lkotlin/jvm/functions/Function1;)V", "results", "", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlaySelectorResult;", "getItemCount", "", "onBindViewHolder", "holder", ViewProps.POSITION, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setResults", "mobile_voice_overlay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ResultAdapter extends RecyclerView.Adapter<ResultViewHolder> {
    private final Function1<ChannelId, Unit> onChannelSelected;
    private List<MobileVoiceOverlaySelectorResult> results;

    
    public ResultAdapter(Function1<? super ChannelId, Unit> onChannelSelected) {
        List<MobileVoiceOverlaySelectorResult> h10;
        q.h(onChannelSelected, "onChannelSelected");
        this.onChannelSelected = onChannelSelected;
        h10 = j.h();
        this.results = h10;
    }

    @Override 
    public int getItemCount() {
        return this.results.size();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setResults(List<MobileVoiceOverlaySelectorResult> results) {
        q.h(results, "results");
        this.results = results;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(ResultViewHolder holder, int i10) {
        q.h(holder, "holder");
        holder.bind(this.results.get(i10));
    }

    @Override 
    public ResultViewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        q.h(parent, "parent");
        return new ResultViewHolder(parent, this.onChannelSelected, null, 4, null);
    }
}
