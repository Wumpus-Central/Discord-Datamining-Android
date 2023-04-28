.class public final Lcom/discord/MainApplication;
.super Lcom/discord/tti_manager/TTILoggingApplication;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/ReactApplication;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0008\u0010\u0006\u001a\u00020\u0005H\u0016J\u0008\u0010\u0007\u001a\u00020\u0008H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/discord/MainApplication;",
        "Lcom/discord/tti_manager/TTILoggingApplication;",
        "Lcom/facebook/react/ReactApplication;",
        "()V",
        "host",
        "Lcom/discord/bridge/DCDReactNativeHost;",
        "getReactNativeHost",
        "initialize",
        "",
        "app_canaryRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final host:Lcom/discord/bridge/DCDReactNativeHost;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/discord/tti_manager/TTILoggingApplication;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/discord/bridge/DCDReactNativeHost;

    .line 5
    .line 6
    invoke-direct {v0, p0}, Lcom/discord/bridge/DCDReactNativeHost;-><init>(Landroid/app/Application;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/discord/MainApplication;->host:Lcom/discord/bridge/DCDReactNativeHost;

    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method


# virtual methods
.method public getReactNativeHost()Lcom/discord/bridge/DCDReactNativeHost;
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/discord/MainApplication;->host:Lcom/discord/bridge/DCDReactNativeHost;

    return-object v0
.end method

.method public bridge synthetic getReactNativeHost()Lcom/facebook/react/ReactNativeHost;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/discord/MainApplication;->getReactNativeHost()Lcom/discord/bridge/DCDReactNativeHost;

    move-result-object v0

    return-object v0
.end method

.method public initialize()V
    .locals 11

    .line 1
    sget-object v8, Lcom/discord/tti_manager/TTIMetrics;->INSTANCE:Lcom/discord/tti_manager/TTIMetrics;

    .line 2
    .line 3
    const-string v1, "Start MainApplication.initialize()"

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    const/16 v6, 0xe

    .line 10
    .line 11
    const/4 v7, 0x0

    .line 12
    move-object v0, v8

    .line 13
    invoke-static/range {v0 .. v7}, Lcom/discord/tti_manager/TTIMetrics;->record$default(Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/discord/tti_manager/react/ReactMarkerListener;->INSTANCE:Lcom/discord/tti_manager/react/ReactMarkerListener;

    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/discord/tti_manager/react/ReactMarkerListener;->start()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lcom/discord/cache/CacheModule;->Companion:Lcom/discord/cache/CacheModule$Companion;

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Lcom/discord/cache/CacheModule$Companion;->quickInitCache(Landroid/content/Context;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    const/4 v9, 0x0

    .line 31
    invoke-virtual {v0, p0, v9}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->allowRTL(Landroid/content/Context;Z)V

    .line 32
    .line 33
    .line 34
    const-string v1, "I18nUtil.allowRtl()"

    .line 35
    .line 36
    move-object v0, v8

    .line 37
    invoke-static/range {v0 .. v7}, Lcom/discord/tti_manager/TTIMetrics;->record$default(Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    sget-object v10, Lcom/discord/bundle_updater/BundleUpdater;->Companion:Lcom/discord/bundle_updater/BundleUpdater$Companion;

    .line 41
    .line 42
    invoke-virtual {v10, p0}, Lcom/discord/bundle_updater/BundleUpdater$Companion;->init(Landroid/content/Context;)V

    .line 43
    .line 44
    .line 45
    const-string v1, "BundlerUpdater.init()"

    .line 46
    .line 47
    invoke-static/range {v0 .. v7}, Lcom/discord/tti_manager/TTIMetrics;->record$default(Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v0, Lcom/discord/client_info/ClientInfo;->INSTANCE:Lcom/discord/client_info/ClientInfo;

    .line 51
    .line 52
    const-string v2, "177.6"

    .line 53
    .line 54
    const v3, 0x2b436

    .line 55
    .line 56
    .line 57
    const-string v4, "canary"

    .line 58
    .line 59
    const-string v5, "release"

    .line 60
    .line 61
    invoke-virtual {v10}, Lcom/discord/bundle_updater/BundleUpdater$Companion;->instance()Lcom/discord/bundle_updater/BundleUpdater;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Lcom/discord/bundle_updater/BundleUpdater;->getManifestETag()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v10}, Lcom/discord/bundle_updater/BundleUpdater$Companion;->instance()Lcom/discord/bundle_updater/BundleUpdater;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, Lcom/discord/bundle_updater/BundleUpdater;->getOtaVersion()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    move-object v1, p0

    .line 78
    invoke-virtual/range {v0 .. v7}, Lcom/discord/client_info/ClientInfo;->init(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v1, "ClientInfo.init()"

    .line 82
    .line 83
    const-wide/16 v2, 0x0

    .line 84
    .line 85
    const/4 v4, 0x0

    .line 86
    const/4 v5, 0x0

    .line 87
    const/16 v6, 0xe

    .line 88
    .line 89
    const/4 v7, 0x0

    .line 90
    move-object v0, v8

    .line 91
    invoke-static/range {v0 .. v7}, Lcom/discord/tti_manager/TTIMetrics;->record$default(Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object v0, Lcom/discord/media_player/CacheDataSourceFactory;->Companion:Lcom/discord/media_player/CacheDataSourceFactory$Companion;

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Lcom/discord/media_player/CacheDataSourceFactory$Companion;->init(Landroid/content/Context;)V

    .line 97
    .line 98
    .line 99
    const-string v1, "CacheDataSourceFactory.init()"

    .line 100
    .line 101
    move-object v0, v8

    .line 102
    invoke-static/range {v0 .. v7}, Lcom/discord/tti_manager/TTIMetrics;->record$default(Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    sget-object v0, Lcom/discord/crash_reporting/CrashReporting;->INSTANCE:Lcom/discord/crash_reporting/CrashReporting;

    .line 106
    .line 107
    invoke-virtual {v0, p0}, Lcom/discord/crash_reporting/CrashReporting;->init(Landroid/content/Context;)V

    .line 108
    .line 109
    .line 110
    const-string v1, "CrashReporting.init()"

    .line 111
    .line 112
    move-object v0, v8

    .line 113
    invoke-static/range {v0 .. v7}, Lcom/discord/tti_manager/TTIMetrics;->record$default(Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    sget-object v0, Lcom/discord/crash_reporting/PerformanceTracing;->Companion:Lcom/discord/crash_reporting/PerformanceTracing$Companion;

    .line 117
    .line 118
    invoke-virtual {v0}, Lcom/discord/crash_reporting/PerformanceTracing$Companion;->get()Lcom/discord/crash_reporting/PerformanceTracing;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {v0}, Lcom/discord/crash_reporting/PerformanceTracing;->start()V

    .line 123
    .line 124
    .line 125
    sget-object v0, Lcom/discord/utils/SoLoaderUtils;->INSTANCE:Lcom/discord/utils/SoLoaderUtils;

    .line 126
    .line 127
    const/4 v1, 0x2

    .line 128
    const/4 v2, 0x0

    .line 129
    invoke-static {v0, p0, v9, v1, v2}, Lcom/discord/utils/SoLoaderUtils;->init$default(Lcom/discord/utils/SoLoaderUtils;Landroid/content/Context;ZILjava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    const-string v1, "SoLoaderUtils.init()"

    .line 133
    .line 134
    const-wide/16 v2, 0x0

    .line 135
    .line 136
    move-object v0, v8

    .line 137
    invoke-static/range {v0 .. v7}, Lcom/discord/tti_manager/TTIMetrics;->record$default(Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    sget-object v0, Lcom/discord/flipper/FlipperUtils;->INSTANCE:Lcom/discord/flipper/FlipperUtils;

    .line 141
    .line 142
    invoke-virtual {v0, p0}, Lcom/discord/flipper/FlipperUtils;->init(Landroid/content/Context;)V

    .line 143
    .line 144
    .line 145
    sget-object v0, Lcom/discord/sticker/sticker_types/RLottieUtils;->INSTANCE:Lcom/discord/sticker/sticker_types/RLottieUtils;

    .line 146
    .line 147
    invoke-virtual {v0}, Lcom/discord/sticker/sticker_types/RLottieUtils;->init()V

    .line 148
    .line 149
    .line 150
    sget-object v0, Lcom/discord/react/FontManager;->INSTANCE:Lcom/discord/react/FontManager;

    .line 151
    .line 152
    invoke-virtual {v0, p0}, Lcom/discord/react/FontManager;->init(Landroid/content/Context;)V

    .line 153
    .line 154
    .line 155
    sget-object v0, Lcom/discord/react_fork_overrides/ReactForkOverrides;->INSTANCE:Lcom/discord/react_fork_overrides/ReactForkOverrides;

    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/discord/react_fork_overrides/ReactForkOverrides;->init()V

    .line 158
    .line 159
    .line 160
    sget-object v0, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->INSTANCE:Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;

    .line 161
    .line 162
    invoke-virtual {v0, p0}, Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerManager;->init(Landroid/content/Context;)V

    .line 163
    .line 164
    .line 165
    const-string v1, "Finish MainApplication.initialize()"

    .line 166
    .line 167
    move-object v0, v8

    .line 168
    invoke-static/range {v0 .. v7}, Lcom/discord/tti_manager/TTIMetrics;->record$default(Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V

    .line 169
    .line 170
    .line 171
    iget-object v0, p0, Lcom/discord/MainApplication;->host:Lcom/discord/bridge/DCDReactNativeHost;

    .line 172
    .line 173
    invoke-virtual {v0}, Lcom/facebook/react/ReactNativeHost;->getReactInstanceManager()Lcom/facebook/react/ReactInstanceManager;

    .line 174
    .line 175
    .line 176
    return-void
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
.end method
