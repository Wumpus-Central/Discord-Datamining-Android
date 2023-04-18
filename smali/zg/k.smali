.class Lzg/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lni/b$c;


# static fields
.field public static final a:Lzg/k;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lzg/k;

    invoke-direct {v0}, Lzg/k;-><init>()V

    sput-object v0, Lzg/k;->a:Lzg/k;

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

    check-cast p1, Lmg/e;

    invoke-static {p1}, Lzg/l;->M(Lmg/e;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
