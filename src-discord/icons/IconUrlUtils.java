package com.discord.icons;

import android.content.Context;
import com.discord.hosts.Hosts;
import com.discord.icons.media.MediaExtensionKt;
import com.discord.icons.media.MediaProxy;
import com.discord.primitives.ApplicationId;
import com.discord.primitives.ChannelId;
import com.discord.primitives.GuildId;
import com.discord.primitives.UserId;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.snowflake.SnowflakeUtils;
import kg.s;
import kg.t;
import kotlin.Metadata;
import kotlin.jvm.internal.q;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\nJ'\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u0010JC\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019JI\u0010\u001a\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001fJG\u0010 \u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u001b2\b\u0010#\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'JQ\u0010(\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010)\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001d\u001a\u00020\u000f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b+\u0010,J&\u0010-\u001a\u00020.2\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, d2 = {"Lcom/discord/icons/IconUrlUtils;", "", "()V", "getApplicationIcon", "", "applicationId", "Lcom/discord/primitives/ApplicationId;", "imageId", "size", "", "getApplicationIcon-weIltyw", "getCustomEmojiUrl", "emojiId", "", "animate", "", "(JZLjava/lang/Integer;)Ljava/lang/String;", "getForChannel", "context", "Landroid/content/Context;", "id", "Lcom/discord/primitives/ChannelId;", "icon", "isGroupDM", "getForChannel-JYSGpIY", "(Landroid/content/Context;Lcom/discord/primitives/ChannelId;Ljava/lang/String;ZLjava/lang/Integer;)Ljava/lang/String;", "getForGuild", "Lcom/discord/primitives/GuildId;", "defaultIcon", "animated", "getForGuild-14CJxO4", "(Lcom/discord/primitives/GuildId;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;)Ljava/lang/String;", "getForGuildMember", "guildMemberAvatar", "guildId", "userId", "Lcom/discord/primitives/UserId;", "sizePx", "getForGuildMember-2tNb6hE", "(Ljava/lang/String;Lcom/discord/primitives/GuildId;Lcom/discord/primitives/UserId;Ljava/lang/Integer;Z)Ljava/lang/String;", "getForUser", "userAvatar", "discriminator", "getForUser-_fRzTXg", "(Landroid/content/Context;Lcom/discord/primitives/UserId;Ljava/lang/String;Ljava/lang/Integer;ZLjava/lang/Integer;)Ljava/lang/String;", "init", "", "cdnHost", "apiHost", "icons_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IconUrlUtils {
    public static final IconUrlUtils INSTANCE = new IconUrlUtils();

    private IconUrlUtils() {
    }

    /* renamed from: getApplicationIcon-weIltyw$default  reason: not valid java name */
    public static /* synthetic */ String m438getApplicationIconweIltyw$default(IconUrlUtils iconUrlUtils, ApplicationId applicationId, String str, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 160;
        }
        return iconUrlUtils.m443getApplicationIconweIltyw(applicationId, str, i10);
    }

    public static /* synthetic */ String getCustomEmojiUrl$default(IconUrlUtils iconUrlUtils, long j10, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            num = null;
        }
        return iconUrlUtils.getCustomEmojiUrl(j10, z10, num);
    }

    /* renamed from: getForChannel-JYSGpIY$default  reason: not valid java name */
    public static /* synthetic */ String m439getForChannelJYSGpIY$default(IconUrlUtils iconUrlUtils, Context context, ChannelId channelId, String str, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            num = null;
        }
        return iconUrlUtils.m444getForChannelJYSGpIY(context, channelId, str, z10, num);
    }

    /* renamed from: getForGuild-14CJxO4$default  reason: not valid java name */
    public static /* synthetic */ String m440getForGuild14CJxO4$default(IconUrlUtils iconUrlUtils, GuildId guildId, String str, String str2, boolean z10, Integer num, int i10, Object obj) {
        String str3 = (i10 & 4) != 0 ? null : str2;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return iconUrlUtils.m445getForGuild14CJxO4(guildId, str, str3, z10, (i10 & 16) != 0 ? null : num);
    }

    /* renamed from: getForGuildMember-2tNb6hE$default  reason: not valid java name */
    public static /* synthetic */ String m441getForGuildMember2tNb6hE$default(IconUrlUtils iconUrlUtils, String str, GuildId guildId, UserId userId, Integer num, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            z10 = false;
        }
        return iconUrlUtils.m446getForGuildMember2tNb6hE(str, guildId, userId, num, z10);
    }

    public static /* synthetic */ void init$default(IconUrlUtils iconUrlUtils, Context context, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        iconUrlUtils.init(context, str, str2);
    }

    /* renamed from: getApplicationIcon-weIltyw  reason: not valid java name */
    public final String m443getApplicationIconweIltyw(ApplicationId applicationId, String str, int i10) {
        MediaProxy mediaProxy = MediaProxy.INSTANCE;
        String cdn = Hosts.INSTANCE.getCDN();
        String mediaExtension$default = MediaExtensionKt.getMediaExtension$default(false, null, 2, null);
        return MediaProxy.withSize$default(mediaProxy, cdn + "/app-icons/" + applicationId + "/" + str + "." + mediaExtension$default, Integer.valueOf(i10), null, 4, null);
    }

    public final String getCustomEmojiUrl(long j10, boolean z10, Integer num) {
        MediaProxy mediaProxy = MediaProxy.INSTANCE;
        String cdn = Hosts.INSTANCE.getCDN();
        String mediaExtension$default = MediaExtensionKt.getMediaExtension$default(z10, null, 2, null);
        return MediaProxy.withSize$default(mediaProxy, cdn + "/emojis/" + j10 + "." + mediaExtension$default, num, null, 4, null);
    }

    /* renamed from: getForChannel-JYSGpIY  reason: not valid java name */
    public final String m444getForChannelJYSGpIY(Context context, ChannelId channelId, String str, boolean z10, Integer num) {
        boolean z11;
        Object obj;
        q.g(context, "context");
        if (channelId == null) {
            return "";
        }
        if (str == null || str.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            try {
                s.a aVar = s.f21863l;
                obj = s.b(MediaProxy.withSize$default(MediaProxy.INSTANCE, Hosts.INSTANCE.getCDN() + "/channel-icons/" + channelId + "/" + str + "." + MediaExtensionKt.getMediaExtension$default(false, null, 2, null), num, null, 4, null));
            } catch (Throwable th2) {
                s.a aVar2 = s.f21863l;
                obj = s.b(t.a(th2));
            }
            if (s.e(obj) != null) {
                obj = Hosts.INSTANCE.getAPI() + "/channels/" + channelId + "/icons/" + str + ".jpg";
            }
            return (String) obj;
        } else if (!z10) {
            return "";
        } else {
            switch ((int) (SnowflakeUtils.INSTANCE.toTimestamp(channelId) % 8)) {
                case 1:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup1.getUri(context));
                case 2:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup2.getUri(context));
                case 3:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup3.getUri(context));
                case 4:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup4.getUri(context));
                case 5:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup5.getUri(context));
                case 6:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup6.getUri(context));
                case 7:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup7.getUri(context));
                default:
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultGroup0.getUri(context));
            }
        }
    }

    /* renamed from: getForGuild-14CJxO4  reason: not valid java name */
    public final String m445getForGuild14CJxO4(GuildId guildId, String str, String str2, boolean z10, Integer num) {
        boolean z11;
        Object obj;
        if (str == null || str.length() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11 && guildId != null) {
            MediaProxy mediaProxy = MediaProxy.INSTANCE;
            try {
                s.a aVar = s.f21863l;
                obj = s.b(Hosts.INSTANCE.getCDN() + "/icons/" + guildId + "/" + str + "." + MediaExtensionKt.getMediaExtension(z10, str));
            } catch (Throwable th2) {
                s.a aVar2 = s.f21863l;
                obj = s.b(t.a(th2));
            }
            if (s.e(obj) != null) {
                obj = Hosts.INSTANCE.getAPI() + "/guilds/" + guildId + "/icons/" + str + ".jpg";
            }
            return MediaProxy.withSize$default(mediaProxy, (String) obj, num, null, 4, null);
        } else if (str2 == null) {
            return "";
        } else {
            return str2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /* renamed from: getForGuildMember-2tNb6hE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m446getForGuildMember2tNb6hE(java.lang.String r9, com.discord.primitives.GuildId r10, com.discord.primitives.UserId r11, java.lang.Integer r12, boolean r13) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            if (r9 == 0) goto L_0x000d
            boolean r2 = oj.l.w(r9)
            if (r2 == 0) goto L_0x000b
            goto L_0x000d
        L_0x000b:
            r2 = r0
            goto L_0x000e
        L_0x000d:
            r2 = r1
        L_0x000e:
            if (r2 != 0) goto L_0x0072
            if (r10 == 0) goto L_0x001e
            long r2 = r10.m568unboximpl()
            boolean r2 = com.discord.primitives.GuildId.m565isValidimpl(r2)
            if (r2 != r1) goto L_0x001e
            r2 = r1
            goto L_0x001f
        L_0x001e:
            r2 = r0
        L_0x001f:
            if (r2 == 0) goto L_0x0072
            if (r11 == 0) goto L_0x002e
            long r2 = r11.m619unboximpl()
            boolean r2 = com.discord.primitives.UserId.m616isValidimpl(r2)
            if (r2 != r1) goto L_0x002e
            r0 = r1
        L_0x002e:
            if (r0 != 0) goto L_0x0031
            goto L_0x0072
        L_0x0031:
            java.lang.String r13 = com.discord.icons.media.MediaExtensionKt.getMediaExtension(r13, r9)
            com.discord.hosts.Hosts r0 = com.discord.hosts.Hosts.INSTANCE
            java.lang.String r0 = r0.getCDN()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "/guilds/"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r10 = "/users/"
            r1.append(r10)
            r1.append(r11)
            java.lang.String r10 = "/avatars/"
            r1.append(r10)
            r1.append(r9)
            java.lang.String r9 = "."
            r1.append(r9)
            r1.append(r13)
            java.lang.String r3 = r1.toString()
            com.discord.icons.media.MediaProxy r2 = com.discord.icons.media.MediaProxy.INSTANCE
            r5 = 0
            r6 = 4
            r7 = 0
            r4 = r12
            java.lang.String r9 = com.discord.icons.media.MediaProxy.withSize$default(r2, r3, r4, r5, r6, r7)
            return r9
        L_0x0072:
            java.lang.String r9 = ""
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.icons.IconUrlUtils.m446getForGuildMember2tNb6hE(java.lang.String, com.discord.primitives.GuildId, com.discord.primitives.UserId, java.lang.Integer, boolean):java.lang.String");
    }

    /* renamed from: getForUser-_fRzTXg  reason: not valid java name */
    public final String m447getForUser_fRzTXg(Context context, UserId userId, String str, Integer num, boolean z10, Integer num2) {
        Object obj;
        q.g(context, "context");
        if (userId != null) {
            if (UserId.m613equalsimpl(UserId.m611constructorimpl(-1L), userId)) {
                if (str == null) {
                    return "";
                }
                return str;
            } else if (str != null) {
                try {
                    s.a aVar = s.f21863l;
                    String mediaExtension = MediaExtensionKt.getMediaExtension(z10, str);
                    obj = s.b(MediaProxy.withSize$default(MediaProxy.INSTANCE, Hosts.INSTANCE.getCDN() + "/avatars/" + userId + "/" + str + "." + mediaExtension, num2, null, 4, null));
                } catch (Throwable th2) {
                    s.a aVar2 = s.f21863l;
                    obj = s.b(t.a(th2));
                }
                if (s.e(obj) != null) {
                    obj = Hosts.INSTANCE.getAPI() + "/users/" + userId + "/avatars/" + str + ".jpg";
                }
                return (String) obj;
            } else if (num != null) {
                int intValue = num.intValue() % 5;
                if (intValue == 1) {
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar1.getUri(context));
                }
                if (intValue == 2) {
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar2.getUri(context));
                }
                if (intValue == 3) {
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar3.getUri(context));
                }
                if (intValue != 4) {
                    return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar0.getUri(context));
                }
                return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar4.getUri(context));
            }
        }
        return ReactAssetUtilsKt.getReactImageUrl(context, ReactAsset.DefaultAvatar0.getUri(context));
    }

    public final void init(Context context, String str, String str2) {
        q.g(context, "context");
        Hosts.INSTANCE.init(context, str2, str);
    }
}
