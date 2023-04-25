.class final Lcom/facebook/soloader/i$b$a;
.super Lcom/facebook/soloader/r$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/soloader/i$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private k:I

.field final synthetic l:Lcom/facebook/soloader/i$b;


# direct methods
.method private constructor <init>(Lcom/facebook/soloader/i$b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/soloader/i$b$a;->l:Lcom/facebook/soloader/i$b;

    invoke-direct {p0}, Lcom/facebook/soloader/r$e;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/soloader/i$b;Lcom/facebook/soloader/i$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/soloader/i$b$a;-><init>(Lcom/facebook/soloader/i$b;)V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 2

    iget v0, p0, Lcom/facebook/soloader/i$b$a;->k:I

    iget-object v1, p0, Lcom/facebook/soloader/i$b$a;->l:Lcom/facebook/soloader/i$b;

    invoke-static {v1}, Lcom/facebook/soloader/i$b;->h(Lcom/facebook/soloader/i$b;)[Lcom/facebook/soloader/i$c;

    move-result-object v1

    array-length v1, v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public g()Lcom/facebook/soloader/r$d;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/soloader/i$b$a;->l:Lcom/facebook/soloader/i$b;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/soloader/i$b;->h(Lcom/facebook/soloader/i$b;)[Lcom/facebook/soloader/i$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v1, p0, Lcom/facebook/soloader/i$b$a;->k:I

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    iput v2, p0, Lcom/facebook/soloader/i$b$a;->k:I

    .line 12
    .line 13
    aget-object v0, v0, v1

    .line 14
    .line 15
    new-instance v1, Ljava/io/FileInputStream;

    .line 16
    .line 17
    iget-object v2, v0, Lcom/facebook/soloader/i$c;->m:Ljava/io/File;

    .line 18
    .line 19
    invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    new-instance v2, Lcom/facebook/soloader/r$f;

    .line 23
    .line 24
    invoke-direct {v2, v0, v1}, Lcom/facebook/soloader/r$f;-><init>(Lcom/facebook/soloader/r$b;Ljava/io/InputStream;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    return-object v2

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    invoke-virtual {v1}, Ljava/io/FileInputStream;->close()V

    .line 30
    .line 31
    .line 32
    throw v0
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
.end method
