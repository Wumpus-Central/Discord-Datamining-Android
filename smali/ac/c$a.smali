.class final Lac/c$a;
.super Lac/c$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lac/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# static fields
.field static final b:Lac/c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lac/c$a;

    invoke-direct {v0}, Lac/c$a;-><init>()V

    sput-object v0, Lac/c$a;->b:Lac/c$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    const-string v0, "CharMatcher.any()"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lac/c$e;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
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
.end method


# virtual methods
.method public d(Ljava/lang/CharSequence;I)I
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p2, p1}, Lac/i;->k(II)I

    .line 6
    .line 7
    .line 8
    if-ne p2, p1, :cond_0

    .line 9
    .line 10
    const/4 p2, -0x1

    .line 11
    :cond_0
    return p2
    .line 12
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

.method public g(C)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public j()Lac/c;
    .locals 1

    invoke-static {}, Lac/c;->h()Lac/c;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic negate()Lj$/util/function/Predicate;
    .locals 1

    invoke-virtual {p0}, Lac/c$a;->j()Lac/c;

    move-result-object v0

    return-object v0
.end method
