package com.discord.share;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.b;
import androidx.core.os.e;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.share.intent.GetFileNameKt;
import com.discord.shortcuts.ShortcutData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kf.x;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.j;
import kotlin.collections.k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0006\u0010\u001a\u001a\u00020\u001bJ\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/discord/share/ShareProps;", "", "text", "", "attachments", "", "Lcom/discord/share/ShareProps$Attachment;", "targetChannelId", "targetUserId", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAttachments", "()Ljava/util/List;", "getTargetChannelId", "()Ljava/lang/String;", "getTargetUserId", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toString", "Attachment", "Companion", "share_release"}, k = 1, mv = {1, 8, 0}, xi = 48)

public final class ShareProps {
    public static final Companion Companion = new Companion(null);
    private final List<Attachment> attachments;
    private final String targetChannelId;
    private final String targetUserId;
    private final String text;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/discord/share/ShareProps$Attachment;", "", ZeroconfModule.KEY_SERVICE_NAME, "", "uri", "mimeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMimeType", "()Ljava/lang/String;", "getName", "getUri", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toString", "share_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Attachment {
        private final String mimeType;
        private final String name;
        private final String uri;

        public Attachment(String name, String uri, String str) {
            q.h(name, "name");
            q.h(uri, "uri");
            this.name = name;
            this.uri = uri;
            this.mimeType = str;
        }

        public static  Attachment copy$default(Attachment attachment, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = attachment.name;
            }
            if ((i10 & 2) != 0) {
                str2 = attachment.uri;
            }
            if ((i10 & 4) != 0) {
                str3 = attachment.mimeType;
            }
            return attachment.copy(str, str2, str3);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.uri;
        }

        public final String component3() {
            return this.mimeType;
        }

        public final Attachment copy(String name, String uri, String str) {
            q.h(name, "name");
            q.h(uri, "uri");
            return new Attachment(name, uri, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) obj;
            return q.c(this.name, attachment.name) && q.c(this.uri, attachment.uri) && q.c(this.mimeType, attachment.mimeType);
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public final String getName() {
            return this.name;
        }

        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            int hashCode = ((this.name.hashCode() * 31) + this.uri.hashCode()) * 31;
            String str = this.mimeType;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final Bundle toBundle() {
            return e.a(x.a(ZeroconfModule.KEY_SERVICE_NAME, this.name), x.a("uri", this.uri), x.a("mimeType", this.mimeType));
        }

        public String toString() {
            String str = this.name;
            String str2 = this.uri;
            String str3 = this.mimeType;
            return "Attachment(name=" + str + ", uri=" + str2 + ", mimeType=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"Lcom/discord/share/ShareProps$Companion;", "", "()V", "createShareProps", "Lcom/discord/share/ShareProps;", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "getUriExtras", "", "Landroid/net/Uri;", "share_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    
    public static final class Companion {
        private Companion() {
        }

        public  Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Uri> getUriExtras(Intent intent) {
            List<Uri> l10;
            ArrayList a10 = androidx.core.content.e.a(intent, "android.intent.extra.STREAM", Uri.class);
            if (a10 != null) {
                return a10;
            }
            l10 = j.l((Parcelable) androidx.core.content.e.b(intent, "android.intent.extra.STREAM", Uri.class));
            return l10;
        }

        public final ShareProps createShareProps(Intent intent, Context context) {
            String str;
            int s10;
            Object obj;
            Intent h10;
            ShortcutData shortcutIntentData;
            Map<String, String> data;
            q.h(intent, "<this>");
            q.h(context, "context");
            String str2 = null;
            if (Build.VERSION.SDK_INT >= 29) {
                str = intent.getStringExtra("android.intent.extra.shortcut.ID");
            } else {
                str = null;
            }
            if (str != null) {
                List<ShortcutInfoCompat> f10 = b.f(context, 10);
                q.g(f10, "getShortcuts(\n          …YNAMIC,\n                )");
                Iterator<T> it = f10.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (q.c(((ShortcutInfoCompat) obj).g(), str)) {
                        break;
                    }
                }
                ShortcutInfoCompat shortcutInfoCompat = (ShortcutInfoCompat) obj;
                if (!(shortcutInfoCompat == null || (h10 = shortcutInfoCompat.h()) == null || (shortcutIntentData = ShortcutData.Companion.getShortcutIntentData(h10)) == null || (data = shortcutIntentData.getData()) == null)) {
                    str2 = data.get("receiving_user_id");
                }
            }
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            if (stringExtra == null) {
                stringExtra = "";
            }
            List<Uri> uriExtras = getUriExtras(intent);
            s10 = k.s(uriExtras, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (Uri uri : uriExtras) {
                ContentResolver contentResolver = context.getContentResolver();
                q.g(contentResolver, "context.contentResolver");
                String fileName = GetFileNameKt.getFileName(contentResolver, uri);
                String uri2 = uri.toString();
                q.g(uri2, "uri.toString()");
                arrayList.add(new Attachment(fileName, uri2, context.getContentResolver().getType(uri)));
            }
            return new ShareProps(stringExtra, arrayList, str, str2);
        }
    }

    public ShareProps(String text, List<Attachment> attachments, String str, String str2) {
        q.h(text, "text");
        q.h(attachments, "attachments");
        this.text = text;
        this.attachments = attachments;
        this.targetChannelId = str;
        this.targetUserId = str2;
    }

    
    public static  ShareProps copy$default(ShareProps shareProps, String str, List list, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = shareProps.text;
        }
        if ((i10 & 2) != 0) {
            list = shareProps.attachments;
        }
        if ((i10 & 4) != 0) {
            str2 = shareProps.targetChannelId;
        }
        if ((i10 & 8) != 0) {
            str3 = shareProps.targetUserId;
        }
        return shareProps.copy(str, list, str2, str3);
    }

    public final String component1() {
        return this.text;
    }

    public final List<Attachment> component2() {
        return this.attachments;
    }

    public final String component3() {
        return this.targetChannelId;
    }

    public final String component4() {
        return this.targetUserId;
    }

    public final ShareProps copy(String text, List<Attachment> attachments, String str, String str2) {
        q.h(text, "text");
        q.h(attachments, "attachments");
        return new ShareProps(text, attachments, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareProps)) {
            return false;
        }
        ShareProps shareProps = (ShareProps) obj;
        return q.c(this.text, shareProps.text) && q.c(this.attachments, shareProps.attachments) && q.c(this.targetChannelId, shareProps.targetChannelId) && q.c(this.targetUserId, shareProps.targetUserId);
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final String getTargetChannelId() {
        return this.targetChannelId;
    }

    public final String getTargetUserId() {
        return this.targetUserId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = ((this.text.hashCode() * 31) + this.attachments.hashCode()) * 31;
        String str = this.targetChannelId;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.targetUserId;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 + i10;
    }

    public final Bundle toBundle() {
        int s10;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = x.a("text", this.text);
        List<Attachment> list = this.attachments;
        s10 = k.s(list, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Attachment attachment : list) {
            arrayList.add(attachment.toBundle());
        }
        pairArr[1] = x.a("attachments", arrayList.toArray(new Bundle[0]));
        pairArr[2] = x.a("targetChannelId", this.targetChannelId);
        pairArr[3] = x.a("targetUserId", this.targetUserId);
        return e.a(pairArr);
    }

    public String toString() {
        String str = this.text;
        List<Attachment> list = this.attachments;
        String str2 = this.targetChannelId;
        String str3 = this.targetUserId;
        return "ShareProps(text=" + str + ", attachments=" + list + ", targetChannelId=" + str2 + ", targetUserId=" + str3 + ")";
    }
}
