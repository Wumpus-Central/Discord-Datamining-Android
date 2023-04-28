package co.discord.media_engine.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.facebook.react.uimanager.ViewProps;
import com.hammerandchisel.libdiscord.C5875R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.C9971q;
import p163j$.util.Spliterator;
import p426xf.C14081b;
import p426xf.C14099n;

@Metadata(m15074d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m15073d2 = {"Lco/discord/media_engine/internal/AssetManagement;", "", "ctx", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getCtx", "()Landroid/content/Context;", "cleanup", "", "copy", "dir", "Ljava/io/File;", "name", "", "ensureKrispModelsCopied", ViewProps.ENABLED, "", "android_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes.dex */
public final class AssetManagement {
    private final Context ctx;

    public AssetManagement(Context ctx) {
        C9971q.m14633g(ctx, "ctx");
        this.ctx = ctx;
    }

    private final void cleanup() {
        try {
            File file = new File(this.ctx.getFilesDir(), "thz");
            if (file.exists()) {
                C14099n.m1681i(file);
            }
        } catch (Exception e) {
            Log.e("DiscordKrisp", "Failed removing krisp model files: " + e.getMessage() + ": " + e);
        }
    }

    private final void copy(File file, String str) {
        AssetManager assets = this.ctx.getAssets();
        InputStream open = assets.open("thz/" + str);
        C9971q.m14634f(open, "ctx.assets.open(\"thz/\" + name)");
        FileOutputStream fileOutputStream = new FileOutputStream(new File(file, str));
        C14081b.m1716a(open, fileOutputStream, Spliterator.IMMUTABLE);
        open.close();
        fileOutputStream.close();
    }

    public final void ensureKrispModelsCopied(boolean z) {
        if (z) {
            try {
                File file = new File(this.ctx.getFilesDir(), "thz");
                String string = this.ctx.getString(C5875R.string.krisp_model_version);
                C9971q.m14634f(string, "ctx.getString(R.string.krisp_model_version)");
                if (!new File(file, string).exists()) {
                    cleanup();
                    File file2 = new File(this.ctx.getFilesDir(), "thz");
                    file2.mkdir();
                    File file3 = new File(file2, string);
                    file3.mkdir();
                    String[] list = this.ctx.getAssets().list("thz");
                    if (list == null) {
                        list = new String[0];
                    }
                    for (String file4 : list) {
                        C9971q.m14634f(file4, "file");
                        copy(file3, file4);
                    }
                }
            } catch (Exception e) {
                Log.e("DiscordKrisp", "Failed copying krisp model files: " + e.getMessage() + ": " + e);
                cleanup();
            }
        } else {
            cleanup();
        }
    }

    public final Context getCtx() {
        return this.ctx;
    }
}
