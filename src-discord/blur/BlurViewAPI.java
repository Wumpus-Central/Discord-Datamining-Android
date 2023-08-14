package com.discord.blur;

import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0001\u0007J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\b"}, d2 = {"Lcom/discord/blur/BlurViewAPI;", "Lcom/discord/blur/BlurViewAPIBase;", "setBlurTint", "", ViewProps.COLOR, "", "setBlurTintIOSParityCompensation", "Target", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public interface BlurViewAPI extends BlurViewAPIBase {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH&J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/discord/blur/BlurViewAPI$Target;", "Lcom/discord/blur/BlurViewAPIBase;", "viewRef", "Landroid/view/ViewGroup;", "getViewRef", "()Landroid/view/ViewGroup;", "addBlurRect", "", "rectId", "", "windowX", "windowY", "width", "height", "removeBlurRect", "blur_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public interface Target extends BlurViewAPIBase {
        void addBlurRect(int i10, int i11, int i12, int i13, int i14);

        ViewGroup getViewRef();

        void removeBlurRect(int i10);
    }

    void setBlurTint(int i10);

    void setBlurTintIOSParityCompensation(int i10);
}
