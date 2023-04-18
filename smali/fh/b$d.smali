.class Lfh/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Leh/r$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lfh/b;


# direct methods
.method private constructor <init>(Lfh/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lfh/b$d;->a:Lfh/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lfh/b;Lfh/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lfh/b$d;-><init>(Lfh/b;)V

    return-void
.end method

.method private static synthetic g(I)V
    .locals 6

    const/4 v0, 0x3

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eq p0, v2, :cond_2

    if-eq p0, v4, :cond_1

    if-eq p0, v0, :cond_0

    const-string v5, "classLiteralValue"

    aput-object v5, v1, v3

    goto :goto_0

    :cond_0
    const-string v5, "classId"

    aput-object v5, v1, v3

    goto :goto_0

    :cond_1
    const-string v5, "enumEntryName"

    aput-object v5, v1, v3

    goto :goto_0

    :cond_2
    const-string v5, "enumClassId"

    aput-object v5, v1, v3

    :goto_0
    const-string v3, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor"

    aput-object v3, v1, v2

    if-eq p0, v2, :cond_4

    if-eq p0, v4, :cond_4

    if-eq p0, v0, :cond_3

    const-string p0, "visitClassLiteral"

    aput-object p0, v1, v4

    goto :goto_1

    :cond_3
    const-string p0, "visitAnnotation"

    aput-object p0, v1, v4

    goto :goto_1

    :cond_4
    const-string p0, "visitEnum"

    aput-object p0, v1, v4

    :goto_1
    const-string p0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private h()Leh/r$b;
    .locals 1

    new-instance v0, Lfh/b$d$a;

    invoke-direct {v0, p0}, Lfh/b$d$a;-><init>(Lfh/b$d;)V

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Llh/f;Llh/b;)Leh/r$a;
    .locals 0

    if-nez p2, :cond_0

    const/4 p1, 0x3

    invoke-static {p1}, Lfh/b$d;->g(I)V

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public c(Llh/f;)Leh/r$b;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Llh/f;->b()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p1, v0

    .line 10
    :goto_0
    const-string v1, "b"

    .line 11
    .line 12
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-direct {p0}, Lfh/b$d;->h()Leh/r$b;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_1
    return-object v0
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public d(Llh/f;Ljava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public e(Llh/f;Lrh/f;)V
    .locals 0

    if-nez p2, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Lfh/b$d;->g(I)V

    :cond_0
    return-void
.end method

.method public f(Llh/f;Llh/b;Llh/f;)V
    .locals 0

    if-nez p2, :cond_0

    const/4 p1, 0x1

    invoke-static {p1}, Lfh/b$d;->g(I)V

    :cond_0
    if-nez p3, :cond_1

    const/4 p1, 0x2

    invoke-static {p1}, Lfh/b$d;->g(I)V

    :cond_1
    return-void
.end method
