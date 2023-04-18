.class Lth/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lni/b$c;


# static fields
.field public static final a:Lth/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lth/a;

    invoke-direct {v0}, Lth/a;-><init>()V

    sput-object v0, Lth/a;->a:Lth/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 0

    check-cast p1, Lmg/j1;

    invoke-static {p1}, Lth/c;->a(Lmg/j1;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
