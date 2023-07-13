package com.discord.rlottie;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.appcompat.widget.n;
import com.BV.LinearGradient.LinearGradientManager;
import com.discord.rlottie.RLottieDrawable;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.util.JSStackTrace;
import ff.y;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b0\u00101B\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u00103\u001a\u0004\u0018\u000102¢\u0006\u0004\b0\u00104B%\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u00103\u001a\u0004\u0018\u000102\u0012\b\b\u0002\u00105\u001a\u00020\u0007¢\u0006\u0004\b0\u00106J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0003J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u001d\u0010\r\u001a\u00020\t2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0007J6\u0010\u0012\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017J0\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017J\b\u0010\u001c\u001a\u00020\tH\u0014J\b\u0010\u001d\u001a\u00020\tH\u0014J\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010!\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\tJ\u0006\u0010#\u001a\u00020\tR$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-R\u0016\u0010/\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010-¨\u00067"}, d2 = {"Lcom/discord/rlottie/RLottieImageView;", "Landroidx/appcompat/widget/n;", "Landroid/content/Context;", "Landroid/view/Display;", "getDisplayCompat", "", "layer", "", ViewProps.COLOR, "", "setLayerColor", "", LinearGradientManager.PROP_COLORS, "replaceColors", "([Ljava/lang/Integer;)V", "resId", "w", "h", "setAnimation", "width", "height", "", "colorReplacement", "Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;", "playbackMode", "context", "Ljava/io/File;", JSStackTrace.FILE_KEY, "onAttachedToWindow", "onDetachedFromWindow", "setPlaybackMode", "", "progress", "setProgress", "playAnimation", "pauseAnimation", "Ljava/util/HashMap;", "layerColors", "Ljava/util/HashMap;", "Lcom/discord/rlottie/RLottieDrawable;", "drawable", "Lcom/discord/rlottie/RLottieDrawable;", "Lcom/discord/rlottie/RLottieDrawable$PlaybackMode;", "", "attachedToWindow", "Z", "playing", "startOnAttach", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "rlottie_release"}, k = 1, mv = {1, 4, 0})

public class RLottieImageView extends n {
    private HashMap _$_findViewCache;
    private boolean attachedToWindow;
    private RLottieDrawable drawable;
    private HashMap<String, Integer> layerColors;
    private RLottieDrawable.PlaybackMode playbackMode;
    private boolean playing;
    private boolean startOnAttach;

    
    public RLottieImageView(Context context) {
        super(context);
        q.h(context, "context");
        this.playbackMode = RLottieDrawable.PlaybackMode.FREEZE;
    }

    @SuppressLint({"AnnotateVersionCheck"})
    private final Display getDisplayCompat(Context context) {
        Display display;
        if (Build.VERSION.SDK_INT >= 30) {
            display = context.getDisplay();
            if (display == null) {
                q.s();
            }
            q.c(display, "display!!");
            return display;
        }
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            q.c(defaultDisplay, "(getSystemService(Contex…owManager).defaultDisplay");
            return defaultDisplay;
        }
        throw new y("null cannot be cast to non-null type android.view.WindowManager");
    }

    public static  void setAnimation$default(RLottieImageView rLottieImageView, int i10, int i11, int i12, int[] iArr, RLottieDrawable.PlaybackMode playbackMode, int i13, Object obj) {
        if (obj == null) {
            if ((i13 & 8) != 0) {
                iArr = null;
            }
            if ((i13 & 16) != 0) {
                playbackMode = RLottieDrawable.PlaybackMode.LOOP;
            }
            rLottieImageView.setAnimation(i10, i11, i12, iArr, playbackMode);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnimation");
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i10) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        this._$_findViewCache.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    
    @Override 
    public void onAttachedToWindow() {
        RLottieDrawable rLottieDrawable;
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        if (this.playing && (rLottieDrawable = this.drawable) != null) {
            rLottieDrawable.start();
        }
    }

    
    @Override 
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
    }

    public final void pauseAnimation() {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            this.playing = false;
            if (!this.attachedToWindow) {
                this.startOnAttach = false;
            } else if (rLottieDrawable != null) {
                rLottieDrawable.stop();
            }
        }
    }

    public final void playAnimation() {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            this.playing = true;
            if (!this.attachedToWindow) {
                this.startOnAttach = true;
            } else if (rLottieDrawable != null) {
                rLottieDrawable.start();
            }
        }
    }

    public final void replaceColors(Integer[] numArr) {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.replaceColors(numArr);
        }
    }

    public final void setAnimation(int i10, int i11, int i12) {
        setAnimation$default(this, i10, i11, i12, (int[]) null, (RLottieDrawable.PlaybackMode) null, 16, (Object) null);
    }

    public final void setLayerColor(String layer, int i10) {
        q.h(layer, "layer");
        if (this.layerColors == null) {
            this.layerColors = new HashMap<>();
        }
        HashMap<String, Integer> hashMap = this.layerColors;
        if (hashMap == null) {
            q.s();
        }
        hashMap.put(layer, Integer.valueOf(i10));
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.setLayerColor(layer, i10);
        }
    }

    public final void setPlaybackMode(RLottieDrawable.PlaybackMode playbackMode) {
        q.h(playbackMode, "playbackMode");
        this.playbackMode = playbackMode;
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.setPlaybackMode(playbackMode);
        }
    }

    public final void setProgress(float f10) {
        RLottieDrawable rLottieDrawable = this.drawable;
        if (rLottieDrawable != null) {
            rLottieDrawable.setProgress(f10);
        }
    }

    public final void setAnimation(int i10, int i11, int i12, int[] iArr, RLottieDrawable.PlaybackMode playbackMode) {
        q.h(playbackMode, "playbackMode");
        Context context = getContext();
        q.c(context, "context");
        String valueOf = String.valueOf(i10);
        Context context2 = getContext();
        q.c(context2, "context");
        RLottieDrawable rLottieDrawable = new RLottieDrawable(context, i10, valueOf, i11, i12, getDisplayCompat(context2).getRefreshRate(), false, iArr);
        this.drawable = rLottieDrawable;
        this.playbackMode = playbackMode;
        rLottieDrawable.setPlaybackMode(playbackMode);
        HashMap<String, Integer> hashMap = this.layerColors;
        if (hashMap != null) {
            RLottieDrawable rLottieDrawable2 = this.drawable;
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.beginApplyLayerColors();
            }
            for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                String key = entry.getKey();
                int intValue = entry.getValue().intValue();
                RLottieDrawable rLottieDrawable3 = this.drawable;
                if (rLottieDrawable3 != null) {
                    rLottieDrawable3.setLayerColor(key, intValue);
                }
            }
            RLottieDrawable rLottieDrawable4 = this.drawable;
            if (rLottieDrawable4 != null) {
                rLottieDrawable4.commitApplyLayerColors();
            }
        }
        RLottieDrawable rLottieDrawable5 = this.drawable;
        if (rLottieDrawable5 != null) {
            rLottieDrawable5.setAllowDecodeSingleFrame(true);
        }
        setImageDrawable(this.drawable);
    }

    
    public RLottieImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.h(context, "context");
        this.playbackMode = RLottieDrawable.PlaybackMode.FREEZE;
    }

    public static  void setAnimation$default(RLottieImageView rLottieImageView, Context context, File file, int i10, int i11, RLottieDrawable.PlaybackMode playbackMode, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 16) != 0) {
                playbackMode = RLottieDrawable.PlaybackMode.LOOP;
            }
            rLottieImageView.setAnimation(context, file, i10, i11, playbackMode);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAnimation");
    }

    public  RLottieImageView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    
    public RLottieImageView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        q.h(context, "context");
        this.playbackMode = RLottieDrawable.PlaybackMode.FREEZE;
    }

    public final void setAnimation(Context context, File file, int i10, int i11, RLottieDrawable.PlaybackMode playbackMode) {
        q.h(context, "context");
        q.h(file, "file");
        q.h(playbackMode, "playbackMode");
        RLottieDrawable rLottieDrawable = new RLottieDrawable(file, i10, i11, false, true, getDisplayCompat(context).getRefreshRate(), null, 64, null);
        this.drawable = rLottieDrawable;
        this.playbackMode = playbackMode;
        rLottieDrawable.setPlaybackMode(playbackMode);
        RLottieDrawable rLottieDrawable2 = this.drawable;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.setAllowDecodeSingleFrame(true);
        }
        setImageDrawable(this.drawable);
    }
}
