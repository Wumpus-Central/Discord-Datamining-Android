.class public final Le0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/o0;
.implements Le0/i;


# instance fields
.field private final a:Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;

.field private b:Le0/h;


# direct methods
.method public constructor <init>(Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Le0/h;

    .line 5
    .line 6
    invoke-direct {v0}, Le0/h;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Le0/c;->b:Le0/h;

    .line 10
    .line 11
    iput-object p1, p0, Le0/c;->a:Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;

    .line 12
    .line 13
    return-void
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
.end method


# virtual methods
.method public a(Lw/l1;)V
    .locals 5

    .line 1
    invoke-interface {p1}, Lw/l1;->b()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x1

    .line 11
    if-ne v1, v3, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v3, v2

    .line 15
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v4, "Processing preview bundle must be 1, but found "

    .line 21
    .line 22
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v3, v1}, Landroidx/core/util/g;->b(ZLjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-interface {p1, v0}, Lw/l1;->a(I)Lfc/b;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, Ljava/util/concurrent/Future;->isDone()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    invoke-static {v0}, Landroidx/core/util/g;->a(Z)V

    .line 58
    .line 59
    .line 60
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, Landroidx/camera/core/ImageProxy;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->p0()Landroid/media/Image;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->e0()Landroidx/camera/core/k1;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Lw/u;->a(Landroidx/camera/core/k1;)Lw/t;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-static {p1}, Lp/a;->a(Lw/t;)Landroid/hardware/camera2/CaptureResult;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    instance-of v1, p1, Landroid/hardware/camera2/TotalCaptureResult;

    .line 83
    .line 84
    if-eqz v1, :cond_1

    .line 85
    .line 86
    check-cast p1, Landroid/hardware/camera2/TotalCaptureResult;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_1
    const/4 p1, 0x0

    .line 90
    :goto_1
    if-nez v0, :cond_2

    .line 91
    .line 92
    return-void

    .line 93
    :cond_2
    iget-object v1, p0, Le0/c;->b:Le0/h;

    .line 94
    .line 95
    invoke-virtual {v1}, Le0/h;->c()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-nez v1, :cond_3

    .line 100
    .line 101
    return-void

    .line 102
    :cond_3
    :try_start_1
    iget-object v1, p0, Le0/c;->a:Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;

    .line 103
    .line 104
    invoke-interface {v1, v0, p1}, Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;->process(Landroid/media/Image;Landroid/hardware/camera2/TotalCaptureResult;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Le0/c;->b:Le0/h;

    .line 108
    .line 109
    invoke-virtual {p1}, Le0/h;->a()V

    .line 110
    .line 111
    .line 112
    return-void

    .line 113
    :catchall_0
    move-exception p1

    .line 114
    iget-object v0, p0, Le0/c;->b:Le0/h;

    .line 115
    .line 116
    invoke-virtual {v0}, Le0/h;->a()V

    .line 117
    .line 118
    .line 119
    throw p1

    .line 120
    :catch_0
    const-string p1, "AdaptingPreviewProcesso"

    .line 121
    .line 122
    const-string v0, "Unable to retrieve ImageProxy from bundle"

    .line 123
    .line 124
    invoke-static {p1, v0}, Landroidx/camera/core/r1;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    return-void
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
.end method

.method public b(Landroid/view/Surface;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Le0/c;->b:Le0/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Le0/h;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, Le0/c;->a:Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;

    .line 11
    .line 12
    invoke-interface {v0, p1, p2}, Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;->onOutputSurface(Landroid/view/Surface;I)V

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Le0/c;->a:Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;

    .line 16
    .line 17
    const/16 p2, 0x23

    .line 18
    .line 19
    invoke-interface {p1, p2}, Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;->onImageFormatUpdate(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Le0/c;->b:Le0/h;

    .line 23
    .line 24
    invoke-virtual {p1}, Le0/h;->a()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    iget-object p2, p0, Le0/c;->b:Le0/h;

    .line 30
    .line 31
    invoke-virtual {p2}, Le0/h;->a()V

    .line 32
    .line 33
    .line 34
    throw p1
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
.end method

.method public c(Landroid/util/Size;)V
    .locals 1

    .line 1
    iget-object v0, p0, Le0/c;->b:Le0/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Le0/h;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    iget-object v0, p0, Le0/c;->a:Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;

    .line 11
    .line 12
    invoke-interface {v0, p1}, Landroidx/camera/extensions/impl/PreviewImageProcessorImpl;->onResolutionUpdate(Landroid/util/Size;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    iget-object p1, p0, Le0/c;->b:Le0/h;

    .line 16
    .line 17
    invoke-virtual {p1}, Le0/h;->a()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    iget-object v0, p0, Le0/c;->b:Le0/h;

    .line 23
    .line 24
    invoke-virtual {v0}, Le0/h;->a()V

    .line 25
    .line 26
    .line 27
    throw p1
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
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Le0/c;->b:Le0/h;

    invoke-virtual {v0}, Le0/h;->b()V

    return-void
.end method
