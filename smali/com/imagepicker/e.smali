.class public Lcom/imagepicker/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:I

.field b:Ljava/lang/Boolean;

.field c:Ljava/lang/Boolean;

.field d:I

.field e:I

.field f:I

.field g:I

.field h:Ljava/lang/Boolean;

.field i:I

.field j:Ljava/lang/Boolean;

.field k:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, Lcom/imagepicker/e;->d:I

    .line 6
    .line 7
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 8
    .line 9
    iput-object v0, p0, Lcom/imagepicker/e;->j:Ljava/lang/Boolean;

    .line 10
    .line 11
    const-string v0, "mediaType"

    .line 12
    .line 13
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lcom/imagepicker/e;->k:Ljava/lang/String;

    .line 18
    .line 19
    const-string v0, "selectionLimit"

    .line 20
    .line 21
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iput v0, p0, Lcom/imagepicker/e;->a:I

    .line 26
    .line 27
    const-string v0, "includeBase64"

    .line 28
    .line 29
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lcom/imagepicker/e;->b:Ljava/lang/Boolean;

    .line 38
    .line 39
    const-string v0, "includeExtra"

    .line 40
    .line 41
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, Lcom/imagepicker/e;->c:Ljava/lang/Boolean;

    .line 50
    .line 51
    const-string v0, "videoQuality"

    .line 52
    .line 53
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_0

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "high"

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_0

    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    iput v0, p0, Lcom/imagepicker/e;->d:I

    .line 77
    .line 78
    :cond_0
    const-string v0, "cameraType"

    .line 79
    .line 80
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v1, "front"

    .line 85
    .line 86
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 93
    .line 94
    iput-object v0, p0, Lcom/imagepicker/e;->j:Ljava/lang/Boolean;

    .line 95
    .line 96
    :cond_1
    const-string v0, "quality"

    .line 97
    .line 98
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    .line 99
    .line 100
    .line 101
    move-result-wide v0

    .line 102
    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    .line 103
    .line 104
    mul-double/2addr v0, v2

    .line 105
    double-to-int v0, v0

    .line 106
    iput v0, p0, Lcom/imagepicker/e;->e:I

    .line 107
    .line 108
    const-string v0, "maxHeight"

    .line 109
    .line 110
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    iput v0, p0, Lcom/imagepicker/e;->g:I

    .line 115
    .line 116
    const-string v0, "maxWidth"

    .line 117
    .line 118
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    iput v0, p0, Lcom/imagepicker/e;->f:I

    .line 123
    .line 124
    const-string v0, "saveToPhotos"

    .line 125
    .line 126
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iput-object v0, p0, Lcom/imagepicker/e;->h:Ljava/lang/Boolean;

    .line 135
    .line 136
    const-string v0, "durationLimit"

    .line 137
    .line 138
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result p1

    .line 142
    iput p1, p0, Lcom/imagepicker/e;->i:I

    .line 143
    .line 144
    return-void
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
