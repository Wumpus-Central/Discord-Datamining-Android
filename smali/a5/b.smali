.class public La5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx4/c;


# static fields
.field private static final e:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lx4/b;

.field private b:Lj5/a;

.field private c:Ll5/d;

.field private final d:Ll5/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, La5/b;

    sput-object v0, La5/b;->e:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Lx4/b;Lj5/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La5/b$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, La5/b$a;-><init>(La5/b;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La5/b;->d:Ll5/d$b;

    .line 10
    .line 11
    iput-object p1, p0, La5/b;->a:Lx4/b;

    .line 12
    .line 13
    iput-object p2, p0, La5/b;->b:Lj5/a;

    .line 14
    .line 15
    new-instance p1, Ll5/d;

    .line 16
    .line 17
    invoke-direct {p1, p2, v0}, Ll5/d;-><init>(Lj5/a;Ll5/d$b;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, La5/b;->c:Ll5/d;

    .line 21
    .line 22
    return-void
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
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
.end method

.method static synthetic b(La5/b;)Lx4/b;
    .locals 0

    iget-object p0, p0, La5/b;->a:Lx4/b;

    return-object p0
.end method


# virtual methods
.method public a(ILandroid/graphics/Bitmap;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    :try_start_0
    iget-object v1, p0, La5/b;->c:Ll5/d;

    .line 3
    .line 4
    invoke-virtual {v1, p1, p2}, Ll5/d;->g(ILandroid/graphics/Bitmap;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    .line 6
    .line 7
    return v0

    .line 8
    :catch_0
    move-exception p2

    .line 9
    sget-object v1, La5/b;->e:Ljava/lang/Class;

    .line 10
    .line 11
    new-array v0, v0, [Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v2, 0x0

    .line 18
    aput-object p1, v0, v2

    .line 19
    .line 20
    const-string p1, "Rendering of frame unsuccessful. Frame number: %d"

    .line 21
    .line 22
    invoke-static {v1, p2, p1, v0}, Lw3/a;->i(Ljava/lang/Class;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return v2
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
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, La5/b;->b:Lj5/a;

    invoke-interface {v0}, Lj5/a;->getHeight()I

    move-result v0

    return v0
.end method

.method public d(Landroid/graphics/Rect;)V
    .locals 2

    .line 1
    iget-object v0, p0, La5/b;->b:Lj5/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lj5/a;->f(Landroid/graphics/Rect;)Lj5/a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, La5/b;->b:Lj5/a;

    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, La5/b;->b:Lj5/a;

    .line 12
    .line 13
    new-instance v0, Ll5/d;

    .line 14
    .line 15
    iget-object v1, p0, La5/b;->d:Ll5/d$b;

    .line 16
    .line 17
    invoke-direct {v0, p1, v1}, Ll5/d;-><init>(Lj5/a;Ll5/d$b;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La5/b;->c:Ll5/d;

    .line 21
    .line 22
    :cond_0
    return-void
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
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, La5/b;->b:Lj5/a;

    invoke-interface {v0}, Lj5/a;->getWidth()I

    move-result v0

    return v0
.end method
