.class public final Lcom/discord/image/fresco/config/FrescoConfigKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "frescoConfig",
        "Lcom/facebook/imagepipeline/core/ImagePipelineConfig;",
        "Landroid/content/Context;",
        "fresco_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final frescoConfig(Landroid/content/Context;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig;
    .locals 5

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/facebook/react/bridge/ReactContext;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/facebook/react/bridge/ReactContext;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/modules/fresco/FrescoModule;->getDefaultConfigBuilder(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lcom/discord/image/fresco/config/FrescoDiskCache;->INSTANCE:Lcom/discord/image/fresco/config/FrescoDiskCache;

    .line 16
    .line 17
    invoke-virtual {v1, p0}, Lcom/discord/image/fresco/config/FrescoDiskCache;->newRegularDiskCache(Landroid/content/Context;)Lcom/facebook/cache/disk/DiskCacheConfig;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v0, v2}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->O(Lcom/facebook/cache/disk/DiskCacheConfig;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v1, p0}, Lcom/discord/image/fresco/config/FrescoDiskCache;->newSmallDiskCache(Landroid/content/Context;)Lcom/facebook/cache/disk/DiskCacheConfig;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->S(Lcom/facebook/cache/disk/DiskCacheConfig;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, Lcom/discord/image/fresco/config/FrescoBitmapSupplier;

    .line 34
    .line 35
    invoke-direct {v1, p0}, Lcom/discord/image/fresco/config/FrescoBitmapSupplier;-><init>(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->M(Lcom/facebook/common/internal/Supplier;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-static {}, Lx5/x;->n()Lx5/x$b;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {}, Lx5/l;->a()Lx5/z;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    new-instance v2, Lx5/z;

    .line 51
    .line 52
    iget v3, v1, Lx5/z;->b:I

    .line 53
    .line 54
    iget v4, v1, Lx5/z;->a:I

    .line 55
    .line 56
    mul-int/lit8 v4, v4, 0x2

    .line 57
    .line 58
    iget-object v1, v1, Lx5/z;->c:Landroid/util/SparseIntArray;

    .line 59
    .line 60
    invoke-direct {v2, v3, v4, v1}, Lx5/z;-><init>(IILandroid/util/SparseIntArray;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Lx5/x$b;->n(Lx5/z;)Lx5/x$b;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lx5/x$b;->m()Lx5/x;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v1, Lx5/y;

    .line 72
    .line 73
    invoke-direct {v1, v0}, Lx5/y;-><init>(Lx5/x;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->Q(Lx5/y;)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const/4 v0, 0x1

    .line 81
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->N(Z)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->L()Lcom/facebook/imagepipeline/core/a$b;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {p0, v0}, Lcom/facebook/imagepipeline/core/a$b;->t(Z)Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/core/ImagePipelineConfig$Builder;->K()Lcom/facebook/imagepipeline/core/ImagePipelineConfig;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string v0, "getDefaultConfigBuilder(\u2026ns(true)\n        .build()"

    .line 98
    .line 99
    invoke-static {p0, v0}, Lkotlin/jvm/internal/q;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object p0
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
.end method
