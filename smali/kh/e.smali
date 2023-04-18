.class public final Lkh/e;
.super Lih/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkh/e$a;
    }
.end annotation


# static fields
.field public static final h:Lkh/e$a;

.field public static final i:Lkh/e;

.field public static final j:Lkh/e;


# instance fields
.field private final g:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkh/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lkh/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lkh/e;->h:Lkh/e$a;

    .line 8
    .line 9
    new-instance v0, Lkh/e;

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    new-array v1, v1, [I

    .line 13
    .line 14
    fill-array-data v1, :array_0

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lkh/e;-><init>([I)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lkh/e;->i:Lkh/e;

    .line 21
    .line 22
    new-instance v0, Lkh/e;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    new-array v1, v1, [I

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lkh/e;-><init>([I)V

    .line 28
    .line 29
    .line 30
    sput-object v0, Lkh/e;->j:Lkh/e;

    .line 31
    .line 32
    return-void

    .line 33
    :array_0
    .array-data 4
        0x1
        0x8
        0x0
    .end array-data
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
.end method

.method public varargs constructor <init>([I)V
    .locals 1

    const-string v0, "numbers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, Lkh/e;-><init>([IZ)V

    return-void
.end method

.method public constructor <init>([IZ)V
    .locals 1

    const-string v0, "versionArray"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/q;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    invoke-direct {p0, p1}, Lih/a;-><init>([I)V

    iput-boolean p2, p0, Lkh/e;->g:Z

    return-void
.end method


# virtual methods
.method public h()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Lih/a;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lih/a;->b()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    :cond_0
    iget-boolean v0, p0, Lkh/e;->g:Z

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    sget-object v0, Lkh/e;->i:Lkh/e;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lih/a;->f(Lih/a;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0}, Lih/a;->a()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    sget-object v3, Lkh/e;->i:Lkh/e;

    .line 31
    .line 32
    invoke-virtual {v3}, Lih/a;->a()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-ne v0, v4, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0}, Lih/a;->b()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {v3}, Lih/a;->b()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    add-int/2addr v3, v2

    .line 47
    if-gt v0, v3, :cond_2

    .line 48
    .line 49
    move v0, v2

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    move v0, v1

    .line 52
    :goto_0
    if-eqz v0, :cond_3

    .line 53
    .line 54
    move v1, v2

    .line 55
    :cond_3
    return v1
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
.end method
