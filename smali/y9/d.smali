.class public final Ly9/d;
.super Lu9/e;
.source "SourceFile"

# interfaces
.implements Lw9/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lu9/e<",
        "Lw9/w;",
        ">;",
        "Lw9/v;"
    }
.end annotation


# static fields
.field private static final k:Lu9/a$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/a$g<",
            "Ly9/e;",
            ">;"
        }
    .end annotation
.end field

.field private static final l:Lu9/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/a$a<",
            "Ly9/e;",
            "Lw9/w;",
            ">;"
        }
    .end annotation
.end field

.field private static final m:Lu9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/a<",
            "Lw9/w;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic n:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lu9/a$g;

    invoke-direct {v0}, Lu9/a$g;-><init>()V

    sput-object v0, Ly9/d;->k:Lu9/a$g;

    new-instance v1, Ly9/c;

    invoke-direct {v1}, Ly9/c;-><init>()V

    sput-object v1, Ly9/d;->l:Lu9/a$a;

    new-instance v2, Lu9/a;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, Lu9/a;-><init>(Ljava/lang/String;Lu9/a$a;Lu9/a$g;)V

    sput-object v2, Ly9/d;->m:Lu9/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lw9/w;)V
    .locals 2

    sget-object v0, Ly9/d;->m:Lu9/a;

    sget-object v1, Lu9/e$a;->c:Lu9/e$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lu9/e;-><init>(Landroid/content/Context;Lu9/a;Lu9/a$d;Lu9/e$a;)V

    return-void
.end method


# virtual methods
.method public final g(Lw9/t;)Lcom/google/android/gms/tasks/Task;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw9/t;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/google/android/gms/common/api/internal/h;->a()Lcom/google/android/gms/common/api/internal/h$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    new-array v1, v1, [Lt9/c;

    .line 7
    .line 8
    sget-object v2, Lma/d;->a:Lt9/c;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    aput-object v2, v1, v3

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/h$a;->d([Lt9/c;)Lcom/google/android/gms/common/api/internal/h$a;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v3}, Lcom/google/android/gms/common/api/internal/h$a;->c(Z)Lcom/google/android/gms/common/api/internal/h$a;

    .line 17
    .line 18
    .line 19
    new-instance v1, Ly9/b;

    .line 20
    .line 21
    invoke-direct {v1, p1}, Ly9/b;-><init>(Lw9/t;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/internal/h$a;->b(Lv9/i;)Lcom/google/android/gms/common/api/internal/h$a;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/common/api/internal/h$a;->a()Lcom/google/android/gms/common/api/internal/h;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, p1}, Lu9/e;->j(Lcom/google/android/gms/common/api/internal/h;)Lcom/google/android/gms/tasks/Task;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1
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
.end method
