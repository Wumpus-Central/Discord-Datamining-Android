.class public abstract Lbc/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbc/x$b;
    }
.end annotation


# static fields
.field private static final a:Lbc/x;

.field private static final b:Lbc/x;

.field private static final c:Lbc/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lbc/x$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lbc/x$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbc/x;->a:Lbc/x;

    .line 7
    .line 8
    new-instance v0, Lbc/x$b;

    .line 9
    .line 10
    const/4 v1, -0x1

    .line 11
    invoke-direct {v0, v1}, Lbc/x$b;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lbc/x;->b:Lbc/x;

    .line 15
    .line 16
    new-instance v0, Lbc/x$b;

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    invoke-direct {v0, v1}, Lbc/x$b;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, Lbc/x;->c:Lbc/x;

    .line 23
    .line 24
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lbc/x$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lbc/x;-><init>()V

    return-void
.end method

.method static synthetic a()Lbc/x;
    .locals 1

    sget-object v0, Lbc/x;->b:Lbc/x;

    return-object v0
.end method

.method static synthetic b()Lbc/x;
    .locals 1

    sget-object v0, Lbc/x;->c:Lbc/x;

    return-object v0
.end method

.method static synthetic c()Lbc/x;
    .locals 1

    sget-object v0, Lbc/x;->a:Lbc/x;

    return-object v0
.end method

.method public static j()Lbc/x;
    .locals 1

    sget-object v0, Lbc/x;->a:Lbc/x;

    return-object v0
.end method


# virtual methods
.method public abstract d(II)Lbc/x;
.end method

.method public abstract e(JJ)Lbc/x;
.end method

.method public abstract f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lbc/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;TT;",
            "Ljava/util/Comparator<",
            "TT;>;)",
            "Lbc/x;"
        }
    .end annotation
.end method

.method public abstract g(ZZ)Lbc/x;
.end method

.method public abstract h(ZZ)Lbc/x;
.end method

.method public abstract i()I
.end method
