.class public Lph/k$i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lph/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lph/k$i$a;
    }
.end annotation


# static fields
.field private static final c:Lph/k$i;


# instance fields
.field private final a:Lph/k$i$a;

.field private final b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lph/k$i;

    sget-object v1, Lph/k$i$a;->k:Lph/k$i$a;

    const-string v2, "SUCCESS"

    invoke-direct {v0, v1, v2}, Lph/k$i;-><init>(Lph/k$i$a;Ljava/lang/String;)V

    sput-object v0, Lph/k$i;->c:Lph/k$i;

    return-void
.end method

.method public constructor <init>(Lph/k$i$a;Ljava/lang/String;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    invoke-static {v0}, Lph/k$i;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    if-nez p2, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x4

    .line 10
    invoke-static {v0}, Lph/k$i;->a(I)V

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lph/k$i;->a:Lph/k$i$a;

    .line 17
    .line 18
    iput-object p2, p0, Lph/k$i;->b:Ljava/lang/String;

    .line 19
    .line 20
    return-void
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
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method

.method private static synthetic a(I)V
    .locals 10

    const/4 v0, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq p0, v3, :cond_0

    if-eq p0, v2, :cond_0

    if-eq p0, v1, :cond_0

    if-eq p0, v0, :cond_0

    const-string v4, "@NotNull method %s.%s must not return null"

    goto :goto_0

    :cond_0
    const-string v4, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    :goto_0
    if-eq p0, v3, :cond_1

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    move v5, v2

    goto :goto_1

    :cond_1
    move v5, v1

    :goto_1
    new-array v5, v5, [Ljava/lang/Object;

    const-string v6, "success"

    const-string v7, "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"

    const/4 v8, 0x0

    if-eq p0, v3, :cond_3

    if-eq p0, v2, :cond_3

    if-eq p0, v1, :cond_2

    if-eq p0, v0, :cond_3

    aput-object v7, v5, v8

    goto :goto_2

    :cond_2
    aput-object v6, v5, v8

    goto :goto_2

    :cond_3
    const-string v9, "debugMessage"

    aput-object v9, v5, v8

    :goto_2
    packed-switch p0, :pswitch_data_0

    aput-object v6, v5, v3

    goto :goto_3

    :pswitch_0
    const-string v6, "getDebugMessage"

    aput-object v6, v5, v3

    goto :goto_3

    :pswitch_1
    const-string v6, "getResult"

    aput-object v6, v5, v3

    goto :goto_3

    :pswitch_2
    aput-object v7, v5, v3

    :goto_3
    if-eq p0, v3, :cond_6

    if-eq p0, v2, :cond_5

    if-eq p0, v1, :cond_4

    if-eq p0, v0, :cond_4

    goto :goto_4

    :cond_4
    const-string v6, "<init>"

    aput-object v6, v5, v2

    goto :goto_4

    :cond_5
    const-string v6, "conflict"

    aput-object v6, v5, v2

    goto :goto_4

    :cond_6
    const-string v6, "incompatible"

    aput-object v6, v5, v2

    :goto_4
    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    if-eq p0, v3, :cond_7

    if-eq p0, v2, :cond_7

    if-eq p0, v1, :cond_7

    if-eq p0, v0, :cond_7

    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    :goto_5
    throw p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static b(Ljava/lang/String;)Lph/k$i;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-static {v0}, Lph/k$i;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    new-instance v0, Lph/k$i;

    .line 8
    .line 9
    sget-object v1, Lph/k$i$a;->m:Lph/k$i$a;

    .line 10
    .line 11
    invoke-direct {v0, v1, p0}, Lph/k$i;-><init>(Lph/k$i$a;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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

.method public static d(Ljava/lang/String;)Lph/k$i;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-static {v0}, Lph/k$i;->a(I)V

    .line 5
    .line 6
    .line 7
    :cond_0
    new-instance v0, Lph/k$i;

    .line 8
    .line 9
    sget-object v1, Lph/k$i$a;->l:Lph/k$i$a;

    .line 10
    .line 11
    invoke-direct {v0, v1, p0}, Lph/k$i;-><init>(Lph/k$i$a;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
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

.method public static e()Lph/k$i;
    .locals 2

    sget-object v0, Lph/k$i;->c:Lph/k$i;

    if-nez v0, :cond_0

    const/4 v1, 0x0

    invoke-static {v1}, Lph/k$i;->a(I)V

    :cond_0
    return-object v0
.end method


# virtual methods
.method public c()Lph/k$i$a;
    .locals 2

    iget-object v0, p0, Lph/k$i;->a:Lph/k$i$a;

    if-nez v0, :cond_0

    const/4 v1, 0x5

    invoke-static {v1}, Lph/k$i;->a(I)V

    :cond_0
    return-object v0
.end method
