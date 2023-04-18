.class final Lv9/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic k:Lcom/google/android/gms/common/api/internal/LifecycleCallback;

.field final synthetic l:Ljava/lang/String;

.field final synthetic m:Lv9/j0;


# direct methods
.method constructor <init>(Lv9/j0;Lcom/google/android/gms/common/api/internal/LifecycleCallback;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lv9/i0;->m:Lv9/j0;

    iput-object p2, p0, Lv9/i0;->k:Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    iput-object p3, p0, Lv9/i0;->l:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv9/i0;->m:Lv9/j0;

    .line 2
    .line 3
    invoke-static {v0}, Lv9/j0;->d(Lv9/j0;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-lez v1, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lv9/i0;->k:Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    .line 10
    .line 11
    invoke-static {v0}, Lv9/j0;->e(Lv9/j0;)Landroid/os/Bundle;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {v0}, Lv9/j0;->e(Lv9/j0;)Landroid/os/Bundle;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget-object v2, p0, Lv9/i0;->l:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    invoke-virtual {v1, v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->f(Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lv9/i0;->m:Lv9/j0;

    .line 33
    .line 34
    invoke-static {v0}, Lv9/j0;->d(Lv9/j0;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, 0x2

    .line 39
    if-lt v0, v1, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Lv9/i0;->k:Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->j()V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v0, p0, Lv9/i0;->m:Lv9/j0;

    .line 47
    .line 48
    invoke-static {v0}, Lv9/j0;->d(Lv9/j0;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v1, 0x3

    .line 53
    if-lt v0, v1, :cond_3

    .line 54
    .line 55
    iget-object v0, p0, Lv9/i0;->k:Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    .line 56
    .line 57
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->h()V

    .line 58
    .line 59
    .line 60
    :cond_3
    iget-object v0, p0, Lv9/i0;->m:Lv9/j0;

    .line 61
    .line 62
    invoke-static {v0}, Lv9/j0;->d(Lv9/j0;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v1, 0x4

    .line 67
    if-lt v0, v1, :cond_4

    .line 68
    .line 69
    iget-object v0, p0, Lv9/i0;->k:Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->k()V

    .line 72
    .line 73
    .line 74
    :cond_4
    iget-object v0, p0, Lv9/i0;->m:Lv9/j0;

    .line 75
    .line 76
    invoke-static {v0}, Lv9/j0;->d(Lv9/j0;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    const/4 v1, 0x5

    .line 81
    if-lt v0, v1, :cond_5

    .line 82
    .line 83
    iget-object v0, p0, Lv9/i0;->k:Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->g()V

    .line 86
    .line 87
    .line 88
    :cond_5
    return-void
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
.end method
