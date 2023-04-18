.class final Lcom/budiyev/android/codescanner/CodeScanner$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/budiyev/android/codescanner/f$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/budiyev/android/codescanner/CodeScanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/budiyev/android/codescanner/CodeScanner;


# direct methods
.method private constructor <init>(Lcom/budiyev/android/codescanner/CodeScanner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner$b;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/budiyev/android/codescanner/CodeScanner;Lcom/budiyev/android/codescanner/CodeScanner$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/budiyev/android/codescanner/CodeScanner$b;-><init>(Lcom/budiyev/android/codescanner/CodeScanner;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/budiyev/android/codescanner/f$b;)Z
    .locals 2

    .line 1
    sget-object v0, Lcom/budiyev/android/codescanner/f$b;->n:Lcom/budiyev/android/codescanner/f$b;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne p1, v0, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner$b;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 7
    .line 8
    invoke-static {p1}, Lcom/budiyev/android/codescanner/CodeScanner;->k(Lcom/budiyev/android/codescanner/CodeScanner;)Lcom/budiyev/android/codescanner/m;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v0, Lcom/budiyev/android/codescanner/m;->m:Lcom/budiyev/android/codescanner/m;

    .line 13
    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    return p1

    .line 18
    :cond_0
    sget-object v0, Lcom/budiyev/android/codescanner/m;->k:Lcom/budiyev/android/codescanner/m;

    .line 19
    .line 20
    if-ne p1, v0, :cond_1

    .line 21
    .line 22
    iget-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner$b;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 23
    .line 24
    invoke-static {p1, v1}, Lcom/budiyev/android/codescanner/CodeScanner;->j(Lcom/budiyev/android/codescanner/CodeScanner;Z)Z

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/budiyev/android/codescanner/CodeScanner$b;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 28
    .line 29
    invoke-static {p1}, Lcom/budiyev/android/codescanner/CodeScanner;->r(Lcom/budiyev/android/codescanner/CodeScanner;)Landroid/os/Handler;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v0, p0, Lcom/budiyev/android/codescanner/CodeScanner$b;->a:Lcom/budiyev/android/codescanner/CodeScanner;

    .line 34
    .line 35
    invoke-static {v0}, Lcom/budiyev/android/codescanner/CodeScanner;->q(Lcom/budiyev/android/codescanner/CodeScanner;)Ljava/lang/Runnable;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 40
    .line 41
    .line 42
    :cond_1
    return v1
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
