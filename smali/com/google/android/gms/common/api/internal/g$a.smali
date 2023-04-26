.class public Lcom/google/android/gms/common/api/internal/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/common/api/internal/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lu9/a$b;",
        "L:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lv9/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv9/i<",
            "TA;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Void;",
            ">;>;"
        }
    .end annotation
.end field

.field private b:Lv9/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv9/i<",
            "TA;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation
.end field

.field private c:Ljava/lang/Runnable;

.field private d:Lcom/google/android/gms/common/api/internal/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/common/api/internal/d<",
            "T",
            "L;",
            ">;"
        }
    .end annotation
.end field

.field private e:[Lt9/c;

.field private f:Z

.field private g:I


# direct methods
.method synthetic constructor <init>(Lv9/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lv9/y;->k:Lv9/y;

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/g$a;->c:Ljava/lang/Runnable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/google/android/gms/common/api/internal/g$a;->f:Z

    return-void
.end method

.method static bridge synthetic f(Lcom/google/android/gms/common/api/internal/g$a;)Lv9/i;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/g$a;->a:Lv9/i;

    return-object p0
.end method

.method static bridge synthetic g(Lcom/google/android/gms/common/api/internal/g$a;)Lv9/i;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/common/api/internal/g$a;->b:Lv9/i;

    return-object p0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/internal/g;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/internal/g<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g$a;->a:Lv9/i;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    :goto_0
    const-string v3, "Must set register function"

    .line 11
    .line 12
    invoke-static {v0, v3}, Lw9/p;->b(ZLjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g$a;->b:Lv9/i;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    move v0, v1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v0, v2

    .line 22
    :goto_1
    const-string v3, "Must set unregister function"

    .line 23
    .line 24
    invoke-static {v0, v3}, Lw9/p;->b(ZLjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g$a;->d:Lcom/google/android/gms/common/api/internal/d;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move v1, v2

    .line 33
    :goto_2
    const-string v0, "Must set holder"

    .line 34
    .line 35
    invoke-static {v1, v0}, Lw9/p;->b(ZLjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g$a;->d:Lcom/google/android/gms/common/api/internal/d;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/d;->b()Lcom/google/android/gms/common/api/internal/d$a;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const-string v1, "Key must not be null"

    .line 45
    .line 46
    invoke-static {v0, v1}, Lw9/p;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lcom/google/android/gms/common/api/internal/d$a;

    .line 51
    .line 52
    new-instance v1, Lcom/google/android/gms/common/api/internal/g;

    .line 53
    .line 54
    new-instance v8, Lcom/google/android/gms/common/api/internal/a0;

    .line 55
    .line 56
    iget-object v4, p0, Lcom/google/android/gms/common/api/internal/g$a;->d:Lcom/google/android/gms/common/api/internal/d;

    .line 57
    .line 58
    iget-object v5, p0, Lcom/google/android/gms/common/api/internal/g$a;->e:[Lt9/c;

    .line 59
    .line 60
    iget-boolean v6, p0, Lcom/google/android/gms/common/api/internal/g$a;->f:Z

    .line 61
    .line 62
    iget v7, p0, Lcom/google/android/gms/common/api/internal/g$a;->g:I

    .line 63
    .line 64
    move-object v2, v8

    .line 65
    move-object v3, p0

    .line 66
    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/common/api/internal/a0;-><init>(Lcom/google/android/gms/common/api/internal/g$a;Lcom/google/android/gms/common/api/internal/d;[Lt9/c;ZI)V

    .line 67
    .line 68
    .line 69
    new-instance v2, Lcom/google/android/gms/common/api/internal/b0;

    .line 70
    .line 71
    invoke-direct {v2, p0, v0}, Lcom/google/android/gms/common/api/internal/b0;-><init>(Lcom/google/android/gms/common/api/internal/g$a;Lcom/google/android/gms/common/api/internal/d$a;)V

    .line 72
    .line 73
    .line 74
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/g$a;->c:Ljava/lang/Runnable;

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    invoke-direct {v1, v8, v2, v0, v3}, Lcom/google/android/gms/common/api/internal/g;-><init>(Lcom/google/android/gms/common/api/internal/f;Lcom/google/android/gms/common/api/internal/i;Ljava/lang/Runnable;Lv9/a0;)V

    .line 78
    .line 79
    .line 80
    return-object v1
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
.end method

.method public b(Lv9/i;)Lcom/google/android/gms/common/api/internal/g$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/i<",
            "TA;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Void;",
            ">;>;)",
            "Lcom/google/android/gms/common/api/internal/g$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/g$a;->a:Lv9/i;

    return-object p0
.end method

.method public c(I)Lcom/google/android/gms/common/api/internal/g$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/android/gms/common/api/internal/g$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput p1, p0, Lcom/google/android/gms/common/api/internal/g$a;->g:I

    return-object p0
.end method

.method public d(Lv9/i;)Lcom/google/android/gms/common/api/internal/g$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv9/i<",
            "TA;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Lcom/google/android/gms/common/api/internal/g$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/g$a;->b:Lv9/i;

    return-object p0
.end method

.method public e(Lcom/google/android/gms/common/api/internal/d;)Lcom/google/android/gms/common/api/internal/g$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/internal/d<",
            "T",
            "L;",
            ">;)",
            "Lcom/google/android/gms/common/api/internal/g$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/g$a;->d:Lcom/google/android/gms/common/api/internal/d;

    return-object p0
.end method
