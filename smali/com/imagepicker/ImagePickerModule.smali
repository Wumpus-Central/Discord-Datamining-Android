.class public Lcom/imagepicker/ImagePickerModule;
.super Lcom/facebook/react/bridge/ReactContextBaseJavaModule;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/react/bridge/ActivityEventListener;


# annotations
.annotation runtime Lcom/facebook/react/module/annotations/ReactModule;
    name = "ImagePickerManager"
.end annotation


# static fields
.field static final NAME:Ljava/lang/String; = "ImagePickerManager"

.field public static final REQUEST_LAUNCH_IMAGE_CAPTURE:I = 0x32c9

.field public static final REQUEST_LAUNCH_LIBRARY:I = 0x32cb

.field public static final REQUEST_LAUNCH_VIDEO_CAPTURE:I = 0x32ca


# instance fields
.field callback:Lcom/facebook/react/bridge/Callback;

.field cameraCaptureURI:Landroid/net/Uri;

.field private fileUri:Landroid/net/Uri;

.field identifier:Ljava/util/UUID;

.field options:Lcom/imagepicker/e;

.field final reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/imagepicker/ImagePickerModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 5
    .line 6
    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addActivityEventListener(Lcom/facebook/react/bridge/ActivityEventListener;)V

    .line 7
    .line 8
    .line 9
    return-void
    .line 10
    .line 11
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
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "ImagePickerManager"

    return-object v0
.end method

.method public launchCamera(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 7
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/imagepicker/ImagePickerModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {v0}, Lcom/imagepicker/f;->w(Landroid/content/Context;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_0

    new-array p1, v3, [Ljava/lang/Object;

    .line 2
    sget-object v0, Lcom/imagepicker/f;->b:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/imagepicker/f;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v0

    aput-object v0, p1, v2

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_1

    new-array p1, v3, [Ljava/lang/Object;

    .line 4
    sget-object v0, Lcom/imagepicker/f;->d:Ljava/lang/String;

    const-string v1, "Activity error"

    invoke-static {v0, v1}, Lcom/imagepicker/f;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v0

    aput-object v0, p1, v2

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void

    .line 5
    :cond_1
    iget-object v4, p0, Lcom/imagepicker/ImagePickerModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {v4, v0}, Lcom/imagepicker/f;->x(Landroid/content/Context;Landroid/app/Activity;)Z

    move-result v4

    if-nez v4, :cond_2

    new-array p1, v3, [Ljava/lang/Object;

    .line 6
    sget-object v0, Lcom/imagepicker/f;->d:Ljava/lang/String;

    sget-object v1, Lcom/imagepicker/f;->i:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/imagepicker/f;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v0

    aput-object v0, p1, v2

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    return-void

    .line 7
    :cond_2
    iput-object p2, p0, Lcom/imagepicker/ImagePickerModule;->callback:Lcom/facebook/react/bridge/Callback;

    .line 8
    new-instance v4, Lcom/imagepicker/e;

    invoke-direct {v4, p1}, Lcom/imagepicker/e;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    iput-object v4, p0, Lcom/imagepicker/ImagePickerModule;->options:Lcom/imagepicker/e;

    .line 9
    iget-object p1, v4, Lcom/imagepicker/e;->h:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1c

    if-gt p1, v4, :cond_3

    invoke-static {v0}, Lcom/imagepicker/f;->v(Landroid/app/Activity;)Z

    move-result p1

    if-nez p1, :cond_3

    new-array p1, v3, [Ljava/lang/Object;

    .line 10
    sget-object v0, Lcom/imagepicker/f;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/imagepicker/f;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v0

    aput-object v0, p1, v2

    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 11
    iput-object v1, p0, Lcom/imagepicker/ImagePickerModule;->callback:Lcom/facebook/react/bridge/Callback;

    return-void

    .line 12
    :cond_3
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    iput-object p1, p0, Lcom/imagepicker/ImagePickerModule;->identifier:Ljava/util/UUID;

    .line 13
    iget-object p1, p0, Lcom/imagepicker/ImagePickerModule;->options:Lcom/imagepicker/e;

    iget-object p1, p1, Lcom/imagepicker/e;->k:Ljava/lang/String;

    sget-object v4, Lcom/imagepicker/f;->f:Ljava/lang/String;

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 14
    new-instance p1, Landroid/content/Intent;

    const-string v4, "android.media.action.VIDEO_CAPTURE"

    invoke-direct {p1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 15
    iget-object v4, p0, Lcom/imagepicker/ImagePickerModule;->options:Lcom/imagepicker/e;

    iget v4, v4, Lcom/imagepicker/e;->d:I

    const-string v5, "android.intent.extra.videoQuality"

    invoke-virtual {p1, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 16
    iget-object v4, p0, Lcom/imagepicker/ImagePickerModule;->options:Lcom/imagepicker/e;

    iget v4, v4, Lcom/imagepicker/e;->i:I

    if-lez v4, :cond_4

    const-string v5, "android.intent.extra.durationLimit"

    .line 17
    invoke-virtual {p1, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 18
    :cond_4
    iget-object v4, p0, Lcom/imagepicker/ImagePickerModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    iget-object v5, p0, Lcom/imagepicker/ImagePickerModule;->identifier:Ljava/util/UUID;

    const-string v6, "mp4"

    invoke-static {v4, v5, v6}, Lcom/imagepicker/f;->c(Landroid/content/Context;Ljava/util/UUID;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 19
    iget-object v5, p0, Lcom/imagepicker/ImagePickerModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {v4, v5}, Lcom/imagepicker/f;->d(Ljava/io/File;Landroid/content/Context;)Landroid/net/Uri;

    move-result-object v5

    iput-object v5, p0, Lcom/imagepicker/ImagePickerModule;->cameraCaptureURI:Landroid/net/Uri;

    const/16 v5, 0x32ca

    goto :goto_0

    .line 20
    :cond_5
    new-instance p1, Landroid/content/Intent;

    const-string v4, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {p1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 21
    iget-object v4, p0, Lcom/imagepicker/ImagePickerModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    iget-object v5, p0, Lcom/imagepicker/ImagePickerModule;->identifier:Ljava/util/UUID;

    const-string v6, "jpg"

    invoke-static {v4, v5, v6}, Lcom/imagepicker/f;->c(Landroid/content/Context;Ljava/util/UUID;Ljava/lang/String;)Ljava/io/File;

    move-result-object v4

    .line 22
    iget-object v5, p0, Lcom/imagepicker/ImagePickerModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    invoke-static {v4, v5}, Lcom/imagepicker/f;->d(Ljava/io/File;Landroid/content/Context;)Landroid/net/Uri;

    move-result-object v5

    iput-object v5, p0, Lcom/imagepicker/ImagePickerModule;->cameraCaptureURI:Landroid/net/Uri;

    const/16 v5, 0x32c9

    .line 23
    :goto_0
    iget-object v6, p0, Lcom/imagepicker/ImagePickerModule;->options:Lcom/imagepicker/e;

    iget-object v6, v6, Lcom/imagepicker/e;->j:Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_6

    .line 24
    invoke-static {p1}, Lcom/imagepicker/f;->E(Landroid/content/Intent;)V

    .line 25
    :cond_6
    invoke-static {v4}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v4

    iput-object v4, p0, Lcom/imagepicker/ImagePickerModule;->fileUri:Landroid/net/Uri;

    const-string v4, "output"

    .line 26
    iget-object v6, p0, Lcom/imagepicker/ImagePickerModule;->cameraCaptureURI:Landroid/net/Uri;

    invoke-virtual {p1, v4, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const/4 v4, 0x3

    .line 27
    invoke-virtual {p1, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 28
    :try_start_0
    invoke-virtual {v0, p1, v5}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    new-array v0, v3, [Ljava/lang/Object;

    .line 29
    sget-object v3, Lcom/imagepicker/f;->d:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Lcom/imagepicker/f;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object p1

    aput-object p1, v0, v2

    invoke-interface {p2, v0}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 30
    iput-object v1, p0, Lcom/imagepicker/ImagePickerModule;->callback:Lcom/facebook/react/bridge/Callback;

    :goto_1
    return-void
.end method

.method public launchImageLibrary(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V
    .locals 8
    .annotation runtime Lcom/facebook/react/bridge/ReactMethod;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContextBaseJavaModule;->getCurrentActivity()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-array p1, v2, [Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v0, Lcom/imagepicker/f;->d:Ljava/lang/String;

    .line 12
    .line 13
    const-string v2, "Activity error"

    .line 14
    .line 15
    invoke-static {v0, v2}, Lcom/imagepicker/f;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    aput-object v0, p1, v1

    .line 20
    .line 21
    invoke-interface {p2, p1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iput-object p2, p0, Lcom/imagepicker/ImagePickerModule;->callback:Lcom/facebook/react/bridge/Callback;

    .line 26
    .line 27
    new-instance v3, Lcom/imagepicker/e;

    .line 28
    .line 29
    invoke-direct {v3, p1}, Lcom/imagepicker/e;-><init>(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 30
    .line 31
    .line 32
    iput-object v3, p0, Lcom/imagepicker/ImagePickerModule;->options:Lcom/imagepicker/e;

    .line 33
    .line 34
    iget p1, v3, Lcom/imagepicker/e;->a:I

    .line 35
    .line 36
    if-ne p1, v2, :cond_1

    .line 37
    .line 38
    move p1, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move p1, v1

    .line 41
    :goto_0
    iget-object v3, v3, Lcom/imagepicker/e;->k:Ljava/lang/String;

    .line 42
    .line 43
    sget-object v4, Lcom/imagepicker/f;->e:Ljava/lang/String;

    .line 44
    .line 45
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    iget-object v4, p0, Lcom/imagepicker/ImagePickerModule;->options:Lcom/imagepicker/e;

    .line 50
    .line 51
    iget-object v4, v4, Lcom/imagepicker/e;->k:Ljava/lang/String;

    .line 52
    .line 53
    sget-object v5, Lcom/imagepicker/f;->f:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    iget-object v5, p0, Lcom/imagepicker/ImagePickerModule;->options:Lcom/imagepicker/e;

    .line 60
    .line 61
    iget-object v5, v5, Lcom/imagepicker/e;->k:Ljava/lang/String;

    .line 62
    .line 63
    sget-object v6, Lcom/imagepicker/f;->g:Ljava/lang/String;

    .line 64
    .line 65
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz p1, :cond_3

    .line 70
    .line 71
    if-nez v3, :cond_2

    .line 72
    .line 73
    if-eqz v4, :cond_3

    .line 74
    .line 75
    :cond_2
    new-instance v6, Landroid/content/Intent;

    .line 76
    .line 77
    const-string v7, "android.intent.action.PICK"

    .line 78
    .line 79
    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    new-instance v6, Landroid/content/Intent;

    .line 84
    .line 85
    const-string v7, "android.intent.action.GET_CONTENT"

    .line 86
    .line 87
    invoke-direct {v6, v7}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const-string v7, "android.intent.category.OPENABLE"

    .line 91
    .line 92
    invoke-virtual {v6, v7}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    :goto_1
    if-nez p1, :cond_4

    .line 96
    .line 97
    const-string p1, "android.intent.extra.ALLOW_MULTIPLE"

    .line 98
    .line 99
    invoke-virtual {v6, p1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 100
    .line 101
    .line 102
    :cond_4
    const-string p1, "image/*"

    .line 103
    .line 104
    if-eqz v3, :cond_5

    .line 105
    .line 106
    invoke-virtual {v6, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_5
    const-string v3, "video/*"

    .line 111
    .line 112
    if-eqz v4, :cond_6

    .line 113
    .line 114
    invoke-virtual {v6, v3}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_6
    const-string v4, "*/*"

    .line 119
    .line 120
    if-eqz v5, :cond_7

    .line 121
    .line 122
    invoke-virtual {v6, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 123
    .line 124
    .line 125
    const-string v4, "android.intent.extra.MIME_TYPES"

    .line 126
    .line 127
    filled-new-array {p1, v3}, [Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {v6, v4, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    invoke-virtual {v6, v4}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 136
    .line 137
    .line 138
    :goto_2
    const/4 p1, 0x0

    .line 139
    :try_start_0
    invoke-static {v6, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    const/16 v4, 0x32cb

    .line 144
    .line 145
    invoke-virtual {v0, v3, v4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :catch_0
    move-exception v0

    .line 150
    new-array v2, v2, [Ljava/lang/Object;

    .line 151
    .line 152
    sget-object v3, Lcom/imagepicker/f;->d:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    invoke-static {v3, v0}, Lcom/imagepicker/f;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    aput-object v0, v2, v1

    .line 163
    .line 164
    invoke-interface {p2, v2}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    iput-object p1, p0, Lcom/imagepicker/ImagePickerModule;->callback:Lcom/facebook/react/bridge/Callback;

    .line 168
    .line 169
    :goto_3
    return-void
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
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
.end method

.method public onActivityResult(Landroid/app/Activity;IILandroid/content/Intent;)V
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/imagepicker/f;->A(I)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_5

    .line 6
    .line 7
    iget-object p1, p0, Lcom/imagepicker/ImagePickerModule;->callback:Lcom/facebook/react/bridge/Callback;

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, -0x1

    .line 13
    if-eq p3, p1, :cond_2

    .line 14
    .line 15
    const/16 p1, 0x32c9

    .line 16
    .line 17
    if-ne p2, p1, :cond_1

    .line 18
    .line 19
    iget-object p1, p0, Lcom/imagepicker/ImagePickerModule;->fileUri:Landroid/net/Uri;

    .line 20
    .line 21
    invoke-static {p1}, Lcom/imagepicker/f;->e(Landroid/net/Uri;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    iget-object p1, p0, Lcom/imagepicker/ImagePickerModule;->callback:Lcom/facebook/react/bridge/Callback;

    .line 25
    .line 26
    const/4 p2, 0x1

    .line 27
    new-array p2, p2, [Ljava/lang/Object;

    .line 28
    .line 29
    const/4 p3, 0x0

    .line 30
    invoke-static {}, Lcom/imagepicker/f;->i()Lcom/facebook/react/bridge/ReadableMap;

    .line 31
    .line 32
    .line 33
    move-result-object p4

    .line 34
    aput-object p4, p2, p3

    .line 35
    .line 36
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    iput-object p1, p0, Lcom/imagepicker/ImagePickerModule;->callback:Lcom/facebook/react/bridge/Callback;

    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    packed-switch p2, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_0
    invoke-static {p4}, Lcom/imagepicker/f;->a(Landroid/content/Intent;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, p1}, Lcom/imagepicker/ImagePickerModule;->onAssetsObtained(Ljava/util/List;)V

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :pswitch_1
    iget-object p1, p0, Lcom/imagepicker/ImagePickerModule;->options:Lcom/imagepicker/e;

    .line 56
    .line 57
    iget-object p1, p1, Lcom/imagepicker/e;->h:Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-eqz p1, :cond_3

    .line 64
    .line 65
    iget-object p1, p0, Lcom/imagepicker/ImagePickerModule;->cameraCaptureURI:Landroid/net/Uri;

    .line 66
    .line 67
    iget-object p2, p0, Lcom/imagepicker/ImagePickerModule;->identifier:Ljava/util/UUID;

    .line 68
    .line 69
    iget-object p3, p0, Lcom/imagepicker/ImagePickerModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 70
    .line 71
    const-string p4, "video"

    .line 72
    .line 73
    invoke-static {p1, p2, p3, p4}, Lcom/imagepicker/f;->D(Landroid/net/Uri;Ljava/util/UUID;Landroid/content/Context;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    iget-object p1, p0, Lcom/imagepicker/ImagePickerModule;->fileUri:Landroid/net/Uri;

    .line 77
    .line 78
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0, p1}, Lcom/imagepicker/ImagePickerModule;->onAssetsObtained(Ljava/util/List;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_2
    iget-object p1, p0, Lcom/imagepicker/ImagePickerModule;->options:Lcom/imagepicker/e;

    .line 87
    .line 88
    iget-object p1, p1, Lcom/imagepicker/e;->h:Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    iget-object p1, p0, Lcom/imagepicker/ImagePickerModule;->cameraCaptureURI:Landroid/net/Uri;

    .line 97
    .line 98
    iget-object p2, p0, Lcom/imagepicker/ImagePickerModule;->identifier:Ljava/util/UUID;

    .line 99
    .line 100
    iget-object p3, p0, Lcom/imagepicker/ImagePickerModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 101
    .line 102
    const-string p4, "photo"

    .line 103
    .line 104
    invoke-static {p1, p2, p3, p4}, Lcom/imagepicker/f;->D(Landroid/net/Uri;Ljava/util/UUID;Landroid/content/Context;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    :cond_4
    iget-object p1, p0, Lcom/imagepicker/ImagePickerModule;->fileUri:Landroid/net/Uri;

    .line 108
    .line 109
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p0, p1}, Lcom/imagepicker/ImagePickerModule;->onAssetsObtained(Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    :cond_5
    :goto_0
    return-void

    .line 117
    :pswitch_data_0
    .packed-switch 0x32c9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
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
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
.end method

.method onAssetsObtained(Ljava/util/List;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    :try_start_0
    iget-object v3, p0, Lcom/imagepicker/ImagePickerModule;->callback:Lcom/facebook/react/bridge/Callback;

    .line 5
    .line 6
    new-array v4, v1, [Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v5, p0, Lcom/imagepicker/ImagePickerModule;->identifier:Ljava/util/UUID;

    .line 9
    .line 10
    iget-object v6, p0, Lcom/imagepicker/ImagePickerModule;->options:Lcom/imagepicker/e;

    .line 11
    .line 12
    iget-object v7, p0, Lcom/imagepicker/ImagePickerModule;->reactContext:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 13
    .line 14
    invoke-static {p1, v5, v6, v7}, Lcom/imagepicker/f;->t(Ljava/util/List;Ljava/util/UUID;Lcom/imagepicker/e;Landroid/content/Context;)Lcom/facebook/react/bridge/ReadableMap;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    aput-object p1, v4, v0

    .line 19
    .line 20
    invoke-interface {v3, v4}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    :goto_0
    iput-object v2, p0, Lcom/imagepicker/ImagePickerModule;->callback:Lcom/facebook/react/bridge/Callback;

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    goto :goto_2

    .line 28
    :catch_0
    move-exception p1

    .line 29
    :try_start_1
    iget-object v3, p0, Lcom/imagepicker/ImagePickerModule;->callback:Lcom/facebook/react/bridge/Callback;

    .line 30
    .line 31
    new-array v1, v1, [Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v4, Lcom/imagepicker/f;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {v4, p1}, Lcom/imagepicker/f;->j(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    aput-object p1, v1, v0

    .line 44
    .line 45
    invoke-interface {v3, v1}, Lcom/facebook/react/bridge/Callback;->invoke([Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :goto_1
    return-void

    .line 50
    :goto_2
    iput-object v2, p0, Lcom/imagepicker/ImagePickerModule;->callback:Lcom/facebook/react/bridge/Callback;

    .line 51
    .line 52
    throw p1
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 0

    return-void
.end method
