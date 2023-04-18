.class final Llg/b;
.super Ljg/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llg/b$a;
    }
.end annotation


# static fields
.field public static final h:Llg/b$a;

.field private static final i:Ljg/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Llg/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Llg/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Llg/b;->h:Llg/b$a;

    .line 8
    .line 9
    new-instance v0, Llg/b;

    .line 10
    .line 11
    invoke-direct {v0}, Llg/b;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Llg/b;->i:Ljg/h;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, Lci/f;

    .line 2
    .line 3
    const-string v1, "FallbackBuiltIns"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lci/f;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Ljg/h;-><init>(Lci/n;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, Ljg/h;->f(Z)V

    .line 13
    .line 14
    .line 15
    return-void
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

.method public static final synthetic E0()Ljg/h;
    .locals 1

    sget-object v0, Llg/b;->i:Ljg/h;

    return-object v0
.end method


# virtual methods
.method protected F0()Log/c$a;
    .locals 1

    sget-object v0, Log/c$a;->a:Log/c$a;

    return-object v0
.end method

.method public bridge synthetic M()Log/c;
    .locals 1

    invoke-virtual {p0}, Llg/b;->F0()Log/c$a;

    move-result-object v0

    return-object v0
.end method
