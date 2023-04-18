.class public final Ls/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls/b$a;
    }
.end annotation


# instance fields
.field private final a:Ls/b$a;


# direct methods
.method public constructor <init>(Landroid/view/Surface;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 3
    new-instance v0, Ls/h;

    invoke-direct {v0, p1}, Ls/h;-><init>(Landroid/view/Surface;)V

    iput-object v0, p0, Ls/b;->a:Ls/b$a;

    goto :goto_0

    :cond_0
    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    .line 4
    new-instance v0, Ls/f;

    invoke-direct {v0, p1}, Ls/f;-><init>(Landroid/view/Surface;)V

    iput-object v0, p0, Ls/b;->a:Ls/b$a;

    goto :goto_0

    :cond_1
    const/16 v1, 0x18

    if-lt v0, v1, :cond_2

    .line 5
    new-instance v0, Ls/e;

    invoke-direct {v0, p1}, Ls/e;-><init>(Landroid/view/Surface;)V

    iput-object v0, p0, Ls/b;->a:Ls/b$a;

    goto :goto_0

    .line 6
    :cond_2
    new-instance v0, Ls/i;

    invoke-direct {v0, p1}, Ls/i;-><init>(Landroid/view/Surface;)V

    iput-object v0, p0, Ls/b;->a:Ls/b$a;

    :goto_0
    return-void
.end method

.method private constructor <init>(Ls/b$a;)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Ls/b;->a:Ls/b$a;

    return-void
.end method

.method public static e(Ljava/lang/Object;)Ls/b;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v2, 0x1c

    .line 8
    .line 9
    if-lt v1, v2, :cond_1

    .line 10
    .line 11
    check-cast p0, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 12
    .line 13
    invoke-static {p0}, Ls/h;->f(Landroid/hardware/camera2/params/OutputConfiguration;)Ls/h;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_1
    const/16 v2, 0x1a

    .line 19
    .line 20
    if-lt v1, v2, :cond_2

    .line 21
    .line 22
    check-cast p0, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 23
    .line 24
    invoke-static {p0}, Ls/f;->e(Landroid/hardware/camera2/params/OutputConfiguration;)Ls/f;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    const/16 v2, 0x18

    .line 30
    .line 31
    if-lt v1, v2, :cond_3

    .line 32
    .line 33
    check-cast p0, Landroid/hardware/camera2/params/OutputConfiguration;

    .line 34
    .line 35
    invoke-static {p0}, Ls/e;->d(Landroid/hardware/camera2/params/OutputConfiguration;)Ls/e;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    move-object p0, v0

    .line 41
    :goto_0
    if-nez p0, :cond_4

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_4
    new-instance v0, Ls/b;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Ls/b;-><init>(Ls/b$a;)V

    .line 47
    .line 48
    .line 49
    return-object v0
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


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls/b;->a:Ls/b$a;

    invoke-interface {v0}, Ls/b$a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Ls/b;->a:Ls/b$a;

    invoke-interface {v0}, Ls/b$a;->getSurface()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ls/b;->a:Ls/b$a;

    invoke-interface {v0, p1}, Ls/b$a;->b(Ljava/lang/String;)V

    return-void
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls/b;->a:Ls/b$a;

    invoke-interface {v0}, Ls/b$a;->c()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ls/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    iget-object v0, p0, Ls/b;->a:Ls/b$a;

    .line 8
    .line 9
    check-cast p1, Ls/b;

    .line 10
    .line 11
    iget-object p1, p1, Ls/b;->a:Ls/b$a;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
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

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ls/b;->a:Ls/b$a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
