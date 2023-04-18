.class Llg/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lni/b$c;


# instance fields
.field private final a:Llg/i;


# direct methods
.method public constructor <init>(Llg/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llg/h;->a:Llg/i;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Llg/h;->a:Llg/i;

    check-cast p1, Lmg/e;

    invoke-static {v0, p1}, Llg/i;->j(Llg/i;Lmg/e;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method
