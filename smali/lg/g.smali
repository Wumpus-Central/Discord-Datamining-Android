.class Llg/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lni/b$c;


# static fields
.field public static final a:Llg/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llg/g;

    invoke-direct {v0}, Llg/g;-><init>()V

    sput-object v0, Llg/g;->a:Llg/g;

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

    check-cast p1, Lmg/b;

    invoke-static {p1}, Llg/i;->i(Lmg/b;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
