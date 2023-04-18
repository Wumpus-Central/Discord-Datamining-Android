.class public final Lua/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lu9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/a<",
            "Lva/b;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lva/a;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Lu9/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu9/a<",
            "Lxa/e;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lxa/c;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final e:Lxa/l;

.field public static final f:Lu9/a;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final g:Lqa/t;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lu9/a;

    .line 2
    .line 3
    sget-object v1, Lqa/w;->b:Lu9/a$a;

    .line 4
    .line 5
    sget-object v2, Lqa/w;->a:Lu9/a$g;

    .line 6
    .line 7
    const-string v3, "Nearby.CONNECTIONS_API"

    .line 8
    .line 9
    invoke-direct {v0, v3, v1, v2}, Lu9/a;-><init>(Ljava/lang/String;Lu9/a$a;Lu9/a$g;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lua/a;->a:Lu9/a;

    .line 13
    .line 14
    new-instance v0, Lqa/w;

    .line 15
    .line 16
    invoke-direct {v0}, Lqa/w;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lua/a;->b:Lva/a;

    .line 20
    .line 21
    new-instance v0, Lu9/a;

    .line 22
    .line 23
    sget-object v1, Lcom/google/android/gms/nearby/messages/internal/w;->c:Lu9/a$a;

    .line 24
    .line 25
    sget-object v2, Lcom/google/android/gms/nearby/messages/internal/w;->b:Lu9/a$g;

    .line 26
    .line 27
    const-string v3, "Nearby.MESSAGES_API"

    .line 28
    .line 29
    invoke-direct {v0, v3, v1, v2}, Lu9/a;-><init>(Ljava/lang/String;Lu9/a$a;Lu9/a$g;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lua/a;->c:Lu9/a;

    .line 33
    .line 34
    sget-object v0, Lcom/google/android/gms/nearby/messages/internal/w;->a:Lcom/google/android/gms/nearby/messages/internal/w;

    .line 35
    .line 36
    sput-object v0, Lua/a;->d:Lxa/c;

    .line 37
    .line 38
    new-instance v0, Lya/j;

    .line 39
    .line 40
    invoke-direct {v0}, Lya/j;-><init>()V

    .line 41
    .line 42
    .line 43
    sput-object v0, Lua/a;->e:Lxa/l;

    .line 44
    .line 45
    new-instance v0, Lu9/a;

    .line 46
    .line 47
    sget-object v1, Lqa/b0;->b:Lu9/a$a;

    .line 48
    .line 49
    sget-object v2, Lqa/b0;->a:Lu9/a$g;

    .line 50
    .line 51
    const-string v3, "Nearby.BOOTSTRAP_API"

    .line 52
    .line 53
    invoke-direct {v0, v3, v1, v2}, Lu9/a;-><init>(Ljava/lang/String;Lu9/a$a;Lu9/a$g;)V

    .line 54
    .line 55
    .line 56
    sput-object v0, Lua/a;->f:Lu9/a;

    .line 57
    .line 58
    new-instance v0, Lqa/b0;

    .line 59
    .line 60
    invoke-direct {v0}, Lqa/b0;-><init>()V

    .line 61
    .line 62
    .line 63
    sput-object v0, Lua/a;->g:Lqa/t;

    .line 64
    .line 65
    return-void
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
.end method

.method public static final a(Landroid/content/Context;)Lxa/d;
    .locals 2

    .line 1
    const-string v0, "Context must not be null"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lw9/p;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/u;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/nearby/messages/internal/u;-><init>(Landroid/content/Context;Lxa/e;)V

    .line 10
    .line 11
    .line 12
    return-object v0
    .line 13
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
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lda/d;->a(Landroid/content/Context;)Lda/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "com.google.android.providers.gsf.permission.READ_GSERVICES"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lda/c;->a(Ljava/lang/String;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const-string v0, "gms:nearby:requires_gms_check"

    .line 19
    .line 20
    invoke-static {p0, v0, v1}, Lqa/i1;->b(Landroid/content/ContentResolver;Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_0
    return v1
    .line 26
    .line 27
.end method
