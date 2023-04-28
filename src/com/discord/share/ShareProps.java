package com.discord.share;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.p018os.C2436d;
import com.discord.share.intent.GetFileNameKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9906j;
import kotlin.collections.C9907k;
import kotlin.jvm.internal.C9971q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nf.C11098x;

@Metadata(m15074d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001c"}, m15073d2 = {"Lcom/discord/share/ShareProps;", "", "text", "", "attachments", "", "Lcom/discord/share/ShareProps$Attachment;", "targetChannelId", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getAttachments", "()Ljava/util/List;", "getTargetChannelId", "()Ljava/lang/String;", "getText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toString", "Attachment", "Companion", "share_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
/* loaded from: classes7.dex */
public final class ShareProps {
    public static final Companion Companion = new Companion(null);
    private final List<Attachment> attachments;
    private final String targetChannelId;
    private final String text;

    @Metadata(m15074d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, m15073d2 = {"Lcom/discord/share/ShareProps$Attachment;", "", "name", "", "uri", "mimeType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMimeType", "()Ljava/lang/String;", "getName", "getUri", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toBundle", "Landroid/os/Bundle;", "toString", "share_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes7.dex */
    public static final class Attachment {
        private final String mimeType;
        private final String name;
        private final String uri;

        public Attachment(String name, String uri, String str) {
            C9971q.m14633g(name, "name");
            C9971q.m14633g(uri, "uri");
            this.name = name;
            this.uri = uri;
            this.mimeType = str;
        }

        public static /* synthetic */ Attachment copy$default(Attachment attachment, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = attachment.name;
            }
            if ((i & 2) != 0) {
                str2 = attachment.uri;
            }
            if ((i & 4) != 0) {
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
            C9971q.m14633g(name, "name");
            C9971q.m14633g(uri, "uri");
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
            return C9971q.m14638b(this.name, attachment.name) && C9971q.m14638b(this.uri, attachment.uri) && C9971q.m14638b(this.mimeType, attachment.mimeType);
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
            return C2436d.m37746a(C11098x.m10921a("name", this.name), C11098x.m10921a("uri", this.uri), C11098x.m10921a("mimeType", this.mimeType));
        }

        public String toString() {
            String str = this.name;
            String str2 = this.uri;
            String str3 = this.mimeType;
            return "Attachment(name=" + str + ", uri=" + str2 + ", mimeType=" + str3 + ")";
        }
    }

    @Metadata(m15074d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\u00020\u0005H\u0002¨\u0006\u000b"}, m15073d2 = {"Lcom/discord/share/ShareProps$Companion;", "", "()V", "createShareProps", "Lcom/discord/share/ShareProps;", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "getUriExtras", "", "Landroid/net/Uri;", "share_release"}, m15072k = 1, m15071mv = {1, 8, 0}, m15069xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Uri> getUriExtras(Intent intent) {
            List<Uri> m;
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
            if (parcelableArrayListExtra != null) {
                return parcelableArrayListExtra;
            }
            m = C9906j.m14816m(intent.getParcelableExtra("android.intent.extra.STREAM"));
            return m;
        }

        public final ShareProps createShareProps(Intent intent, Context context) {
            int t;
            String str;
            C9971q.m14633g(intent, "<this>");
            C9971q.m14633g(context, "context");
            String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
            if (stringExtra == null) {
                stringExtra = "";
            }
            List<Uri> uriExtras = getUriExtras(intent);
            t = C9907k.m14809t(uriExtras, 10);
            ArrayList arrayList = new ArrayList(t);
            for (Uri uri : uriExtras) {
                ContentResolver contentResolver = context.getContentResolver();
                C9971q.m14634f(contentResolver, "context.contentResolver");
                String fileName = GetFileNameKt.getFileName(contentResolver, uri);
                String uri2 = uri.toString();
                C9971q.m14634f(uri2, "uri.toString()");
                arrayList.add(new Attachment(fileName, uri2, context.getContentResolver().getType(uri)));
            }
            if (Build.VERSION.SDK_INT >= 29) {
                str = intent.getStringExtra("android.intent.extra.shortcut.ID");
            } else {
                str = null;
            }
            return new ShareProps(stringExtra, arrayList, str);
        }
    }

    public ShareProps(String text, List<Attachment> attachments, String str) {
        C9971q.m14633g(text, "text");
        C9971q.m14633g(attachments, "attachments");
        this.text = text;
        this.attachments = attachments;
        this.targetChannelId = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShareProps copy$default(ShareProps shareProps, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareProps.text;
        }
        if ((i & 2) != 0) {
            list = shareProps.attachments;
        }
        if ((i & 4) != 0) {
            str2 = shareProps.targetChannelId;
        }
        return shareProps.copy(str, list, str2);
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

    public final ShareProps copy(String text, List<Attachment> attachments, String str) {
        C9971q.m14633g(text, "text");
        C9971q.m14633g(attachments, "attachments");
        return new ShareProps(text, attachments, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareProps)) {
            return false;
        }
        ShareProps shareProps = (ShareProps) obj;
        return C9971q.m14638b(this.text, shareProps.text) && C9971q.m14638b(this.attachments, shareProps.attachments) && C9971q.m14638b(this.targetChannelId, shareProps.targetChannelId);
    }

    public final List<Attachment> getAttachments() {
        return this.attachments;
    }

    public final String getTargetChannelId() {
        return this.targetChannelId;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = ((this.text.hashCode() * 31) + this.attachments.hashCode()) * 31;
        String str = this.targetChannelId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final Bundle toBundle() {
        int t;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C11098x.m10921a("text", this.text);
        List<Attachment> list = this.attachments;
        t = C9907k.m14809t(list, 10);
        ArrayList arrayList = new ArrayList(t);
        for (Attachment attachment : list) {
            arrayList.add(attachment.toBundle());
        }
        pairArr[1] = C11098x.m10921a("attachments", arrayList.toArray(new Bundle[0]));
        pairArr[2] = C11098x.m10921a("targetChannelId", this.targetChannelId);
        return C2436d.m37746a(pairArr);
    }

    public String toString() {
        String str = this.text;
        List<Attachment> list = this.attachments;
        String str2 = this.targetChannelId;
        return "ShareProps(text=" + str + ", attachments=" + list + ", targetChannelId=" + str2 + ")";
    }
}
